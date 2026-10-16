package com.waze.navbar;

import android.location.Location;
import com.waze.ConfigManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f30891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30893c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f30894d;

    public /* synthetic */ i(ConfigManager configManager, com.waze.config.c cVar, long j2, int i2) {
        this.f30894d = i2;
        this.f30893c = configManager;
        this.f30892b = cVar;
        this.f30891a = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f30894d;
        long j2 = this.f30891a;
        if (i2 != 0) {
            ((ConfigManager) this.f30893c).lambda$setConfigValueLong$0((com.waze.config.c) this.f30892b, j2);
        } else {
            p.j((p) this.f30892b, (Location) this.f30893c, j2);
        }
    }

    public /* synthetic */ i(p pVar, Location location, long j2, int i2) {
        this.f30894d = i2;
        this.f30892b = pVar;
        this.f30893c = location;
        this.f30891a = j2;
    }
}
