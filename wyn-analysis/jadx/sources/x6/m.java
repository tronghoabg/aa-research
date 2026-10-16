package X6;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m extends AbstractC2614a {
    public static final Parcelable.Creator<m> CREATOR = new T6.f(23);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f16161a;

    public m(PendingIntent pendingIntent) {
        AbstractC1732v.i(pendingIntent);
        this.f16161a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return AbstractC1732v.m(this.f16161a, ((m) obj).f16161a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16161a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f16161a, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
