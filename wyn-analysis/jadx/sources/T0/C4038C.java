package t0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4188n;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4038C implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f45424a;

    /* renamed from: b, reason: collision with root package name */
    public final s0.b f45425b;

    /* renamed from: c, reason: collision with root package name */
    public C4038C f45426c;

    /* renamed from: d, reason: collision with root package name */
    public C4038C f45427d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45428e;

    /* renamed from: f, reason: collision with root package name */
    public final P.d f45429f;

    public C4038C(t layoutNode, s0.b modifier) {
        AbstractC3340k.e(layoutNode, "layoutNode");
        AbstractC3340k.e(modifier, "modifier");
        this.f45424a = layoutNode;
        this.f45425b = modifier;
        this.f45429f = new P.d(new C4037B[16]);
    }

    public final void a() {
        this.f45428e = false;
        P.d dVar = this.f45429f;
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                C4037B c4037b = (C4037B) objArr[i10];
                c4037b.f45421b.o(C4037B.f45419e);
                c4037b.f45423d = false;
                i10++;
            } while (i10 < i5);
        }
        c(this.f45425b.getKey(), false);
    }

    public final s0.b b(a2.v local) {
        C4038C c4038c;
        s0.b bVarB;
        AbstractC3340k.e(local, "local");
        s0.b bVar = this.f45425b;
        if (AbstractC3340k.a(bVar.getKey(), local)) {
            return bVar;
        }
        C4038C c4038c2 = this.f45427d;
        if (c4038c2 != null && (bVarB = c4038c2.b(local)) != null) {
            return bVarB;
        }
        t tVarJ = this.f45424a.j();
        if (tVarJ == null || (c4038c = tVarJ.f45498D) == null) {
            return null;
        }
        return c4038c.b(local);
    }

    public final void c(a2.v local, boolean z2) {
        C2515C c2515c;
        P.d dVarL;
        int i5;
        C4188n c4188n;
        if (z2 && AbstractC3340k.a(this.f45425b.getKey(), local)) {
            return;
        }
        P.d dVar = this.f45429f;
        int i10 = dVar.f8972c;
        int i11 = 0;
        if (i10 > 0) {
            Object[] objArr = dVar.f8970a;
            int i12 = 0;
            do {
                C4037B c4037b = (C4037B) objArr[i12];
                c4037b.getClass();
                AbstractC3340k.e(local, "local");
                if (c4037b.f45422c.f(local) && (c4188n = c4037b.f45420a.f45424a.f45517g) != null) {
                    c4188n.r(c4037b);
                }
                i12++;
            } while (i12 < i10);
        }
        C4038C c4038c = this.f45426c;
        if (c4038c != null) {
            c4038c.c(local, true);
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c != null || (i5 = (dVarL = this.f45424a.l()).f8972c) <= 0) {
            return;
        }
        Object[] objArr2 = dVarL.f8970a;
        do {
            ((t) objArr2[i11]).f45497C.c(local, true);
            i11++;
        } while (i11 < i5);
    }

    @Override // tf.a
    public final Object invoke() {
        if (this.f45428e) {
            c(this.f45425b.getKey(), false);
        }
        return C2515C.f34653a;
    }
}
