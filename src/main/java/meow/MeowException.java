package meow;

abstract class MeowException extends Exception {
}

class InvalidInputException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! I'm sorry, but I don't know what that means :-(\n" +
                "------------------------------------------------------------------------------";
    }
}

class EmptyTodoDescriptionException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! The description of a todo cannot be empty~\n" +
                "------------------------------------------------------------------------------";
    }
}

class EmptyDeadlineDescriptionException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! The description of a deadline cannot be empty~\n" +
                "------------------------------------------------------------------------------";
    }
}

class EmptyEventDescriptionException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! The description of an event cannot be empty~\n" +
                "------------------------------------------------------------------------------";
    }
}

class EmptyDeadlineTimeException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! The date/time of a deadline cannot be empty~\n" +
                "------------------------------------------------------------------------------";
    }
}

class EmptyEventTimeException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! The starting and ending time of an event cannot be empty~\n" +
                "------------------------------------------------------------------------------";
    }
}

class InvalidTaskIndex extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! This task is not in your task list,\n " +
                "try entering a correct task number~\n" +
                "------------------------------------------------------------------------------";
    }
}

class NotSuchTaskFoundException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: ☹ OOPS!!! I'm sorry, but I don't know what that means,\n" +
                "please enter a number to indicate the correct task number~\n" +
                "------------------------------------------------------------------------------";
    }
}

class NoItemInTheListException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: You have not added any tasks yet, please add one now~\n" +
                "------------------------------------------------------------------------------";
    }
}

class InvalidDateTimeException extends MeowException {
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------\n" +
                "Meow: The format of your deadline is invalid, please try again~\n" +
                "------------------------------------------------------------------------------";
    }
}
