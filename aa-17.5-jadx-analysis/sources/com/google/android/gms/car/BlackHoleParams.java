package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;
import defpackage.yfq;
import java.util.List;

/* loaded from: classes2.dex */
public class BlackHoleParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BlackHoleParams> CREATOR = new qoj(12);
    public final List a;
    public final int b;
    public final List c;

    public BlackHoleParams(List list, int i, List list2) {
        this.a = list;
        this.b = i;
        this.c = list2;
    }

    public final String toString() {
        List list = this.c;
        return "BlackHoleParams{escapeIntentFilters=" + String.valueOf(this.a) + ", blackHoleTimeOutMs=" + this.b + ", escapeApps=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, yfq.o(list));
        spu.r(parcel, 2, this.b);
        spu.J(parcel, 3, yfq.o(this.c));
        spu.m(parcel, iL);
    }
}
