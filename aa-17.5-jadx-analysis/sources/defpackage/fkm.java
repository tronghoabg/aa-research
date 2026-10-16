package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fkm implements fng {
    public static final String a = fjo.b("Processor");
    public final Context c;
    public final fiy d;
    public final WorkDatabase e;
    public final ajdr l;
    public final Map g = new HashMap();
    public final Map f = new HashMap();
    public final Set i = new HashSet();
    public final List j = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object k = new Object();
    public final Map h = new HashMap();

    public fkm(Context context, fiy fiyVar, ajdr ajdrVar, WorkDatabase workDatabase) {
        this.c = context;
        this.d = fiyVar;
        this.l = ajdrVar;
        this.e = workDatabase;
    }

    public static boolean e(String str, flz flzVar, int i) {
        if (flzVar == null) {
            fjo.a().c(a, "WorkerWrapper could not be found for ".concat(str));
            return false;
        }
        flzVar.j.s(new fls(i));
        fjo.a().c(a, "WorkerWrapper interrupted for " + str + " (" + flzVar.a.c + "), reason: " + i);
        return true;
    }

    public final flz a(String str) {
        Map map = this.f;
        flz flzVar = (flz) map.remove(str);
        boolean z = flzVar != null;
        if (!z) {
            flzVar = (flz) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                if (map.isEmpty()) {
                    Context context = this.c;
                    int i = fni.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        fjo.a();
                        Log.e(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
        }
        return flzVar;
    }

    public final flz b(String str) {
        flz flzVar = (flz) this.f.get(str);
        return flzVar == null ? (flz) this.g.get(str) : flzVar;
    }

    public final void c(fkb fkbVar) {
        synchronized (this.k) {
            this.j.add(fkbVar);
        }
    }

    public final void d(fkb fkbVar) {
        synchronized (this.k) {
            this.j.remove(fkbVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(fny fnyVar) {
        this.l.d.execute(new esx(this, fnyVar, 7, (byte[]) null));
    }
}
