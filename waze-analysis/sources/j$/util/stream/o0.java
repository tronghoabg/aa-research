package j$.util.stream;

import java.util.stream.Gatherer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class o0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gatherer.Downstream f50548a;

    public final /* synthetic */ boolean equals(Object obj) {
        Gatherer.Downstream downstream = this.f50548a;
        if (obj instanceof o0) {
            obj = ((o0) obj).f50548a;
        }
        return downstream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50548a.hashCode();
    }

    @Override // j$.util.stream.q0
    public final /* synthetic */ boolean isRejecting() {
        return this.f50548a.isRejecting();
    }

    @Override // j$.util.stream.q0
    public final /* synthetic */ boolean push(Object obj) {
        return this.f50548a.push(obj);
    }
}
