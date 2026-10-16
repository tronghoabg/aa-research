package com.google.android.gms.car.display;

/* JADX INFO: loaded from: classes2.dex */
public final class UiStyle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.display.UiStyle> CREATOR = new defpackage.rih(18);
    public final defpackage.ygw a;
    public final defpackage.ygw b;

    public UiStyle(java.util.List list, java.util.List list2) {
        this.a = defpackage.ygw.o(list);
        this.b = defpackage.ygw.o(list2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.car.display.UiStyle) {
            com.google.android.gms.car.display.UiStyle uiStyle = (com.google.android.gms.car.display.UiStyle) obj;
            if (j$.util.Objects.equals(this.a, uiStyle.a) && j$.util.Objects.equals(this.b, uiStyle.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b);
    }

    public final java.lang.String toString() {
        defpackage.ygw ygwVar = this.b;
        return "UiStyle{lightTokens=" + java.lang.String.valueOf(this.a) + ", darkTokens=" + java.lang.String.valueOf(ygwVar) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, this.a);
        defpackage.sqs.N(parcel, 2, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
