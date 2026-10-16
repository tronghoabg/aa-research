package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class e0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent.Modifier f49746a;

    public final /* synthetic */ String a() {
        return this.f49746a.name();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.f49746a;
        if (obj instanceof e0) {
            obj = ((e0) obj).f49746a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49746a.hashCode();
    }
}
