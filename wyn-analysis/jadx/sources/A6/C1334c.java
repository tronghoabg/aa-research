package a6;

import E5.C0448e0;
import E5.T;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334c implements W5.b {
    public static final Parcelable.Creator<C1334c> CREATOR = new Z6.c(4);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17389c;

    public C1334c(String str, String str2, byte[] bArr) {
        this.f17387a = bArr;
        this.f17388b = str;
        this.f17389c = str2;
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
        String str = this.f17388b;
        if (str != null) {
            c0448e0.f3320a = str;
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
        if (obj == null || C1334c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f17387a, ((C1334c) obj).f17387a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17387a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f17388b + "\", url=\"" + this.f17389c + "\", rawMetadata.length=\"" + this.f17387a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByteArray(this.f17387a);
        parcel.writeString(this.f17388b);
        parcel.writeString(this.f17389c);
    }

    public C1334c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f17387a = bArrCreateByteArray;
        this.f17388b = parcel.readString();
        this.f17389c = parcel.readString();
    }
}
