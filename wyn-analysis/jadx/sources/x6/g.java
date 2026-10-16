package X6;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class g extends AbstractC2614a {
    public static final Parcelable.Creator<g> CREATOR = new T6.f(13);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f16149a;

    public g(PendingIntent pendingIntent) {
        AbstractC1732v.i(pendingIntent);
        this.f16149a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f16149a, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
