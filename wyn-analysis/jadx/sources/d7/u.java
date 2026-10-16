package d7;

import a.AbstractC1304a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c6.C1559a;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.c0;
import f7.AbstractC2614a;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class u extends AbstractC2614a {
    public static final Parcelable.Creator<u> CREATOR = new C1559a(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f34173a;

    /* renamed from: b, reason: collision with root package name */
    public final o f34174b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34175c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34176d;

    public u(String str, o oVar, boolean z2, boolean z10) {
        this.f34173a = str;
        this.f34174b = oVar;
        this.f34175c = z2;
        this.f34176d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f34173a, false);
        o oVar = this.f34174b;
        if (oVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            oVar = null;
        }
        AbstractC1304a.V(parcel, 2, oVar);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f34175c ? 1 : 0);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f34176d ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public u(String str, IBinder iBinder, boolean z2, boolean z10) {
        c0 b0Var;
        this.f34173a = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                int i5 = n.f34147b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (iInterfaceQueryLocalInterface instanceof c0) {
                    b0Var = (c0) iInterfaceQueryLocalInterface;
                } else {
                    b0Var = new b0(iBinder, "com.google.android.gms.common.internal.ICertData");
                }
                InterfaceC3876a interfaceC3876aZzd = b0Var.zzd();
                byte[] bArr = interfaceC3876aZzd == null ? null : (byte[]) BinderC3877b.S(interfaceC3876aZzd);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.f34174b = oVar;
        this.f34175c = z2;
        this.f34176d = z10;
    }
}
