package Z5;

import E5.C0448e0;
import E5.T;
import T6.f;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.AbstractC3198g;
import u6.v;

/* loaded from: classes3.dex */
public final class a implements W5.b {
    public static final Parcelable.Creator<a> CREATOR = new f(27);

    /* renamed from: a, reason: collision with root package name */
    public final int f16987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16989c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16990d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16991e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16992f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16993g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f16994h;

    public a(int i5, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f16987a = i5;
        this.f16988b = str;
        this.f16989c = str2;
        this.f16990d = i10;
        this.f16991e = i11;
        this.f16992f = i12;
        this.f16993g = i13;
        this.f16994h = bArr;
    }

    public static a c(Y4.b bVar) {
        int iD = bVar.d();
        String strO = bVar.o(bVar.d(), AbstractC3198g.f39299a);
        String strO2 = bVar.o(bVar.d(), AbstractC3198g.f39301c);
        int iD2 = bVar.d();
        int iD3 = bVar.d();
        int iD4 = bVar.d();
        int iD5 = bVar.d();
        int iD6 = bVar.d();
        byte[] bArr = new byte[iD6];
        bVar.c(0, iD6, bArr);
        return new a(iD, strO, strO2, iD2, iD3, iD4, iD5, bArr);
    }

    @Override // W5.b
    public final /* synthetic */ T a() {
        return null;
    }

    @Override // W5.b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // W5.b
    public final void d(C0448e0 c0448e0) {
        c0448e0.a(this.f16987a, this.f16994h);
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
            if (this.f16987a == aVar.f16987a && this.f16988b.equals(aVar.f16988b) && this.f16989c.equals(aVar.f16989c) && this.f16990d == aVar.f16990d && this.f16991e == aVar.f16991e && this.f16992f == aVar.f16992f && this.f16993g == aVar.f16993g && Arrays.equals(this.f16994h, aVar.f16994h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16994h) + ((((((((N0.a.c(N0.a.c((527 + this.f16987a) * 31, 31, this.f16988b), 31, this.f16989c) + this.f16990d) * 31) + this.f16991e) * 31) + this.f16992f) * 31) + this.f16993g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f16988b + ", description=" + this.f16989c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f16987a);
        parcel.writeString(this.f16988b);
        parcel.writeString(this.f16989c);
        parcel.writeInt(this.f16990d);
        parcel.writeInt(this.f16991e);
        parcel.writeInt(this.f16992f);
        parcel.writeInt(this.f16993g);
        parcel.writeByteArray(this.f16994h);
    }

    public a(Parcel parcel) {
        this.f16987a = parcel.readInt();
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f16988b = string;
        this.f16989c = parcel.readString();
        this.f16990d = parcel.readInt();
        this.f16991e = parcel.readInt();
        this.f16992f = parcel.readInt();
        this.f16993g = parcel.readInt();
        this.f16994h = parcel.createByteArray();
    }
}
