package c6;

import E5.C0448e0;
import E5.T;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* renamed from: c6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1560b implements W5.b {
    public static final Parcelable.Creator<C1560b> CREATOR = new C1559a(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f19655a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19658d;

    public C1560b(String str, byte[] bArr, int i5, int i10) {
        this.f19655a = str;
        this.f19656b = bArr;
        this.f19657c = i5;
        this.f19658d = i10;
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
    public final /* synthetic */ void d(C0448e0 c0448e0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1560b.class == obj.getClass()) {
            C1560b c1560b = (C1560b) obj;
            if (this.f19655a.equals(c1560b.f19655a) && Arrays.equals(this.f19656b, c1560b.f19656b) && this.f19657c == c1560b.f19657c && this.f19658d == c1560b.f19658d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f19656b) + N0.a.c(527, 31, this.f19655a)) * 31) + this.f19657c) * 31) + this.f19658d;
    }

    public final String toString() {
        return "mdta: key=" + this.f19655a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19655a);
        parcel.writeByteArray(this.f19656b);
        parcel.writeInt(this.f19657c);
        parcel.writeInt(this.f19658d);
    }

    public C1560b(Parcel parcel) {
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19655a = string;
        this.f19656b = parcel.createByteArray();
        this.f19657c = parcel.readInt();
        this.f19658d = parcel.readInt();
    }
}
