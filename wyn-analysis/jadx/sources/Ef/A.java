package Ef;

import jf.AbstractC3101a;
import jf.C3104d;
import jf.InterfaceC3105e;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class A extends AbstractC3101a implements InterfaceC3105e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0519z f3655a = new C0519z(C3104d.f38758a, new Ad.g(16));

    public A() {
        super(C3104d.f38758a);
    }

    @Override // jf.AbstractC3101a, jf.InterfaceC3108h
    public final InterfaceC3106f get(InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        if (!(key instanceof C0519z)) {
            if (C3104d.f38758a == key) {
                return this;
            }
            return null;
        }
        C0519z c0519z = (C0519z) key;
        InterfaceC3107g key2 = getKey();
        AbstractC3340k.e(key2, "key");
        if (key2 != c0519z && c0519z.f3792b != key2) {
            return null;
        }
        InterfaceC3106f interfaceC3106f = (InterfaceC3106f) c0519z.f3791a.invoke(this);
        if (interfaceC3106f instanceof InterfaceC3106f) {
            return interfaceC3106f;
        }
        return null;
    }

    public abstract void i(InterfaceC3108h interfaceC3108h, Runnable runnable);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[RETURN] */
    @Override // jf.AbstractC3101a, jf.InterfaceC3108h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jf.InterfaceC3108h minusKey(jf.InterfaceC3107g r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.AbstractC3340k.e(r4, r0)
            boolean r1 = r4 instanceof Ef.C0519z
            jf.i r2 = jf.C3109i.f38759a
            if (r1 == 0) goto L27
            Ef.z r4 = (Ef.C0519z) r4
            jf.g r1 = r3.getKey()
            kotlin.jvm.internal.AbstractC3340k.e(r1, r0)
            if (r1 == r4) goto L1c
            jf.g r0 = r4.f3792b
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            return r3
        L1c:
            tf.l r4 = r4.f3791a
            java.lang.Object r4 = r4.invoke(r3)
            jf.f r4 = (jf.InterfaceC3106f) r4
            if (r4 == 0) goto L2c
            goto L2b
        L27:
            jf.d r0 = jf.C3104d.f38758a
            if (r0 != r4) goto L2c
        L2b:
            return r2
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.A.minusKey(jf.g):jf.h");
    }

    public void o(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        Jf.b.i(this, interfaceC3108h, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + H.t(this);
    }

    public boolean w(InterfaceC3108h interfaceC3108h) {
        return !(this instanceof O0);
    }

    public A y(int i5) {
        Jf.b.a(i5);
        return new Jf.g(this, i5);
    }
}
