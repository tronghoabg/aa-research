package com.google.android.gms.car;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.car.CarInfo> CREATOR = new defpackage.qsq();
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public java.lang.String p;
    public java.lang.String q;
    public int r;

    public CarInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, boolean z, int i3, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z2, boolean z3, boolean z4, java.lang.String str9, java.lang.String str10, int i4) {
        int i5;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = str9;
        this.q = str10;
        if (i4 == 0) {
            i5 = 1;
            if (str2 != null && str2.toLowerCase(java.util.Locale.ENGLISH).endsWith("truck")) {
                i5 = 2;
            }
        } else {
            i5 = i4;
        }
        this.r = i5;
    }

    public final defpackage.yyv a() {
        defpackage.abor aborVarN = defpackage.yyv.a.n();
        java.lang.String strBv = defpackage.ysr.bv(this.a);
        aborVarN.t();
        defpackage.yyv yyvVar = (defpackage.yyv) aborVarN.b;
        yyvVar.b |= 1;
        yyvVar.c = strBv;
        java.lang.String strBv2 = defpackage.ysr.bv(this.b);
        aborVarN.t();
        defpackage.yyv yyvVar2 = (defpackage.yyv) aborVarN.b;
        yyvVar2.b |= 2;
        yyvVar2.d = strBv2;
        java.lang.String strBv3 = defpackage.ysr.bv(this.c);
        aborVarN.t();
        defpackage.yyv yyvVar3 = (defpackage.yyv) aborVarN.b;
        yyvVar3.b |= 4;
        yyvVar3.e = strBv3;
        java.lang.String strBv4 = defpackage.ysr.bv(this.k);
        aborVarN.t();
        defpackage.yyv yyvVar4 = (defpackage.yyv) aborVarN.b;
        yyvVar4.b |= 32;
        yyvVar4.h = strBv4;
        java.lang.String strBv5 = defpackage.ysr.bv(this.i);
        aborVarN.t();
        defpackage.yyv yyvVar5 = (defpackage.yyv) aborVarN.b;
        yyvVar5.b |= 8;
        yyvVar5.f = strBv5;
        java.lang.String strBv6 = defpackage.ysr.bv(this.j);
        aborVarN.t();
        defpackage.yyv yyvVar6 = (defpackage.yyv) aborVarN.b;
        yyvVar6.b |= 16;
        yyvVar6.g = strBv6;
        java.lang.String strBv7 = defpackage.ysr.bv(this.l);
        aborVarN.t();
        defpackage.yyv yyvVar7 = (defpackage.yyv) aborVarN.b;
        yyvVar7.b |= 64;
        yyvVar7.i = strBv7;
        int i = this.e;
        java.lang.Integer.valueOf(i).getClass();
        aborVarN.t();
        defpackage.yyv yyvVar8 = (defpackage.yyv) aborVarN.b;
        yyvVar8.b |= 512;
        yyvVar8.j = i;
        int i2 = this.f;
        java.lang.Integer.valueOf(i2).getClass();
        aborVarN.t();
        defpackage.yyv yyvVar9 = (defpackage.yyv) aborVarN.b;
        yyvVar9.b |= 1024;
        yyvVar9.k = i2;
        java.lang.String strBv8 = defpackage.ysr.bv(this.q);
        aborVarN.t();
        defpackage.yyv yyvVar10 = (defpackage.yyv) aborVarN.b;
        yyvVar10.b |= 2048;
        yyvVar10.l = strBv8;
        return (defpackage.yyv) aborVarN.q();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.car.CarInfo)) {
            return false;
        }
        com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) obj;
        return j$.util.Objects.equals(this.a, carInfo.a) && j$.util.Objects.equals(this.b, carInfo.b) && j$.util.Objects.equals(this.c, carInfo.c) && j$.util.Objects.equals(this.d, carInfo.d) && this.e == carInfo.e && this.f == carInfo.f && this.g == carInfo.g && this.h == carInfo.h && j$.util.Objects.equals(this.i, carInfo.i) && j$.util.Objects.equals(this.j, carInfo.j) && j$.util.Objects.equals(this.k, carInfo.k) && j$.util.Objects.equals(this.l, carInfo.l) && this.m == carInfo.m && this.n == carInfo.n && this.o == carInfo.o && j$.util.Objects.equals(this.p, carInfo.p) && j$.util.Objects.equals(this.q, carInfo.q) && this.r == carInfo.r;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c, this.d, java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f)});
    }

    public final java.lang.String toString() {
        return this.a + "," + this.b + "," + this.e + "." + this.f + "," + this.c + "," + this.i + "," + this.j + "," + this.k + "," + this.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iP = defpackage.sqs.p(parcel, 20293);
        java.lang.String str = this.a;
        if (str != null) {
            int iP2 = defpackage.sqs.p(parcel, 1);
            parcel.writeString(str);
            defpackage.sqs.q(parcel, iP2);
        }
        java.lang.String str2 = this.b;
        if (str2 != null) {
            int iP3 = defpackage.sqs.p(parcel, 2);
            parcel.writeString(str2);
            defpackage.sqs.q(parcel, iP3);
        }
        java.lang.String str3 = this.c;
        if (str3 != null) {
            int iP4 = defpackage.sqs.p(parcel, 3);
            parcel.writeString(str3);
            defpackage.sqs.q(parcel, iP4);
        }
        java.lang.String str4 = this.d;
        if (str4 != null) {
            int iP5 = defpackage.sqs.p(parcel, 4);
            parcel.writeString(str4);
            defpackage.sqs.q(parcel, iP5);
        }
        int i2 = this.e;
        parcel.writeInt(262149);
        parcel.writeInt(i2);
        int i3 = this.f;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        boolean z = this.g;
        parcel.writeInt(262151);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.h;
        parcel.writeInt(262152);
        parcel.writeInt(i4);
        java.lang.String str5 = this.i;
        if (str5 != null) {
            int iP6 = defpackage.sqs.p(parcel, 9);
            parcel.writeString(str5);
            defpackage.sqs.q(parcel, iP6);
        }
        java.lang.String str6 = this.j;
        if (str6 != null) {
            int iP7 = defpackage.sqs.p(parcel, 10);
            parcel.writeString(str6);
            defpackage.sqs.q(parcel, iP7);
        }
        java.lang.String str7 = this.k;
        if (str7 != null) {
            int iP8 = defpackage.sqs.p(parcel, 11);
            parcel.writeString(str7);
            defpackage.sqs.q(parcel, iP8);
        }
        java.lang.String str8 = this.l;
        if (str8 != null) {
            int iP9 = defpackage.sqs.p(parcel, 12);
            parcel.writeString(str8);
            defpackage.sqs.q(parcel, iP9);
        }
        boolean z2 = this.m;
        parcel.writeInt(262157);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.n;
        parcel.writeInt(262158);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.o;
        parcel.writeInt(262159);
        parcel.writeInt(z4 ? 1 : 0);
        java.lang.String str9 = this.p;
        if (str9 != null) {
            int iP10 = defpackage.sqs.p(parcel, 16);
            parcel.writeString(str9);
            defpackage.sqs.q(parcel, iP10);
        }
        java.lang.String str10 = this.q;
        if (str10 != null) {
            int iP11 = defpackage.sqs.p(parcel, 17);
            parcel.writeString(str10);
            defpackage.sqs.q(parcel, iP11);
        }
        int i5 = this.r;
        parcel.writeInt(262162);
        parcel.writeInt(i5);
        defpackage.sqs.q(parcel, iP);
    }

    public CarInfo() {
    }
}
