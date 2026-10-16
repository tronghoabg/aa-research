package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface afie<T> extends defpackage.afig, defpackage.afic, defpackage.afif {
    java.util.Collection<defpackage.afih<T>> getConstructors();

    java.util.Collection<defpackage.afid<?>> getMembers();

    java.util.Collection<defpackage.afie<?>> getNestedClasses();

    T getObjectInstance();

    java.lang.String getQualifiedName();

    java.util.List<defpackage.afie<? extends T>> getSealedSubclasses();

    java.lang.String getSimpleName();

    java.util.List<defpackage.afjb> getSupertypes();

    java.util.List<defpackage.afjc> getTypeParameters();

    defpackage.afjf getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    boolean isInstance(java.lang.Object obj);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}
