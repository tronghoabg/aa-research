package ad;

import x6.C4477h;

/* renamed from: ad.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1349C extends AbstractC1364i implements InterfaceC1366k {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17494b;

    /* renamed from: c, reason: collision with root package name */
    public C4477h f17495c;

    public C1349C(int i5, G9.e eVar, String str, C1372q c1372q, C1377w c1377w, E0.a aVar) {
        super(i5);
        eVar.getClass();
        str.getClass();
        c1372q.getClass();
        c1377w.getClass();
        this.f17494b = eVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        C4477h c4477h = this.f17495c;
        if (c4477h != null) {
            c4477h.a();
            this.f17495c = null;
        }
    }

    @Override // ad.AbstractC1364i
    public final io.flutter.plugin.platform.e b() {
        C4477h c4477h = this.f17495c;
        if (c4477h == null) {
            return null;
        }
        return new N(c4477h, 0);
    }

    @Override // ad.InterfaceC1366k
    public final void onAdLoaded() {
        C4477h c4477h = this.f17495c;
        if (c4477h != null) {
            this.f17494b.z(this.f17586a, c4477h.getResponseInfo());
        }
    }
}
