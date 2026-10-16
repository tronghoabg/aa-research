package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class airb implements afhe, afrx, aimd {
    public static final airb INSTANCE = new airb();
    private final /* synthetic */ afhe<Void> $$delegate_0 = affw.b(Void.class);

    private airb() {
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return this.$$delegate_0.getAnnotations();
    }

    @Override // defpackage.afhe
    public Collection<afhh<Void>> getConstructors() {
        return this.$$delegate_0.getConstructors();
    }

    @Override // defpackage.afhe
    public Collection<afhd<?>> getMembers() {
        return this.$$delegate_0.getMembers();
    }

    @Override // defpackage.afhe
    public Collection<afhe<?>> getNestedClasses() {
        return this.$$delegate_0.getNestedClasses();
    }

    @Override // defpackage.afhe
    public Void getObjectInstance() {
        return this.$$delegate_0.getObjectInstance();
    }

    @Override // defpackage.afhe
    public String getQualifiedName() {
        return "kotlin.Nothing";
    }

    @Override // defpackage.afhe
    public List<afhe<? extends Void>> getSealedSubclasses() {
        return this.$$delegate_0.getSealedSubclasses();
    }

    @Override // defpackage.afhe
    public String getSimpleName() {
        return "Nothing";
    }

    @Override // defpackage.afhe
    public List<afib> getSupertypes() {
        return this.$$delegate_0.getSupertypes();
    }

    @Override // defpackage.afhe
    public List<afic> getTypeParameters() {
        return this.$$delegate_0.getTypeParameters();
    }

    @Override // defpackage.afhe
    public afif getVisibility() {
        return this.$$delegate_0.getVisibility();
    }

    @Override // defpackage.afhe
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.afhe
    public boolean isAbstract() {
        return this.$$delegate_0.isAbstract();
    }

    @Override // defpackage.afhe
    public boolean isCompanion() {
        return this.$$delegate_0.isCompanion();
    }

    @Override // defpackage.afhe
    public boolean isData() {
        return this.$$delegate_0.isData();
    }

    @Override // defpackage.afhe
    public boolean isFinal() {
        return this.$$delegate_0.isFinal();
    }

    @Override // defpackage.afhe
    public boolean isFun() {
        return this.$$delegate_0.isFun();
    }

    @Override // defpackage.afhe
    public boolean isInner() {
        return this.$$delegate_0.isInner();
    }

    @Override // defpackage.afhe
    public boolean isInstance(Object obj) {
        return this.$$delegate_0.isInstance(obj);
    }

    @Override // defpackage.afhe
    public boolean isOpen() {
        return this.$$delegate_0.isOpen();
    }

    @Override // defpackage.afhe
    public boolean isSealed() {
        return this.$$delegate_0.isSealed();
    }

    @Override // defpackage.afhe
    public boolean isValue() {
        return this.$$delegate_0.isValue();
    }

    public String toString() {
        return "NothingKClass";
    }
}
