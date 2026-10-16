package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class oex implements ServiceConnection {
    final /* synthetic */ ofb a;

    public oex(ofb ofbVar) {
        this.a = ofbVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ((ype) ((ype) ofb.a.h()).ai((char) 5718)).u("onBindingDied");
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aN);
        if (componentName == null) {
            componentName = mkn.b;
        }
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        ((ype) ((ype) ofb.a.h()).ai((char) 5719)).u("onNullBinding");
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aO);
        if (componentName == null) {
            componentName = mkn.b;
        }
        rrbVarH.p(componentName);
        ohsVarJ.F(rrbVarH.l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ogf ogdVar;
        yph yphVar = ofb.a;
        ((ype) ((ype) yphVar.f()).ai(5720)).M("onServiceConnected - componentName: %s, service: %s", componentName.toShortString(), iBinder);
        if (iBinder == null) {
            ogdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.components.telecom.service.ICarCall");
            ogdVar = iInterfaceQueryLocalInterface instanceof ogf ? (ogf) iInterfaceQueryLocalInterface : new ogd(iBinder);
        }
        ofb ofbVar = this.a;
        ofbVar.c = ogdVar;
        ofbVar.d = true;
        ((ype) ((ype) yphVar.f()).ai((char) 5721)).u("bound is now true");
        try {
            if (ofbVar.d) {
                ofbVar.c.l();
                boolean zD = ofbVar.c.D(ofbVar.k);
                mjv.C().e();
                ((ype) ((ype) yphVar.f()).ai((char) 5759)).u("nowBoundSetup and bound == true");
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aG);
                if (rrbVarH.w == null) {
                    rrbVarH.w = yym.a.n();
                }
                abnp abnpVar = rrbVarH.w;
                abnpVar.t();
                yym yymVar = (yym) abnpVar.b;
                yym yymVar2 = yym.a;
                yymVar.b = 1 | yymVar.b;
                yymVar.c = zD;
                int i = ofbVar.i;
                abnpVar.t();
                yym yymVar3 = (yym) abnpVar.b;
                yymVar3.b |= 2;
                yymVar3.d = i;
                int i2 = ofbVar.j;
                abnpVar.t();
                yym yymVar4 = (yym) abnpVar.b;
                yymVar4.b |= 4;
                yymVar4.e = i2;
                ebf.j().F(rrbVarH.l());
                List listG = ofbVar.g();
                ynp ynpVarListIterator = ((yfq) listG).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    CarCall carCall = (CarCall) ynpVarListIterator.next();
                    ComponentName componentNameB = mcd.A().b(carCall);
                    ofb.z(yyv.PHONE_EXISTING_CALL_AT_STARTUP, false, componentNameB);
                    ofb.A(yzy.Er, false, componentNameB);
                    ofb.z(yyv.PHONE_ON_CALL_ADDED, false, componentNameB);
                    if (carCall.e == 2) {
                        ofb.z(yyv.PHONE_RINGING_CALL_ADDED, false, componentNameB);
                    }
                    Iterator it = ofbVar.b.iterator();
                    while (it.hasNext()) {
                        ((ebf) it.next()).n(carCall);
                    }
                }
                if (listG.isEmpty()) {
                    return;
                }
                CallAudioState callAudioStateD = ofbVar.d();
                Iterator it2 = ofbVar.b.iterator();
                while (it2.hasNext()) {
                    ((ebf) it2.next()).m(callAudioStateD);
                }
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) ofb.a.g()).p(e)).ai((char) 5722)).u("Exception during setup");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ype) ((ype) ofb.a.f()).ai((char) 5723)).u("onServiceDisconnected");
        ofb ofbVar = this.a;
        ofbVar.d = false;
        ofbVar.i++;
    }
}
