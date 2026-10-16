package D6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;

/* loaded from: classes3.dex */
public final class r extends zzbem implements InterfaceC0401v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0358a f2485a;

    public r(InterfaceC0358a interfaceC0358a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f2485a = interfaceC0358a;
    }

    @Override // D6.InterfaceC0401v
    public final void zzb() {
        this.f2485a.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
