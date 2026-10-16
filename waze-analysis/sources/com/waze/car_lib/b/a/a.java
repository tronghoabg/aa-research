package com.waze.car_lib.b.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18929a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18930b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18931c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18932d;

    public a(String str, String str2, String str3, int i2) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str3, "tts");
        this.f18929a = str;
        this.f18930b = str2;
        this.f18931c = str3;
        this.f18932d = i2;
    }

    public final int a() {
        return this.f18932d;
    }

    public final String b() {
        return this.f18930b;
    }

    public final String c() {
        return this.f18931c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f18929a, aVar.f18929a) && x.n(this.f18930b, aVar.f18930b) && x.n(this.f18931c, aVar.f18931c) && this.f18932d == aVar.f18932d;
    }

    public final int hashCode() {
        return (((((this.f18929a.hashCode() * 31) + this.f18930b.hashCode()) * 31) + this.f18931c.hashCode()) * 31) + this.f18932d;
    }

    public final String toString() {
        return "ConversationalReportUiItem(id=" + this.f18929a + ", title=" + this.f18930b + ", tts=" + this.f18931c + ", iconResId=" + this.f18932d + ")";
    }
}
