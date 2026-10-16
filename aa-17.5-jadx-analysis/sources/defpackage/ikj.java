package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import j$.util.Objects;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class ikj implements xwx {
    private final /* synthetic */ int a;

    public /* synthetic */ ikj(int i) {
        this.a = i;
    }

    @Override // defpackage.xwx
    public final Object a(Object obj) {
        boolean zB = true;
        char c = 1;
        switch (this.a) {
            case 0:
                return ((udp) obj).a();
            case 1:
                return ((rbi) obj).a();
            case 2:
                return ((rbh) obj).a();
            case 3:
                Boolean bool = (Boolean) obj;
                yph yphVar = jnv.a;
                if (!Boolean.TRUE.equals(bool)) {
                    ((ype) ((ype) jnv.a.h()).ai((char) 2436)).u("ICar release task succeeded but did not release ICar.");
                }
                return bool;
            case 4:
                yph yphVar2 = knv.a;
                return new htm((rrk) obj, (byte[]) null);
            case 5:
                return Boolean.valueOf(Objects.nonNull((BluetoothDevice) obj));
            case 6:
                return htm.p(obj);
            case 7:
                return rpz.a((Context) obj);
            case 8:
                return rpz.a((Context) obj);
            case 9:
                return (plz) obj;
            case 10:
                return Long.valueOf(((ptn) obj).a);
            case 11:
                return pwa.b;
            case 12:
                udp udpVar = new udp();
                for (pwn pwnVar : (List) obj) {
                    if (pwnVar != null) {
                        udpVar.c(pwnVar);
                    }
                }
                return udpVar;
            case 13:
                return Integer.valueOf(((zbf) obj).b);
            case 14:
                final ots otsVar = (ots) obj;
                ott ottVar = otsVar.f;
                if (ottVar == null) {
                    ottVar = ott.a;
                }
                abpt abptVar = ottVar.c;
                if (abptVar == null) {
                    abptVar = abpt.a;
                }
                final char c2 = c == true ? 1 : 0;
                return new rer(abptVar, new res() { // from class: req
                    @Override // defpackage.res
                    public final void a(rzj rzjVar) {
                        int i = c2;
                        abnv abnvVar = otsVar;
                        if (i != 0) {
                            uqw.ac(rzjVar, (ots) abnvVar);
                        } else {
                            uqw.O(rzjVar, (oub) abnvVar);
                        }
                    }
                });
            case 15:
                final oub oubVar = (oub) obj;
                oue oueVar = oubVar.f;
                if (oueVar == null) {
                    oueVar = oue.a;
                }
                abpt abptVar2 = oueVar.c;
                if (abptVar2 == null) {
                    abptVar2 = abpt.a;
                }
                final int i = 0;
                return new rer(abptVar2, new res() { // from class: req
                    @Override // defpackage.res
                    public final void a(rzj rzjVar) {
                        int i2 = i;
                        abnv abnvVar = oubVar;
                        if (i2 != 0) {
                            uqw.ac(rzjVar, (ots) abnvVar);
                        } else {
                            uqw.O(rzjVar, (oub) abnvVar);
                        }
                    }
                });
            case 16:
                return ((ouq) obj).name();
            case 17:
                return ((scw) obj).name();
            case 18:
                double d = 1.0d;
                for (siu siuVar : (List) obj) {
                    zB &= siuVar.b();
                    d *= siuVar.e;
                }
                return siu.a(zB, d);
            case 19:
                boolean z = ((SamplerDecisionParcelable) obj).a;
                WeakHashMap weakHashMap = sjn.b;
                return Boolean.valueOf(z);
            default:
                return ((syo) obj).b;
        }
    }
}
