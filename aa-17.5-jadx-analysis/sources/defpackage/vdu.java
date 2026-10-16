package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.libraries.maps.MapsInitializer;
import com.google.android.libraries.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.libraries.maps.SupportStreetViewPanoramaFragment;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class vdu extends sqg {
    public final List d = new ArrayList();
    protected ykd e;
    private final Fragment f;
    private Activity g;

    public vdu(Fragment fragment) {
        this.f = fragment;
    }

    @Override // defpackage.sqg
    protected final void m(ykd ykdVar) {
        this.e = ykdVar;
        n();
    }

    public final void n() {
        Activity activity = this.g;
        if (activity == null || this.e == null || this.a != null) {
            return;
        }
        try {
            MapsInitializer.initialize(activity);
            try {
                this.e.v(new SupportStreetViewPanoramaFragment.StreetViewPanoramaFragmentDelegate(this.f, vjb.a(this.g).d(new sqi(this.g))));
                List list = this.d;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((SupportStreetViewPanoramaFragment.StreetViewPanoramaFragmentDelegate) this.a).getStreetViewPanoramaAsync((OnStreetViewPanoramaReadyCallback) it.next());
                }
                list.clear();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (skk unused) {
        }
    }

    public final void o(Activity activity) {
        this.g = activity;
        n();
    }
}
