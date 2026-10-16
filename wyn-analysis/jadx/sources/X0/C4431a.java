package x0;

import ef.InterfaceC2521e;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4431a {

    /* renamed from: a, reason: collision with root package name */
    public final String f47567a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2521e f47568b;

    public C4431a(String str, InterfaceC2521e interfaceC2521e) {
        this.f47567a = str;
        this.f47568b = interfaceC2521e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4431a)) {
            return false;
        }
        C4431a c4431a = (C4431a) obj;
        return AbstractC3340k.a(this.f47567a, c4431a.f47567a) && AbstractC3340k.a(this.f47568b, c4431a.f47568b);
    }

    public final int hashCode() {
        String str = this.f47567a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC2521e interfaceC2521e = this.f47568b;
        return iHashCode + (interfaceC2521e != null ? interfaceC2521e.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f47567a + ", action=" + this.f47568b + ')';
    }
}
