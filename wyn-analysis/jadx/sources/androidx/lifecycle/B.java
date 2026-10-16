package androidx.lifecycle;

/* loaded from: classes.dex */
public final class B extends C implements InterfaceC1455t {

    /* renamed from: e, reason: collision with root package name */
    public final Object f18573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f18574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d3, InterfaceC1457v interfaceC1457v, F f10) {
        super(d3, f10);
        this.f18574f = d3;
        this.f18573e = interfaceC1457v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.v, java.lang.Object] */
    @Override // androidx.lifecycle.C
    public final void b() {
        this.f18573e.getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.C
    public final boolean c(InterfaceC1457v interfaceC1457v) {
        return this.f18573e == interfaceC1457v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.v, java.lang.Object] */
    @Override // androidx.lifecycle.C
    public final boolean d() {
        return this.f18573e.getLifecycle().b().compareTo(EnumC1450n.f18679d) >= 0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.v, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        ?? r32 = this.f18573e;
        EnumC1450n enumC1450nB = r32.getLifecycle().b();
        if (enumC1450nB == EnumC1450n.f18676a) {
            this.f18574f.i(this.f18575a);
            return;
        }
        EnumC1450n enumC1450n = null;
        while (enumC1450n != enumC1450nB) {
            a(d());
            enumC1450n = enumC1450nB;
            enumC1450nB = r32.getLifecycle().b();
        }
    }
}
