package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.car.app.SessionInfo;
import com.google.android.apps.auto.components.media.app.MediaCarAppService;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class lke extends qz {
    public eqj c;
    public eqj d;
    public mon e;
    public qw f;
    final /* synthetic */ SessionInfo g;
    final /* synthetic */ MediaCarAppService h;
    private final aezr i = woy.dG(new lkd(this, 0));

    public lke(SessionInfo sessionInfo, MediaCarAppService mediaCarAppService) {
        this.g = sessionInfo;
        this.h = mediaCarAppService;
        this.a.c(new erc(this, 8, null));
    }

    private final qw m() {
        qn qnVarA = a();
        mon monVarH = h();
        ehq ehqVar = new ehq(this, 5, (boolean[]) null);
        eyr eyrVar = new eyr(this, 12, (float[][]) null);
        monVarH.getClass();
        thj thjVar = new thj(qnVarA, new lkt(2), new ewo(this.h.e, qnVarA, monVarH, eyrVar, ehqVar, 2));
        thjVar.c = "PLAYBACK";
        return thjVar;
    }

    private final qw n(String str, Bundle bundle) {
        qn qnVarA = a();
        mon monVarH = h();
        ehq ehqVar = new ehq(this, 6, (float[]) null);
        ezb ezbVar = new ezb((Object) this, 7, (byte[][]) null);
        ehq ehqVar2 = new ehq(this, 7, (boolean[]) null);
        monVarH.getClass();
        thj thjVar = new thj(qnVarA, new lld(), new llp(qnVarA, monVarH, ehqVar, ezbVar, ehqVar2, str, bundle, 0));
        thjVar.c = "SEARCH_RESULTS";
        return thjVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, tho] */
    @Override // defpackage.qz
    public final qw b(Intent intent) {
        mqb mqbVar;
        mqb mqbVarB;
        eqj eqjVar;
        intent.getClass();
        try {
            String sessionId = this.g.getSessionId();
            sessionId.getClass();
            mqbVarB = mpl.c(sessionId);
        } catch (Exception unused) {
            ((ynz) MediaCarAppService.c.h().ai(3982)).u("No app key in sessionInfo, using component from intent");
            int i = lng.a;
            Bundle extras = intent.getExtras();
            ComponentName componentNameA = extras != null ? (ComponentName) extras.getParcelable("GH.ComponentExtra") : null;
            if (componentNameA == null) {
                componentNameA = lgv.a().a(mpz.d);
            }
            if (componentNameA != null) {
                mqbVarB = mpl.b(componentNameA);
            } else {
                mqbVar = null;
            }
        }
        mqbVar = mqbVarB;
        if (mqbVar == null) {
            ((ynz) MediaCarAppService.c.h().ai(3981)).u("No targeted media component, falling back to launcher");
            return lnm.s(a(), null);
        }
        tfk tfkVar = tfk.a;
        tfj tfjVar = tfj.GEARHEAD_MEDIA_ACTIVITY_PRIMARY_REGION_INITIAL_SCREEN_BROWSE;
        tfkVar.d(tfjVar, 3);
        tfj tfjVar2 = tfj.GEARHEAD_MEDIA_ACTIVITY_PRIMARY_REGION_INITIAL_SCREEN_PLAYBACK;
        tfkVar.d(tfjVar2, 3);
        tfkVar.b(tfjVar);
        tfkVar.b(tfjVar2);
        loy loyVarJ = loy.j();
        ComponentName componentName = mqbVar.a;
        this.c = tby.t(loyVarJ.b(componentName));
        eqj eqjVarF = loy.j().f(componentName);
        eqjVarF.getClass();
        this.d = eqjVarF;
        this.e = new mon(a(), componentName);
        eqj eqjVar2 = this.c;
        if (eqjVar2 == null) {
            affa.d("browserConnectionData");
            eqjVar2 = null;
        }
        eqjVar2.fE(lbh.d(), new ewg(new lfn(2), 14));
        eqj eqjVar3 = this.d;
        if (eqjVar3 == null) {
            affa.d("controllerConnectionData");
            eqjVar = null;
        } else {
            eqjVar = eqjVar3;
        }
        eqjVar.fE(this, new ewg(new hgf((Object) this, (Object) mqbVar, (Object) intent, 9, (char[]) null), 14));
        MediaCarAppService mediaCarAppService = this.h;
        qn qnVarA = a();
        mon monVarH = h();
        ehq ehqVar = new ehq(this, 8, (float[]) null);
        ehq ehqVar2 = new ehq(this, 9, (boolean[]) null);
        ezb ezbVar = new ezb((Object) this, 8, (byte[][]) null);
        monVarH.getClass();
        thj thjVar = new thj(qnVarA, mediaCarAppService.d.b, new lkh(qnVarA, this, monVarH, ehqVar, ehqVar2, ezbVar, 0));
        thjVar.c = "BROWSE";
        return thjVar;
    }

    @Override // defpackage.qz
    public final void e(Intent intent) {
        qw qwVarF;
        intent.getClass();
        if (this.e == null || (qwVarF = f(intent)) == null) {
            return;
        }
        lnm.x(qwVarF);
    }

    public final qw f(Intent intent) {
        if (lnm.e(intent)) {
            return m();
        }
        if (intent.getComponent() == null || !"MEDIA_SHOW_SEARCH_RESULTS".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("query");
        stringExtra.getClass();
        return n(stringExtra, intent.getBundleExtra("search_extras"));
    }

    public final qx g() {
        return (qx) this.i.a();
    }

    public final mon h() {
        mon monVar = this.e;
        if (monVar != null) {
            return monVar;
        }
        affa.d("appInfo");
        return null;
    }

    public final void i() {
        qx qxVarG = g();
        qxVarG.getClass();
        Collection collectionB = qxVarG.b();
        if (!collectionB.isEmpty()) {
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                if (affa.f(((qw) it.next()).c, "PLAYBACK")) {
                    qx qxVarG2 = g();
                    qxVarG2.getClass();
                    qxVarG2.e("PLAYBACK");
                    return;
                }
            }
        }
        lnm.w(m());
    }

    public final void j(String str) {
        lnm.x(n(str, Bundle.EMPTY));
    }

    public final void k() {
        qn qnVarA = a();
        mon monVarH = h();
        ehq ehqVar = new ehq(this, 12, (float[]) null);
        ezb ezbVar = new ezb((Object) this, 10, (byte[][]) null);
        eyr eyrVar = new eyr(this, 13, (float[][]) null);
        monVarH.getClass();
        thj thjVar = new thj(qnVarA, new lkt(3), new ewo(qnVarA, monVarH, ehqVar, ezbVar, eyrVar, 3));
        thjVar.c = "SEARCH";
        lnm.x(thjVar);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, tho] */
    public final void l(llu lluVar, htm htmVar) {
        qn qnVarA = a();
        mon monVarH = h();
        ehq ehqVar = new ehq(this, 10, (float[]) null);
        ehq ehqVar2 = new ehq(this, 11, (boolean[]) null);
        ezb ezbVar = new ezb((Object) this, 9, (byte[][]) null);
        monVarH.getClass();
        thj thjVar = new thj(qnVarA, this.h.d.a, new llp(qnVarA, monVarH, lluVar, htmVar, ehqVar, ehqVar2, ezbVar, 1));
        thjVar.c = "BROWSE";
        lnm.w(thjVar);
    }
}
