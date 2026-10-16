package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.qol;
import defpackage.spu;
import java.util.List;

/* loaded from: classes2.dex */
public final class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsRequest> CREATOR = new qoj(3);
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public GetAccountsRequest(String str, List list, List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public static qol a() {
        qol qolVar = new qol();
        qolVar.a = (byte) 3;
        return qolVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, str);
        spu.H(parcel, 2, this.b);
        spu.H(parcel, 3, this.c);
        spu.n(parcel, 4, this.d);
        spu.n(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
