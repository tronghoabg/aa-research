package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum g implements Parcelable {
    NONE("none"),
    INDIRECT("indirect"),
    DIRECT("direct");

    public static final Parcelable.Creator<g> CREATOR = new e(0);

    /* renamed from: e, reason: collision with root package name */
    private final String f5381e;

    g(String str) {
        this.f5381e = str;
    }

    public static g a(String str) throws f {
        for (g gVar : values()) {
            if (str.equals(gVar.f5381e)) {
                return gVar;
            }
        }
        throw new f(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5381e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5381e);
    }
}
