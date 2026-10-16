package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class jw implements ig {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.a.ad f40348a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40349b;

    public /* synthetic */ jw(kotlinx.coroutines.a.ad adVar, int i2) {
        this.f40349b = i2;
        this.f40348a = adVar;
    }

    /* JADX WARN: Failed to inline method: com.waze.sound.ec.c(kotlinx.coroutines.a.ad, int):void */
    /* JADX WARN: Unknown register number '(r2v0 int)' in method call: com.waze.sound.ec.c(kotlinx.coroutines.a.ad, int):void */
    @Override // com.waze.sound.ig
    public final void a(int i2) {
        int i3 = this.f40349b;
        kotlinx.coroutines.a.ad adVar = this.f40348a;
        if (i3 != 0) {
            kotlinx.coroutines.a.ab.e(adVar, (i2 == 0 || i2 + (-1) == 0) ? com.waze.z.a.d.ap.f45940b : com.waze.z.a.d.ap.f45939a);
        } else {
            ec.c(adVar, i2);
        }
    }
}
