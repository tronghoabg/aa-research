package j$.util.stream;

import java.util.stream.Gatherer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class p0 implements Gatherer.Downstream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f50564a;

    public final /* synthetic */ boolean equals(Object obj) {
        q0 q0Var = this.f50564a;
        if (obj instanceof p0) {
            obj = ((p0) obj).f50564a;
        }
        return q0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50564a.hashCode();
    }

    public final /* synthetic */ boolean isRejecting() {
        return this.f50564a.isRejecting();
    }

    public final /* synthetic */ boolean push(Object obj) {
        return this.f50564a.push(obj);
    }
}
