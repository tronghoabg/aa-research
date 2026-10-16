package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new B1(14);

    /* renamed from: b, reason: collision with root package name */
    public final String f4162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4164d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4165e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4166f;

    /* renamed from: g, reason: collision with root package name */
    public final j[] f4167g;

    public c(String str, int i5, int i10, long j8, long j10, j[] jVarArr) {
        super("CHAP");
        this.f4162b = str;
        this.f4163c = i5;
        this.f4164d = i10;
        this.f4165e = j8;
        this.f4166f = j10;
        this.f4167g = jVarArr;
    }

    @Override // G2.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f4163c == cVar.f4163c && this.f4164d == cVar.f4164d && this.f4165e == cVar.f4165e && this.f4166f == cVar.f4166f) {
                int i5 = x.f9724a;
                if (Objects.equals(this.f4162b, cVar.f4162b) && Arrays.equals(this.f4167g, cVar.f4167g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (((((((527 + this.f4163c) * 31) + this.f4164d) * 31) + ((int) this.f4165e)) * 31) + ((int) this.f4166f)) * 31;
        String str = this.f4162b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4162b);
        parcel.writeInt(this.f4163c);
        parcel.writeInt(this.f4164d);
        parcel.writeLong(this.f4165e);
        parcel.writeLong(this.f4166f);
        j[] jVarArr = this.f4167g;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4162b = string;
        this.f4163c = parcel.readInt();
        this.f4164d = parcel.readInt();
        this.f4165e = parcel.readLong();
        this.f4166f = parcel.readLong();
        int i10 = parcel.readInt();
        this.f4167g = new j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4167g[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
