package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.time.Duration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ndp extends erm {
    public static final /* synthetic */ int q = 0;
    private static final Duration r;
    public final String a;
    public final eqj b;
    public final Context c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    public final eqj g;
    public final eqj i;
    public final eqj j;
    public final eqj k;
    public final eqj l;
    public final eqj m;
    public final eqj n;
    public final eqj o;
    public final eqj p;
    private final eqj s;
    private final eqj t;
    private final eqj u;
    private final eqj v;
    private final eqj w;
    private final eqj x;
    private final eqj y;

    static {
        long j = aisq.a;
        Duration durationOfSeconds = Duration.ofSeconds(aisq.f(afzc.c(1, aiss.d)), aisq.d(r0));
        durationOfSeconds.getClass();
        r = durationOfSeconds;
    }

    public ndp(String str) {
        this.a = str;
        eqj eqjVarT = tby.t(tby.v(nuj.b().a(), new nar(this, 5)));
        this.b = eqjVarT;
        Context context = mki.a.c;
        context.getClass();
        this.c = context;
        eqj eqjVarA = eqy.a(tby.v(eqjVarT, new nch(7)));
        this.s = eqjVarA;
        this.d = tby.v(eqjVarA, new nch(8));
        eqj eqjVarV = tby.v(eqjVarA, new nch(9));
        this.t = eqjVarV;
        Duration duration = r;
        duration.getClass();
        eqj eqjVarP = dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new tci(duration, null));
        this.u = eqjVarP;
        eqj eqjVarV2 = tby.v(eqjVarA, new nch(10));
        this.v = eqjVarV2;
        int i = 20;
        eqj eqjVarE = tby.e(eqjVarV, eqjVarV2, eqjVarP, new kkw(this, i));
        this.w = eqjVarE;
        eqj eqjVarV3 = tby.v(eqjVarA, new nch(11));
        this.x = eqjVarV3;
        this.e = tby.v(eqjVarA, new nch(12));
        this.f = eqy.a(tby.v(eqjVarA, new nch(13)));
        this.g = tby.v(eqjVarA, new nch(14));
        this.i = tby.G(eqjVarE, eqjVarV3, new msw(this, i));
        this.j = tby.v(eqjVarA, new nch(15));
        eqj eqjVarV4 = tby.v(eqjVarA, new nch(16));
        this.y = eqjVarV4;
        this.k = tby.C(eqjVarV4, new nch(17));
        this.l = tby.v(eqjVarA, new nch(18));
        this.m = tby.v(eqjVarA, new nch(19));
        this.n = tby.v(eqjVarA, new nch(i));
        this.o = tby.v(eqjVarA, new ndo(1));
        tby.v(eqjVarA, new ndo(0));
        this.p = tby.v(eqjVarA, new nch(6));
    }

    public final void a() {
        nuh nuhVar = (nuh) this.b.e();
        if (nuhVar != null) {
            nuhVar.d();
        }
    }

    public final void b(int i) {
        nuh nuhVar = (nuh) this.b.e();
        Bundle bundle = nuhVar != null ? nuhVar.c.F : null;
        if (bundle != null && bundle.containsKey("assistantSuggestionShownEventKey")) {
            kwv kwvVarH = kfl.h();
            abnp abnpVarN = osa.a.n();
            abnpVarN.getClass();
            osq.y(i, abnpVarN);
            osq.z(abnpVarN);
            ArrayList<String> stringArrayList = bundle.getStringArrayList("assistantSuggestionShownEventKey");
            stringArrayList.getClass();
            osq.x(stringArrayList, abnpVarN);
            kwvVarH.w(osq.w(abnpVarN));
        }
        if (acrn.g() && bundle != null && bundle.containsKey("assistantSuggestionShownEventKey") && bundle.containsKey("assistantSuggestionIntentTypeKey") && bundle.getInt("assistantSuggestionIntentTypeKey") == 4) {
            ebf.j().F(rqv.h(yxy.GEARHEAD, 40, yyv.ASSISTANT_SUGGESTION_SHOWN_SHARE_ETA_TRIGGER_HATS).l());
        }
    }
}
