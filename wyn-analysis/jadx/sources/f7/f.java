package F7;

import D6.B1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class f extends AbstractC2614a {
    public static final Parcelable.Creator<f> CREATOR = new B1(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f4026a;

    /* renamed from: b, reason: collision with root package name */
    public final E f4027b;

    public f(int i5, E e7) {
        this.f4026a = i5;
        this.f4027b = e7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f4026a);
        AbstractC1304a.Z(parcel, 2, this.f4027b, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
