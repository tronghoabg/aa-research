package com.google.android.gms.car.navigation;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationState extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.navigation.NavigationState> CREATOR = new defpackage.rsh(11);
    private final java.util.List a;
    private final java.util.List b;
    private final java.util.List c;

    public NavigationState(java.util.List list, java.util.List list2, java.util.List list3) {
        defpackage.ygw ygwVarO;
        if (list == null) {
            int i = defpackage.ygw.d;
            ygwVarO = defpackage.ymx.a;
        } else {
            ygwVarO = defpackage.ygw.o(list);
        }
        this.a = ygwVarO;
        this.b = list2 == null ? defpackage.ymx.a : defpackage.ygw.o(list2);
        this.c = list3 == null ? defpackage.ymx.a : defpackage.ygw.o(list3);
    }

    public final defpackage.ygw a() {
        return defpackage.ygw.o(this.c);
    }

    public final defpackage.ygw b() {
        return defpackage.ygw.o(this.b);
    }

    public final defpackage.ygw c() {
        return defpackage.ygw.o(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.car.navigation.NavigationState navigationState = (com.google.android.gms.car.navigation.NavigationState) obj;
            if (j$.util.Objects.equals(this.a, navigationState.a) && j$.util.Objects.equals(this.b, navigationState.b) && j$.util.Objects.equals(this.c, navigationState.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c);
    }

    public final java.lang.String toString() {
        java.util.List list = this.c;
        java.util.List list2 = this.b;
        return "NavigationState{navigationSteps=" + java.lang.String.valueOf(this.a) + ", destinations=" + java.lang.String.valueOf(list2) + ", destinationDetails" + java.lang.String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.N(parcel, 1, c());
        defpackage.sqs.L(parcel, 2, b());
        defpackage.sqs.N(parcel, 3, a());
        defpackage.sqs.q(parcel, iP);
    }
}
