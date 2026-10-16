package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface afhe<T> extends afhg, afhc, afhf {
    Collection<afhh<T>> getConstructors();

    Collection<afhd<?>> getMembers();

    Collection<afhe<?>> getNestedClasses();

    T getObjectInstance();

    String getQualifiedName();

    List<afhe<? extends T>> getSealedSubclasses();

    String getSimpleName();

    List<afib> getSupertypes();

    List<afic> getTypeParameters();

    afif getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    boolean isInstance(Object obj);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();
}
