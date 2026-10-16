package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class WazeTtsPlayerNativeManager extends km implements kk {
    public static final int $stable = 0;

    public final native void initNativeLayerNTV();

    @Override // com.waze.sound.kk
    public void play(String str, boolean z) {
        h.g.b.x.f(str, "text");
        km.playActual$default(this, str, z, null, 4, null);
    }

    public final native void playActualNTV(String str, boolean z);
}
