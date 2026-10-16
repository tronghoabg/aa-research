package com.b.b.d;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("image_data")
    @com.google.l.a.b(a = "image_data")
    public final byte[] f2638a = null;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty("width")
    @com.google.l.a.b(a = "width")
    public final int f2639b = 0;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty("height")
    @com.google.l.a.b(a = "height")
    public final int f2640c = 0;

    private g() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f2639b == gVar.f2639b && this.f2640c == gVar.f2640c) {
            return Arrays.equals(this.f2638a, gVar.f2638a);
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f2638a) * 31) + this.f2639b) * 31) + this.f2640c;
    }

    public final String toString() {
        return "Image{imageData=" + Arrays.toString(this.f2638a) + ", width=" + this.f2639b + ", height=" + this.f2640c + "}";
    }
}
