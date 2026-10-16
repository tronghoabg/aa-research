package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;

/* loaded from: classes2.dex */
public class ClientNotificationEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientNotificationEvent> CREATOR = new sht(12);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public ClientNotificationEvent(int i, String str, long j, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.F(parcel, 2, this.b);
        spu.s(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.n(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
