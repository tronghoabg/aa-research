package E2;

import D6.B1;
import N1.A;
import N1.C;
import N1.C0765n;
import N1.C0775y;
import Q1.o;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR = new B1(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2817b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2818c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2819d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2820e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2821f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2822g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f2823h;

    public a(int i5, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f2816a = i5;
        this.f2817b = str;
        this.f2818c = str2;
        this.f2819d = i10;
        this.f2820e = i11;
        this.f2821f = i12;
        this.f2822g = i13;
        this.f2823h = bArr;
    }

    public static a c(o oVar) {
        int iH = oVar.h();
        String strM = C.m(oVar.s(oVar.h(), StandardCharsets.US_ASCII));
        String strS = oVar.s(oVar.h(), StandardCharsets.UTF_8);
        int iH2 = oVar.h();
        int iH3 = oVar.h();
        int iH4 = oVar.h();
        int iH5 = oVar.h();
        int iH6 = oVar.h();
        byte[] bArr = new byte[iH6];
        oVar.f(0, iH6, bArr);
        return new a(iH, strM, strS, iH2, iH3, iH4, iH5, bArr);
    }

    @Override // N1.A
    public final void P(C0775y c0775y) {
        c0775y.a(this.f2816a, this.f2823h);
    }

    @Override // N1.A
    public final /* synthetic */ C0765n a() {
        return null;
    }

    @Override // N1.A
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2816a == aVar.f2816a && this.f2817b.equals(aVar.f2817b) && this.f2818c.equals(aVar.f2818c) && this.f2819d == aVar.f2819d && this.f2820e == aVar.f2820e && this.f2821f == aVar.f2821f && this.f2822g == aVar.f2822g && Arrays.equals(this.f2823h, aVar.f2823h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2823h) + ((((((((N0.a.c(N0.a.c((527 + this.f2816a) * 31, 31, this.f2817b), 31, this.f2818c) + this.f2819d) * 31) + this.f2820e) * 31) + this.f2821f) * 31) + this.f2822g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f2817b + ", description=" + this.f2818c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f2816a);
        parcel.writeString(this.f2817b);
        parcel.writeString(this.f2818c);
        parcel.writeInt(this.f2819d);
        parcel.writeInt(this.f2820e);
        parcel.writeInt(this.f2821f);
        parcel.writeInt(this.f2822g);
        parcel.writeByteArray(this.f2823h);
    }

    public a(Parcel parcel) {
        this.f2816a = parcel.readInt();
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f2817b = string;
        this.f2818c = parcel.readString();
        this.f2819d = parcel.readInt();
        this.f2820e = parcel.readInt();
        this.f2821f = parcel.readInt();
        this.f2822g = parcel.readInt();
        this.f2823h = parcel.createByteArray();
    }
}
