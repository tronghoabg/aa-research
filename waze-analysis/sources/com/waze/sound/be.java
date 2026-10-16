package com.waze.sound;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class be implements Runnable {
    be(bg bgVar) {
        Objects.requireNonNull(bgVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SoundNativeManager.getInstance().finishEditCustomPromptSet(false, "");
    }
}
