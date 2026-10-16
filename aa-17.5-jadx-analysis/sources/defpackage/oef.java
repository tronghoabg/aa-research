package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import java.util.Random;

/* loaded from: classes.dex */
public final class oef implements nfz {
    private static final yph a = yph.c("GH.DialerQuickFdbkPrvdr");
    private final ngf b;
    private final Context c;
    private final Random d;

    public oef(ngf ngfVar, Context context) {
        Random random = new Random();
        this.b = ngfVar;
        this.c = context;
        this.d = random;
    }

    @Override // defpackage.nfz
    public final /* bridge */ /* synthetic */ nge a(nga ngaVar) {
        ComponentName componentNameA;
        if (ngaVar != ngb.d && !(ngaVar instanceof ngc)) {
            return null;
        }
        ngf ngfVar = this.b;
        if (ngfVar.a() <= ngfVar.n() || this.d.nextDouble() >= acqd.b()) {
            return null;
        }
        ((ype) ((ype) a.f()).ai((char) 5604)).u("Showing dialer quick feedback notification.");
        if (ngaVar instanceof ngc) {
            componentNameA = ((ngc) ngaVar).a;
        } else if (ogb.i()) {
            mqc mqcVarA = ogb.d().a();
            mqcVarA.getClass();
            componentNameA = mqcVarA.a();
        } else {
            componentNameA = mkn.b;
        }
        ComponentName componentName = componentNameA;
        return new nvm(this.c, R.string.call_quick_feedback_prompt, 0, "Dialer Quick Feedback Notification", GhIcon.j(componentName), yzz.CSAT_PHONE_CALL, componentName, null);
    }
}
