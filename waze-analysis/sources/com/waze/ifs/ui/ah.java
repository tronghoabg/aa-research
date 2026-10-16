package com.waze.ifs.ui;

import android.graphics.drawable.Drawable;
import com.waze.gas.GasNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final String f24507a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f24508b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f24509c;

    public ah(String str, Drawable drawable, Drawable drawable2) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        this.f24507a = str;
        this.f24508b = drawable;
        this.f24509c = drawable2;
    }

    public final Drawable a() {
        return this.f24508b;
    }

    public final Drawable b() {
        return this.f24509c;
    }

    public final String c() {
        return this.f24507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f24507a, ahVar.f24507a) && h.g.b.x.n(this.f24508b, ahVar.f24508b) && h.g.b.x.n(this.f24509c, ahVar.f24509c);
    }

    public final int hashCode() {
        int iHashCode = this.f24507a.hashCode() * 31;
        Drawable drawable = this.f24508b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f24509c;
        return iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        return "OptionData(title=" + this.f24507a + ", selected=" + this.f24508b + ", unselected=" + this.f24509c + ")";
    }
}
