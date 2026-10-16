package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator<d> CREATOR = new e(1);

    /* renamed from: d, reason: collision with root package name */
    private final String f5375d;

    d(String str) {
        this.f5375d = str;
    }

    public static d a(String str) throws c {
        for (d dVar : values()) {
            if (str.equals(dVar.f5375d)) {
                return dVar;
            }
        }
        throw new c(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5375d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5375d);
    }
}
