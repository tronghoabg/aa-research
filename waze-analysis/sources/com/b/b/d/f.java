package com.b.b.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty(TtmlNode.ATTR_ID)
    @com.google.l.a.b(a = TtmlNode.ATTR_ID)
    public final String f2637a;

    public f(String str) {
        this.f2637a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f2637a;
        return str != null ? str.equals(fVar.f2637a) : fVar.f2637a == null;
    }

    public final int hashCode() {
        String str = this.f2637a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Identifier{id='" + this.f2637a + "'}";
    }

    private f() {
        this(null);
    }
}
