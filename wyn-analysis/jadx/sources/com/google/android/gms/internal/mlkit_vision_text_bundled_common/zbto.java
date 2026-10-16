package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
final class zbto {
    private final Object zba;
    private final int zbb;

    public zbto(Object obj, int i5) {
        this.zba = obj;
        this.zbb = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbto)) {
            return false;
        }
        zbto zbtoVar = (zbto) obj;
        return this.zba == zbtoVar.zba && this.zbb == zbtoVar.zbb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zba) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zbb;
    }
}
