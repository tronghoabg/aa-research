package com.waze.view.popups.b;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f45260a;

    /* renamed from: b, reason: collision with root package name */
    public final i f45261b;

    /* renamed from: c, reason: collision with root package name */
    public final j f45262c;

    public l(Bitmap bitmap, i iVar, j jVar) {
        this.f45260a = bitmap;
        this.f45261b = iVar;
        this.f45262c = jVar;
    }

    public static /* synthetic */ l a(l lVar, Bitmap bitmap, i iVar, j jVar, int i2) {
        if ((i2 & 1) != 0) {
            bitmap = lVar.f45260a;
        }
        if ((i2 & 2) != 0) {
            iVar = lVar.f45261b;
        }
        if ((i2 & 4) != 0) {
            jVar = lVar.f45262c;
        }
        return new l(bitmap, iVar, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.g.b.x.n(this.f45260a, lVar.f45260a) && h.g.b.x.n(this.f45261b, lVar.f45261b) && h.g.b.x.n(this.f45262c, lVar.f45262c);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f45260a;
        int iHashCode = bitmap == null ? 0 : bitmap.hashCode();
        i iVar = this.f45261b;
        int iHashCode2 = iVar == null ? 0 : iVar.hashCode();
        int i2 = iHashCode * 31;
        j jVar = this.f45262c;
        return ((i2 + iHashCode2) * 31) + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "MyParkingPhotoState(bitmap=" + this.f45260a + ", showScreen=" + this.f45261b + ", takeScreen=" + this.f45262c + ")";
    }
}
