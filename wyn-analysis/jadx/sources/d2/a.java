package D2;

import A6.j;
import N1.A;
import N1.C;
import N1.C0764m;
import N1.C0765n;
import N1.C0775y;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: g, reason: collision with root package name */
    public static final C0765n f2279g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0765n f2280h;

    /* renamed from: a, reason: collision with root package name */
    public final String f2281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2282b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2283c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2284d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2285e;

    /* renamed from: f, reason: collision with root package name */
    public int f2286f;

    static {
        C0764m c0764m = new C0764m();
        c0764m.f8194m = C.m("application/id3");
        f2279g = new C0765n(c0764m);
        C0764m c0764m2 = new C0764m();
        c0764m2.f8194m = C.m("application/x-scte35");
        f2280h = new C0765n(c0764m2);
        CREATOR = new j(17);
    }

    public a(String str, String str2, long j8, long j10, byte[] bArr) {
        this.f2281a = str;
        this.f2282b = str2;
        this.f2283c = j8;
        this.f2284d = j10;
        this.f2285e = bArr;
    }

    @Override // N1.A
    public final /* synthetic */ void P(C0775y c0775y) {
    }

    @Override // N1.A
    public final C0765n a() {
        String str = this.f2281a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f2280h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f2279g;
            default:
                return null;
        }
    }

    @Override // N1.A
    public final byte[] b() {
        if (a() != null) {
            return this.f2285e;
        }
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
            if (this.f2283c == aVar.f2283c && this.f2284d == aVar.f2284d) {
                int i5 = x.f9724a;
                if (Objects.equals(this.f2281a, aVar.f2281a) && Objects.equals(this.f2282b, aVar.f2282b) && Arrays.equals(this.f2285e, aVar.f2285e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2286f == 0) {
            String str = this.f2281a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f2282b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j8 = this.f2283c;
            int i5 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j10 = this.f2284d;
            this.f2286f = Arrays.hashCode(this.f2285e) + ((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f2286f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f2281a + ", id=" + this.f2284d + ", durationMs=" + this.f2283c + ", value=" + this.f2282b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f2281a);
        parcel.writeString(this.f2282b);
        parcel.writeLong(this.f2283c);
        parcel.writeLong(this.f2284d);
        parcel.writeByteArray(this.f2285e);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f2281a = string;
        this.f2282b = parcel.readString();
        this.f2283c = parcel.readLong();
        this.f2284d = parcel.readLong();
        this.f2285e = parcel.createByteArray();
    }
}
