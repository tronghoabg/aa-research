package defpackage;

import java.lang.reflect.GenericDeclaration;

/* loaded from: classes3.dex */
public abstract class affc implements afic {
    private final Object container;
    private final aezr javaContainingDeclaration$delegate;

    public affc(Object obj) {
        obj.getClass();
        this.container = obj;
        this.javaContainingDeclaration$delegate = woy.dH(2, new tim(this, 9));
    }

    public static final GenericDeclaration javaContainingDeclaration_delegate$lambda$0(affc affcVar) {
        Object obj = affcVar.container;
        affd affdVar = obj instanceof affd ? (affd) obj : null;
        if (affdVar != null) {
            return affdVar.findJavaDeclaration();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof affc)) {
            return false;
        }
        affc affcVar = (affc) obj;
        return affa.f(getName(), affcVar.getName()) && affa.f(this.container, affcVar.container);
    }

    public final Object getContainer$kotlin_stdlib() {
        return this.container;
    }

    public final GenericDeclaration getJavaContainingDeclaration$kotlin_stdlib() {
        return (GenericDeclaration) this.javaContainingDeclaration$delegate.a();
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iOrdinal = getVariance().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                sb.append("out ");
            }
        }
        sb.append(getName());
        return sb.toString();
    }
}
