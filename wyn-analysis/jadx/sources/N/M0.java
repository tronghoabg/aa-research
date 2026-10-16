package N;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class M0 implements N0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7724a;

    public M0(Object obj) {
        this.f7724a = obj;
    }

    @Override // N.N0
    public final Object a(InterfaceC0717c0 interfaceC0717c0) {
        return this.f7724a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M0) && AbstractC3340k.a(this.f7724a, ((M0) obj).f7724a);
    }

    public final int hashCode() {
        Object obj = this.f7724a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f7724a + ')';
    }
}
