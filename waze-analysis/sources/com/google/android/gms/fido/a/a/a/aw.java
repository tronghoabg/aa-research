package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum aw implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<aw> CREATOR = new e(14);

    /* renamed from: e, reason: collision with root package name */
    private final String f5353e;

    aw(String str) {
        this.f5353e = str;
    }

    public static aw a(String str) throws av {
        for (aw awVar : values()) {
            if (str.equals(awVar.f5353e)) {
                return awVar;
            }
        }
        throw new av(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5353e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5353e);
    }
}
