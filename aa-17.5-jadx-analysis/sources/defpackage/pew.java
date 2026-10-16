package defpackage;

import android.content.Context;
import android.os.Looper;
import j$.util.Objects;
import j$.util.OptionalInt;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class pew implements pab {
    public static final yph a = yph.c("GH.WPP.TCP");
    public final Context b;
    public final ozt c;
    public final kny d;
    public final Supplier e;
    public final tle f;
    public final tla g;
    public final phy h;
    public final pgc i;
    public final gjv j;
    public final ajmd k;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public pew(Context context, ajdr ajdrVar, pgc pgcVar, ajmd ajmdVar, ozt oztVar, phy phyVar) {
        xyc xycVarL = wub.L(new ojk(this, 7));
        xycVarL.getClass();
        this.e = new llv(xycVarL, 12);
        this.j = new gjv(pei.a);
        ((ype) ((ype) a.f()).ai((char) 6431)).u("Initializing WPP TCP manager...");
        this.b = context;
        this.i = pgcVar;
        this.k = ajmdVar;
        this.c = oztVar;
        this.h = phyVar;
        this.f = new tle("wpp-tcp-wakelock", Looper.getMainLooper().getThread(), ajdrVar.b);
        this.g = new tla("wpp-tcp-socket", Looper.getMainLooper(), ajdrVar.b);
        this.d = (kny) ajdrVar.e;
    }

    @Override // defpackage.pab
    public final pac a() {
        return pac.b;
    }

    @Override // defpackage.pab
    public final void b(xpr xprVar, abow abowVar) {
        xprVar.name();
        pej pejVar = (pej) this.j.v();
        if (pejVar instanceof pef) {
            try {
                ((pef) pejVar).a.b(xprVar, abowVar);
            } catch (Throwable th) {
                throw new RuntimeException(th.toString(), th);
            }
        } else {
            this.d.e(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_SEND_MESSAGE_DROPPED_NO_CONNECTION_TCP, OptionalInt.of(xprVar.l));
            ((ype) ((ype) a.h()).ai((char) 6436)).y("Dropping message of type %s because connection object is empty", xprVar.name());
        }
    }

    public final void c() {
        if (!Looper.getMainLooper().isCurrentThread()) {
            throw new IllegalStateException("Illegal state, expected to run in the main thread");
        }
    }

    public final void d(ozr ozrVar) {
        c();
        int iOrdinal = ozrVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 2) {
            switch (iOrdinal) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    switch (iOrdinal) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            break;
                        default:
                            woy.aa(((pej) this.j.v()).q(), "onConnectionFailure called when stopped");
                            e();
                            this.i.b(ozrVar);
                            return;
                    }
            }
        }
        throw new IllegalArgumentException(a.bW(ozrVar, "Reason ", " should not be used from WifiProjectionProtocolOnTcpManager"));
    }

    public final void e() {
        gjv gjvVar = this.j;
        if (!((pej) gjvVar.v()).q()) {
            ((ype) a.l().ai((char) 6440)).u("Ignore stop request of WPP TCP manager as it is already inactive.");
            return;
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6438)).u("Stopping WPP on TCP");
        pej pejVar = (pej) gjvVar.v();
        pejVar.getClass();
        Objects.checkIndex(0, 5);
        if (osq.H(pejVar, pec.a)) {
            throw new IllegalStateException("Only shutdown when started");
        }
        if (!osq.J(pejVar, pec.a)) {
            if (osq.I(pejVar, pec.a)) {
                this.g.b();
            } else {
                if (!(pejVar instanceof pef)) {
                    throw new RuntimeException(null, null);
                }
                try {
                    ((pef) pejVar).a.d();
                    this.g.b();
                } catch (Throwable th) {
                    throw new RuntimeException(th.toString(), th);
                }
            }
        }
        this.c.b();
        ((ype) ((ype) yphVar.f()).ai((char) 6439)).u("WPP on TCP stopped");
        this.d.d(yxi.WIRELESS_WIFI_PROJECTION_PROTOCOL_TCP_STOPPED);
        this.j.w(pei.a);
        this.f.b(new pea(this, 0));
    }
}
