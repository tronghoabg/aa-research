package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.libraries.maps.MapsInitializer;
import com.google.android.libraries.maps.OnMapReadyCallback;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class vds extends sqg {
    public final List d = new ArrayList();
    protected ykd e;
    private final Fragment f;
    private Activity g;

    public vds(Fragment fragment) {
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
            this.e.v(new vdr(this.f, vjb.a(this.g).b(new sqi(this.g))));
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((vdr) this.a).a((OnMapReadyCallback) it.next());
            }
            list.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (skk unused) {
        }
    }

    public final void o(Activity activity) {
        this.g = activity;
        n();
    }
}
