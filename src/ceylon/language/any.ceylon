"Determines if any one of the given boolean values 
 (usually a comprehension) is `true`."
see (`function every`)
shared Boolean any({Boolean*} values) {
    for (val in values) {
        if (val) {
            return true;
        }
    }
    return false;
}
