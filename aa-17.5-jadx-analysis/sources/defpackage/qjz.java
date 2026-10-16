package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class qjz extends qkk {
    static {
        yph.c("GH.CCPAdapter");
    }

    private final nul g(qjy qjyVar, int i) {
        Context context = mki.a.c;
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_ACTION_ID", qjyVar);
        PendingIntent pendingIntentBo = roc.bo(this.g, bundle);
        aaew aaewVar = new aaew(null);
        GhIcon ghIconP = GhIcon.p(context, R.drawable.ic_call_end);
        ghIconP.d = null;
        ghIconP.c = R.color.ongoing_call_endcall;
        ghIconP.e = PorterDuff.Mode.SRC_IN;
        aaewVar.e = ghIconP;
        aaewVar.d = context.getString(i);
        aaewVar.b = pendingIntentBo;
        aaewVar.a = 3;
        return new nul(aaewVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    @Override // defpackage.qkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.nur a(defpackage.moa r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjz.a(moa):nur");
    }

    @Override // defpackage.qkj
    public final void b(Bundle bundle) {
        qjy qjyVar = (qjy) bundle.getSerializable("EXTRA_ACTION_ID");
        ohk ohkVar = (ohk) this.g;
        int iOrdinal = qjyVar.ordinal();
        if (iOrdinal == 0) {
            ComponentName componentName = mkn.b;
            CarCall carCallE = odn.a().e(ohkVar.a());
            if (carCallE != null && mcd.A().t(carCallE)) {
                ComponentName componentNameA = mcd.A().a(mki.a.c, mcd.A().b(carCallE).getPackageName());
                if (componentNameA != null) {
                    componentName = componentNameA;
                }
            }
            Intent intent = new Intent();
            intent.setComponent(componentName);
            mpe.a().i(intent);
            ebf.j().F(odn.a().k(yzz.PROJECTION_NOTIFICATION, yzy.aa).l());
            return;
        }
        if (iOrdinal == 1) {
            ebf.A().u(ohkVar.a(), true);
            ebf.j().F(odn.a().k(yzz.PROJECTION_NOTIFICATION, yzy.J).l());
            return;
        }
        if (iOrdinal == 2) {
            ebf.A().u(ohkVar.a(), false);
            ebf.j().F(odn.a().k(yzz.PROJECTION_NOTIFICATION, yzy.J).l());
            return;
        }
        if (iOrdinal == 3) {
            ebf.A().y(ohkVar.a());
            ebf.j().F(odn.a().i(ohkVar.a(), yzz.PROJECTION_NOTIFICATION, yzy.I).l());
        } else if (iOrdinal == 4) {
            ebf.A().m(ohkVar.a());
            ebf.j().F(odn.a().i(ohkVar.a(), yzz.PROJECTION_NOTIFICATION, yzy.E).l());
        } else {
            if (iOrdinal != 5) {
                throw new IllegalStateException("Call widget received invalid action: ".concat(String.valueOf(String.valueOf(qjyVar))));
            }
            ebf.A().y(ohkVar.a());
            ebf.j().F(odn.a().i(ohkVar.a(), yzz.PROJECTION_NOTIFICATION, yzy.G).l());
        }
    }
}
