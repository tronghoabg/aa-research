package t0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;
import u0.C4188n;

/* renamed from: t0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4037B implements tf.a, InterfaceC4045J, s0.c {

    /* renamed from: e, reason: collision with root package name */
    public static final C4062j f45419e = new C4062j(3);

    /* renamed from: a, reason: collision with root package name */
    public C4038C f45420a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3987a f45421b;

    /* renamed from: c, reason: collision with root package name */
    public final P.d f45422c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45423d;

    public C4037B(C4038C provider, InterfaceC3987a modifier) {
        AbstractC3340k.e(provider, "provider");
        AbstractC3340k.e(modifier, "modifier");
        this.f45420a = provider;
        this.f45421b = modifier;
        this.f45422c = new P.d(new a2.v[16]);
    }

    @Override // s0.c
    public final Object a(a2.v vVar) {
        AbstractC3340k.e(vVar, "<this>");
        this.f45422c.b(vVar);
        s0.b bVarB = this.f45420a.b(vVar);
        return bVarB == null ? ((tf.a) vVar.f17322b).invoke() : bVarB.getValue();
    }

    public final void b() {
        if (this.f45423d) {
            this.f45422c.e();
            ((C4188n) S3.f.E(this.f45420a.f45424a)).getSnapshotObserver().a(this, C4057e.f45464m, new C4068p(this, 3));
        }
    }

    @Override // tf.a
    public final Object invoke() {
        b();
        return C2515C.f34653a;
    }

    @Override // t0.InterfaceC4045J
    public final boolean n() {
        return this.f45423d;
    }
}
