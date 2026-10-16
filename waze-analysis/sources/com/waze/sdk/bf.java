package com.waze.sdk;

import android.os.RemoteException;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.BoundService;
import com.waze.br;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.lh;
import com.waze.modules.c.eb;
import com.waze.navigate.de;
import com.waze.navigate.di;
import com.waze.navigate.dj;
import com.waze.navigate.ea;
import com.waze.navigate.ga;
import j$.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bf implements dj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bi f35321a;

    bf(bi biVar) {
        Objects.requireNonNull(biVar);
        this.f35321a = biVar;
    }

    @Override // com.waze.navigate.dj
    public final void A(String str, String str2, int i2) throws RemoteException {
        if (BoundService.a() == null || i2 <= 0) {
            return;
        }
        bi biVar = this.f35321a;
        if (!biVar.f35341l && biVar.f35340k != -1) {
            BoundService.l(biVar.f35340k);
            biVar.f35341l = true;
        }
        BoundService.f(i2, str + " " + str2);
    }

    @Override // com.waze.navigate.dj
    public final void B(int i2) throws RemoteException {
        if (BoundService.a() != null) {
            BoundService.g(i2);
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void C() {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void D(eb ebVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void E(com.waze.realtime_report_feedback.c cVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void F(com.waze.realtime_report_feedback.c cVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void G(com.waze.realtime_report_feedback.c cVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void a(com.waze.navigate.a aVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void b(int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void bB(com.waze.main_screen.bottom_bars.scrollable_eta.i iVar) {
    }

    @Override // com.waze.navigate.dj
    public final void c(ea eaVar) throws RemoteException {
        int number = com.waze.navigate.eb.a(eaVar).getNumber();
        bi biVar = this.f35321a;
        biVar.f35340k = number;
        if (BoundService.a() != null) {
            biVar.f35341l = true;
            BoundService.l(com.waze.navigate.eb.a(eaVar).getNumber());
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void d(de deVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void e(com.waze.av.b.n nVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void f(br brVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void g(de deVar) {
    }

    @Override // com.waze.navigate.dj
    public final void h(String str, String str2, int i2) throws RemoteException {
        if (BoundService.a() != null) {
            BoundService.h(i2);
        }
    }

    @Override // com.waze.navigate.dj
    public final void j(int i2) throws RemoteException {
        if (BoundService.a() == null || i2 <= 0) {
            return;
        }
        BoundService.i(i2);
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void k(di diVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void l(com.waze.shared_infra.l.a aVar, long j2) {
    }

    @Override // com.waze.navigate.dj
    public final void m(boolean z, int i2) throws RemoteException {
        if (BoundService.a() != null) {
            if (!z) {
                BoundService.l(0);
            }
            BoundService.k(z);
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void n(int i2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void o(ea eaVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void p(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void q(com.waze.shared_infra.l.a aVar) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // com.waze.navigate.dj
    public final void s(PolylineGeometry polylineGeometry) throws JSONException, RemoteException {
        String string;
        if (BoundService.a() != null) {
            if (polylineGeometry != null) {
                int i2 = lh.f25149a;
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("geometry", jSONObject2);
                    jSONObject2.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "LineString");
                    JSONArray jSONArray = new JSONArray();
                    jSONObject2.put("coordinates", jSONArray);
                    for (Position.IntPosition intPosition : polylineGeometry.getPositionList()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(com.waze.shared_infra.h.b.d(intPosition.getLongitude()));
                        jSONArray2.put(com.waze.shared_infra.h.b.d(intPosition.getLatitude()));
                        jSONArray.put(jSONArray2);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                string = jSONObject.toString();
            } else {
                string = null;
            }
            BoundService.m(string);
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void t(Long l2) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void v(String str, boolean z, int i2, NavigationRoadSign navigationRoadSign) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void w(String str) {
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void x(ga gaVar) {
    }

    @Override // com.waze.navigate.dj
    public final void y(boolean z) throws RemoteException {
        if (BoundService.a() != null) {
            BoundService.j(z);
        }
    }

    @Override // com.waze.navigate.dj
    public final /* synthetic */ void z(Position.IntPosition intPosition) {
    }
}
