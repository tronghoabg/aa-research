package defpackage;

import j$.util.Collection;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class mbd implements lhg, mnd {
    private final ydx c = new ydx(10);
    private final String d;
    private mbb e;
    private static final yph b = yph.c("GH.NotifListnrStMonitor");
    public static final SimpleDateFormat a = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);

    public mbd(String str) {
        this.d = str;
    }

    public final synchronized void a(String str) {
        mbb mbbVar = this.e;
        if (mbbVar == null) {
            return;
        }
        Map map = mbbVar.b;
        if (!map.containsKey(str)) {
            map.put(str, 0L);
        }
        map.put(str, Long.valueOf(((Long) map.get(str)).longValue() + 1));
    }

    public final synchronized void b(int i) {
        mbb mbbVar = this.e;
        if (mbbVar == null) {
            return;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            ebf.j().x(18, yyv.NOTIFICATION_LISTENER_CLIENT_CONNECTING);
        } else if (i2 == 1) {
            ebf.j().x(18, yyv.NOTIFICATION_LISTENER_CLIENT_SUCCESSFULLY_CONNECTED);
        }
        mbbVar.a.add(new mbc(a.format(new Date()), i));
    }

    @Override // defpackage.lhg
    public final synchronized void c() {
        mbb mbbVar = new mbb(a.format(new Date()), this.d);
        this.e = mbbVar;
        this.c.add(mbbVar);
        mnc.a().b(mnb.q, this);
    }

    @Override // defpackage.lhg
    public final synchronized void d() {
        mbb mbbVar = this.e;
        if (mbbVar == null) {
            ((ype) ((ype) b.f()).ai((char) 4703)).u("Unable to log telemetry event for total number of notifications posted");
        } else {
            long jSum = Collection.EL.stream(yfy.j(mbbVar.b).values()).mapToLong(new luz(2)).sum();
            ((ype) b.l().ai(4702)).x("Logging telemetry events: Total number of notifications posted %d", jSum);
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_LISTENER, yzy.Fi);
            int i = (int) jSum;
            if (jSum != i) {
                throw new ArithmeticException();
            }
            rrbVarH.w(i);
            ohsVarJ.F(rrbVarH.l());
        }
        mnc.a().d(mnb.q);
        this.e = null;
    }

    @Override // defpackage.mnd
    public final synchronized void h(PrintWriter printWriter) {
        Iterator<E> it = this.c.iterator();
        while (it.hasNext()) {
            printWriter.println(((mbb) it.next()).toString());
        }
    }
}
