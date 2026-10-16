package A7;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* renamed from: A7.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0251g extends AbstractC2614a {
    public static final Parcelable.Creator<C0251g> CREATOR = new A6.j(3);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f868a;

    public C0251g(Bundle bundle) {
        this.f868a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.S(parcel, 1, this.f868a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
