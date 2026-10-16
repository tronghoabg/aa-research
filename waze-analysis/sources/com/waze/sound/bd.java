package com.waze.sound;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f39518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f39519b;

    bd(bg bgVar, boolean z, String str) {
        this.f39518a = z;
        this.f39519b = str;
        Objects.requireNonNull(bgVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f39518a;
        String str = this.f39519b;
        if (z) {
            SoundNativeManager.getInstance().finishEditCustomPromptSet(true, str);
        } else {
            SoundNativeManager.getInstance().saveCustomPrompt(str);
        }
    }
}
