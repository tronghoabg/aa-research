package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class aiqx<T> implements afhe, afrx, aimd {
    private final afhe<T> klass;
    private final String qualifiedName;
    private final List<afib> supertypes;
    private final List<afic> typeParameters;

    public aiqx(afhe<T> afheVar, String str, afec<? super aiqx<T>, ? extends List<? extends afic>> afecVar, afec<? super aiqx<T>, ? extends List<? extends afib>> afecVar2) {
        afheVar.getClass();
        str.getClass();
        afecVar.getClass();
        afecVar2.getClass();
        this.klass = afheVar;
        this.qualifiedName = str;
        this.typeParameters = (List) afecVar.invoke(this);
        this.supertypes = (List) afecVar2.invoke(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof aiqx) && affa.f(this.klass, ((aiqx) obj).klass);
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return this.klass.getAnnotations();
    }

    @Override // defpackage.afhe
    public Collection<afhh<T>> getConstructors() {
        return this.klass.getConstructors();
    }

    public final afhe<T> getKlass() {
        return this.klass;
    }

    @Override // defpackage.afhe
    public Collection<afhd<?>> getMembers() {
        return this.klass.getMembers();
    }

    @Override // defpackage.afhe
    public Collection<afhe<?>> getNestedClasses() {
        return this.klass.getNestedClasses();
    }

    @Override // defpackage.afhe
    public T getObjectInstance() {
        return this.klass.getObjectInstance();
    }

    @Override // defpackage.afhe
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    @Override // defpackage.afhe
    public List<afhe<? extends T>> getSealedSubclasses() {
        return this.klass.getSealedSubclasses();
    }

    @Override // defpackage.afhe
    public String getSimpleName() {
        String qualifiedName = getQualifiedName();
        return afyh.O(qualifiedName, qualifiedName);
    }

    @Override // defpackage.afhe
    public List<afib> getSupertypes() {
        return this.supertypes;
    }

    @Override // defpackage.afhe
    public List<afic> getTypeParameters() {
        return this.typeParameters;
    }

    @Override // defpackage.afhe
    public afif getVisibility() {
        return this.klass.getVisibility();
    }

    @Override // defpackage.afhe
    public int hashCode() {
        return this.klass.hashCode();
    }

    @Override // defpackage.afhe
    public boolean isAbstract() {
        return this.klass.isAbstract();
    }

    @Override // defpackage.afhe
    public boolean isCompanion() {
        return this.klass.isCompanion();
    }

    @Override // defpackage.afhe
    public boolean isData() {
        return this.klass.isData();
    }

    @Override // defpackage.afhe
    public boolean isFinal() {
        return this.klass.isFinal();
    }

    @Override // defpackage.afhe
    public boolean isFun() {
        return this.klass.isFun();
    }

    @Override // defpackage.afhe
    public boolean isInner() {
        return this.klass.isInner();
    }

    @Override // defpackage.afhe
    public boolean isInstance(Object obj) {
        return this.klass.isInstance(obj);
    }

    @Override // defpackage.afhe
    public boolean isOpen() {
        return this.klass.isOpen();
    }

    @Override // defpackage.afhe
    public boolean isSealed() {
        return this.klass.isSealed();
    }

    @Override // defpackage.afhe
    public boolean isValue() {
        return this.klass.isValue();
    }

    public String toString() {
        return "MutableCollectionKClass(" + this.klass + ')';
    }
}
