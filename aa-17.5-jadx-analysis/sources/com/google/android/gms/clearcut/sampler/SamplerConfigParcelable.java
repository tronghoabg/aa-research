package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;
import defpackage.yss;
import defpackage.ysv;
import defpackage.ysy;
import defpackage.ytj;
import defpackage.ytk;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class SamplerConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SamplerConfigParcelable> CREATOR = new sht(4);
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    public SamplerConfigParcelable(int i, double d, int i2, int i3, String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = ysy.a;
        ysv ysvVar = ytk.a;
        ytj ytjVar = new ytj();
        ytjVar.c(this.a);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(this.b);
        ytjVar.g(4, (int) jDoubleToRawLongBits);
        ytjVar.g(4, jDoubleToRawLongBits >>> 32);
        ytjVar.c(this.c);
        ytjVar.c(this.d);
        String str = this.e;
        if (str != null) {
            ytjVar.f(str, StandardCharsets.UTF_8);
        }
        return ((yss) ytjVar.l()).a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.p(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.F(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
