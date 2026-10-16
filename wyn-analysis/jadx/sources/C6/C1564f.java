package c6;

import E5.C0448e0;
import E5.T;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1564f implements W5.b {
    public static final Parcelable.Creator<C1564f> CREATOR = new C1559a(4);

    /* renamed from: a, reason: collision with root package name */
    public final float f19668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19669b;

    public C1564f(float f10, int i5) {
        this.f19668a = f10;
        this.f19669b = i5;
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
        if (obj != null && C1564f.class == obj.getClass()) {
            C1564f c1564f = (C1564f) obj;
            if (this.f19668a == c1564f.f19668a && this.f19669b == c1564f.f19669b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f19668a).hashCode() + 527) * 31) + this.f19669b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f19668a + ", svcTemporalLayerCount=" + this.f19669b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeFloat(this.f19668a);
        parcel.writeInt(this.f19669b);
    }

    public C1564f(Parcel parcel) {
        this.f19668a = parcel.readFloat();
        this.f19669b = parcel.readInt();
    }
}
