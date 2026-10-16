package t0;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4188n;

/* renamed from: t0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4052Q extends E9.c {
    @Override // E9.c
    public final void l(int i5, Object obj) {
        P.d dVar;
        int i10;
        t instance = (t) obj;
        AbstractC3340k.e(instance, "instance");
        t tVar = (t) this.f3603c;
        tVar.getClass();
        int i11 = 0;
        C4061i c4061i = null;
        if (instance.f45516f != null) {
            StringBuilder sb2 = new StringBuilder("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(tVar.f(0));
            sb2.append(" Other tree: ");
            t tVar2 = instance.f45516f;
            sb2.append(tVar2 != null ? tVar2.f(0) : null);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance.f45517g != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + tVar.f(0) + " Other tree: " + instance.f(0)).toString());
        }
        instance.f45516f = tVar;
        tVar.f45513c.a(i5, instance);
        tVar.x();
        boolean z2 = tVar.f45511a;
        boolean z10 = instance.f45511a;
        if (z10) {
            if (z2) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent");
            }
            tVar.f45512b++;
        }
        tVar.q();
        y yVar = instance.f45534y.f45436f;
        C4061i c4061i2 = tVar.f45533x;
        if (z2) {
            t tVar3 = tVar.f45516f;
            if (tVar3 != null) {
                c4061i = tVar3.f45533x;
            }
        } else {
            c4061i = c4061i2;
        }
        yVar.f45562f = c4061i;
        if (z10 && (i10 = (dVar = instance.f45513c).f8972c) > 0) {
            Object[] objArr = dVar.f8970a;
            do {
                ((t) objArr[i11]).f45534y.f45436f.f45562f = c4061i2;
                i11++;
            } while (i11 < i10);
        }
        C4188n c4188n = tVar.f45517g;
        if (c4188n != null) {
            instance.b(c4188n);
        }
    }

    @Override // E9.c
    public final void m(int i5, Object obj) {
        t instance = (t) obj;
        AbstractC3340k.e(instance, "instance");
    }

    @Override // E9.c
    public final void n(int i5, int i10, int i11) {
        t tVar = (t) this.f3603c;
        tVar.getClass();
        if (i5 == i10) {
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i5 > i10 ? i5 + i12 : i5;
            int i14 = i5 > i10 ? i10 + i12 : (i10 + i11) - 2;
            P.d dVar = tVar.f45513c;
            dVar.a(i14, (t) dVar.m(i13));
        }
        tVar.x();
        tVar.q();
        tVar.z(false);
    }

    @Override // E9.c
    public final void o() {
        t tVar = (t) this.f3601a;
        P.d dVar = tVar.f45513c;
        int i5 = dVar.f8972c;
        while (true) {
            i5--;
            if (-1 >= i5) {
                dVar.e();
                return;
            }
            tVar.w((t) dVar.f8970a[i5]);
        }
    }

    @Override // E9.c
    public final void p() {
        C4188n c4188n = ((t) this.f3601a).f45517g;
        if (c4188n != null) {
            c4188n.m();
        }
    }

    @Override // E9.c
    public final void r(int i5, int i10) {
        t tVar = (t) this.f3603c;
        tVar.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i10, "count (", ") must be greater than 0").toString());
        }
        int i11 = (i10 + i5) - 1;
        if (i5 > i11) {
            return;
        }
        while (true) {
            tVar.w((t) tVar.f45513c.m(i11));
            if (i11 == i5) {
                return;
            } else {
                i11--;
            }
        }
    }
}
