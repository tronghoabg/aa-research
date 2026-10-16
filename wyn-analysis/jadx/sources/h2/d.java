package H2;

import D6.B1;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements A {
    public static final Parcelable.Creator<d> CREATOR = new B1(27);

    /* renamed from: a, reason: collision with root package name */
    public final float f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4882b;

    public d(float f10, int i5) {
        this.f4881a = f10;
        this.f4882b = i5;
    }

    @Override // N1.A
    public final /* synthetic */ void P(C0775y c0775y) {
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f4881a == dVar.f4881a && this.f4882b == dVar.f4882b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f4881a).hashCode() + 527) * 31) + this.f4882b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f4881a + ", svcTemporalLayerCount=" + this.f4882b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeFloat(this.f4881a);
        parcel.writeInt(this.f4882b);
    }

    public d(Parcel parcel) {
        this.f4881a = parcel.readFloat();
        this.f4882b = parcel.readInt();
    }
}
