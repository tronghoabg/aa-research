package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;

/* loaded from: classes2.dex */
public class AppRestriction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRestriction> CREATOR = new qoj(1);
    public final AppRestrictionState a;
    public final AppRestrictionInfo b;

    public AppRestriction(AppRestrictionState appRestrictionState, AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppRestrictionState appRestrictionState = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, appRestrictionState, i);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
