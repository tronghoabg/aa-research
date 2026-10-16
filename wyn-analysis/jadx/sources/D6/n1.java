package D6;

import ad.AbstractC1364i;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import java.util.HashMap;
import java.util.Iterator;
import x6.InterfaceC4486q;

/* loaded from: classes3.dex */
public final class n1 extends zzbem implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4486q f2461a;

    public n1(InterfaceC4486q interfaceC4486q) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f2461a = interfaceC4486q;
    }

    public static A0 R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof A0 ? (A0) iInterfaceQueryLocalInterface : new C0410z0(iBinder);
    }

    @Override // D6.A0
    public final void t(y1 y1Var) {
        Integer num;
        InterfaceC4486q interfaceC4486q = this.f2461a;
        if (interfaceC4486q != null) {
            int i5 = y1Var.f2546b;
            S3.e eVar = (S3.e) interfaceC4486q;
            G9.e eVar2 = (G9.e) eVar.f10941b;
            eVar2.getClass();
            HashMap map = new HashMap();
            HashMap map2 = (HashMap) eVar2.f4686c;
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                } else {
                    num = (Integer) it.next();
                    if (map2.get(num) == ((AbstractC1364i) eVar.f10942c)) {
                        break;
                    }
                }
            }
            map.put("adId", num);
            map.put("eventName", "onPaidEvent");
            map.put("valueMicros", Long.valueOf(y1Var.f2548d));
            map.put("precision", Integer.valueOf(i5));
            map.put("currencyCode", y1Var.f2547c);
            eVar2.w(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            y1 y1Var = (y1) zzben.zzb(parcel, y1.CREATOR);
            zzben.zzh(parcel);
            t(y1Var);
            parcel2.writeNoException();
        } else {
            if (i5 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i11 = zzben.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }

    @Override // D6.A0
    public final boolean zzf() {
        return this.f2461a == null;
    }
}
