package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("track")
    @com.google.l.a.b(a = "track")
    public final u f2683a = null;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("is_paused")
    @com.google.l.a.b(a = "is_paused")
    public final boolean f2684b = false;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("playback_speed")
    @com.google.l.a.b(a = "playback_speed")
    public final float f2685c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty("playback_position")
    @com.google.l.a.b(a = "playback_position")
    public final long f2686d = 0;

    /* renamed from: e, reason: collision with root package name */
    @JsonProperty("playback_options")
    @com.google.l.a.b(a = "playback_options")
    public final q f2687e = q.f2673a;

    /* renamed from: f, reason: collision with root package name */
    @JsonProperty("playback_restrictions")
    @com.google.l.a.b(a = "playback_restrictions")
    public final r f2688f = r.f2676a;

    private s() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f2684b != sVar.f2684b || Float.compare(sVar.f2685c, this.f2685c) != 0 || this.f2686d != sVar.f2686d) {
            return false;
        }
        if (this.f2683a != null) {
            throw null;
        }
        if (sVar.f2683a != null) {
            return false;
        }
        q qVar = this.f2687e;
        if (qVar == null ? sVar.f2687e != null : !qVar.equals(sVar.f2687e)) {
            return false;
        }
        r rVar = this.f2688f;
        return rVar != null ? rVar.equals(sVar.f2688f) : sVar.f2688f == null;
    }

    public final int hashCode() {
        if (this.f2683a != null) {
            throw null;
        }
        boolean z = this.f2684b;
        float f2 = this.f2685c;
        int iFloatToIntBits = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        int i2 = (z ? 1 : 0) * 31;
        long j2 = this.f2686d;
        q qVar = this.f2687e;
        int iHashCode = (((((i2 + iFloatToIntBits) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (qVar != null ? qVar.hashCode() : 0)) * 31;
        r rVar = this.f2688f;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        r rVar = this.f2688f;
        q qVar = this.f2687e;
        return "PlayerState{track=" + String.valueOf(this.f2683a) + ", isPaused=" + this.f2684b + ", playbackSpeed=" + this.f2685c + ", playbackPosition=" + this.f2686d + ", playbackOptions=" + String.valueOf(qVar) + ", playbackRestrictions=" + String.valueOf(rVar) + "}";
    }
}
