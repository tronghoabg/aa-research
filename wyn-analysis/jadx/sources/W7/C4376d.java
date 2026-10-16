package w7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4376d extends AbstractC2614a {
    public static final Parcelable.Creator<C4376d> CREATOR = new C4381i(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f47377a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f47378b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4378f f47379c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f47380d;

    public C4376d(int i5, String str, ArrayList arrayList, byte[] bArr) {
        this.f47377a = i5;
        this.f47378b = bArr;
        try {
            this.f47379c = EnumC4378f.c(str);
            this.f47380d = arrayList;
        } catch (C4377e e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4376d)) {
            return false;
        }
        C4376d c4376d = (C4376d) obj;
        if (!Arrays.equals(this.f47378b, c4376d.f47378b) || !this.f47379c.equals(c4376d.f47379c)) {
            return false;
        }
        ArrayList arrayList = this.f47380d;
        ArrayList arrayList2 = c4376d.f47380d;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f47378b)), this.f47379c, this.f47380d});
    }

    public final String toString() {
        ArrayList arrayList = this.f47380d;
        String string = arrayList == null ? "null" : arrayList.toString();
        byte[] bArr = this.f47378b;
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("{keyHandle: ", bArr == null ? null : Base64.encodeToString(bArr, 0), ", version: ");
        sbW.append(this.f47379c);
        sbW.append(", transports: ");
        sbW.append(string);
        sbW.append("}");
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47377a);
        AbstractC1304a.T(parcel, 2, this.f47378b, false);
        AbstractC1304a.a0(parcel, 3, this.f47379c.f47383a, false);
        AbstractC1304a.e0(parcel, 4, this.f47380d, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
