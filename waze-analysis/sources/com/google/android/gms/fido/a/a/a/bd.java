package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum bd implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<bd> CREATOR = new e(18);

    /* renamed from: e, reason: collision with root package name */
    private final String f5367e;

    bd(String str) {
        this.f5367e = str;
    }

    public static bd a(String str) throws bc {
        for (bd bdVar : values()) {
            if (str.equals(bdVar.f5367e)) {
                return bdVar;
            }
        }
        throw new bc(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5367e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5367e);
    }
}
