package R1;

import N1.A;
import N1.C0765n;
import N1.C0775y;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements A {
    public static final Parcelable.Creator<d> CREATOR = new I2.d(27);

    /* renamed from: a, reason: collision with root package name */
    public final float f10098a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10099b;

    public d(float f10, float f11) {
        Q1.k.b("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f10098a = f10;
        this.f10099b = f11;
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
            if (this.f10098a == dVar.f10098a && this.f10099b == dVar.f10099b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f10099b).hashCode() + ((Float.valueOf(this.f10098a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f10098a + ", longitude=" + this.f10099b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeFloat(this.f10098a);
        parcel.writeFloat(this.f10099b);
    }

    public d(Parcel parcel) {
        this.f10098a = parcel.readFloat();
        this.f10099b = parcel.readFloat();
    }
}
