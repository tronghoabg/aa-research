package com.waze.ui.g;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f42317a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42318b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42319c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42320d;

    public a(String str, String str2, String str3, boolean z) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f42317a = str;
        this.f42318b = str2;
        this.f42319c = str3;
        this.f42320d = z;
    }

    public final String a() {
        return this.f42317a;
    }

    public final String b() {
        return this.f42318b;
    }

    public final String c() {
        return this.f42319c;
    }

    public final boolean d() {
        return this.f42320d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f42317a, aVar.f42317a) && h.g.b.x.n(this.f42318b, aVar.f42318b) && h.g.b.x.n(this.f42319c, aVar.f42319c) && this.f42320d == aVar.f42320d;
    }

    public final int hashCode() {
        int iHashCode = (this.f42317a.hashCode() * 31) + this.f42318b.hashCode();
        String str = this.f42319c;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f42320d);
    }

    public final String toString() {
        return "CarUi(id=" + this.f42317a + ", title=" + this.f42318b + ", iconUrl=" + this.f42319c + ", isSelected=" + this.f42320d + ")";
    }
}
