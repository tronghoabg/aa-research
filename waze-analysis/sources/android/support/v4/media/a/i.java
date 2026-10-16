package android.support.v4.media.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class i extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f401a;

    i(k kVar) {
        super(null);
        this.f401a = new WeakReference(kVar);
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i2, Bundle bundle) {
        e cVar;
        k kVar = (k) this.f401a.get();
        if (kVar == null || bundle == null) {
            return;
        }
        synchronized (kVar.f403b) {
            u uVar = kVar.f404c;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            if (binder == null) {
                cVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                cVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new c(binder) : (e) iInterfaceQueryLocalInterface;
            }
            uVar.e(cVar);
            ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            uVar.f();
            kVar.a();
        }
    }
}
