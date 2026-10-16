package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.MapsInitializer;
import com.google.android.libraries.maps.OnMapReadyCallback;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class vdj extends sqg {
    public final List d = new ArrayList();
    protected ykd e;
    private final ViewGroup f;
    private final Context g;
    private final GoogleMapOptions h;

    public vdj(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f = viewGroup;
        this.g = context;
        this.h = googleMapOptions;
    }

    @Override // defpackage.sqg
    protected final void m(ykd ykdVar) {
        this.e = ykdVar;
        if (ykdVar == null || this.a != null) {
            return;
        }
        try {
            Context context = this.g;
            MapsInitializer.initialize(context);
            this.e.v(new vdi(this.f, vjb.a(context).c(new sqi(context), this.h)));
            List list = this.d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((vdi) this.a).a((OnMapReadyCallback) it.next());
            }
            list.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (skk unused) {
        }
    }
}
