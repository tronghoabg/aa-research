package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* loaded from: classes3.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new Z6.c(20);

    /* renamed from: b, reason: collision with root package name */
    public final String f19337b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19338c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19339d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f19340e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f19341f;

    public d(String str, boolean z2, boolean z10, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f19337b = str;
        this.f19338c = z2;
        this.f19339d = z10;
        this.f19340e = strArr;
        this.f19341f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f19338c == dVar.f19338c && this.f19339d == dVar.f19339d && v.a(this.f19337b, dVar.f19337b) && Arrays.equals(this.f19340e, dVar.f19340e) && Arrays.equals(this.f19341f, dVar.f19341f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (((527 + (this.f19338c ? 1 : 0)) * 31) + (this.f19339d ? 1 : 0)) * 31;
        String str = this.f19337b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19337b);
        parcel.writeByte(this.f19338c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19339d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f19340e);
        i[] iVarArr = this.f19341f;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19337b = string;
        this.f19338c = parcel.readByte() != 0;
        this.f19339d = parcel.readByte() != 0;
        this.f19340e = parcel.createStringArray();
        int i10 = parcel.readInt();
        this.f19341f = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19341f[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
