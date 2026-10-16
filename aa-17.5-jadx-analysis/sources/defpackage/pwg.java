package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import com.google.android.libraries.storage.protostore.MappedCounterCacheVersion;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class pwg implements zfk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pwg(wdn wdnVar, wae waeVar, int i) {
        this.d = i;
        this.b = wdnVar;
        this.c = "";
        this.a = waeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, zfk] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, zfk] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Future, zgp] */
    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        String string;
        switch (this.d) {
            case 0:
                Object obj2 = this.b;
                final udp udpVar = (udp) obj;
                final pwh pwhVar = (pwh) this.a;
                final pwz pwzVar = (pwz) obj2;
                pwzVar.r = pwhVar.b();
                pwzVar.C = 18;
                return zfb.f(((pwd) this.c.gu()).d(), new xwx() { // from class: pwf
                    @Override // defpackage.xwx
                    public final Object a(Object obj3) {
                        udp udpVar2 = udpVar;
                        udpVar2.b = (pwn) obj3;
                        pwz pwzVar2 = pwzVar;
                        pwzVar2.s = pwhVar.b();
                        pwzVar2.C = 19;
                        return udpVar2;
                    }
                }, pwhVar.i);
            case 1:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                if (bluetoothDevice == null) {
                    ((ype) WifiBluetoothReceiver.a.l().ai((char) 6172)).u("No AA bluetooth device was connected.");
                    return wub.Y(false);
                }
                Object obj3 = this.b;
                return ((WifiBluetoothReceiver) this.c).g((Context) this.a, (Intent) obj3, bluetoothDevice);
            case 2:
                List listQ = (List) obj;
                wcw wcwVar = (wcw) this.b;
                if (!wcwVar.e) {
                    listQ = yfq.q("");
                }
                int i = yfq.d;
                yfl yflVar = new yfl(4);
                Iterator it = listQ.iterator();
                while (true) {
                    Object obj4 = this.a;
                    if (!it.hasNext()) {
                        return wub.S(yflVar.g()).a(new wdd(0), ((wae) obj4).b());
                    }
                    Object obj5 = this.c;
                    String str = (String) it.next();
                    wyd wydVar = wdf.a;
                    if (wydVar == null || !wydVar.b((String) obj5, str)) {
                        wae waeVar = (wae) obj4;
                        wdn wdnVar = new wdn(waeVar, (String) obj5, str, wcwVar.c);
                        if (wcwVar.d) {
                            Context context = waeVar.c;
                            string = context.getSharedPreferences("PhenotypeStickyAccount", 0).getString(wcwVar.a, "");
                        } else {
                            string = str;
                        }
                        zgp zgpVarB = wdnVar.b(string);
                        yflVar.i(zfb.g(zfb.g(zgj.v(zgpVarB), new kew(wdnVar, 7), waeVar.b()), new oyf(waeVar, zgpVarB, wcwVar, str, 3), waeVar.b()));
                    }
                }
                break;
            case 3:
                if (!((wdm) obj).b) {
                    return zgl.a;
                }
                Object obj6 = this.a;
                Object obj7 = this.c;
                Object obj8 = this.b;
                return zfb.g(zgj.v(((wdn) obj8).b((String) obj7)), new kew(obj8, 8), ((wae) obj6).b());
            case 4:
                Object obj9 = this.b;
                return wub.Y(((wgp) this.c).d((Uri) this.a, (MappedCounterCacheVersion) obj9));
            case 5:
                ?? r0 = this.b;
                ?? r1 = this.c;
                boolean zEquals = wub.af(r0).equals(wub.af(r1));
                Object obj10 = this.a;
                if (zEquals) {
                    return wub.Y(obj);
                }
                zfk zfkVarB = xur.b(new vzf(obj10, (Object) r1, 6));
                wgt wgtVar = (wgt) obj10;
                zgp zgpVarG = zfb.g(r1, zfkVarB, wgtVar.b);
                synchronized (wgtVar.d) {
                }
                return zgpVarG;
            case 6:
                ?? r11 = this.c;
                return ((wgx) this.a).b.i(this.b, r11);
            default:
                return ((wgx) ((wyd) this.a).a).b.i(this.b, this.c);
        }
    }

    public /* synthetic */ pwg(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ pwg(wcw wcwVar, String str, wae waeVar, int i) {
        this.d = i;
        this.b = wcwVar;
        this.c = str;
        this.a = waeVar;
    }

    public /* synthetic */ pwg(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
