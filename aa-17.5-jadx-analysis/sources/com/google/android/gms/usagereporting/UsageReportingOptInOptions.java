package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.snf;
import defpackage.spu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UsageReportingOptInOptions> CREATOR = new snf(6);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, this.a);
        spu.n(parcel, 3, this.b);
        spu.H(parcel, 4, this.c);
        spu.r(parcel, 5, this.d);
        spu.F(parcel, 6, this.e);
        spu.n(parcel, 7, this.f);
        spu.m(parcel, iL);
    }
}
