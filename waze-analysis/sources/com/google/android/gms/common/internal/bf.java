package com.google.android.gms.common.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    private static bf f5027a;

    /* renamed from: b, reason: collision with root package name */
    private static final bg f5028b = new bg(0, false, false, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    private bg f5029c;

    public static synchronized bf a() {
        bf bfVar;
        bfVar = f5027a;
        if (bfVar == null) {
            bfVar = new bf();
            f5027a = bfVar;
        }
        return bfVar;
    }

    public final bg b() {
        return this.f5029c;
    }

    public final synchronized void c(bg bgVar) {
        if (bgVar == null) {
            this.f5029c = f5028b;
            return;
        }
        bg bgVar2 = this.f5029c;
        if (bgVar2 == null || bgVar2.c() < bgVar.c()) {
            this.f5029c = bgVar;
        }
    }
}
