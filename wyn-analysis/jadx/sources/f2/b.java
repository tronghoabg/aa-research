package F2;

import D6.B1;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import Q1.k;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class b implements A {
    public static final Parcelable.Creator<b> CREATOR = new B1(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3815c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3816d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3817e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3818f;

    public b(int i5, String str, String str2, String str3, boolean z2, int i10) {
        k.c(i10 == -1 || i10 > 0);
        this.f3813a = i5;
        this.f3814b = str;
        this.f3815c = str2;
        this.f3816d = str3;
        this.f3817e = z2;
        this.f3818f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static F2.b c(java.util.Map r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.b.c(java.util.Map):F2.b");
    }

    @Override // N1.A
    public final void P(C0775y c0775y) {
        String str = this.f3815c;
        if (str != null) {
            c0775y.f8301x = str;
        }
        String str2 = this.f3814b;
        if (str2 != null) {
            c0775y.f8300w = str2;
        }
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f3813a == bVar.f3813a) {
                int i5 = x.f9724a;
                if (Objects.equals(this.f3814b, bVar.f3814b) && Objects.equals(this.f3815c, bVar.f3815c) && Objects.equals(this.f3816d, bVar.f3816d) && this.f3817e == bVar.f3817e && this.f3818f == bVar.f3818f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (527 + this.f3813a) * 31;
        String str = this.f3814b;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3815c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3816d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f3817e ? 1 : 0)) * 31) + this.f3818f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f3815c + "\", genre=\"" + this.f3814b + "\", bitrate=" + this.f3813a + ", metadataInterval=" + this.f3818f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f3813a);
        parcel.writeString(this.f3814b);
        parcel.writeString(this.f3815c);
        parcel.writeString(this.f3816d);
        int i10 = x.f9724a;
        parcel.writeInt(this.f3817e ? 1 : 0);
        parcel.writeInt(this.f3818f);
    }

    public b(Parcel parcel) {
        this.f3813a = parcel.readInt();
        this.f3814b = parcel.readString();
        this.f3815c = parcel.readString();
        this.f3816d = parcel.readString();
        int i5 = x.f9724a;
        this.f3817e = parcel.readInt() != 0;
        this.f3818f = parcel.readInt();
    }
}
