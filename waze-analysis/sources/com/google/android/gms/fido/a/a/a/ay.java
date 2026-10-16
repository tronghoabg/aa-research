package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum ay implements Parcelable {
    PRESENT("present"),
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<ay> CREATOR = new e(16);

    /* renamed from: e, reason: collision with root package name */
    private final String f5359e;

    ay(String str) {
        this.f5359e = str;
    }

    public static ay a(String str) throws az {
        for (ay ayVar : values()) {
            if (str.equals(ayVar.f5359e)) {
                return ayVar;
            }
        }
        throw new az(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5359e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5359e);
    }
}
