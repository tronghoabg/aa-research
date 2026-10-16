package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.car.app.SessionInfo;
import androidx.car.app.model.TemplateWrapper;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class jsb implements hid {
    public static final yph a = yph.c("CarApp.H");
    public static int b = 1000;
    public final Handler c = new Handler(Looper.getMainLooper(), new gly(this, 3));
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public long f = -9223372036854775807L;
    public TemplateWrapper g;
    public boolean h;
    public final WeakReference i;
    private final mqb j;
    private final WeakReference k;

    public jsb(geu geuVar, jsp jspVar, mqb mqbVar) {
        this.k = new WeakReference(jspVar);
        this.i = new WeakReference(geuVar);
        this.j = mqbVar;
        byte[] bArr = null;
        geuVar.B().b(this, 13, new joo(this, 8, bArr));
        leh.a();
        int i = 9;
        if (leh.a().b()) {
            geuVar.B().b(this, 7, new joo(this, i, bArr));
        }
        geuVar.B().b(this, 8, new joo(this, i, bArr));
        jspVar.getLifecycle().c(new jsa(this, geuVar));
        this.h = ((gsf) geuVar.F(gsf.class)).c();
        ggk ggkVar = (ggk) geuVar.F(ggk.class);
        if (ggkVar.h()) {
            b = (int) ggkVar.d();
        }
    }

    @Override // defpackage.hid
    public final void a(ComponentName componentName, SessionInfo sessionInfo, TemplateWrapper templateWrapper) {
        mqb mqbVar = this.j;
        ComponentName componentName2 = mqbVar.a;
        woy.af(componentName.equals(componentName2), "Expected template for %s but was %s", componentName2, componentName);
        if (templateWrapper.isRefresh()) {
            this.d.incrementAndGet();
        } else {
            this.e.incrementAndGet();
        }
        jsp jspVarD = d(mqbVar);
        if (jspVarD == null) {
            ((ype) a.l().ai((char) 2721)).M("Fragment has been cleared for app: %s when setting template: %s", componentName.flattenToShortString(), templateWrapper);
            return;
        }
        Handler handler = this.c;
        Message messageObtainMessage = handler.obtainMessage(2);
        messageObtainMessage.obj = new ncp(mqbVar, jspVarD.d(mqbVar, sessionInfo), templateWrapper);
        leh.a();
        if (acxa.an()) {
            geu geuVar = (geu) this.i.get();
            if (geuVar != null) {
                if (geuVar.q()) {
                    ((ype) a.l().ai((char) 2720)).u("setTemplate: Configuration update detected, force reloading template");
                    messageObtainMessage.what = 1;
                    geuVar.m();
                }
                if (geuVar.r()) {
                    ((ype) a.l().ai((char) 2719)).u("setTemplate: Palette update detected, force reloading template");
                    messageObtainMessage.what = 1;
                    geuVar.n();
                }
            } else {
                ((ype) a.l().ai((char) 2718)).u("setTemplate: TemplateContext is null");
            }
        }
        handler.removeMessages(messageObtainMessage.what);
        handler.sendMessage(messageObtainMessage);
    }

    @Override // defpackage.hid
    public final hln b(SessionInfo sessionInfo) {
        jsp jspVarC = c();
        if (jspVarC != null) {
            if (jspVarC.getContext() != null) {
                return jspVarC.d(this.j, sessionInfo).o();
            }
            ((ype) a.l().ai((char) 2709)).y("Fragment does not have a context, will return an empty surface provider, detached: %b", Boolean.valueOf(jspVarC.isDetached()));
        }
        return hln.a;
    }

    final jsp c() {
        return (jsp) this.k.get();
    }

    public final jsp d(mqb mqbVar) {
        jsp jspVarC = c();
        if (jspVarC == null) {
            ((ype) a.l().ai((char) 2717)).y("Fragment has been cleared for app: %s", mqbVar.c());
            return null;
        }
        eps epsVarA = jspVarC.getLifecycle().a();
        if (!epsVarA.a(eps.c)) {
            ((ype) a.l().ai((char) 2716)).M("Fragment for app is not created: %s, state: %s", mqbVar.c(), epsVarA);
            return null;
        }
        mqb mqbVar2 = jspVarC.p;
        if (mqbVar2 == null || mqbVar.equals(mqbVar2)) {
            return jspVarC;
        }
        ((ype) a.l().ai((char) 2715)).M("Current app is not target: %s, target: %s", mqbVar2.c(), mqbVar.c());
        return null;
    }

    public final void e(yzy yzyVar, int i) {
        rrb rrbVarB = kad.b(yzyVar, this.j.a);
        TemplateWrapper templateWrapper = this.g;
        rrbVarB.j(templateWrapper != null ? templateWrapper.getTemplate().getClass().getSimpleName() : "UNKNOWN");
        TemplateWrapper templateWrapper2 = this.g;
        rrbVarB.A(templateWrapper2 != null ? templateWrapper2.getCurrentTaskStep() : 0);
        rrbVarB.w(i);
        kad.e(rrbVarB);
    }

    public final void f() {
        jsp jspVarD = d(this.j);
        if (jspVarD == null) {
            ((ype) a.l().ai((char) 2714)).u("Fragment has been cleared when refreshing UI");
            return;
        }
        mqb mqbVar = jspVarD.p;
        if (mqbVar == null) {
            ((ype) a.l().ai((char) 2713)).u("Current app name has been cleared when refreshing UI");
            return;
        }
        geu geuVar = (geu) this.i.get();
        if (geuVar == null) {
            ((ype) a.l().ai((char) 2712)).u("Template Context has been cleared when refreshing UI");
            return;
        }
        SessionInfo sessionInfoB = geuVar.b();
        TemplateWrapper templateWrapper = this.g;
        if (templateWrapper != null) {
            Handler handler = this.c;
            Message messageObtainMessage = handler.obtainMessage(1);
            messageObtainMessage.obj = new ncp(mqbVar, jspVarD.d(mqbVar, sessionInfoB), templateWrapper);
            handler.removeMessages(messageObtainMessage.what);
            handler.sendMessage(messageObtainMessage);
        }
    }
}
