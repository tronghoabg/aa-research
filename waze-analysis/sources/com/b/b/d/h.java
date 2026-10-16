package com.b.b.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty(TtmlNode.ATTR_ID)
    public final String f2641a;

    public h(String str) {
        this.f2641a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f2641a;
        return str == null ? hVar.f2641a == null : str.equals(hVar.f2641a);
    }

    public final int hashCode() {
        String str = this.f2641a;
        return ((((str != null ? str.hashCode() : 0) * 31) + DisplayStrings.DS_KM_PD) * 31) + DisplayStrings.DS_KM_PD;
    }
}
