package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ofr implements android.content.ServiceConnection {
    final /* synthetic */ defpackage.ofv a;

    public ofr(defpackage.ofv ofvVar) {
        this.a = ofvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofv.a.h()).ai((char) 5744)).u("onBindingDied");
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aN);
        if (componentName == null) {
            componentName = defpackage.mkt.b;
        }
        rrvVarH.p(componentName);
        oimVarU.F(rrvVarH.l());
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofv.a.h()).ai((char) 5745)).u("onNullBinding");
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aO);
        if (componentName == null) {
            componentName = defpackage.mkt.b;
        }
        rrvVarH.p(componentName);
        oimVarU.F(rrvVarH.l());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        ogz ogxVar;
        defpackage.yqm yqmVar = defpackage.ofv.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5746)).M("onServiceConnected - componentName: %s, service: %s", componentName.toShortString(), iBinder);
        if (iBinder == null) {
            ogxVar = null;
        } else {
            ogz ogzVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.components.telecom.service.ICarCall");
            ogxVar = ogzVarQueryLocalInterface instanceof ogz ? ogzVarQueryLocalInterface : new ogx(iBinder);
        }
        defpackage.ofv ofvVar = this.a;
        ofvVar.c = ogxVar;
        ofvVar.d = true;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5747)).u("bound is now true");
        try {
            if (ofvVar.d) {
                ofvVar.c.l();
                boolean zD = ofvVar.c.D(ofvVar.k);
                defpackage.mkc.Q().e();
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5785)).u("nowBoundSetup and bound == true");
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aG);
                if (rrvVarH.w == null) {
                    rrvVarH.w = defpackage.yzr.a.n();
                }
                defpackage.abor aborVar = rrvVarH.w;
                aborVar.t();
                defpackage.yzr yzrVar = (defpackage.yzr) aborVar.b;
                defpackage.yzr yzrVar2 = defpackage.yzr.a;
                yzrVar.b = 1 | yzrVar.b;
                yzrVar.c = zD;
                int i = ofvVar.i;
                aborVar.t();
                defpackage.yzr yzrVar3 = (defpackage.yzr) aborVar.b;
                yzrVar3.b |= 2;
                yzrVar3.d = i;
                int i2 = ofvVar.j;
                aborVar.t();
                defpackage.yzr yzrVar4 = (defpackage.yzr) aborVar.b;
                yzrVar4.b |= 4;
                yzrVar4.e = i2;
                defpackage.omf.u().F(rrvVarH.l());
                java.util.List listG = ofvVar.g();
                defpackage.you youVarListIterator = ((defpackage.ygw) listG).listIterator(0);
                while (youVarListIterator.hasNext()) {
                    com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) youVarListIterator.next();
                    android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
                    defpackage.ofv.z(defpackage.zaa.PHONE_EXISTING_CALL_AT_STARTUP, false, componentNameB);
                    defpackage.ofv.A(defpackage.zbd.Ev, false, componentNameB);
                    defpackage.ofv.z(defpackage.zaa.PHONE_ON_CALL_ADDED, false, componentNameB);
                    if (carCall.e == 2) {
                        defpackage.ofv.z(defpackage.zaa.PHONE_RINGING_CALL_ADDED, false, componentNameB);
                    }
                    java.util.Iterator it = ofvVar.b.iterator();
                    while (it.hasNext()) {
                        ((defpackage.omf) it.next()).a(carCall);
                    }
                }
                if (listG.isEmpty()) {
                    return;
                }
                android.telecom.CallAudioState callAudioStateD = ofvVar.d();
                java.util.Iterator it2 = ofvVar.b.iterator();
                while (it2.hasNext()) {
                    ((defpackage.omf) it2.next()).e(callAudioStateD);
                }
            }
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ofv.a.g()).p(e)).ai((char) 5748)).u("Exception during setup");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofv.a.f()).ai((char) 5749)).u("onServiceDisconnected");
        defpackage.ofv ofvVar = this.a;
        ofvVar.d = false;
        ofvVar.i++;
    }
}
