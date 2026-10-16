package t0;

import e0.InterfaceC2463o;
import g0.C2660a;
import g0.C2661b;
import kotlin.jvm.internal.AbstractC3340k;
import u0.C4188n;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4058f extends X0.E implements InterfaceC4045J {

    /* renamed from: e, reason: collision with root package name */
    public b0.d f45469e;

    /* renamed from: f, reason: collision with root package name */
    public final md.J f45470f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45471g;

    /* renamed from: h, reason: collision with root package name */
    public final A0.p f45472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4058f(y layoutNodeWrapper, b0.e modifier) {
        super(layoutNodeWrapper, modifier);
        AbstractC3340k.e(layoutNodeWrapper, "layoutNodeWrapper");
        AbstractC3340k.e(modifier, "modifier");
        b0.e eVar = modifier;
        this.f45469e = eVar instanceof b0.d ? (b0.d) eVar : null;
        md.J j8 = new md.J();
        j8.f40581b = this;
        j8.f40582c = layoutNodeWrapper;
        j8.f40580a = ((y) this.f15788b).f45561e.f45523n;
        this.f45470f = j8;
        this.f45471g = true;
        this.f45472h = new A0.p(this, 29);
    }

    @Override // X0.E
    public final void g() {
        b0.e eVar = (b0.e) ((Z.j) this.f15789c);
        this.f45469e = eVar instanceof b0.d ? (b0.d) eVar : null;
        this.f45471g = true;
        this.f15787a = true;
    }

    public final void j(InterfaceC2463o canvas) {
        AbstractC3340k.e(canvas, "canvas");
        y yVar = (y) this.f15788b;
        long jR = Ba.c.R(yVar.f44309c);
        b0.d dVar = this.f45469e;
        t tVar = yVar.f45561e;
        if (dVar != null && this.f45471g) {
            ((C4188n) S3.f.E(tVar)).getSnapshotObserver().a(this, C4057e.f45462j, this.f45472h);
        }
        tVar.getClass();
        v sharedDrawScope = ((C4188n) S3.f.E(tVar)).getSharedDrawScope();
        C4058f c4058f = sharedDrawScope.f45544b;
        sharedDrawScope.f45544b = this;
        C4070r c4070rJ = yVar.J();
        L0.i iVar = yVar.J().f45488a.f45525p;
        C2661b c2661b = sharedDrawScope.f45543a;
        C2660a c2660a = c2661b.f35483a;
        L0.b bVar = c2660a.f35479a;
        L0.i iVar2 = c2660a.f35480b;
        InterfaceC2463o interfaceC2463o = c2660a.f35481c;
        long j8 = c2660a.f35482d;
        AbstractC3340k.e(c4070rJ, "<set-?>");
        c2660a.f35479a = c4070rJ;
        AbstractC3340k.e(iVar, "<set-?>");
        c2660a.f35480b = iVar;
        c2660a.f35481c = canvas;
        c2660a.f35482d = jR;
        canvas.m();
        ((b0.e) ((Z.j) this.f15789c)).e(sharedDrawScope);
        canvas.restore();
        C2660a c2660a2 = c2661b.f35483a;
        c2660a2.getClass();
        AbstractC3340k.e(bVar, "<set-?>");
        c2660a2.f35479a = bVar;
        AbstractC3340k.e(iVar2, "<set-?>");
        c2660a2.f35480b = iVar2;
        c2660a2.f35481c = interfaceC2463o;
        c2660a2.f35482d = j8;
        sharedDrawScope.f45544b = c4058f;
    }

    @Override // t0.InterfaceC4045J
    public final boolean n() {
        return ((y) this.f15788b).S();
    }
}
