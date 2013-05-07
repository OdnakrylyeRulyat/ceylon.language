import ceylon.language.metamodel.untyped {
    UntypedClassOrInterface = ClassOrInterface,
    TypeParameter
}

shared interface ClassOrInterface<out Type> 
    of Class<Type, Nothing> | Interface<Type>
    satisfies Declaration {
    
    shared formal actual UntypedClassOrInterface declaration;
    
    shared formal Map<TypeParameter, AppliedType> typeArguments;
    
    shared formal Class<Anything, Nothing>? superclass;
    
    shared formal Interface<Anything>[] interfaces;
    
    shared formal Member<SubType, Kind>? getFunction<SubType, Kind>(String name, AppliedType* types)
        given Kind satisfies Function<Anything, Nothing>;
    
    shared formal Member<SubType, Kind>? getAttribute<SubType, Kind>(String name)
        given Kind satisfies Value<Anything>;
}
