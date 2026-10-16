package com.google.android.gms.common;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = new defpackage.rcy(19);
    public final java.lang.String a;

    @java.lang.Deprecated
    public final int b;
    public final boolean c;
    private final long d;

    public Feature(java.lang.String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.d = j;
        this.c = z;
    }

    public final long a() {
        long j = this.d;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.common.Feature feature;
        return (obj instanceof com.google.android.gms.common.Feature) && (feature = (com.google.android.gms.common.Feature) obj) != null && j$.util.Objects.equals(this.a, feature.a) && a() == feature.a() && this.c == feature.c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Long.valueOf(a()), java.lang.Boolean.valueOf(this.c)});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        sqg.b("name", this.a, arrayList);
        sqg.b("version", java.lang.Long.valueOf(a()), arrayList);
        sqg.b("is_fully_rolled_out", java.lang.Boolean.valueOf(this.c), arrayList);
        return sqg.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 1);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        int i2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        long jA = a();
        parcel.writeInt(524291);
        parcel.writeLong(jA);
        boolean z = this.c;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        defpackage.sqs.q(parcel, iP);
    }
}
