package kotlin.jvm.internal;

import java.util.Collection;

/* loaded from: classes5.dex */
public final class u implements InterfaceC3333d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f39757a;

    public u(Class jClass, String str) {
        AbstractC3340k.e(jClass, "jClass");
        this.f39757a = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return AbstractC3340k.a(this.f39757a, ((u) obj).f39757a);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3333d
    public final Class getJClass() {
        return this.f39757a;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        throw new Ef.G(2);
    }

    public final int hashCode() {
        return this.f39757a.hashCode();
    }

    public final String toString() {
        return this.f39757a.toString() + " (Kotlin reflection is not available)";
    }
}
