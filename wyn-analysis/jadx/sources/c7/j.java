package C7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class j extends AbstractC2614a {
    public static final Parcelable.Creator<j> CREATOR = new A6.j(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f1900a;

    public j(String str) {
        this.f1900a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f1900a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
