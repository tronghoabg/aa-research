package com.waze.notifications;

import com.waze.sound.SoundNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        SoundNativeManager.getInstance().playSoundFile(WazeNotificationNativeManager.SOUND_TRAFFIC_DETECTION_NOTIFICATION);
    }
}
