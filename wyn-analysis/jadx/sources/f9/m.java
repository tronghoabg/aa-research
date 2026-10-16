package f9;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class m extends AbstractC2614a {
    public static final Parcelable.Creator<m> CREATOR = new C2555b(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f35259a;

    public m(String str) {
        this.f35259a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f35259a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
