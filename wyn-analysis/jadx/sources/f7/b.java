package F7;

import D6.B1;
import a.AbstractC1304a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class b extends AbstractC2614a implements t {
    public static final Parcelable.Creator<b> CREATOR = new B1(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f4021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4022b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f4023c;

    public b(int i5, int i10, Intent intent) {
        this.f4021a = i5;
        this.f4022b = i10;
        this.f4023c = intent;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f4022b == 0 ? Status.f26424e : Status.f26428i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f4021a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f4022b);
        AbstractC1304a.Z(parcel, 3, this.f4023c, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
