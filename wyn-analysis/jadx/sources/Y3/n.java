package Y3;

import Ef.H;
import Ef.I0;
import Ef.S;
import Hf.k0;
import Hf.x0;
import N.C0718d;
import N.P;
import N.Y;
import N.q0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import e0.C2452d;
import e0.z;
import g0.InterfaceC2663d;
import h0.AbstractC2765c;
import h0.C2763a;
import h0.C2764b;
import h4.C2775b;
import kotlin.jvm.internal.AbstractC3340k;
import o5.C3647a;
import r0.C3902g;
import r0.InterfaceC3903h;

/* loaded from: classes.dex */
public final class n extends AbstractC2765c implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public Kd.a f16651f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f16652g = k0.c(new d0.f(d0.f.f33949b));

    /* renamed from: h, reason: collision with root package name */
    public final Y f16653h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f16654i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f16655j;
    public g k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC2765c f16656l;

    /* renamed from: m, reason: collision with root package name */
    public tf.l f16657m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC3903h f16658n;

    /* renamed from: o, reason: collision with root package name */
    public int f16659o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16660p;

    /* renamed from: q, reason: collision with root package name */
    public final Y f16661q;

    /* renamed from: r, reason: collision with root package name */
    public final Y f16662r;

    /* renamed from: s, reason: collision with root package name */
    public final Y f16663s;

    public n(h4.h hVar, X3.k kVar) {
        P p10 = P.f7730f;
        this.f16653h = C0718d.G(null, p10);
        this.f16654i = C0718d.G(Float.valueOf(1.0f), p10);
        this.f16655j = C0718d.G(null, p10);
        c cVar = c.f16633a;
        this.k = cVar;
        this.f16657m = a.k;
        this.f16658n = C3902g.f44297b;
        this.f16659o = 1;
        this.f16661q = C0718d.G(cVar, p10);
        this.f16662r = C0718d.G(hVar, p10);
        this.f16663s = C0718d.G(kVar, p10);
    }

    @Override // h0.AbstractC2765c
    public final boolean a(float f10) {
        this.f16654i.setValue(Float.valueOf(f10));
        return true;
    }

    @Override // h0.AbstractC2765c
    public final boolean b(e0.r rVar) {
        this.f16655j.setValue(rVar);
        return true;
    }

    @Override // N.q0
    public final void c() {
        if (this.f16651f != null) {
            return;
        }
        I0 i0F = H.f();
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(Fe.e.O(i0F, Jf.n.f6132a.f4117e));
        this.f16651f = aVarC;
        Object obj = this.f16656l;
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var != null) {
            q0Var.c();
        }
        if (!this.f16660p) {
            H.D(aVarC, null, new j(this, null), 3);
            return;
        }
        h4.g gVarA = h4.h.a((h4.h) this.f16662r.getValue());
        gVarA.f36077b = ((X3.k) this.f16663s.getValue()).f16112b;
        gVarA.f36091q = 0;
        gVarA.a().f36111u.getClass();
        C2775b c2775b = k4.d.f39263a;
        i(new e(null));
    }

    @Override // h0.AbstractC2765c
    public final long f() {
        AbstractC2765c abstractC2765c = (AbstractC2765c) this.f16653h.getValue();
        return abstractC2765c != null ? abstractC2765c.f() : d0.f.f33950c;
    }

    @Override // h0.AbstractC2765c
    public final void g(InterfaceC2663d interfaceC2663d) {
        d0.f fVar = new d0.f(interfaceC2663d.c());
        x0 x0Var = this.f16652g;
        x0Var.getClass();
        x0Var.k(null, fVar);
        AbstractC2765c abstractC2765c = (AbstractC2765c) this.f16653h.getValue();
        if (abstractC2765c != null) {
            abstractC2765c.e(interfaceC2663d, interfaceC2663d.c(), ((Number) this.f16654i.getValue()).floatValue(), (e0.r) this.f16655j.getValue());
        }
    }

    public final AbstractC2765c h(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable instanceof ColorDrawable ? new C2764b(z.b(((ColorDrawable) drawable).getColor())) : new C3647a(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        AbstractC3340k.e(bitmap, "<this>");
        C2452d c2452d = new C2452d(bitmap);
        int i5 = this.f16659o;
        C2763a c2763a = new C2763a(c2452d, L0.g.f6802b, Ba.c.a(bitmap.getWidth(), bitmap.getHeight()));
        c2763a.f35923i = i5;
        return c2763a;
    }

    public final void i(g gVar) {
        h4.i iVar;
        g gVar2 = this.k;
        g gVar3 = (g) this.f16657m.invoke(gVar);
        this.k = gVar3;
        this.f16661q.setValue(gVar3);
        if (!(gVar3 instanceof f)) {
            if (gVar3 instanceof d) {
                iVar = ((d) gVar3).f16635b;
            }
            AbstractC2765c abstractC2765cA = gVar3.a();
            this.f16656l = abstractC2765cA;
            this.f16653h.setValue(abstractC2765cA);
            if (this.f16651f != null || gVar2.a() == gVar3.a()) {
            }
            Object objA = gVar2.a();
            q0 q0Var = objA instanceof q0 ? (q0) objA : null;
            if (q0Var != null) {
                q0Var.k();
            }
            Object objA2 = gVar3.a();
            q0 q0Var2 = objA2 instanceof q0 ? (q0) objA2 : null;
            if (q0Var2 != null) {
                q0Var2.c();
                return;
            }
            return;
        }
        iVar = ((f) gVar3).f16638b;
        iVar.a().f36097f.getClass();
        AbstractC2765c abstractC2765cA2 = gVar3.a();
        this.f16656l = abstractC2765cA2;
        this.f16653h.setValue(abstractC2765cA2);
        if (this.f16651f != null) {
        }
    }

    @Override // N.q0
    public final void j() {
        Kd.a aVar = this.f16651f;
        if (aVar != null) {
            H.j(aVar, null);
        }
        this.f16651f = null;
        Object obj = this.f16656l;
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var != null) {
            q0Var.j();
        }
    }

    @Override // N.q0
    public final void k() {
        Kd.a aVar = this.f16651f;
        if (aVar != null) {
            H.j(aVar, null);
        }
        this.f16651f = null;
        Object obj = this.f16656l;
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var != null) {
            q0Var.k();
        }
    }
}
