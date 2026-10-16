package defpackage;

import android.telecom.CallAudioState;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class oem extends qrv {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final mjv b;

    public oem(mjv mjvVar) {
        this.b = mjvVar;
    }

    private final void ah(oel oelVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            oelVar.a((ebf) it.next());
        }
    }

    @Override // defpackage.qrv
    public final void a(KeyEvent keyEvent) {
        ah(new oek(keyEvent, 2));
    }

    @Override // defpackage.qrv
    public final void b(final boolean z, final int i, final int i2) {
        ah(new oel() { // from class: oej
            @Override // defpackage.oel
            public final void a(ebf ebfVar) {
                ebfVar.m(new CallAudioState(z, i, i2));
            }
        });
    }

    @Override // defpackage.qrv
    public final void c(CarCall carCall) {
        ah(new oek(this.b.z(carCall), 3));
    }

    @Override // defpackage.qrv
    public final void d(CarCall carCall) {
        ah(new oek(this.b.z(carCall), 1));
    }

    @Override // defpackage.qrv
    public final void e(CarCall carCall) {
        ah(new oek(this.b.z(carCall), 0));
    }

    @Override // defpackage.qrv
    public final void f(CarCall carCall, List list) {
        ah(new oei(this.b.z(carCall), list, 5));
    }

    @Override // defpackage.qrv
    public final void g(CarCall carCall, List list) {
        mjv mjvVar = this.b;
        com.google.android.apps.auto.components.telecom.call.CarCall carCallZ = mjvVar.z(carCall);
        Stream map = Collection.EL.stream(list).map(new mix(mjvVar, 10));
        int i = yfq.d;
        ah(new oei(carCallZ, (yfq) map.collect(ycm.a), 3));
    }

    @Override // defpackage.qrv
    public final void h(CarCall carCall, List list) {
        mjv mjvVar = this.b;
        com.google.android.apps.auto.components.telecom.call.CarCall carCallZ = mjvVar.z(carCall);
        Stream map = Collection.EL.stream(list).map(new mix(mjvVar, 10));
        int i = yfq.d;
        ah(new oei(carCallZ, (yfq) map.collect(ycm.a), 2));
    }

    @Override // defpackage.qrv
    public final void i(CarCall carCall, CarCall.Details details) {
        ah(new oei(this.b.z(carCall), mjv.B(details), 0));
    }

    @Override // defpackage.qrv
    public final void j(CarCall carCall, CarCall carCall2) {
        mjv mjvVar = this.b;
        ah(new oei(mjvVar.z(carCall), mjvVar.z(carCall2), 1));
    }

    @Override // defpackage.qrv
    public final void k(CarCall carCall, String str) {
        ah(new oei(this.b.z(carCall), str, 4));
    }

    @Override // defpackage.qrv
    public final void l(CarCall carCall, final int i) {
        final com.google.android.apps.auto.components.telecom.call.CarCall carCallZ = this.b.z(carCall);
        ah(new oel() { // from class: oeh
            @Override // defpackage.oel
            public final void a(ebf ebfVar) {
                ebfVar.y(carCallZ, i);
            }
        });
    }
}
