package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class KeyEventCompleteData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyEventCompleteData> CREATOR = new qte(6);
    public final boolean a;
    private final Rect b;

    public KeyEventCompleteData(boolean z, Rect rect) {
        this.a = z;
        this.b = rect == null ? null : new Rect(rect);
    }

    public final Rect a() {
        Rect rect = this.b;
        if (rect == null) {
            return null;
        }
        return new Rect(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyEventCompleteData keyEventCompleteData = (KeyEventCompleteData) obj;
        if (this.a != keyEventCompleteData.a) {
            return false;
        }
        return Objects.equals(this.b, keyEventCompleteData.b);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "KeyEventCompleteData{handled=" + this.a + ", currentFocus=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, this.a);
        spu.E(parcel, 2, a(), i);
        spu.m(parcel, iL);
    }
}
