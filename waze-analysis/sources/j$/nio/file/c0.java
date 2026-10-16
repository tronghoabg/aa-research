package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class c0 implements WatchEvent.Kind {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f49743a;

    public final /* synthetic */ boolean equals(Object obj) {
        d0 d0Var = this.f49743a;
        if (obj instanceof c0) {
            obj = ((c0) obj).f49743a;
        }
        return d0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49743a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.f49743a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.f49743a.type();
    }
}
