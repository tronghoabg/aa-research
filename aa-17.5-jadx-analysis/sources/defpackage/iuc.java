package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class iuc {
    public static final yph a = yph.c("CAR.SERVICE");
    public static final ygr b = new ymp(RemoteApiConstants.NOW_PACKAGE);
    public volatile ikg A;
    public volatile iki B;
    public volatile ikt C;
    public volatile ikp D;
    public volatile ile E;
    public volatile ijv F;
    public volatile ike G;
    public volatile ikd H;
    public volatile itt I;
    public volatile irg J;
    private jco M;
    public final iub c;
    public final xyc d;
    public final jev e;
    public final ikz f;
    public final jew g;
    public final ilb h;
    public final ilc i;
    public final xyc j;
    public final Context k;
    public final rbe m;
    public boolean n;
    public volatile long o;
    public volatile int p;
    public volatile jfg q;
    public volatile CarInfoInternal r;
    public volatile jbp s;
    public volatile boolean t;
    public volatile HandlerThread u;
    public volatile jff v;
    public volatile iud w;
    public volatile iwz x;
    public volatile irb y;
    public volatile iwc z;
    public volatile yfy K = ylx.a;
    public final Map L = new ConcurrentHashMap();
    public final Handler l = new Handler(Looper.getMainLooper());

    public iuc(iub iubVar, xyc xycVar, jev jevVar, ikz ikzVar, jew jewVar, ilb ilbVar, ilc ilcVar, xyc xycVar2, Context context, rbe rbeVar) {
        this.c = iubVar;
        this.d = xycVar;
        this.e = jevVar;
        this.f = ikzVar;
        this.g = jewVar;
        this.h = ilbVar;
        this.i = ilcVar;
        this.j = xycVar2;
        this.k = context;
        this.m = rbeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(yfq yfqVar, xjc xjcVar) {
        int size = yfqVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((iuu) ((Pair) yfqVar.get(i2)).first).k.equals(xjcVar)) {
                i++;
            }
        }
        return i;
    }

    private static final boolean f() {
        return ((int) acvz.a.gu().a()) == 1;
    }

    public final synchronized jcp b() {
        return this.M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c() {
        jco jcoVar = this.M;
        if (jcoVar != null) {
            yph yphVar = jcoVar.g;
            yws ywsVar = jcoVar.f;
            ((ype) ((ype) yphVar.f()).ai((char) 1887)).y("Logging in use buffers for consumer: %s", ywsVar.name());
            int i = 0;
            while (true) {
                yfq yfqVar = jcoVar.c;
                if (i >= ((yls) yfqVar).c) {
                    break;
                }
                ((jcl) yfqVar.get(i)).f();
                i++;
            }
        }
        this.M = null;
    }

    public final synchronized void d(yws ywsVar) {
        if (ywsVar.ordinal() != 2) {
            throw new UnsupportedOperationException(String.format("Construction of pool for %s is not supported", ywsVar.name()));
        }
        if (this.M == null) {
            acns acnsVar = acns.a;
            this.M = jco.a(acnsVar.gu().b().b, a.O(), f(), yws.POOL_VIDEO, new jcq(f(), (int) acnsVar.gu().a()));
        }
    }

    public final boolean e() {
        CarInfo carInfo = this.r != null ? this.r.a : null;
        return carInfo != null && carInfo.r == 3;
    }
}
