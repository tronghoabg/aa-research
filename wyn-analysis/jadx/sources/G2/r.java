package g2;

import k2.c0;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f35653a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.m f35654b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f35655c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35656d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f35658f;

    public r(s sVar, w wVar, int i5, InterfaceC2683d interfaceC2683d) {
        this.f35658f = sVar;
        this.f35654b = new o2.m(AbstractC3256n.g(i5, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        c0 c0Var = new c0(sVar.f35659a, null, null);
        this.f35655c = c0Var;
        this.f35653a = new q(sVar, wVar, i5, c0Var, interfaceC2683d);
        c0Var.f39038f = sVar.f35661c;
    }

    public final void a() {
        if (this.f35656d) {
            return;
        }
        this.f35653a.f35650b.f35586j = true;
        this.f35656d = true;
        s.a(this.f35658f);
    }
}
