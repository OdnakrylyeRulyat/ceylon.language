package com.redhat.ceylon.compiler.java.language;


import ceylon.language.Boolean;
import ceylon.language.Callable;
import ceylon.language.Comparison;
import ceylon.language.Entry;
import ceylon.language.Integer;
import ceylon.language.Iterable;
import ceylon.language.Map;
import ceylon.language.Sequence;
import ceylon.language.Sequential;
import ceylon.language.exhausted_;

import com.redhat.ceylon.compiler.java.metadata.Class;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.metadata.SatisfiedTypes;
import com.redhat.ceylon.compiler.java.metadata.Sequenced;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;

/** A non-user-visible class that's useful to create Iterables in generated bytecode.
 * The getIterator() method should return a new instance in every call.
 * 
 * @author Enrique Zamudio
 */
@Ignore
@Class(extendsType="ceylon.language::Object")
@SatisfiedTypes("ceylon.language::Iterable<Element>")
public abstract class AbstractIterable<Element> implements Iterable<Element> {
    private final ceylon.language.Iterable$impl<Element> $ceylon$language$Iterable$this;
    private final ceylon.language.Category$impl $ceylon$language$Category$this;

    public AbstractIterable() {
        this.$ceylon$language$Iterable$this = new ceylon.language.Iterable$impl<Element>(this);
        this.$ceylon$language$Category$this = new ceylon.language.Category$impl(this);
    }
    
    @Override
    public long getSize() {
        return $ceylon$language$Iterable$this.getSize();
    }
    
    @Override
    public boolean getEmpty() {
        return getIterator().next() == exhausted_.getExhausted$();
    }

    @Override
    @Ignore
    public Sequential<? extends Element> getSequence() {
        return $ceylon$language$Iterable$this.getSequence();
    }
    
    @Override
    @Ignore
    public Element getFirst() {
    	return $ceylon$language$Iterable$this.getFirst();
    }
    @Override @Ignore public Element getLast() {
        return $ceylon$language$Iterable$this.getLast();
    }

    @Override
    @Ignore
    public Iterable<? extends Element> getRest() {
    	return $ceylon$language$Iterable$this.getRest();
    }

    @Override
    public <Result> Iterable<? extends Result> map(
            Callable<? extends Result> collecting) {
        return new MapIterable<Element, Result>(this, collecting);
    }

    @Override
    public Iterable<? extends Element> filter(
            Callable<? extends Boolean> selecting) {
        return new FilterIterable<Element>(this, selecting);
    }

    @Override
    @Ignore
    public <Result> Result fold(Result initial,
            Callable<? extends Result> accumulating) {
        return $ceylon$language$Iterable$this.fold(initial, accumulating);
    }

    @Override @Ignore
    public Element find(Callable<? extends Boolean> selecting) {
        return $ceylon$language$Iterable$this.find(selecting);
    }

    @Override @Ignore
    public Element findLast(Callable<? extends Boolean> selecting) {
        return $ceylon$language$Iterable$this.findLast(selecting);
    }

    @Override 
    @Ignore
    public Sequential<? extends Element> sort(Callable<? extends Comparison> f) { 
        return $ceylon$language$Iterable$this.sort(f); 
    }
    @Override @Ignore
    public <Result> Sequential<? extends Result> collect(Callable<? extends Result> f) {
        return $ceylon$language$Iterable$this.collect(f);
    }
    @Override @Ignore
    public Sequential<? extends Element> select(Callable<? extends Boolean> f) {
        return $ceylon$language$Iterable$this.select(f);
    }
    @Override @Ignore
    public boolean any(Callable<? extends Boolean> f) {
        return $ceylon$language$Iterable$this.any(f);
    }
    @Override @Ignore
    public boolean every(Callable<? extends Boolean> f) {
        return $ceylon$language$Iterable$this.every(f);
    }
    @Override @Ignore
    public Iterable<? extends Element> skipping(long skip) {
        return $ceylon$language$Iterable$this.skipping(skip);
    }
    @Override @Ignore
    public Iterable<? extends Element> taking(long take) {
        return $ceylon$language$Iterable$this.taking(take);
    }
    @Override @Ignore
    public Iterable<? extends Element> by(long step) {
        return $ceylon$language$Iterable$this.by(step);
    }
    @Override @Ignore
    public long count(Callable<? extends Boolean> selecting) {
        return $ceylon$language$Iterable$this.count(selecting);
    }
    @Override @Ignore
    public Iterable<? extends Element> getCoalesced() {
        return $ceylon$language$Iterable$this.getCoalesced();
    }
    @Override @Ignore
    public Iterable<? extends Entry<? extends Integer, ? extends Element>> getIndexed() {
        return $ceylon$language$Iterable$this.getIndexed();
    }
    @Override @Ignore @SuppressWarnings("rawtypes")
    public <Other>Iterable chain(Iterable<? extends Other> other) {
        return $ceylon$language$Iterable$this.chain(other);
    }
    @Override @Ignore
    public <Key> Map<? extends Key, ? extends Sequence<? extends Element>> group(Callable<? extends Key> grouping) {
        return $ceylon$language$Iterable$this.group(grouping);
    }
    @Override @Ignore
    public boolean contains(@Name("element") java.lang.Object element) {
        return $ceylon$language$Iterable$this.contains(element);
    }
    @Override @Ignore
    public boolean containsEvery(
            @Sequenced @Name("elements") @TypeInfo("ceylon.language::Sequential<ceylon.language::Object>") Sequential<?> elements) {
        return $ceylon$language$Category$this.containsEvery(elements);
    }
    @Override @Ignore
    public boolean containsEvery() {
        return $ceylon$language$Category$this.containsEvery();
    }
    @Override @Ignore
    public Sequential<?> containsEvery$elements() {
        return $ceylon$language$Category$this.containsEvery$elements();
    }
    @Override @Ignore
    public boolean containsAny(
            @Sequenced @Name("elements") @TypeInfo("ceylon.language::Sequential<ceylon.language::Object>") Sequential<?> elements) {
        return $ceylon$language$Category$this.containsAny(elements);
    }
    @Override @Ignore
    public boolean containsAny() {
        return $ceylon$language$Category$this.containsAny();
    }
    @Override @Ignore
    public Sequential<?> containsAny$elements() {
        return $ceylon$language$Category$this.containsAny$elements();
    }
}
