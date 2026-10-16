package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.khy;
import defpackage.spu;
import j$.util.Objects;

/* loaded from: classes2.dex */
public class AccountWithAppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountWithAppRestrictionState> CREATOR = new khy(20);
    public final GoogleAccount a;
    public final AppRestrictionState b;

    public AccountWithAppRestrictionState(GoogleAccount googleAccount, AppRestrictionState appRestrictionState) {
        this.a = googleAccount;
        this.b = appRestrictionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithAppRestrictionState)) {
            return false;
        }
        AccountWithAppRestrictionState accountWithAppRestrictionState = (AccountWithAppRestrictionState) obj;
        return this.a.equals(accountWithAppRestrictionState.a) && this.b.equals(accountWithAppRestrictionState.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, googleAccount, i);
        spu.E(parcel, 2, this.b, i);
        spu.m(parcel, iL);
    }
}
