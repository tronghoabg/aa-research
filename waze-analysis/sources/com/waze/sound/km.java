package com.waze.sound;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class km {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playActual$default(km kmVar, String str, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playActual");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        kmVar.playActual(str, z, lVar);
    }

    static final h.ab playActual$lambda$0(km kmVar, String str, boolean z) {
        h.g.b.x.d(kmVar, "null cannot be cast to non-null type com.waze.sound.WazeTtsPlayerNativeManager");
        ((WazeTtsPlayerNativeManager) kmVar).playActualNTV(str, z);
        return null;
    }

    public void playActual(String str, boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "text");
        NativeManager.runNativeTask(new kl(this, str, z, 0), lVar != null ? new ew(lVar, 18) : null);
    }

    public final void playActual(String str, boolean z) {
        h.g.b.x.f(str, "text");
        playActual$default(this, str, z, null, 4, null);
    }
}
