package D6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;

/* loaded from: classes3.dex */
public final class m1 extends zzbem implements InterfaceC0408y0 {

    /* renamed from: a, reason: collision with root package name */
    public final R6.a f2456a;

    public m1(R6.a aVar) {
        super("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        this.f2456a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 != 1) {
            return false;
        }
        zze();
        parcel2.writeNoException();
        return true;
    }

    @Override // D6.InterfaceC0408y0
    public final void zze() {
        R6.a aVar = this.f2456a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}
