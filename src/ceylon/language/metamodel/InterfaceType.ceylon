import ceylon.language.metamodel.declaration {
    InterfaceDeclaration
}

shared interface InterfaceType<out Type>
    satisfies ClassOrInterface<Type> {
    
    shared formal actual InterfaceDeclaration declaration;
}