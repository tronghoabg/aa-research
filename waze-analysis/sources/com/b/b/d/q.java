package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f2673a = new q();

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("shuffle")
    @com.google.l.a.b(a = "shuffle")
    public final boolean f2674b = false;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("repeat")
    @com.google.l.a.b(a = "repeat")
    public final int f2675c = 0;

    private q() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f2674b == qVar.f2674b && this.f2675c == qVar.f2675c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2674b ? 1 : 0) * 31) + this.f2675c;
    }

    public final String toString() {
        return "PlayerOptions{isShuffling=" + this.f2674b + ", repeatMode=" + this.f2675c + "}";
    }
}
