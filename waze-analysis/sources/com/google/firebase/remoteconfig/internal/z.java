package com.google.firebase.remoteconfig.internal;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z implements com.google.firebase.remoteconfig.g {

    /* renamed from: a, reason: collision with root package name */
    private final String f10751a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10752b;

    z(String str, int i2) {
        this.f10751a = str;
        this.f10752b = i2;
    }

    private final String f() {
        return d().trim();
    }

    @Override // com.google.firebase.remoteconfig.g
    public final double a() {
        if (this.f10752b == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        String strF = f();
        try {
            return Double.valueOf(strF).doubleValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strF, "double"), e2);
        }
    }

    @Override // com.google.firebase.remoteconfig.g
    public final int b() {
        return this.f10752b;
    }

    @Override // com.google.firebase.remoteconfig.g
    public final long c() {
        if (this.f10752b == 0) {
            return 0L;
        }
        String strF = f();
        try {
            return Long.valueOf(strF).longValue();
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strF, "long"), e2);
        }
    }

    @Override // com.google.firebase.remoteconfig.g
    public final String d() {
        return this.f10752b == 0 ? "" : this.f10751a;
    }

    @Override // com.google.firebase.remoteconfig.g
    public final boolean e() {
        if (this.f10752b == 0) {
            return false;
        }
        String strF = f();
        if (n.f10709a.matcher(strF).matches()) {
            return true;
        }
        if (n.f10710b.matcher(strF).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strF, TypedValues.Custom.S_BOOLEAN));
    }
}
