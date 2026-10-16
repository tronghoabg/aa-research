package K8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.InterfaceC2616c;
import x.C4412e;

/* loaded from: classes4.dex */
public final class Q implements InterfaceC2616c {
    public static final Parcelable.Creator<Q> CREATOR = new C0691c(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f6605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6606b;

    /* renamed from: c, reason: collision with root package name */
    public final C4412e f6607c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6608d;

    public Q(boolean z2) {
        this.f6608d = z2;
        this.f6606b = null;
        this.f6605a = null;
        this.f6607c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f6605a, false);
        AbstractC1304a.a0(parcel, 2, this.f6606b, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f6608d ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public Q(String str, String str2, boolean z2) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        this.f6605a = str;
        this.f6606b = str2;
        this.f6607c = v.d(str2);
        this.f6608d = z2;
    }
}
