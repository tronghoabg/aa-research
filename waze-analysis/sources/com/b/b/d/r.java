package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f2676a = new r();

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("can_skip_next")
    @com.google.l.a.b(a = "can_skip_next")
    public final boolean f2677b = false;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("can_skip_prev")
    @com.google.l.a.b(a = "can_skip_prev")
    public final boolean f2678c = false;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty("can_repeat_track")
    @com.google.l.a.b(a = "can_repeat_track")
    public final boolean f2679d = false;

    /* renamed from: e, reason: collision with root package name */
    @JsonProperty("can_repeat_context")
    @com.google.l.a.b(a = "can_repeat_context")
    public final boolean f2680e = false;

    /* renamed from: f, reason: collision with root package name */
    @JsonProperty("can_toggle_shuffle")
    @com.google.l.a.b(a = "can_toggle_shuffle")
    public final boolean f2681f = false;

    /* renamed from: g, reason: collision with root package name */
    @JsonProperty("can_seek")
    @com.google.l.a.b(a = "can_seek")
    public final boolean f2682g = false;

    private r() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f2677b == rVar.f2677b && this.f2678c == rVar.f2678c && this.f2679d == rVar.f2679d && this.f2680e == rVar.f2680e && this.f2681f == rVar.f2681f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f2677b ? 1 : 0) * 31) + (this.f2678c ? 1 : 0)) * 31) + (this.f2679d ? 1 : 0)) * 31) + (this.f2680e ? 1 : 0)) * 31) + (this.f2681f ? 1 : 0);
    }

    public final String toString() {
        return "PlayerRestrictions{canSkipNext=" + this.f2677b + ", canSkipPrev=" + this.f2678c + ", canRepeatTrack=" + this.f2679d + ", canRepeatContext=" + this.f2680e + ", canToggleShuffle=" + this.f2681f + "}";
    }
}
