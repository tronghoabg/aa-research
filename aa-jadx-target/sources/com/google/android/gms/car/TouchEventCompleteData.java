package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class TouchEventCompleteData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.TouchEventCompleteData> CREATOR = new qua(17);
    public final int a;
    public final android.graphics.Rect b;
    public final int c;

    public TouchEventCompleteData(int i, android.graphics.Rect rect, int i2) {
        this.a = i;
        this.b = rect;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData = (com.google.android.gms.car.TouchEventCompleteData) obj;
        if (this.a == touchEventCompleteData.a && this.c == touchEventCompleteData.c) {
            return j$.util.Objects.equals(this.b, touchEventCompleteData.b);
        }
        return false;
    }

    public final int hashCode() {
        android.graphics.Rect rect = this.b;
        return (((this.a * 31) + (rect != null ? rect.hashCode() : 0)) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "TouchEventCompleteData{hint=" + this.a + ", currentFocus=" + java.lang.String.valueOf(this.b) + ", direction=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.I(parcel, 2, this.b, i);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.q(parcel, iP);
    }
}
