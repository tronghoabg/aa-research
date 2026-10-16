package com.b.b.d;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty("protocol_version")
    @com.google.l.a.b(a = "protocol_version")
    public final int f2643a;

    /* renamed from: b, reason: collision with root package name */
    @JsonProperty(TtmlNode.ATTR_ID)
    @com.google.l.a.b(a = TtmlNode.ATTR_ID)
    public final String f2644b;

    /* renamed from: c, reason: collision with root package name */
    @JsonProperty(HintConstants.AUTOFILL_HINT_NAME)
    @com.google.l.a.b(a = HintConstants.AUTOFILL_HINT_NAME)
    public final String f2645c;

    /* renamed from: d, reason: collision with root package name */
    @JsonProperty("model")
    @com.google.l.a.b(a = "model")
    public final String f2646d;

    /* renamed from: e, reason: collision with root package name */
    @JsonProperty("category")
    @com.google.l.a.b(a = "category")
    public final String f2647e;

    /* renamed from: f, reason: collision with root package name */
    @JsonProperty("version")
    @com.google.l.a.b(a = "version")
    public final String f2648f;

    /* renamed from: g, reason: collision with root package name */
    @JsonProperty("image_type")
    @com.google.l.a.b(a = "image_type")
    public final String f2649g;

    /* renamed from: h, reason: collision with root package name */
    @JsonProperty("required_features")
    @com.google.l.a.b(a = "required_features")
    public final List<String> f2650h;

    /* renamed from: i, reason: collision with root package name */
    @JsonProperty("default_image_height")
    @com.google.l.a.b(a = "default_image_height")
    public final int f2651i;

    /* renamed from: j, reason: collision with root package name */
    @JsonProperty("default_image_width")
    @com.google.l.a.b(a = "default_image_width")
    public final int f2652j;

    /* renamed from: k, reason: collision with root package name */
    @JsonProperty("default_thumbnail_image_height")
    @com.google.l.a.b(a = "default_thumbnail_image_height")
    public final int f2653k;

    /* renamed from: l, reason: collision with root package name */
    @JsonProperty("default_thumbnail_image_width")
    @com.google.l.a.b(a = "default_thumbnail_image_width")
    public final int f2654l;

    public j(int i2, List list, String str, String str2, String str3, String str4) {
        this.f2643a = i2;
        this.f2644b = str;
        this.f2645c = str2;
        this.f2646d = null;
        this.f2647e = str3;
        this.f2648f = str4;
        this.f2649g = null;
        this.f2650h = list;
        this.f2651i = 0;
        this.f2652j = 0;
        this.f2653k = 0;
        this.f2654l = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f2643a != jVar.f2643a || this.f2651i != jVar.f2651i || this.f2652j != jVar.f2652j || this.f2653k != jVar.f2653k || this.f2654l != jVar.f2654l) {
            return false;
        }
        String str = this.f2644b;
        if (str == null ? jVar.f2644b != null : !str.equals(jVar.f2644b)) {
            return false;
        }
        String str2 = this.f2645c;
        if (str2 == null ? jVar.f2645c != null : !str2.equals(jVar.f2645c)) {
            return false;
        }
        String str3 = this.f2646d;
        if (str3 == null ? jVar.f2646d != null : !str3.equals(jVar.f2646d)) {
            return false;
        }
        String str4 = this.f2647e;
        if (str4 == null ? jVar.f2647e != null : !str4.equals(jVar.f2647e)) {
            return false;
        }
        String str5 = this.f2648f;
        if (str5 == null ? jVar.f2648f != null : !str5.equals(jVar.f2648f)) {
            return false;
        }
        String str6 = this.f2649g;
        if (str6 == null ? jVar.f2649g != null : !str6.equals(jVar.f2649g)) {
            return false;
        }
        List<String> list = this.f2650h;
        return list == null ? jVar.f2650h == null : list.equals(jVar.f2650h);
    }

    public final int hashCode() {
        String str = this.f2644b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i2 = this.f2643a;
        String str2 = this.f2645c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i3 = (i2 * 31) + iHashCode;
        String str3 = this.f2646d;
        int iHashCode3 = ((((i3 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f2647e;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f2648f;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f2649g;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.f2650h;
        return ((((((((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.f2651i) * 31) + this.f2652j) * 31) + this.f2653k) * 31) + this.f2654l;
    }

    public final String toString() {
        return "Info{protocolVersion=" + this.f2643a + ", id='" + this.f2644b + "', name='" + this.f2645c + "', model='" + this.f2646d + "', category='" + this.f2647e + "', version='" + this.f2648f + "', imageType='" + this.f2649g + "', requiredFeatures=" + String.valueOf(this.f2650h) + ", defaultImageHeight=" + this.f2651i + ", defaultImageWidth=" + this.f2652j + ", defaultThumbnailImageHeight=" + this.f2653k + ", defaultThumbnailImageWidth=" + this.f2654l + "}";
    }

    private j() {
        this(0, null, null, null, null, null);
    }
}
