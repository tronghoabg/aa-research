package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;
import java.util.List;

/* loaded from: classes2.dex */
public final class GetAccountsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsResponse> CREATOR = new qoj(4);
    public final List a;
    public final List b;

    public GetAccountsResponse(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iL = spu.l(parcel, 20293);
        spu.J(parcel, 1, list);
        spu.J(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
