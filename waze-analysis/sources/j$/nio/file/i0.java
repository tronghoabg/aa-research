package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class i0 implements WatchEvent {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f49753a;

    public /* synthetic */ i0(j0 j0Var) {
        this.f49753a = j0Var;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ Object context() {
        return a.g(((h0) this.f49753a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((h0) this.f49753a).b();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        j0 j0Var = this.f49753a;
        if (obj instanceof i0) {
            obj = ((i0) obj).f49753a;
        }
        return j0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49753a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ WatchEvent.Kind kind() {
        return a.f(((h0) this.f49753a).c());
    }
}
