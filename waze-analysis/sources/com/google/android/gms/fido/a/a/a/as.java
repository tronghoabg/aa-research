package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as implements Parcelable {
    public static final Parcelable.Creator<as> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final as f5332a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ as[] f5333b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5334c = "public-key";

    static {
        as asVar = new as();
        f5332a = asVar;
        f5333b = new as[]{asVar};
        CREATOR = new e(13);
    }

    private as() {
    }

    public static as a(String str) throws ar {
        for (as asVar : values()) {
            if (str.equals(asVar.f5334c)) {
                return asVar;
            }
        }
        throw new ar(String.format("PublicKeyCredentialType %s not supported", str));
    }

    public static as[] values() {
        return (as[]) f5333b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5334c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5334c);
    }
}
