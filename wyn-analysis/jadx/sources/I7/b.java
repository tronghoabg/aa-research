package i7;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class b extends AbstractC2614a {
    public static final Parcelable.Creator<b> CREATOR = new C2555b(7);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f36878a;

    public b(PendingIntent pendingIntent) {
        this.f36878a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f36878a, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
