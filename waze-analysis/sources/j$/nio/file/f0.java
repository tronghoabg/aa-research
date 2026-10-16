package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class f0 implements WatchEvent.Modifier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f49749a;

    public /* synthetic */ f0(g0 g0Var) {
        this.f49749a = g0Var;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        g0 g0Var = this.f49749a;
        if (obj instanceof f0) {
            obj = ((f0) obj).f49749a;
        }
        return g0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49749a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return ((e0) this.f49749a).a();
    }
}
