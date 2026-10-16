package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;
import defpackage.yfq;
import defpackage.yls;
import java.util.List;

/* loaded from: classes2.dex */
public class ClientThrottlingTelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientThrottlingTelemetryData> CREATOR = new sht(14);
    public List a;

    public static class ClientThrottlingEventData extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ClientThrottlingEventData> CREATOR = new sht(13);
        public final int a;
        public final String b;
        public final int c;

        public ClientThrottlingEventData(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int iL = spu.l(parcel, 20293);
            spu.r(parcel, 1, i2);
            spu.F(parcel, 2, this.b);
            spu.r(parcel, 3, this.c);
            spu.m(parcel, iL);
        }
    }

    public ClientThrottlingTelemetryData(List list) {
        this.a = list;
    }

    public final List a() {
        List list = this.a;
        if (list != null) {
            return list;
        }
        int i = yfq.d;
        return yls.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, a());
        spu.m(parcel, iL);
    }
}
