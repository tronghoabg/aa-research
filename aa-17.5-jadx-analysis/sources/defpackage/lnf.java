package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lnf extends mou {
    public lnf() {
        super("Media");
    }

    @Override // defpackage.mou
    protected final void a(Intent intent) {
        if (intent.getComponent() == null) {
            return;
        }
        if (affa.f(intent.getComponent(), mkn.F)) {
            kjq.a.a().l(2);
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_PLAYBACK_ONLY_APP_LAUNCH, yzy.hd);
            rrbVarH.p(intent.getComponent());
            ohsVarJ.F(rrbVarH.l());
            return;
        }
        Context context = mki.a.c;
        context.getClass();
        String str = new lop(context, intent.getComponent()).a().c;
        str.getClass();
        try {
            mfe.a();
            PackageManager packageManager = context.getPackageManager();
            ComponentName component = intent.getComponent();
            if (component == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(component.getPackageName());
            if (launchIntentForPackage == null) {
                intent.addFlags(268435456);
            } else {
                intent = launchIntentForPackage;
            }
            mfe.c(context, intent, str, yzz.MEDIA_PLAYBACK_ONLY_APP_LAUNCH);
        } catch (ActivityNotFoundException e) {
            ((ype) ((ype) mou.b.h()).p(e)).y("Activity not found for %s", str);
            obs.a().g(context, mkn.s, context.getString(R.string.app_not_launchable, str), 1);
        }
    }

    @Override // defpackage.mou
    protected final boolean b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (lnm.e(intent) && component != null && !affa.f(component, mkn.f)) {
            String packageName = component.getPackageName();
            packageName.getClass();
            if (packageName.length() > 0) {
                String className = component.getClassName();
                className.getClass();
                if (className.length() == 0) {
                    String packageName2 = component.getPackageName();
                    packageName2.getClass();
                    ygr ygrVarE = lem.a().e(kio.b().e(), nyj.a());
                    ygrVarE.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : ygrVarE) {
                        if (affa.f(((mqc) obj).a().getPackageName(), packageName2)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() > 1) {
                        ((ype) mou.b.h()).M("Found multiple launcher apps for package %s, choosing first in list %s", packageName2, arrayList);
                    }
                    mqc mqcVar = (mqc) woy.bH(arrayList);
                    if (mqcVar == null) {
                        return true;
                    }
                    intent.setComponent(mqcVar.a());
                    return false;
                }
            }
            if (lem.a().a(kio.b().e(), mpl.d(intent)) == null) {
                return true;
            }
        }
        return false;
    }
}
