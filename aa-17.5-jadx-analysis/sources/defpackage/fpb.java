package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class fpb implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fpb(aitx aitxVar, fwu fwuVar, bwq bwqVar, adu aduVar, int i) {
        this.e = i;
        this.b = aitxVar;
        this.a = fwuVar;
        this.c = bwqVar;
        this.d = aduVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [bym, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            String string = ((UUID) this.b).toString();
            fpc fpcVar = (fpc) this.a;
            fod fodVarC = fpcVar.b.c(string);
            Object obj = this.c;
            if (fodVarC == null || fodVarC.b.a()) {
                throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            fng fngVar = fpcVar.a;
            synchronized (((fkm) fngVar).k) {
                fjo.a();
                Log.i(fkm.a, a.bq(string, "Moving WorkSpec (", ") to the foreground"));
                flz flzVar = (flz) ((fkm) fngVar).g.remove(string);
                if (flzVar != null) {
                    if (((fkm) fngVar).b == null) {
                        Context context = ((fkm) fngVar).c;
                        int i2 = fox.a;
                        context.getClass();
                        Object systemService = context.getApplicationContext().getSystemService("power");
                        systemService.getClass();
                        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
                        synchronized (foy.a) {
                        }
                        wakeLockNewWakeLock.getClass();
                        ((fkm) fngVar).b = wakeLockNewWakeLock;
                        ((fkm) fngVar).b.acquire();
                    }
                    ((fkm) fngVar).f.put(string, flzVar);
                    Context context2 = ((fkm) fngVar).c;
                    fny fnyVarA = flzVar.a();
                    int i3 = fni.k;
                    Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_START_FOREGROUND");
                    intent.putExtra("KEY_WORKSPEC_ID", fnyVarA.a);
                    intent.putExtra("KEY_GENERATION", fnyVarA.b);
                    intent.putExtra("KEY_NOTIFICATION_ID", ((fjg) obj).a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((fjg) obj).b);
                    intent.putExtra("KEY_NOTIFICATION", ((fjg) obj).c);
                    context2.startForegroundService(intent);
                }
            }
            Object obj2 = this.d;
            fny fnyVarL = dtb.l(fodVarC);
            int i4 = fni.k;
            Context context3 = (Context) obj2;
            Intent intent2 = new Intent(context3, (Class<?>) SystemForegroundService.class);
            intent2.setAction("ACTION_NOTIFY");
            fjg fjgVar = (fjg) obj;
            intent2.putExtra("KEY_NOTIFICATION_ID", fjgVar.a);
            intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fjgVar.b);
            intent2.putExtra("KEY_NOTIFICATION", fjgVar.c);
            intent2.putExtra("KEY_WORKSPEC_ID", fnyVarL.a);
            intent2.putExtra("KEY_GENERATION", fnyVarL.b);
            context3.startService(intent2);
            return null;
        }
        if (i == 1) {
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Attempting to create TransitionSeekController");
            }
            Object obj3 = this.a;
            Object obj4 = this.c;
            Object obj5 = this.d;
            ai aiVar = (ai) obj5;
            aiVar.g = aiVar.d.s((ViewGroup) obj4, obj3);
            if (aiVar.g == null) {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", "TransitionSeekController was not created.");
                }
                aiVar.h = true;
                return afak.a;
            }
            ((affv) this.b).a = new ah(obj5, obj3, obj4, 1, (byte[]) null);
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Started executing operations from " + aiVar.b + " to " + aiVar.c);
            }
            return afak.a;
        }
        if (i == 2) {
            ?? r0 = this.c;
            if (!((Boolean) r0.a()).booleanValue()) {
                Object obj6 = this.d;
                Object obj7 = this.a;
                ?? r11 = this.b;
                r0.b(true);
                ((ynz) fwt.a.e().o(ypi.a, "CarApp.H.Action.TimedBn").ai(3)).u("Button clicked");
                ahnc.d(r11, null, 0, new gfw((adu) obj6, (afck) null, 1), 3);
                afdr afdrVar = ((fwu) obj7).b.d;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
            }
            return afak.a;
        }
        if (i == 3) {
            if (affa.f(((eqj) this.d).e(), true)) {
                Object obj8 = this.b;
                Object obj9 = this.a;
                Object obj10 = this.c;
                ((lkp) obj9).a((String) obj8);
                Object objE = ((eqj) obj10).e();
                if (objE instanceof lkl) {
                    ((lkl) objE).a();
                }
            }
            return afak.a;
        }
        if (i != 4) {
            ((naq) this.b).e((Context) this.d, woy.cd(roc.ag(this.a), ((byd) this.c).e()));
            return afak.a;
        }
        ?? r02 = this.d;
        yph yphVar = myv.a;
        if (!((Boolean) r02.a()).booleanValue() && ((Boolean) this.c.a()).booleanValue() && !((Boolean) this.a.a()).booleanValue() && !((Boolean) this.b.a()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ fpb(fpc fpcVar, UUID uuid, fjg fjgVar, Context context, int i) {
        this.e = i;
        this.a = fpcVar;
        this.b = uuid;
        this.c = fjgVar;
        this.d = context;
    }

    public /* synthetic */ fpb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.d = obj;
        this.c = obj2;
        this.a = obj3;
        this.b = obj4;
    }

    public /* synthetic */ fpb(naq naqVar, Context context, bym bymVar, byd bydVar, int i) {
        this.e = i;
        this.b = naqVar;
        this.d = context;
        this.a = bymVar;
        this.c = bydVar;
    }
}
