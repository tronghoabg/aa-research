package a6;

import E5.C0448e0;
import E5.T;
import android.os.Parcel;
import android.os.Parcelable;
import u6.AbstractC4256a;
import u6.v;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1333b implements W5.b {
    public static final Parcelable.Creator<C1333b> CREATOR = new Z6.c(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f17381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17382b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17383c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17384d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17386f;

    public C1333b(int i5, String str, String str2, String str3, boolean z2, int i10) {
        AbstractC4256a.e(i10 == -1 || i10 > 0);
        this.f17381a = i5;
        this.f17382b = str;
        this.f17383c = str2;
        this.f17384d = str3;
        this.f17385e = z2;
        this.f17386f = i10;
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
    public static a6.C1333b c(java.util.Map r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.C1333b.c(java.util.Map):a6.b");
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
        String str = this.f17383c;
        if (str != null) {
            c0448e0.f3318D = str;
        }
        String str2 = this.f17382b;
        if (str2 != null) {
            c0448e0.f3316B = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1333b.class == obj.getClass()) {
            C1333b c1333b = (C1333b) obj;
            if (this.f17381a == c1333b.f17381a && v.a(this.f17382b, c1333b.f17382b) && v.a(this.f17383c, c1333b.f17383c) && v.a(this.f17384d, c1333b.f17384d) && this.f17385e == c1333b.f17385e && this.f17386f == c1333b.f17386f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (527 + this.f17381a) * 31;
        String str = this.f17382b;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17383c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17384d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f17385e ? 1 : 0)) * 31) + this.f17386f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f17383c + "\", genre=\"" + this.f17382b + "\", bitrate=" + this.f17381a + ", metadataInterval=" + this.f17386f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f17381a);
        parcel.writeString(this.f17382b);
        parcel.writeString(this.f17383c);
        parcel.writeString(this.f17384d);
        int i10 = v.f46721a;
        parcel.writeInt(this.f17385e ? 1 : 0);
        parcel.writeInt(this.f17386f);
    }

    public C1333b(Parcel parcel) {
        this.f17381a = parcel.readInt();
        this.f17382b = parcel.readString();
        this.f17383c = parcel.readString();
        this.f17384d = parcel.readString();
        int i5 = v.f46721a;
        this.f17385e = parcel.readInt() != 0;
        this.f17386f = parcel.readInt();
    }
}
