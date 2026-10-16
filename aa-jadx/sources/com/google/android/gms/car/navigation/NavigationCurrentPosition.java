package com.google.android.gms.car.navigation;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationCurrentPosition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.navigation.NavigationCurrentPosition> CREATOR = new defpackage.rsh(10);
    public final com.google.android.gms.car.navigation.StepDistance a;
    public final java.lang.String b;
    private final java.util.List c;

    public NavigationCurrentPosition(com.google.android.gms.car.navigation.StepDistance stepDistance, java.util.List list, java.lang.String str) {
        defpackage.ygw ygwVarO;
        this.a = stepDistance;
        if (list == null) {
            int i = defpackage.ygw.d;
            ygwVarO = defpackage.ymx.a;
        } else {
            ygwVarO = defpackage.ygw.o(list);
        }
        this.c = ygwVarO;
        this.b = str;
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.car.navigation.NavigationCurrentPosition navigationCurrentPosition = (com.google.android.gms.car.navigation.NavigationCurrentPosition) obj;
            if (j$.util.Objects.equals(this.a, navigationCurrentPosition.a) && j$.util.Objects.equals(this.c, navigationCurrentPosition.c) && j$.util.Objects.equals(this.b, navigationCurrentPosition.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.c, this.b);
    }

    public final java.lang.String toString() {
        java.util.List list = this.c;
        return "NavigationCurrentPosition{stepDistance=" + java.lang.String.valueOf(this.a) + ", destinationDistances=" + java.lang.String.valueOf(list) + ", currentRoad='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.I(parcel, 1, this.a, i);
        defpackage.sqs.N(parcel, 2, a());
        defpackage.sqs.J(parcel, 3, this.b);
        defpackage.sqs.q(parcel, iP);
    }
}
