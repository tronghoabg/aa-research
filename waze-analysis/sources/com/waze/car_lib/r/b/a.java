package com.waze.car_lib.r.b;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ui.ac.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21003a;

    /* renamed from: b, reason: collision with root package name */
    private final n f21004b;

    /* renamed from: c, reason: collision with root package name */
    private final n f21005c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21006d;

    public a(String str, n nVar, n nVar2, boolean z) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(nVar, HintConstants.AUTOFILL_HINT_NAME);
        this.f21003a = str;
        this.f21004b = nVar;
        this.f21005c = nVar2;
        this.f21006d = z;
    }

    public final n a() {
        return this.f21005c;
    }

    public final n b() {
        return this.f21004b;
    }

    public final String c() {
        return this.f21003a;
    }

    public final boolean d() {
        return this.f21006d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f21003a, aVar.f21003a) && x.n(this.f21004b, aVar.f21004b) && x.n(this.f21005c, aVar.f21005c) && this.f21006d == aVar.f21006d;
    }

    public final int hashCode() {
        int iHashCode = (this.f21003a.hashCode() * 31) + this.f21004b.hashCode();
        n nVar = this.f21005c;
        return (((iHashCode * 31) + (nVar == null ? 0 : nVar.hashCode())) * 31) + a.a.a(this.f21006d);
    }

    public final String toString() {
        return "Permit(id=" + this.f21003a + ", name=" + this.f21004b + ", description=" + this.f21005c + ", isSelected=" + this.f21006d + ")";
    }
}
