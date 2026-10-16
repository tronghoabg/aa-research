package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.car.app.SessionInfo;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.TemplateWrapper;
import com.android.car.libraries.apphost.external.model.widgets.PaneWidget;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class jrz implements geb {
    private static final yph b = yph.c("CarApp.H.Tem");
    wb a;
    private final jsp c;
    private final Runnable d;

    public jrz(jsp jspVar, Runnable runnable) {
        this.c = jspVar;
        this.d = runnable;
    }

    @Override // defpackage.geb
    public final void a(gdq gdqVar) {
        wb wbVarA;
        Context context = mki.a.c;
        Throwable th = gdqVar.a;
        int i = 0;
        if (th != null) {
            if (gdqVar.d) {
                Object[] objArr = {gdqVar};
                if (Log.isLoggable("CarApp.H.Tem", 2)) {
                    Log.v("CarApp.H.Tem", gks.a("Error: %s", objArr), th);
                }
            } else {
                gks.g("CarApp.H.Tem", th, "Error: %s", gdqVar);
            }
        } else if (gdqVar.d) {
            gks.i("CarApp.H.Tem", "Error: %s", gdqVar);
        } else {
            gks.e("CarApp.H.Tem", "Error: %s", gdqVar);
        }
        jsp jspVar = this.c;
        mqb mqbVar = jspVar.p;
        if (mqbVar == null) {
            mqbVar = new mqb(new ComponentName(context, (Class<?>) jsp.class));
        }
        context.getClass();
        gec gecVar = new gec(this.d, 5);
        Intent intent = jspVar.g;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("com.google.android.apps.auto.components.apphost.EXTRA_WIDGET_APP", false) : false;
        ComponentName componentName = mqbVar.a;
        if (booleanExtra) {
            sw swVar = new sw();
            swVar.d(gecVar);
            swVar.e(context.getString(R.string.exit_text));
            wbVarA = new PaneWidget(null, null, null, CarText.create(gca.d(gca.c(context, componentName), gdqVar, context)), yfq.q(swVar.a()), null);
        } else {
            um umVar = new um(gca.d(gca.c(context, componentName), gdqVar, context));
            umVar.e(" ");
            umVar.d(CarIcon.ERROR);
            if (th != null) {
                umVar.i = th;
            }
            String str = gdqVar.b;
            if (str != null) {
                umVar.j = str;
            }
            sw swVar2 = new sw();
            swVar2.e(context.getString(R.string.exit_text));
            swVar2.d(gecVar);
            umVar.b(swVar2.a());
            int i2 = gdqVar.e;
            Runnable runnable = gdqVar.c;
            Action actionA = null;
            if (i2 == 1 && runnable != null) {
                sw swVar3 = new sw();
                swVar3.e(context.getString(R.string.gearhead_anr_wait));
                swVar3.d(new gec(runnable, i));
                actionA = swVar3.a();
            }
            if (actionA != null) {
                umVar.b(actionA);
            }
            wbVarA = umVar.a();
        }
        this.a = wbVarA;
        try {
            SessionInfo sessionInfo = jspVar.q;
            sessionInfo.getClass();
            hid hidVarR = ((hhz) jspVar.b(mqbVar, sessionInfo).a(CloudRecognizerProtocolStrings.APP)).r();
            jsp jspVar2 = this.c;
            mqb mqbVar2 = jspVar2.p;
            mqbVar2.getClass();
            hidVarR.a(mqbVar2.a, jspVar2.q, TemplateWrapper.wrap(this.a));
        } catch (gee e) {
            ((ype) ((ype) b.l().p(e)).ai((char) 2705)).u("Failure while attempting to show an error screen, Android Auto has stopped already");
        } catch (IllegalStateException e2) {
            ((ype) ((ype) b.l().p(e2)).ai((char) 2706)).u("Failure while attempting to show an error screen, car disconnected");
        }
    }
}
