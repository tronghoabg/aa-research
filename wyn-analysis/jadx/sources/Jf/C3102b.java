package jf;

import A7.AbstractC0279p0;
import Cd.U;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;

/* renamed from: jf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3102b implements InterfaceC3108h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3108h f38756a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3106f f38757b;

    public C3102b(InterfaceC3106f element, InterfaceC3108h left) {
        AbstractC3340k.e(left, "left");
        AbstractC3340k.e(element, "element");
        this.f38756a = left;
        this.f38757b = element;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3102b) {
            C3102b c3102b = (C3102b) obj;
            c3102b.getClass();
            int i5 = 2;
            C3102b c3102b2 = c3102b;
            int i10 = 2;
            while (true) {
                InterfaceC3108h interfaceC3108h = c3102b2.f38756a;
                c3102b2 = interfaceC3108h instanceof C3102b ? (C3102b) interfaceC3108h : null;
                if (c3102b2 == null) {
                    break;
                }
                i10++;
            }
            C3102b c3102b3 = this;
            while (true) {
                InterfaceC3108h interfaceC3108h2 = c3102b3.f38756a;
                c3102b3 = interfaceC3108h2 instanceof C3102b ? (C3102b) interfaceC3108h2 : null;
                if (c3102b3 == null) {
                    break;
                }
                i5++;
            }
            if (i10 == i5) {
                C3102b c3102b4 = this;
                while (true) {
                    InterfaceC3106f interfaceC3106f = c3102b4.f38757b;
                    if (!AbstractC3340k.a(c3102b.get(interfaceC3106f.getKey()), interfaceC3106f)) {
                        zA = false;
                        break;
                    }
                    InterfaceC3108h interfaceC3108h3 = c3102b4.f38756a;
                    if (!(interfaceC3108h3 instanceof C3102b)) {
                        AbstractC3340k.c(interfaceC3108h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC3106f interfaceC3106f2 = (InterfaceC3106f) interfaceC3108h3;
                        zA = AbstractC3340k.a(c3102b.get(interfaceC3106f2.getKey()), interfaceC3106f2);
                        break;
                    }
                    c3102b4 = (C3102b) interfaceC3108h3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f38756a.fold(obj, pVar), this.f38757b);
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        C3102b c3102b = this;
        while (true) {
            InterfaceC3106f interfaceC3106f = c3102b.f38757b.get(key);
            if (interfaceC3106f != null) {
                return interfaceC3106f;
            }
            InterfaceC3108h interfaceC3108h = c3102b.f38756a;
            if (!(interfaceC3108h instanceof C3102b)) {
                return interfaceC3108h.get(key);
            }
            c3102b = (C3102b) interfaceC3108h;
        }
    }

    public final int hashCode() {
        return this.f38757b.hashCode() + this.f38756a.hashCode();
    }

    @Override // jf.InterfaceC3108h
    public final InterfaceC3108h minusKey(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        InterfaceC3106f interfaceC3106f = this.f38757b;
        InterfaceC3106f interfaceC3106f2 = interfaceC3106f.get(key);
        InterfaceC3108h interfaceC3108h = this.f38756a;
        if (interfaceC3106f2 != null) {
            return interfaceC3108h;
        }
        InterfaceC3108h interfaceC3108hMinusKey = interfaceC3108h.minusKey(key);
        return interfaceC3108hMinusKey == interfaceC3108h ? this : interfaceC3108hMinusKey == C3109i.f38759a ? interfaceC3106f : new C3102b(interfaceC3106f, interfaceC3108hMinusKey);
    }

    @Override // jf.InterfaceC3108h
    public final /* bridge */ InterfaceC3108h plus(InterfaceC3108h interfaceC3108h) {
        return Fe.c.B(this, interfaceC3108h);
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("["), (String) fold("", new U(18)), ']');
    }
}
