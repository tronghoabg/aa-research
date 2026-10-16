package D6;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class f1 extends q7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(String str, int i5) {
        super(str);
        this.f2424a = i5;
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        switch (this.f2424a) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface instanceof C0387n0 ? (C0387n0) iInterfaceQueryLocalInterface : new C0387n0(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface2 instanceof I ? (I) iInterfaceQueryLocalInterface2 : new I(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface3 instanceof Y ? (Y) iInterfaceQueryLocalInterface3 : new Y(iBinder);
        }
    }
}
