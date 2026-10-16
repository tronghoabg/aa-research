package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sli;
import defpackage.spu;
import defpackage.srf;
import java.util.List;

/* loaded from: classes2.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements sli {
    public static final Parcelable.Creator<RecordConsentByConsentResultResponse> CREATOR = new srf(13);
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.sli
    public final Status b() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iL = spu.l(parcel, 20293);
        spu.H(parcel, 1, list);
        spu.F(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
