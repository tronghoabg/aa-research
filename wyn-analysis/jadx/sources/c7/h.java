package C7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class h extends AbstractC2614a {
    public static final Parcelable.Creator<h> CREATOR = new A6.j(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f1895a;

    public h(String str) {
        this.f1895a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f1895a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
