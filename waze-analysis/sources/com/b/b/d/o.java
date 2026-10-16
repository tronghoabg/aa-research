package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("playback_speed")
    @com.google.l.a.b(a = "playback_speed")
    public final int f2668a;

    public o(int i2) {
        this.f2668a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f2668a == ((o) obj).f2668a;
    }

    public final int hashCode() {
        return this.f2668a;
    }

    public final String toString() {
        return "PlaybackSpeed{playbackSpeed=" + this.f2668a + "}";
    }

    protected o() {
        this(0);
    }
}
