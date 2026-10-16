package Y5;

import E5.C0448e0;
import E5.S;
import E5.T;
import T6.f;
import W5.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* loaded from: classes3.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: g, reason: collision with root package name */
    public static final T f16702g;

    /* renamed from: h, reason: collision with root package name */
    public static final T f16703h;

    /* renamed from: a, reason: collision with root package name */
    public final String f16704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16705b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16706c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16707d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16708e;

    /* renamed from: f, reason: collision with root package name */
    public int f16709f;

    static {
        S s10 = new S();
        s10.k = "application/id3";
        f16702g = new T(s10);
        S s11 = new S();
        s11.k = "application/x-scte35";
        f16703h = new T(s11);
        CREATOR = new f(26);
    }

    public a(String str, String str2, long j8, long j10, byte[] bArr) {
        this.f16704a = str;
        this.f16705b = str2;
        this.f16706c = j8;
        this.f16707d = j10;
        this.f16708e = bArr;
    }

    @Override // W5.b
    public final T a() {
        String str = this.f16704a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f16703h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f16702g;
            default:
                return null;
        }
    }

    @Override // W5.b
    public final byte[] b() {
        if (a() != null) {
            return this.f16708e;
        }
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16706c == aVar.f16706c && this.f16707d == aVar.f16707d && v.a(this.f16704a, aVar.f16704a) && v.a(this.f16705b, aVar.f16705b) && Arrays.equals(this.f16708e, aVar.f16708e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16709f == 0) {
            String str = this.f16704a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f16705b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j8 = this.f16706c;
            int i5 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j10 = this.f16707d;
            this.f16709f = Arrays.hashCode(this.f16708e) + ((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f16709f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f16704a + ", id=" + this.f16707d + ", durationMs=" + this.f16706c + ", value=" + this.f16705b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f16704a);
        parcel.writeString(this.f16705b);
        parcel.writeLong(this.f16706c);
        parcel.writeLong(this.f16707d);
        parcel.writeByteArray(this.f16708e);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f16704a = string;
        this.f16705b = parcel.readString();
        this.f16706c = parcel.readLong();
        this.f16707d = parcel.readLong();
        this.f16708e = parcel.createByteArray();
    }
}
