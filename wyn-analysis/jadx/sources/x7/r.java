package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import f7.AbstractC2614a;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class r extends AbstractC2614a implements com.google.android.gms.common.api.t {
    public static final Parcelable.Creator<r> CREATOR = new C4381i(14);

    /* renamed from: a, reason: collision with root package name */
    public final Status f47809a;

    /* renamed from: b, reason: collision with root package name */
    public final s f47810b;

    public r(Status status, s sVar) {
        this.f47809a = status;
        this.f47810b = sVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f47809a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f47809a, i5, false);
        AbstractC1304a.Z(parcel, 2, this.f47810b, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
