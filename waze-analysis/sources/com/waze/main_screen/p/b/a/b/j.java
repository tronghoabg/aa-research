package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.ea;
import com.waze.navigate.ee;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ee f27113a;

    /* renamed from: b, reason: collision with root package name */
    public final ea f27114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27115c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27116d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27117e;

    public j(ee eeVar, ea eaVar, String str, String str2, boolean z) {
        this.f27113a = eeVar;
        this.f27114b = eaVar;
        this.f27115c = str;
        this.f27116d = str2;
        this.f27117e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return x.n(this.f27113a, jVar.f27113a) && this.f27114b == jVar.f27114b && x.n(this.f27115c, jVar.f27115c) && x.n(this.f27116d, jVar.f27116d) && this.f27117e == jVar.f27117e;
    }

    public final int hashCode() {
        ee eeVar = this.f27113a;
        int iHashCode = eeVar == null ? 0 : eeVar.hashCode();
        ea eaVar = this.f27114b;
        int iHashCode2 = eaVar == null ? 0 : eaVar.hashCode();
        int i2 = iHashCode * 31;
        String str = this.f27115c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27116d;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + a.a.a(this.f27117e);
    }

    public final String toString() {
        return "NextInstruction(roadSign=" + this.f27113a + ", type=" + this.f27114b + ", iconText=" + this.f27115c + ", streetName=" + this.f27116d + ", iconBeforeText=" + this.f27117e + ")";
    }
}
