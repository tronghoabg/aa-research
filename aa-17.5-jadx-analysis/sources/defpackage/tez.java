package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class tez extends yqr {
    public static boolean a;
    public static Executor b;
    public static final ConcurrentHashMap c;
    public static final Map d;
    public static final Map e;
    private static final yfy f;
    private static final yfy g;
    private static final yfq h;
    private final String i;
    private final tey j;
    private final boolean k;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e("GH.Assistant", tey.b);
        yfuVar.e("GH.CallManager", tey.d);
        yfuVar.e("CAR.AUDIO", tey.c);
        yfuVar.e("CAR.GAL.AUDIO", tey.c);
        yfuVar.e("CAR.GAL.MIC", tey.c);
        yfuVar.e("CAR.GAL.SYNC", tey.c);
        yfuVar.e("GH.SharedNotifications", tey.e);
        f = yfuVar.d(true);
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap(yfy.o(tey.a, new yne(new ydx(0)), tey.b, new yne(new ydx(50)), tey.c, new yne(new ydx(0)), tey.d, new yne(new ydx(0)), tey.e, new yne(new ydx(0))));
        yfy yfyVarO = yfy.o(tey.a, new vpo(0), tey.b, new vpo(50), tey.c, new vpo(0), tey.d, new vpo(0), tey.e, new vpo(0));
        g = yfyVarO;
        e = new ConcurrentHashMap(yfyVarO);
        h = yfq.v("GH", "CAR", "CarApp.H", "ADU", "XRAY", "PCTS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tez(String str) {
        super(str);
        boolean z = false;
        String strSubstring = str.substring(0, Math.min(str.length(), 23));
        this.i = strSubstring;
        tey teyVar = tey.a;
        String strAs = woy.as(strSubstring);
        yno it = f.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (strAs.startsWith(woy.as((String) entry.getKey()))) {
                teyVar = (tey) entry.getValue();
                break;
            }
        }
        this.j = teyVar;
        yfq yfqVar = h;
        int i = ((yls) yfqVar).c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            String str2 = (String) yfqVar.get(i2);
            i2++;
            if (this.i.startsWith(str2)) {
                z = true;
                break;
            }
        }
        this.k = z;
    }

    public static void c(PrintWriter printWriter) {
        for (tey teyVar : tey.values()) {
            d(printWriter, teyVar);
        }
    }

    public static void d(PrintWriter printWriter, tey teyVar) {
        Queue queue = (Queue) d.get(teyVar);
        queue.getClass();
        synchronized (queue) {
            printWriter.println(String.format(Locale.ROOT, "[%s] Dumping the last %d logs.", teyVar.name(), Integer.valueOf(queue.size())));
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                printWriter.println(((teu) it.next()).b());
            }
        }
    }

    public static void e(tey teyVar, int i) {
        Map map = d;
        Queue queue = (Queue) map.get(teyVar);
        queue.getClass();
        ydx ydxVar = new ydx(i);
        synchronized (queue) {
            ydxVar.addAll(queue);
            map.put(teyVar, new yne(ydxVar));
        }
        Map map2 = e;
        vpo vpoVar = (vpo) map2.get(teyVar);
        vpoVar.getClass();
        vpo vpoVar2 = new vpo(i);
        for (vpl vplVar : vpoVar.b(vpoVar.b, Alert.DURATION_SHOW_INDEFINITELY)) {
            vpoVar2.a(vplVar);
        }
        map2.put(teyVar, vpoVar2);
    }

    private static int h(tey teyVar) {
        Integer num = (Integer) c.get(teyVar);
        if (num == null) {
            return 7;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(defpackage.tey r11, defpackage.ypo r12) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tez.i(tey, ypo):void");
    }

    @Override // defpackage.ypp
    public final void a(ypo ypoVar) {
        tey teyVar = this.j;
        i(teyVar, ypoVar);
        tey teyVar2 = tey.a;
        if (teyVar != teyVar2) {
            i(teyVar2, ypoVar);
        }
    }

    @Override // defpackage.ypp
    public final boolean b(Level level) {
        if (!this.k) {
            return false;
        }
        int iF = yrm.f(level);
        String str = this.i;
        tey teyVar = this.j;
        if (spu.aS(str, iF, h(teyVar))) {
            return true;
        }
        tey teyVar2 = tey.a;
        return teyVar != teyVar2 && spu.aS(str, iF, h(teyVar2));
    }
}
