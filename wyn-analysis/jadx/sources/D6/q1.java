package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class q1 extends AbstractC2614a {
    public static final Parcelable.Creator<q1> CREATOR = new A6.j(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f2484a;

    public q1(String str) {
        this.f2484a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 15, this.f2484a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
