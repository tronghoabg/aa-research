package X6;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k extends AbstractC2614a {
    public static final Parcelable.Creator<k> CREATOR = new T6.f(21);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f16157a;

    public k(PendingIntent pendingIntent) {
        this.f16157a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return AbstractC1732v.m(this.f16157a, ((k) obj).f16157a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16157a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f16157a, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
