package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.widget.RemoteViews;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.ui.media.MediaPlaybackView;
import com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator;
import com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView;
import com.google.android.apps.auto.components.ui.telecom.UnCallView;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import j$.util.Map;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class oez implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oez(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setCl;
        int i = 3;
        int i2 = 4;
        boolean z = false;
        switch (this.b) {
            case 0:
                ofb ofbVar = ((ogr) this.a).a;
                Iterator it = ofbVar.b.iterator();
                while (it.hasNext()) {
                    ((ebf) it.next()).m(ofbVar.d());
                }
                return;
            case 1:
                yph yphVar = ofb.a;
                ((ofb) ((oev) this.a).a).B();
                return;
            case 2:
                ((MediaPlaybackView) this.a).o.g();
                return;
            case 3:
                MediaPlaybackView mediaPlaybackView = (MediaPlaybackView) this.a;
                mediaPlaybackView.e();
                mediaPlaybackView.removeCallbacks(this);
                mediaPlaybackView.postDelayed(this, 500L);
                return;
            case 4:
                omx omxVar = (omx) this.a;
                AaPlaybackState aaPlaybackStateC = omxVar.b.c();
                if (aaPlaybackStateC != null) {
                    ajmd ajmdVar = omxVar.g;
                    ajmdVar.j(false);
                    ajmdVar.k(omu.a(aaPlaybackStateC), 1);
                }
                Handler handler = omxVar.d;
                handler.removeCallbacks(this);
                handler.postDelayed(this, 500L);
                return;
            case 5:
                ((omx) this.a).g.j(true);
                return;
            case 6:
                SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) this.a;
                seekableLinearProgressIndicator.h.l(seekableLinearProgressIndicator.a());
                if (mlq.J(seekableLinearProgressIndicator.f)) {
                    seekableLinearProgressIndicator.f = 4;
                    return;
                }
                return;
            case 7:
                int i3 = MaterialUnCallView.q;
                MaterialUnCallView materialUnCallView = (MaterialUnCallView) this.a;
                materialUnCallView.f(materialUnCallView.a);
                materialUnCallView.d.postDelayed(materialUnCallView.o, 1000L);
                return;
            case 8:
                int i4 = UnCallView.n;
                UnCallView unCallView = (UnCallView) this.a;
                unCallView.e(unCallView.a);
                unCallView.c.postDelayed(unCallView.l, 1000L);
                return;
            case 9:
                if (nsr.c().h()) {
                    if (nsr.c().b().m().equals(nsv.f) || nsr.c().b().m().equals(nsv.g) || nsr.c().b().m().equals(nsv.h)) {
                        onu onuVar = (onu) this.a;
                        ooa ooaVar = onuVar.c;
                        zgp zgpVarSubmit = ooaVar.f.submit(new onz(ooaVar));
                        Handler handler2 = onuVar.b;
                        handler2.getClass();
                        wub.ah(zgpVarSubmit, onuVar.f, new fpe(handler2, i2));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                oof oofVar = (oof) this.a;
                oofVar.updateAppWidget(new RemoteViews(oofVar.getAppWidgetInfo().provider.getPackageName(), 0));
                return;
            case 11:
                Object obj = this.a;
                synchronized (obj) {
                    Optional optional = ((oqi) obj).e;
                    optional.getClass();
                    if (optional.isPresent()) {
                        return;
                    }
                    Consumer consumer = ((oqi) obj).c;
                    consumer.getClass();
                    consumer.accept(new oqh());
                    return;
                }
            case 12:
                ((oqz) this.a).b();
                return;
            case 13:
                ((BluetoothAdapter) this.a).enable();
                return;
            case 14:
                PagedListView pagedListView = (PagedListView) this.a;
                PagedScrollBarView pagedScrollBarView = pagedListView.m;
                boolean zIsPressed = pagedScrollBarView.a.isPressed();
                boolean zIsPressed2 = pagedScrollBarView.b.isPressed();
                if (!zIsPressed) {
                    z = zIsPressed2;
                } else if (zIsPressed2) {
                    return;
                }
                if (zIsPressed) {
                    if (pagedListView.l) {
                        pagedListView.p.aB();
                        return;
                    } else {
                        pagedListView.o.aA();
                        return;
                    }
                }
                if (z) {
                    if (pagedListView.l) {
                        pagedListView.p.aA();
                        return;
                    } else {
                        pagedListView.o.a();
                        return;
                    }
                }
                return;
            case 15:
                PagedListView pagedListView2 = (PagedListView) this.a;
                pagedListView2.d(true);
                pagedListView2.m.a();
                return;
            case 16:
                ((PagedScrollBarView) this.a).h(true);
                return;
            case 17:
                kfl.g().d(yxi.WIRELESS_BT_RECEIVER_CREDENTIALS_REMOVED_ON_LOST_BONDING);
                ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai(6152)).y("Deleted HU config for %s", this.a);
                return;
            case 18:
                Object obj2 = this.a;
                Map map = ((oyw) obj2).d;
                synchronized (map) {
                    Map.EL.forEach(map, new mac(i));
                    map.clear();
                    ((oyw) obj2).b();
                }
                return;
            case 19:
                Object obj3 = this.a;
                try {
                    Set<BluetoothDevice> bondedDevices = ((ozb) obj3).e.getBondedDevices();
                    setCl = bondedDevices != null ? woy.cl(bondedDevices) : afbg.a;
                } catch (SecurityException unused) {
                    ((ype) ozb.a.h()).u("Missing Bluetooth permissions: bonded devices.");
                    setCl = afbg.a;
                }
                ozb ozbVar = (ozb) obj3;
                ozbVar.k = setCl;
                Iterator it2 = ozbVar.d.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    oza ozaVar = new oza(ozbVar);
                    ozbVar.g.put(Integer.valueOf(iIntValue), ozaVar);
                    if (aczv.az()) {
                        ExecutorService executorService = ozaVar.d;
                        if (executorService == null) {
                            throw new IllegalStateException("background executor is expected to be initialized");
                        }
                        executorService.execute(new oa(ozaVar.e, ozaVar, iIntValue, 12));
                    } else {
                        ozaVar.a.post(new oa(ozaVar.e, ozaVar, iIntValue, 13));
                    }
                }
                ozbVar.e();
                Iterator it3 = ozbVar.m.iterator();
                while (it3.hasNext()) {
                    ozbVar.c((ozc) it3.next());
                }
                return;
            default:
                ozb ozbVar2 = (ozb) this.a;
                Iterator it4 = ozbVar2.m.iterator();
                while (it4.hasNext()) {
                    ((ozc) it4.next()).e();
                }
                ozbVar2.j.clear();
                java.util.Map map2 = ozbVar2.g;
                for (oza ozaVar2 : map2.values()) {
                    ozaVar2.a.post(new oyy(ozaVar2, i));
                }
                map2.clear();
                ozbVar2.h.clear();
                ozbVar2.i.clear();
                return;
        }
    }

    public oez(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
