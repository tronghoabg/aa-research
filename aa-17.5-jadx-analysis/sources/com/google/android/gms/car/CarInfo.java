package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abnp;
import defpackage.qrw;
import defpackage.sk;
import defpackage.spu;
import defpackage.woy;
import defpackage.yxq;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes.dex */
public class CarInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarInfo> CREATOR = new qrw();
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public int r;

    public CarInfo(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, String str9, String str10, int i4) {
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
            if (str2 != null && str2.toLowerCase(Locale.ENGLISH).endsWith("truck")) {
                i5 = 2;
            }
        } else {
            i5 = i4;
        }
        this.r = i5;
    }

    public final yxq a() {
        abnp abnpVarN = yxq.a.n();
        String strAl = woy.al(this.a);
        abnpVarN.t();
        yxq yxqVar = (yxq) abnpVarN.b;
        yxqVar.b |= 1;
        yxqVar.c = strAl;
        String strAl2 = woy.al(this.b);
        abnpVarN.t();
        yxq yxqVar2 = (yxq) abnpVarN.b;
        yxqVar2.b |= 2;
        yxqVar2.d = strAl2;
        String strAl3 = woy.al(this.c);
        abnpVarN.t();
        yxq yxqVar3 = (yxq) abnpVarN.b;
        yxqVar3.b |= 4;
        yxqVar3.e = strAl3;
        String strAl4 = woy.al(this.k);
        abnpVarN.t();
        yxq yxqVar4 = (yxq) abnpVarN.b;
        yxqVar4.b |= 32;
        yxqVar4.h = strAl4;
        String strAl5 = woy.al(this.i);
        abnpVarN.t();
        yxq yxqVar5 = (yxq) abnpVarN.b;
        yxqVar5.b |= 8;
        yxqVar5.f = strAl5;
        String strAl6 = woy.al(this.j);
        abnpVarN.t();
        yxq yxqVar6 = (yxq) abnpVarN.b;
        yxqVar6.b |= 16;
        yxqVar6.g = strAl6;
        String strAl7 = woy.al(this.l);
        abnpVarN.t();
        yxq yxqVar7 = (yxq) abnpVarN.b;
        yxqVar7.b |= 64;
        yxqVar7.i = strAl7;
        int i = this.e;
        Integer.valueOf(i).getClass();
        abnpVarN.t();
        yxq yxqVar8 = (yxq) abnpVarN.b;
        yxqVar8.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        yxqVar8.j = i;
        int i2 = this.f;
        Integer.valueOf(i2).getClass();
        abnpVarN.t();
        yxq yxqVar9 = (yxq) abnpVarN.b;
        yxqVar9.b |= 1024;
        yxqVar9.k = i2;
        String strAl8 = woy.al(this.q);
        abnpVarN.t();
        yxq yxqVar10 = (yxq) abnpVarN.b;
        yxqVar10.b |= 2048;
        yxqVar10.l = strAl8;
        return (yxq) abnpVarN.q();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarInfo)) {
            return false;
        }
        CarInfo carInfo = (CarInfo) obj;
        return Objects.equals(this.a, carInfo.a) && Objects.equals(this.b, carInfo.b) && Objects.equals(this.c, carInfo.c) && Objects.equals(this.d, carInfo.d) && this.e == carInfo.e && this.f == carInfo.f && this.g == carInfo.g && this.h == carInfo.h && Objects.equals(this.i, carInfo.i) && Objects.equals(this.j, carInfo.j) && Objects.equals(this.k, carInfo.k) && Objects.equals(this.l, carInfo.l) && this.m == carInfo.m && this.n == carInfo.n && this.o == carInfo.o && Objects.equals(this.p, carInfo.p) && Objects.equals(this.q, carInfo.q) && this.r == carInfo.r;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.f));
    }

    public final String toString() {
        return this.a + "," + this.b + "," + this.e + "." + this.f + "," + this.c + "," + this.i + "," + this.j + "," + this.k + "," + this.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        String str = this.a;
        if (str != null) {
            int iL2 = spu.l(parcel, 1);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        String str2 = this.b;
        if (str2 != null) {
            int iL3 = spu.l(parcel, 2);
            parcel.writeString(str2);
            spu.m(parcel, iL3);
        }
        String str3 = this.c;
        if (str3 != null) {
            int iL4 = spu.l(parcel, 3);
            parcel.writeString(str3);
            spu.m(parcel, iL4);
        }
        String str4 = this.d;
        if (str4 != null) {
            int iL5 = spu.l(parcel, 4);
            parcel.writeString(str4);
            spu.m(parcel, iL5);
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
        String str5 = this.i;
        if (str5 != null) {
            int iL6 = spu.l(parcel, 9);
            parcel.writeString(str5);
            spu.m(parcel, iL6);
        }
        String str6 = this.j;
        if (str6 != null) {
            int iL7 = spu.l(parcel, 10);
            parcel.writeString(str6);
            spu.m(parcel, iL7);
        }
        String str7 = this.k;
        if (str7 != null) {
            int iL8 = spu.l(parcel, 11);
            parcel.writeString(str7);
            spu.m(parcel, iL8);
        }
        String str8 = this.l;
        if (str8 != null) {
            int iL9 = spu.l(parcel, 12);
            parcel.writeString(str8);
            spu.m(parcel, iL9);
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
        String str9 = this.p;
        if (str9 != null) {
            int iL10 = spu.l(parcel, 16);
            parcel.writeString(str9);
            spu.m(parcel, iL10);
        }
        String str10 = this.q;
        if (str10 != null) {
            int iL11 = spu.l(parcel, 17);
            parcel.writeString(str10);
            spu.m(parcel, iL11);
        }
        int i5 = this.r;
        parcel.writeInt(262162);
        parcel.writeInt(i5);
        spu.m(parcel, iL);
    }

    public CarInfo() {
    }
}
