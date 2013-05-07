import ceylon.language.metamodel.untyped {
    UntypedValue = Value
}

shared interface Value<out Type>
        satisfies Declaration {

    shared formal actual UntypedValue declaration;
    
    shared formal Type get();
    
    shared formal AppliedType type;
}