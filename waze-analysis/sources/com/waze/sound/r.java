package com.waze.sound;

import android.media.AudioFocusRequest;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.sharedrive.a.s {

    /* renamed from: a, reason: collision with root package name */
    private final AudioFocusRequest f40415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AudioFocusRequest audioFocusRequest) {
        super(null, null);
        h.g.b.x.f(audioFocusRequest, "audioFocusRequest");
        this.f40415a = audioFocusRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && h.g.b.x.n(this.f40415a, ((r) obj).f40415a);
    }

    public final int hashCode() {
        return this.f40415a.hashCode();
    }

    public final AudioFocusRequest l() {
        return this.f40415a;
    }

    public final String toString() {
        return "HasFocus(audioFocusRequest=" + this.f40415a + ")";
    }
}
