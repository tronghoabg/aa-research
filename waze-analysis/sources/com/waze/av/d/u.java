package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new w(19);

    /* renamed from: a, reason: collision with root package name */
    private final String f16119a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16120b;

    public u(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f16119a = str;
        this.f16120b = str2;
    }

    public final String a() {
        return this.f16120b;
    }

    public final String b() {
        return this.f16119a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return x.n(this.f16119a, uVar.f16119a) && x.n(this.f16120b, uVar.f16120b);
    }

    public final int hashCode() {
        int iHashCode = this.f16119a.hashCode() * 31;
        String str = this.f16120b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VenueUser(name=" + this.f16119a + ", mood=" + this.f16120b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x.f(parcel, "dest");
        parcel.writeString(this.f16119a);
        parcel.writeString(this.f16120b);
    }
}
