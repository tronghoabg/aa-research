package defpackage;

import android.content.Context;
import android.location.Location;
import j$.time.Duration;
import j$.time.Instant;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ooa implements mnd {
    public static final yph a = yph.c("GH.WeatherFetcher");
    public static final Duration b = Duration.ofHours(1);
    public final ydx c;
    public final oob d;
    public final aezk e;
    public final zgs f;
    public final htm g;

    public ooa(Context context) {
        oya oyaVar = new oya(context, 1);
        oob oobVar = new oob(context);
        htm htmVar = new htm((Object) context);
        this.c = new ydx(10);
        this.f = yrm.aI(Executors.newSingleThreadExecutor());
        this.e = oyaVar;
        this.d = oobVar;
        this.g = htmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(defpackage.yvf r9, int r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooa.b(yvf, int):int");
    }

    final void a(Location location, Instant instant, yzy yzyVar) {
        this.c.add(new ony(location.getLatitude(), location.getLongitude(), null, instant, yzyVar.sn));
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        mng mngVarA = mnh.a();
        mngVarA.a = "Request Time";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "Status";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        List listAsList = Arrays.asList(mngVarA.a(), mngVarA2.a());
        mnf mnfVarL = mnk.l();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            mnfVarL.b((mnh) it.next());
        }
        mng mngVarA3 = mnh.a();
        mngVarA3.a = "Latitude";
        mngVarA3.b();
        mngVarA3.c('|');
        mngVarA3.d(true);
        mnfVarL.b(mngVarA3.a());
        mng mngVarA4 = mnh.a();
        mngVarA4.a = "Longitude";
        mngVarA4.b();
        mngVarA4.c('|');
        mngVarA4.d(true);
        mnfVarL.b(mngVarA4.a());
        mng mngVarA5 = mnh.a();
        mngVarA5.a = "Weather Data";
        mngVarA5.b();
        mngVarA5.c('|');
        mngVarA5.d(true);
        mnfVarL.b(mngVarA5.a());
        Iterator<E> it2 = this.c.iterator();
        while (it2.hasNext()) {
            ony onyVar = (ony) it2.next();
            mnfVarL.c(onyVar.d, onyVar.e, Double.valueOf(onyVar.a), Double.valueOf(onyVar.b), onyVar.c);
        }
        mnfVarL.a().m(printWriter);
    }
}
