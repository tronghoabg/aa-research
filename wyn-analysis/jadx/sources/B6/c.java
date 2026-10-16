package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* loaded from: classes3.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new Z6.c(19);

    /* renamed from: b, reason: collision with root package name */
    public final String f19331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19332c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19333d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19334e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19335f;

    /* renamed from: g, reason: collision with root package name */
    public final i[] f19336g;

    public c(String str, int i5, int i10, long j8, long j10, i[] iVarArr) {
        super("CHAP");
        this.f19331b = str;
        this.f19332c = i5;
        this.f19333d = i10;
        this.f19334e = j8;
        this.f19335f = j10;
        this.f19336g = iVarArr;
    }

    @Override // b6.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f19332c == cVar.f19332c && this.f19333d == cVar.f19333d && this.f19334e == cVar.f19334e && this.f19335f == cVar.f19335f && v.a(this.f19331b, cVar.f19331b) && Arrays.equals(this.f19336g, cVar.f19336g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (((((((527 + this.f19332c) * 31) + this.f19333d) * 31) + ((int) this.f19334e)) * 31) + ((int) this.f19335f)) * 31;
        String str = this.f19331b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19331b);
        parcel.writeInt(this.f19332c);
        parcel.writeInt(this.f19333d);
        parcel.writeLong(this.f19334e);
        parcel.writeLong(this.f19335f);
        i[] iVarArr = this.f19336g;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19331b = string;
        this.f19332c = parcel.readInt();
        this.f19333d = parcel.readInt();
        this.f19334e = parcel.readLong();
        this.f19335f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f19336g = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19336g[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
