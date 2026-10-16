package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class jyu implements max {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CarApp.H.Not");
    private final ygr c;
    private final ygr d;
    private final Set e;
    private final Context f;
    private final Map g;
    private final kdg h;

    public jyu(Context context, ept eptVar) {
        mqc mqcVarA;
        ygp ygpVar = new ygp();
        Collection.EL.stream(jza.a().b(kio.b().e(), nyj.a())).map(new jxe(5)).filter(new hmd(13)).map(new jxe(6)).forEach(new iju(ygpVar, 18));
        if (ogb.k() && (mqcVarA = ogb.d().a()) != null) {
            ygpVar.c(mqcVarA.a());
        }
        ygr ygrVarG = ygpVar.g();
        this.c = ygrVarG;
        this.d = (ygr) Collection.EL.stream(jzb.a().b(kio.b().e(), nyj.a())).map(new jxe(5)).filter(new hmd(13)).map(new jxe(6)).collect(ycm.b);
        this.f = context;
        this.e = new HashSet();
        this.g = new HashMap();
        this.h = kdg.a;
        eptVar.c(new jyt(context, new jyr(ygrVarG), eptVar));
    }

    private final boolean c(StatusBarNotification statusBarNotification) {
        if (yrm.as(this.c, new jud(statusBarNotification, 3))) {
            return true;
        }
        return Boolean.TRUE.equals(kfl.h().g().e()) && statusBarNotification.getPackageName().equals(RemoteApiConstants.NOW_PACKAGE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.max
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.service.notification.StatusBarNotification r28, int r29, boolean r30) throws android.content.pm.PackageManager.NameNotFoundException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyu.a(android.service.notification.StatusBarNotification, int, boolean):boolean");
    }

    @Override // defpackage.max
    public final boolean b(StatusBarNotification statusBarNotification) {
        if (!c(statusBarNotification)) {
            return false;
        }
        int iA = jyq.a(statusBarNotification);
        nuj.b().g("APPHOST", iA, statusBarNotification.getPackageName());
        this.e.remove(Integer.valueOf(iA));
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sl);
        rrbVarH.f(statusBarNotification.getPackageName());
        ohsVarJ.F(rrbVarH.l());
        return true;
    }
}
