package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;

/* renamed from: D6.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC0363b1 extends zzbem implements InterfaceC0396s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2409b;

    public BinderC0363b1(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f2408a = str;
        this.f2409b = str2;
    }

    public static InterfaceC0396s0 R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0396s0 ? (InterfaceC0396s0) iInterfaceQueryLocalInterface : new C0394r0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f2408a);
        } else {
            if (i5 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.f2409b);
        }
        return true;
    }

    @Override // D6.InterfaceC0396s0
    public final String zze() {
        return this.f2408a;
    }

    @Override // D6.InterfaceC0396s0
    public final String zzf() {
        return this.f2409b;
    }
}
