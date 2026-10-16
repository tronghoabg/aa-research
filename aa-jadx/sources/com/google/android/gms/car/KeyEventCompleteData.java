package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyEventCompleteData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.KeyEventCompleteData> CREATOR = new defpackage.qua(6);
    public final boolean a;
    private final android.graphics.Rect b;

    public KeyEventCompleteData(boolean z, android.graphics.Rect rect) {
        this.a = z;
        this.b = rect == null ? null : new android.graphics.Rect(rect);
    }

    public final android.graphics.Rect a() {
        android.graphics.Rect rect = this.b;
        if (rect == null) {
            return null;
        }
        return new android.graphics.Rect(rect);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData = (com.google.android.gms.car.KeyEventCompleteData) obj;
        if (this.a != keyEventCompleteData.a) {
            return false;
        }
        return j$.util.Objects.equals(this.b, keyEventCompleteData.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.a), this.b);
    }

    public final java.lang.String toString() {
        return "KeyEventCompleteData{handled=" + this.a + ", currentFocus=" + java.lang.String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.r(parcel, 1, this.a);
        defpackage.sqs.I(parcel, 2, a(), i);
        defpackage.sqs.q(parcel, iP);
    }
}
