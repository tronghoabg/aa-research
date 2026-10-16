package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class uoc {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/TileStoreCacheImpl");
    public final abgl b;
    public final uoo c;
    public final uol d;
    public final uol e;
    public uob f = uob.a;
    private final long g;
    private final zgt h;

    public uoc(abgl abglVar, uoo uooVar, uol uolVar, uol uolVar2, zgt zgtVar) {
        this.b = abglVar;
        this.c = uooVar;
        this.e = uolVar2;
        this.d = uolVar;
        this.g = abglVar == abgl.GMM_SATELLITE ? 1000L : 3000L;
        this.h = zgtVar;
    }

    public final synchronized void a(boolean z) {
        uob uobVar;
        uob uobVar2 = this.f;
        if (uobVar2 == uob.a) {
            this.f = uob.b;
            zgt zgtVar = this.h;
            lws.M(zgtVar.schedule(new ueh(this, 19), this.g, TimeUnit.MILLISECONDS), zgtVar);
        } else {
            if (uobVar2 != uob.b && uobVar2 != uob.c && uobVar2 != (uobVar = uob.e) && uobVar2 == uob.d) {
                this.f = uobVar;
            }
        }
    }
}
