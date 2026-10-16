package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new B1(15);

    /* renamed from: b, reason: collision with root package name */
    public final String f4168b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4169c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4170d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f4171e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f4172f;

    public d(String str, boolean z2, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f4168b = str;
        this.f4169c = z2;
        this.f4170d = z10;
        this.f4171e = strArr;
        this.f4172f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f4169c == dVar.f4169c && this.f4170d == dVar.f4170d) {
                int i5 = x.f9724a;
                if (Objects.equals(this.f4168b, dVar.f4168b) && Arrays.equals(this.f4171e, dVar.f4171e) && Arrays.equals(this.f4172f, dVar.f4172f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (((527 + (this.f4169c ? 1 : 0)) * 31) + (this.f4170d ? 1 : 0)) * 31;
        String str = this.f4168b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4168b);
        parcel.writeByte(this.f4169c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4170d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f4171e);
        j[] jVarArr = this.f4172f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4168b = string;
        this.f4169c = parcel.readByte() != 0;
        this.f4170d = parcel.readByte() != 0;
        this.f4171e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f4172f = new j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4172f[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
