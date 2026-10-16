package com.waze.z.a.a;

import androidx.compose.ui.unit.Dp;
import com.waze.z.a.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.i f45565a;

    /* renamed from: b, reason: collision with root package name */
    private final s f45566b;

    /* renamed from: c, reason: collision with root package name */
    private final Dp f45567c;

    private a(com.waze.ui.ac.i iVar, s sVar, Dp dp) {
        x.f(iVar, "imageSource");
        x.f(sVar, "imageProperties");
        this.f45565a = iVar;
        this.f45566b = sVar;
        this.f45567c = dp;
    }

    public final Dp a() {
        return this.f45567c;
    }

    public final s b() {
        return this.f45566b;
    }

    public final com.waze.ui.ac.i c() {
        return this.f45565a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f45565a, aVar.f45565a) && x.n(this.f45566b, aVar.f45566b) && x.n(this.f45567c, aVar.f45567c);
    }

    public final int hashCode() {
        int iHashCode = (this.f45565a.hashCode() * 31) + this.f45566b.hashCode();
        Dp dp = this.f45567c;
        return (iHashCode * 31) + (dp == null ? 0 : Dp.m11170hashCodeimpl(dp.m11178unboximpl()));
    }

    public final String toString() {
        return "ActionCellImage(imageSource=" + this.f45565a + ", imageProperties=" + this.f45566b + ", imageSize=" + this.f45567c + ")";
    }

    public /* synthetic */ a(com.waze.ui.ac.i iVar, s sVar, Dp dp, byte[] bArr) {
        this(iVar, sVar, dp);
    }

    public /* synthetic */ a(com.waze.ui.ac.i iVar, s sVar, int i2) {
        this(iVar, (i2 & 2) != 0 ? s.f46181a : sVar, (Dp) null);
    }
}
