package com.google.android.gms.clearcut.sampler;

/* JADX INFO: loaded from: classes2.dex */
public class SamplerConfigParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.clearcut.sampler.SamplerConfigParcelable> CREATOR = new defpackage.sjy(3);
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final java.lang.String e;

    public SamplerConfigParcelable(int i, double d, int i2, int i3, java.lang.String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = defpackage.yud.a;
        defpackage.yua yuaVar = defpackage.yup.a;
        defpackage.yuo yuoVar = new defpackage.yuo();
        yuoVar.c(this.a);
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(this.b);
        yuoVar.g(4, (int) jDoubleToRawLongBits);
        yuoVar.g(4, jDoubleToRawLongBits >>> 32);
        yuoVar.c(this.c);
        yuoVar.c(this.d);
        java.lang.String str = this.e;
        if (str != null) {
            yuoVar.f(str, java.nio.charset.StandardCharsets.UTF_8);
        }
        return ((defpackage.ytx) yuoVar.l()).a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, i2);
        defpackage.sqs.t(parcel, 2, this.b);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.v(parcel, 4, this.d);
        defpackage.sqs.J(parcel, 5, this.e);
        defpackage.sqs.q(parcel, iP);
    }
}
