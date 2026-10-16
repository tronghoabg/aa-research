package I;

import A.W;
import N.q0;
import U8.v0;
import Va.X7;
import Z.k;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import e0.z;
import ka.AbstractC3230e0;

/* loaded from: classes.dex */
public final class i implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final X7 f5259a;

    /* renamed from: b, reason: collision with root package name */
    public final h f5260b = new h(this);

    /* renamed from: c, reason: collision with root package name */
    public final k f5261c;

    /* renamed from: d, reason: collision with root package name */
    public k f5262d;

    /* renamed from: e, reason: collision with root package name */
    public k f5263e;

    public i(X7 x72) {
        this.f5259a = x72;
        Z.i iVar = Z.i.f16922a;
        this.f5261c = v0.X(AbstractC3230e0.m(z.k(iVar, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE), new f(this, 2)), new f(this, 0));
        this.f5262d = Fe.g.J(iVar, false, new W(9, ((j) x72.f13841a).f5264a, this));
        this.f5263e = iVar;
    }

    @Override // N.q0
    public final void c() {
    }

    @Override // N.q0
    public final void j() {
    }

    @Override // N.q0
    public final void k() {
    }
}
