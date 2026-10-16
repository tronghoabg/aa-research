package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new e(8);

    /* renamed from: a, reason: collision with root package name */
    private final b f5435a;

    t(b bVar) {
        com.google.android.gms.common.api.internal.av.m(bVar);
        this.f5435a = bVar;
    }

    public static t b(int i2) throws s {
        b bVar;
        b bVar2;
        if (i2 == au.LEGACY_RS1.a()) {
            bVar = au.RS1;
        } else {
            b[] bVarArrValues = au.values();
            int length = bVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    b[] bVarArrValues2 = x.values();
                    int length2 = bVarArrValues2.length;
                    for (int i4 = 0; i4 < length2; i4++) {
                        bVar2 = bVarArrValues2[i4];
                        if (bVar2.a() != i2) {
                        }
                    }
                    for (a aVar : a.values()) {
                        if (aVar.a() == i2) {
                            bVar = aVar;
                        }
                    }
                    throw new s(i2);
                }
                bVar2 = bVarArrValues[i3];
                if (bVar2.a() == i2) {
                    break;
                }
                i3++;
            }
            bVar = bVar2;
        }
        return new t(bVar);
    }

    public final int a() {
        return this.f5435a.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && this.f5435a.a() == ((t) obj).f5435a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5435a});
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + this.f5435a.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f5435a.a());
    }
}
