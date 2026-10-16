package d7;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class n extends zzb implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34147b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f34148a;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        AbstractC1732v.b(bArr.length == 25);
        this.f34148a = Arrays.hashCode(bArr);
    }

    public static byte[] S(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public abstract byte[] R();

    public final boolean equals(Object obj) {
        InterfaceC3876a interfaceC3876aZzd;
        if (obj instanceof c0) {
            try {
                c0 c0Var = (c0) obj;
                if (c0Var.zze() == this.f34148a && (interfaceC3876aZzd = c0Var.zzd()) != null) {
                    return Arrays.equals(R(), (byte[]) BinderC3877b.S(interfaceC3876aZzd));
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34148a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            InterfaceC3876a interfaceC3876aZzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, interfaceC3876aZzd);
        } else {
            if (i5 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f34148a);
        }
        return true;
    }

    @Override // com.google.android.gms.common.internal.c0
    public final InterfaceC3876a zzd() {
        return new BinderC3877b(R());
    }

    @Override // com.google.android.gms.common.internal.c0
    public final int zze() {
        return this.f34148a;
    }
}
