package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.messaging.model.ConversationItem;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class jxv {
    public static void a() {
    }

    public static final void b(ConversationItem conversationItem, String str) {
        ogz ogzVarB;
        if (actj.w()) {
            if (actj.w()) {
                String id = conversationItem.getId();
                id.getClass();
                ogzVarB = lyl.a.a().b(new lwb(str, id));
            } else {
                ogzVarB = null;
            }
            if (ogzVarB == null) {
                return;
            } else {
                ogzVarB.a();
            }
        }
        String id2 = conversationItem.getId();
        id2.getClass();
        ohe oheVarB = lyn.a.a().b(new lwb(str, id2));
        if (oheVarB != null) {
            oheVarB.g();
        }
    }

    public static final void c(String str) {
        Uri uri = Uri.parse("tel:".concat(str));
        uri.getClass();
        mpe.a().i(new Intent("android.intent.action.DIAL", uri));
    }

    public static final void d(geu geuVar, ConversationItem conversationItem, String str) {
        glp glpVarT = geuVar.t();
        sr conversationCallbackDelegate = conversationItem.getConversationCallbackDelegate();
        conversationCallbackDelegate.getClass();
        glpVarT.i(conversationCallbackDelegate, str);
    }

    public static final void e(geu geuVar, int i) {
        geuVar.y().a(geuVar.getString(i), 0);
    }

    public static final whg f(geu geuVar, lua luaVar, boolean z) {
        ComponentName componentName = ((gmh) geuVar.d()).a;
        boolean zEquals = Objects.equals(componentName.getPackageName(), "com.google.android.projection.gearhead");
        if (zEquals) {
            componentName = new ComponentName(geuVar.b().getSessionId(), "");
        }
        ComponentName componentName2 = componentName;
        return new whg(Objects.equals(componentName2.getPackageName(), "com.google.android.projection.gearhead") ? ltz.b : zEquals ? ltz.a : ltz.c, luaVar, zEquals ? lub.NOTIFICATION_BACKED_APP : lub.CAL_APP, componentName2, z);
    }

    public static final whg g(geu geuVar) {
        a();
        return f(geuVar, null, false);
    }

    public static final void h(yzy yzyVar, whg whgVar) {
        lxr.e();
        lxr.f(((lub) whgVar.c).h, yzyVar, (ComponentName) whgVar.b);
    }

    public static final void i(lwr lwrVar, yzy yzyVar, whg whgVar) {
        yzz yzzVar = ((lub) whgVar.c).h;
        yzzVar.getClass();
        if (lwrVar.d(yzzVar)) {
            return;
        }
        lwrVar.c(yzzVar);
        h(yzyVar, whgVar);
    }

    public static final ckv j(bcm bcmVar, bux buxVar) {
        bcmVar.getClass();
        aft aftVar = new aft(1.0f, 1500.0f, null);
        boolean zC = buxVar.C(aftVar);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new ksx(bcmVar, aftVar);
            buxVar.x(objG);
        }
        ksx ksxVar = (ksx) objG;
        Object objG2 = buxVar.g();
        Object obj = buw.a;
        if (objG2 == obj) {
            objG2 = afpt.r(-1, 0, 6);
            buxVar.x(objG2);
        }
        aixl aixlVar = (aixl) objG2;
        boolean zE = buxVar.E(aixlVar) | buxVar.C(bcmVar);
        Object objG3 = buxVar.g();
        if (zE || objG3 == obj) {
            objG3 = new kku(aixlVar, bcmVar, 5);
            buxVar.x(objG3);
        }
        buxVar.r((afdr) objG3);
        boolean zE2 = buxVar.E(aixlVar) | buxVar.C(ksxVar);
        Object objG4 = buxVar.g();
        if (zE2 || objG4 == obj) {
            objG4 = new bsj(aixlVar, ksxVar, null, 2);
            buxVar.x(objG4);
        }
        bvq.f(ksxVar, aixlVar, (afeg) objG4, buxVar);
        dlg dlgVar = (dlg) buxVar.f(dbc.d);
        dlgVar.getClass();
        ksxVar.c = dlgVar;
        boolean zC2 = buxVar.C(dlgVar) | buxVar.C(ksxVar);
        Object objG5 = buxVar.g();
        if (zC2 || objG5 == obj) {
            objG5 = new ksv(ksxVar);
            buxVar.x(objG5);
        }
        return (ksv) objG5;
    }

    public static kqx k() {
        return (kqx) mki.a.i(kqx.class);
    }
}
