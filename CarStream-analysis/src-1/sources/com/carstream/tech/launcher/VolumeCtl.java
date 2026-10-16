package com.carstream.tech.launcher;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class VolumeCtl {
    private static final int STREAM = 3;
    private final AudioManager am;

    public VolumeCtl(Context context) {
        this.am = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int get() {
        try {
            return this.am.getStreamVolume(3);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int max() {
        try {
            return Math.max(1, this.am.getStreamMaxVolume(3));
        } catch (Throwable unused) {
            return 15;
        }
    }

    public float ratio() {
        return get() / max();
    }

    public void set(int i) {
        try {
            this.am.setStreamVolume(3, Math.max(0, Math.min(max(), i)), 0);
        } catch (Throwable unused) {
        }
    }

    public void step(int i) {
        set(get() + i);
    }
}
