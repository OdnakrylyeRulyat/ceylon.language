package ceylon.language;

import com.redhat.ceylon.compiler.java.language.NonemptyArray;
import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Method;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;

@Ceylon(major = 3)
@Method
public final class arrayOfSome_ {

    private arrayOfSome_() {}

    @TypeParameters(@TypeParameter(value="Element"))
    @TypeInfo(value="ceylon.language::Array<Element>&ceylon.language::Some<Element>", erased=true)
    public static <Element> Array<Element> arrayOfSome(
    @Name("elements")
    @TypeInfo("ceylon.language::Sequence<Element>")
    final Iterable<? extends Element> elements) {
        return NonemptyArray.<Element>instance(null, elements);
    }
    
    @Ignore
    public static <Element> Array<Element> arrayOfSome(
            final Class typeClass,
            final Iterable<? extends Element> elements) {
        return NonemptyArray.<Element>instance(typeClass, elements);
    }
}
