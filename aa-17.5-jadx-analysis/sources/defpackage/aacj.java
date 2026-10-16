package defpackage;

import android.graphics.Point;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class aacj implements pix {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aacj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, tqc] */
    @Override // defpackage.pix
    public final void a(piw piwVar) throws Throwable {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            aabi aabiVar = (aabi) obj;
            aabiVar.b.l();
            if (piwVar.a - 1 != 0) {
                zrt.a.a();
                if (zrn.e("InfoWindowRendererV3", 3)) {
                    Log.d("InfoWindowRendererV3", "handleLongPress");
                }
                if (aabiVar.c == null) {
                    return;
                }
                zwv zwvVar = aabiVar.a;
                zwvVar.b.h(zwvVar);
                return;
            }
            zrt.a.a();
            if (zrn.e("InfoWindowRendererV3", 3)) {
                Log.d("InfoWindowRendererV3", "handleTap");
            }
            if (aabiVar.c != null) {
                zwv zwvVar2 = aabiVar.a;
                zwvVar2.b.f(zwvVar2);
                return;
            }
            return;
        }
        aack aackVar = (aack) obj;
        aackVar.d.l();
        if (piwVar.a - 1 == 0) {
            aackVar.j();
            zrt.a.a();
            if (zrn.e("MarkerRendererV3", 3)) {
                Log.d("MarkerRendererV3", "handleTap");
            }
            if (aackVar.j) {
                return;
            }
            zwv zwvVar3 = aackVar.e;
            if (!zwvVar3.isVisible() || zwvVar3.b.r(zwvVar3)) {
                return;
            }
            ztt zttVar = aackVar.f;
            CameraPosition.Builder builder = CameraPosition.builder(zttVar.c());
            builder.target(zwvVar3.l());
            ((aado) zttVar).z(builder.build(), 330, 2);
            return;
        }
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "handleLongPress");
        }
        zwv zwvVar4 = aackVar.e;
        if (!zwvVar4.s()) {
            LatLng latLngL = aackVar.e.l();
            aackVar.k.gu().b(too.l(latLngL.latitude, latLngL.longitude));
            return;
        }
        aach aachVar = aackVar.g;
        aachVar.b.a();
        zwv zwvVar5 = aachVar.d;
        if (zwvVar5 != null) {
            zwvVar5.b.d(zwvVar5);
        }
        aachVar.e = false;
        aachVar.d = zwvVar4;
        if (addm.l()) {
            aacg aacgVar = new aacg(aachVar);
            aachVar.c.d(aacgVar);
            LatLng latLng = aacgVar.a;
            if (latLng != null) {
                zwvVar4.q(latLng);
            }
        } else {
            Point pointA = aachVar.a.l().a(aachVar.d.l());
            aachVar.a(aachVar.d, pointA.x, pointA.y);
        }
        zwv zwvVar6 = aachVar.d;
        zwz zwzVar = zwvVar6.b;
        ((zwu) zwzVar.c.get(zwvVar6)).d();
        View view = (View) zwzVar.d.get(zwvVar6);
        if (view != null) {
            view.setVisibility(4);
        }
        vhb vhbVar = zwzVar.j;
        if (vhbVar != null) {
            try {
                vhbVar.g(zwvVar6);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        Map map = zwzVar.e;
        if (map.get(zwvVar6) != null) {
            ((View) map.get(zwvVar6)).bringToFront();
        }
    }
}
