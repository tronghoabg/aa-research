package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaSessionManager;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class lpq implements lhg {
    public static final yph a = yph.c("GH.MediaNowPlayingApp");
    public final eqj b;
    public final Set c;
    private eqj d;

    /* JADX WARN: Multi-variable type inference failed */
    public lpq(Context context) {
        int i = yfq.d;
        yfq yfqVar = yls.a;
        afco afcoVar = tby.a;
        this.d = new eqm(yfqVar);
        this.c = new HashSet();
        Object systemService = context.getSystemService("media_session");
        systemService.getClass();
        eqj eqjVarA = lno.a(context, (MediaSessionManager) systemService);
        HashMap map = new HashMap();
        if (!lmi.a.a().c()) {
            this.b = eqy.a(tby.C(eqy.a(kiu.a()), new hgf(this, eqjVarA, map, 13)));
            return;
        }
        eqj eqjVarA2 = eqy.a(kiu.a());
        eqj eqjVarC = tby.C(eqjVarA2, new erl(eqjVarA, map, 8, (byte[]) null));
        eqj eqjVarC2 = tby.C(eqjVarA2, new daz(eqjVarC, 19));
        this.b = eqy.a(tby.C(eqjVarA2, new erl((Object) this, (Object) eqjVarC, 9, (char[]) (0 == true ? 1 : 0))));
        this.d = eqy.b(eqy.a(eqjVarC2), new njq(yfqVar, 14));
    }

    public static ComponentName a(lmb lmbVar) {
        String strR = lmbVar.R();
        strR.getClass();
        return new ComponentName(strR, lmbVar.n().getString("android.media.session.BROWSE_SERVICE", ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static loz g(qrn qrnVar, List list, Set set) {
        int i = 0;
        Stream streamDistinct = Collection.EL.stream(list).filter(new lpw(qrnVar, set, 1)).map(new lpc(qrnVar, i)).filter(new kxo(10)).distinct();
        int i2 = yfq.d;
        yfq yfqVar = (yfq) streamDistinct.collect(ycm.a);
        if (yfqVar.isEmpty()) {
            return null;
        }
        loz lozVar = (loz) yfqVar.get(0);
        if (aclu.i()) {
            set.add(lozVar.a);
        }
        if (yfqVar.size() >= 2) {
            ((ype) ((ype) a.h()).ai(4168)).M("Multiple playing browser services (%s), choosing %s", yfqVar, lozVar);
            int size = yfqVar.size();
            while (i < size) {
                loz lozVar2 = (loz) yfqVar.get(i);
                ohu ohuVarA = ohu.a();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_SESSION_LIFECYCLE, yzy.fX);
                rrbVarH.p(lozVar2.a);
                ohuVarA.b((rrc) rrbVarH.l());
                i++;
            }
        }
        return lozVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.loz h(defpackage.qrn r16, defpackage.lpf r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpq.h(qrn, lpf):loz");
    }

    public static lpq i() {
        return (lpq) mki.a.i(lpq.class);
    }

    public static yfq j(qrn qrnVar, List list, Map map) {
        yfq yfqVar;
        if (k()) {
            Stream streamFilter = Collection.EL.stream(list).filter(new kxo(8));
            int i = yfq.d;
            yfqVar = (yfq) streamFilter.collect(ycm.a);
        } else {
            Stream streamFilter2 = Collection.EL.stream(list).filter(new lou(qrnVar, 2));
            int i2 = yfq.d;
            yfqVar = (yfq) streamFilter2.collect(ycm.a);
        }
        ygr ygrVar = (ygr) Collection.EL.stream(yfqVar).map(new lka(11)).collect(ycm.b);
        yno it = ygr.n(map.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!ygrVar.contains(next)) {
                map.remove(next);
            }
        }
        return (yfq) Collection.EL.stream(yfqVar).map(new gjm(map, 19)).filter(new kxo(9)).collect(ycm.a);
    }

    public static boolean k() {
        return lmi.a().e() || acsx.D();
    }

    public final eqj b() {
        woy.aa(lmi.a().c(), "The multiple dashboard media cards feature needs to be enabled to use this API.");
        return this.d;
    }

    @Override // defpackage.lhg
    public final void d() {
        if (aclu.i()) {
            this.c.clear();
        }
    }

    public final eqj e() {
        int i = 15;
        krq krqVar = new krq(i);
        afco afcoVar = tby.a;
        eqj eqjVar = this.b;
        eqjVar.getClass();
        return eqy.b(eqjVar, new njq(krqVar, i));
    }

    public final eqj f() {
        return !k() ? tby.w(this.b, new lmv(8)) : tby.C(eqy.a(kiu.a()), new llf(this, 15));
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
