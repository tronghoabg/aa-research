package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bgf implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bgf(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x052a  */
    /* JADX WARN: Type inference failed for: r0v41, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, jfe, qvl] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        int actionMasked;
        int i;
        android.view.View viewFindFocus;
        java.lang.Object obj2;
        defpackage.rso rsoVar;
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                this.a.invoke();
                return;
            case 1:
                defpackage.od.x((defpackage.od) this.a);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.view.ActionMode actionMode = ((defpackage.bgk) this.a).f;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Class cls = defpackage.czz.a;
                this.a.invoke();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj3 = this.a;
                while (true) {
                    defpackage.afbz afbzVar = ((defpackage.czz) obj3).i;
                    if (afbzVar.isEmpty()) {
                        return;
                    } else {
                        ((defpackage.afer) afbzVar.removeLast()).invoke();
                    }
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.czz czzVar = (defpackage.czz) this.a;
                czzVar.G = false;
                android.view.MotionEvent motionEvent = czzVar.E;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() != 10) {
                    throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                czzVar.L(motionEvent);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.czz czzVar2 = (defpackage.czz) this.a;
                czzVar2.removeCallbacks(this);
                android.view.MotionEvent motionEvent2 = czzVar2.E;
                if (motionEvent2 == null || (actionMasked = motionEvent2.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked == 2 || actionMasked == 7) {
                    i = 7;
                } else if (actionMasked == 8) {
                    i = 9;
                } else if (actionMasked != 9) {
                    i = 2;
                } else {
                    i = 7;
                }
                czzVar2.V(motionEvent2, i, czzVar2.F, false);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.dkf dkfVar = (defpackage.dkf) this.a;
                if (dkfVar.k == this) {
                    dkfVar.k = null;
                    dkfVar.l = false;
                    android.view.View view = dkfVar.a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        dkfVar.j.g();
                        return;
                    }
                    defpackage.afgv afgvVar = new defpackage.afgv();
                    defpackage.afgv afgvVar2 = new defpackage.afgv();
                    defpackage.bzc bzcVar = dkfVar.j;
                    java.lang.Object[] objArr = bzcVar.a;
                    int i2 = bzcVar.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        defpackage.dke dkeVar = (defpackage.dke) objArr[i3];
                        defpackage.dke dkeVar2 = defpackage.dke.StartInput;
                        int iOrdinal = dkeVar.ordinal();
                        if (iOrdinal == 0) {
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            afgvVar.a = bool;
                            afgvVar2.a = bool;
                        } else if (iOrdinal == 1) {
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            afgvVar.a = bool2;
                            afgvVar2.a = bool2;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new defpackage.afas();
                            }
                            if (!defpackage.afga.f(afgvVar.a, java.lang.Boolean.FALSE)) {
                                afgvVar2.a = java.lang.Boolean.valueOf(dkeVar == defpackage.dke.ShowKeyboard);
                            }
                        }
                    }
                    bzcVar.g();
                    if (defpackage.afga.f(afgvVar.a, java.lang.Boolean.TRUE)) {
                        dkfVar.a();
                    }
                    java.lang.Boolean bool3 = (java.lang.Boolean) afgvVar2.a;
                    if (bool3 != null) {
                        if (bool3.booleanValue()) {
                            ((defpackage.ebj) ((defpackage.erh) dkfVar.m.a).a).b();
                        } else {
                            ((defpackage.erh) dkfVar.m.a).I();
                        }
                    }
                    if (defpackage.afga.f(afgvVar.a, java.lang.Boolean.FALSE)) {
                        dkfVar.a();
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.eqp) obj4).c) {
                    obj2 = ((defpackage.eqp) obj4).f;
                    ((defpackage.eqp) obj4).f = defpackage.eqp.b;
                    break;
                }
                ((defpackage.eqp) this.a).m(obj2);
                return;
            case 9:
                java.lang.Object obj5 = this.a;
                defpackage.ikb ikbVar = (defpackage.ikb) obj5;
                android.content.Context context = ikbVar.d;
                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses2 = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses2 != null) {
                    for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses2) {
                        if (!android.text.TextUtils.isEmpty(runningAppProcessInfo.processName) && ikbVar.e.contains(runningAppProcessInfo.processName)) {
                            java.lang.Object obj6 = ikbVar.h;
                            synchronized (obj6) {
                                java.util.Map map = ((defpackage.ikb) obj5).k;
                                defpackage.ijz ijzVar = (defpackage.ijz) map.get(runningAppProcessInfo.processName);
                                if (ijzVar != null) {
                                    if (runningAppProcessInfo != null && (runningAppProcessInfo.importance != ijzVar.b || runningAppProcessInfo.lru != ijzVar.c || runningAppProcessInfo.uid != ijzVar.d)) {
                                        defpackage.ijz ijzVar2 = new defpackage.ijz(runningAppProcessInfo.importance, runningAppProcessInfo.importanceReasonCode, runningAppProcessInfo.importanceReasonPid, runningAppProcessInfo.lru, runningAppProcessInfo.uid);
                                        map.put(runningAppProcessInfo.processName, ijzVar2);
                                        ((defpackage.yfd) ((defpackage.ikb) obj5).j.get(runningAppProcessInfo.processName)).add(new defpackage.ika(java.lang.System.currentTimeMillis(), ijzVar2));
                                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ikb.a.f()).ai(109)).R("Process info changed %s:%s->%s", runningAppProcessInfo.processName, ijzVar, ijzVar2);
                                    }
                                    if (runningAppProcessInfo.importance >= 400) {
                                        java.lang.String str = runningAppProcessInfo.processName;
                                        synchronized (obj6) {
                                            java.util.Set set = ((defpackage.ikb) obj5).l;
                                            if (!set.contains(str) && (rsoVar = (defpackage.rso) ((defpackage.ikb) obj5).i.get(str)) != null) {
                                                defpackage.omv.h(context, "com.google.android.gms.car.PROCESS_STATE_CACHED", rsoVar, null);
                                                ((defpackage.yqj) ((defpackage.yqj) defpackage.ikb.a.h()).ai(110)).y("Process in cached state - not expected %s", new defpackage.zkf(defpackage.zke.a, str));
                                                set.add(str);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (ikbVar.h) {
                    if (((defpackage.ikb) obj5).m) {
                        ((android.os.Handler) ((defpackage.ikb) obj5).f.fF()).postDelayed(((defpackage.ikb) obj5).g, 5000L);
                    }
                    break;
                }
                return;
            case 10:
                android.content.ComponentName componentName = defpackage.imi.c;
                ?? r12 = this.a;
                defpackage.imi imiVar = (defpackage.imi) r12;
                imiVar.U = new defpackage.imr(imiVar.o, componentName, new defpackage.imb(imiVar), r12, r12, imiVar.k, false, j$.util.Optional.empty(), j$.util.Optional.empty(), false);
                imiVar.U.e();
                return;
            case 11:
                defpackage.yqj yqjVar = (defpackage.yqj) defpackage.imr.a.l().ai(431);
                defpackage.imr imrVar = (defpackage.imr) this.a;
                yqjVar.w("Resetting crash loops due to successful connection. Count: %s", imrVar.t);
                imrVar.t = 0;
                return;
            case 12:
                defpackage.inh inhVar = (defpackage.inh) this.a;
                inhVar.al.h(inhVar.b());
                return;
            case 13:
                defpackage.inh inhVar2 = (defpackage.inh) this.a;
                inhVar2.al.h(inhVar2.b());
                return;
            case 14:
                defpackage.inh inhVar3 = (defpackage.inh) this.a;
                inhVar3.al.h(inhVar3.b());
                return;
            case 15:
                ((defpackage.iya) this.a).e(2);
                return;
            case 16:
                try {
                    java.lang.Object obj7 = this.a;
                    if (!defpackage.rcm.i(((defpackage.inh) obj7).t, defpackage.acwv.a.fF().e())) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).ai(456)).u("Unable to acquire composition semaphore");
                        try {
                            ((defpackage.inh) obj7).aq.j();
                            break;
                        } catch (defpackage.jjf unused) {
                        }
                        java.lang.Object obj8 = this.a;
                        ((defpackage.inh) obj8).z = false;
                        ((defpackage.inh) obj8).q.release();
                        return;
                    }
                    try {
                        try {
                            android.os.Process.setThreadPriority(-10);
                            try {
                                java.lang.Object obj9 = this.a;
                                ((defpackage.inh) obj9).aq.i(((defpackage.inh) obj9).p, ((defpackage.inh) obj9).u, ((defpackage.inh) obj9).w, ((defpackage.inh) obj9).k);
                                android.os.Looper.prepare();
                                ((defpackage.inh) obj9).r = android.os.Looper.myLooper();
                                if (defpackage.acwv.a.fF().q()) {
                                    ((defpackage.inh) obj9).ah = new defpackage.jkv(((defpackage.inh) obj9).l, ((defpackage.inh) obj9).ag);
                                    ((defpackage.inh) obj9).ah.a();
                                }
                                ((defpackage.inh) obj9).s = new defpackage.ina((defpackage.inh) obj9, ((defpackage.inh) obj9).r);
                                java.lang.Object obj10 = this.a;
                                ((defpackage.inh) obj10).z = true;
                                ((defpackage.inh) obj10).q.release();
                                android.os.Looper.loop();
                                ((defpackage.yqj) defpackage.inh.a.l().ai(458)).u("CompositionThread exiting");
                                obj = this.a;
                            } catch (java.lang.Exception e) {
                                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).p(e)).ai(460)).u("Error starting composition");
                                try {
                                    ((defpackage.inh) this.a).s();
                                    obj = this.a;
                                    ((defpackage.inh) obj).z = false;
                                    ((defpackage.inh) obj).q.release();
                                    ((defpackage.yqj) defpackage.inh.a.l().ai(461)).u("CompositionThread exiting");
                                } catch (java.lang.Throwable th) {
                                    java.lang.Object obj11 = this.a;
                                    ((defpackage.inh) obj11).z = false;
                                    ((defpackage.inh) obj11).q.release();
                                    throw th;
                                }
                            }
                            ((defpackage.inh) obj).s();
                            ((defpackage.inh) this.a).t.release();
                            return;
                        } catch (java.lang.Throwable th2) {
                            ((defpackage.yqj) defpackage.inh.a.l().ai(459)).u("CompositionThread exiting");
                            ((defpackage.inh) this.a).s();
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        ((defpackage.inh) this.a).t.release();
                        throw th3;
                    }
                } catch (java.lang.InterruptedException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).p(e2)).ai((char) 457)).u("Attempt to acquire composition semaphore interrupted");
                    try {
                        ((defpackage.inh) this.a).aq.j();
                        break;
                    } catch (defpackage.jjf unused2) {
                    }
                    defpackage.inh inhVar4 = (defpackage.inh) this.a;
                    inhVar4.z = false;
                    inhVar4.q.release();
                    return;
                }
            case 17:
                defpackage.inn innVar = (defpackage.inn) this.a;
                if (innVar.k == -1 || (activityManager = (android.app.ActivityManager) innVar.b.d.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    return;
                }
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : runningAppProcesses) {
                    if (runningAppProcessInfo2.pid == innVar.k) {
                        innVar.l = runningAppProcessInfo2.processName;
                        return;
                    }
                }
                return;
            case 18:
                defpackage.yqm yqmVar = defpackage.inn.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 618)).u("Timed out waiting client death to be called on crash");
                defpackage.inn innVar2 = (defpackage.inn) this.a;
                android.os.Bundle bundle = (android.os.Bundle) innVar2.D.get();
                if (innVar2.f != null) {
                    if (defpackage.acps.q()) {
                        defpackage.rqt rqtVarA = defpackage.rqt.a(innVar2.b.d);
                        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.tU);
                        rrvVarH.p(innVar2.d);
                        rrvVarH.o(innVar2.f);
                        rqtVarA.c(rrvVarH.l());
                    }
                    if (bundle == null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 621)).u("Client ANR detected, but we never heard back from the client.");
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 620)).u("Timed out waiting for client ANR data, yet the ANR data has been set?! Possible race condition between the client disconnect, and cancelling the runnable.");
                    }
                } else if (bundle != null) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 619)).u("Client did not ANR, but ANR data has been unexpectedly set in death after crash.");
                }
                innVar2.i();
                return;
            case 19:
                defpackage.iph iphVar = (defpackage.iph) this.a;
                iphVar.J++;
                defpackage.yqm yqmVar2 = defpackage.iph.E;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai(875)).w("Bind timed out: %d", iphVar.J);
                if (iphVar.J < 3) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 877)).u("Retrying...");
                    iphVar.R = false;
                    iphVar.X();
                    return;
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 876)).u("Giving up, crashing client");
                    defpackage.ipg ipgVar = iphVar.H;
                    java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(java.lang.String.valueOf(iphVar.d.flattenToShortString()).concat(" timeout during bind"));
                    int i4 = defpackage.ipg.i;
                    ipgVar.q(runtimeException);
                    return;
                }
            default:
                ((defpackage.irf) this.a).p(2);
                return;
        }
    }

    public bgf(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
