package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;
import androidx.car.app.model.Action;

/* loaded from: classes2.dex */
public final class lyg extends tlm {
    private static final yob h = yob.c("com/google/android/apps/auto/components/messaging/template/MessagingRemoteScreen");
    public final Resources a;
    public final Action b;
    public final luj c;
    public boolean d;
    private final eqj i;
    private eqn j;

    public lyg(wb wbVar, Resources resources, tlh tlhVar, Action action, eqj eqjVar, luj lujVar) {
        super(tlhVar, wbVar);
        this.d = false;
        this.a = resources;
        this.b = action;
        this.i = eqjVar;
        this.c = lujVar;
    }

    @Override // defpackage.tlm, defpackage.epf
    public final void fL(eqa eqaVar) {
        ((ynz) ((ynz) h.e()).ai(4457)).y("Messaging App Stop: %s", this.e.a);
        eqn eqnVar = this.j;
        if (eqnVar != null) {
            this.i.k(eqnVar);
            this.j = null;
            lvb.a().b();
        }
        this.d = false;
    }

    @Override // defpackage.tlm, defpackage.epf
    public final void fM() {
        ((ynz) ((ynz) h.e()).ai(4452)).y("Messaging App Pause: %s", this.e.a);
    }

    @Override // defpackage.tlm, defpackage.epf
    public final void fx(eqa eqaVar) {
        ((ynz) ((ynz) h.e()).ai(4453)).y("Messaging App Resume: %s", this.e.a);
        yzz yzzVar = yzz.MESSAGING_APP;
        lxr.e();
        luj lujVar = this.c;
        yzy yzyVar = yzy.mV;
        ComponentName componentName = lujVar.a;
        lxr.g(yzzVar, yzyVar, componentName);
        if (lup.e().g(componentName)) {
            lxr.e();
            lxr.g(yzzVar, yzy.na, componentName);
        }
        lup.e();
        if (lup.k(componentName)) {
            lxr.e();
            lxr.g(yzzVar, yzy.mZ, componentName);
        }
    }

    @Override // defpackage.tlm, defpackage.epf
    public final void fy(eqa eqaVar) {
        yob yobVar = h;
        yop yopVarE = yobVar.e();
        tlh tlhVar = this.e;
        String str = tlhVar.a;
        ((ynz) ((ynz) yopVarE).ai((char) 4454)).y("Messaging App Start: %s", str);
        ((ynz) ((ynz) yobVar.f()).ai((char) 4455)).y("Launching %s with projection.", str);
        lvb.a().b();
        lvb.a().c(tlhVar.b.a);
        lsh lshVar = new lsh(this, 3);
        this.j = lshVar;
        this.i.fE(eqaVar, lshVar);
    }
}
