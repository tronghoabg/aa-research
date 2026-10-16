package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class vlo implements vyv {
    final htm a;
    private final Context b;

    public vlo(Context context) {
        this.b = context;
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.google.android.primes.action.DEBUG_PRIMES_EVENTS");
        intent.setPackage(context.getPackageName());
        intent.addFlags(268435456);
        this.a = packageManager.queryIntentActivities(intent, 851968).isEmpty() ? null : new htm(new htm(context, (byte[]) null, (char[]) null), (byte[]) null);
    }

    @Override // defpackage.vyv
    public final /* synthetic */ vyu a() {
        return vyu.a;
    }

    @Override // defpackage.vyv
    public final zgp b(final ajgu ajguVar) {
        final htm htmVar = this.a;
        if (htmVar != null) {
            Context context = this.b;
            Runnable runnable = new Runnable() { // from class: vln
                @Override // java.lang.Runnable
                public final void run() {
                    ajgu ajguVar2 = ajguVar;
                    ajguVar2.getClass();
                    ajgh ajghVar = ajguVar2.i;
                    if (ajghVar == null) {
                        ajghVar = ajgh.a;
                    }
                    boolean z = ajghVar.c;
                    if (z) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskWrites().build());
                    }
                    ygp ygpVar = new ygp(15);
                    ygpVar.k(new ymp(new vtu(vmb.APPLICATION_EXIT, ajguVar2)));
                    ygr ygrVarP = ygr.p(new vtl(vmb.CRASH, ajguVar2), new vtm(vmb.PRIMES_INTERNAL, ajguVar2));
                    ygrVarP.getClass();
                    ygpVar.k(ygrVarP);
                    ygpVar.c(new vuc(vmb.CUI, ajguVar2));
                    ygpVar.c(new vwy(vmb.TIMER, ajguVar2));
                    ygpVar.c(new vuu(vmb.JANK, ajguVar2));
                    ygpVar.c(new vrl(vmb.BATTERY, ajguVar2));
                    vmb vmbVar = vmb.TRACE;
                    ygpVar.c(new vxh(vmbVar, ajguVar2));
                    ygpVar.c(new vxi(vmbVar, ajguVar2));
                    ygpVar.c(new vxk(vmbVar, ajguVar2));
                    ygpVar.c(new vws(vmb.STRICT_MODE, ajguVar2));
                    ygpVar.c(new vsm(vmb.CPU_PROFILING, ajguVar2));
                    ygpVar.c(new vwd(vmb.NETWORK, ajguVar2));
                    ygpVar.k(new ymp(new vwf(vmb.STALL, ajguVar2)));
                    ygpVar.c(new vwm(vmb.DISK, ajguVar2));
                    ygpVar.c(new vvr(ajguVar2));
                    yeb<vma> yebVarE = yeb.d(ygpVar.g()).e(new txa(12)).c(new ptu(9)).e(new txa(13));
                    if (!yebVarE.h().iterator().hasNext()) {
                        yebVarE = yeb.a(yebVarE.h(), Arrays.asList((vma) new vmd(vmb.EVENT_TYPE_UNKNOWN, ajguVar2).a().get()));
                    }
                    for (vma vmaVar : yebVarE) {
                        htm htmVar2 = htmVar;
                        SQLiteDatabase writableDatabase = ((vme) ((htm) htmVar2.a).a).getWritableDatabase();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("name", vmaVar.a);
                        contentValues.put(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, Integer.valueOf(vmaVar.b.r));
                        contentValues.put("message", vmaVar.c);
                        contentValues.put("data", vmaVar.d.h());
                        contentValues.put("created_at", Long.valueOf(vmaVar.f));
                        contentValues.put("clienttracing_data", vmaVar.e.h());
                        long jInsert = writableDatabase.insert("PRIMES_EVENTS", null, contentValues);
                        if (jInsert != -1 && !z && jInsert % 100.0f == 1.0f && DatabaseUtils.queryNumEntries(writableDatabase, "PRIMES_EVENTS") > 500) {
                            writableDatabase.delete("PRIMES_EVENTS", "_id NOT IN (SELECT _id FROM PRIMES_EVENTS ORDER BY _id DESC LIMIT ?)", new String[]{Integer.toString(100)});
                        }
                    }
                }
            };
            int i = tmz.a;
            Callable callable = Executors.callable(runnable, null);
            tmz.b(context, new vtb(callable, 1), zfq.a);
        }
        return zgl.a;
    }
}
