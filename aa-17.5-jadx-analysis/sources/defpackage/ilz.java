package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.auto.components.connectivity.reset.ConnectionResetReceiver;
import j$.util.Optional;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ilz extends ilf {
    final /* synthetic */ ima c;

    public ilz(ima imaVar) {
        this.c = imaVar;
    }

    @Override // defpackage.ilf, java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        yph yphVar = ima.b;
        ((ype) ((ype) yphVar.l().p(th)).ai(296)).u("Uncaught exception");
        try {
            ima imaVar = this.c;
            ((ype) yphVar.l().ai(298)).u("Resetting system state on crash");
            iob iobVar = (iob) imaVar.A.get();
            if (iobVar != null) {
                ilb.d();
                synchronized (iobVar) {
                    iobVar.o = false;
                    ((ype) iob.b.l().ai(800)).u("Disconnecting due to crash");
                    Map map = iobVar.u;
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        yig yigVar = ((inm) it.next()).f;
                        ArrayList arrayList = new ArrayList(yigVar.v());
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ing ingVar = (ing) arrayList.get(i);
                            ingVar.y(null);
                            ingVar.l();
                        }
                        yigVar.q();
                    }
                    map.clear();
                    iobVar.t.clear();
                }
                iod iodVar = iobVar.p;
                if (iodVar != null) {
                    iodVar.b();
                }
                yfq yfqVarV = iobVar.k.V();
                int i2 = ((yls) yfqVarV).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((jkk) yfqVarV.get(i3)).Y();
                }
            }
            imaVar.bc();
            Optional optionalX = imaVar.X();
            optionalX.isPresent();
            jff jffVar = ((iuc) optionalX.get()).v;
            if (jffVar != null) {
                jffVar.c();
            }
            if (Build.VERSION.SDK_INT >= 30) {
                jeq jeqVarA = imaVar.e.a();
                if (!ima.d.contains(jeqVarA)) {
                    ((ype) yphVar.l().ai(302)).y("Currently in state %s, so not issuing a connection reset", jeqVarA.name());
                } else if (imaVar.U != null) {
                    ((ype) yphVar.l().ai(301)).u("recoveryLifecycleServiceConnection is set, so let it handle connection reset");
                } else {
                    ((ype) ((ype) yphVar.f()).ai((char) 299)).u("Requesting a connection reset");
                    imaVar.o.removeCallbacks(imaVar.Z);
                    if (imaVar.aa.compareAndSet(false, true)) {
                        Optional optionalX2 = imaVar.X();
                        Intent intent = new Intent("com.google.android.projection.gearhead.RECOVERY_RESET");
                        Context context = imaVar.k;
                        Intent component = intent.setComponent(new ComponentName(context, (Class<?>) ConnectionResetReceiver.class));
                        optionalX2.isPresent();
                        context.sendBroadcast(component.putExtra("EXTRA_CONNECTION_TYPE", ((iuc) optionalX2.get()).p).putExtra("EXTRA_ORIGIN", qrv.y(3)).addFlags(268435456));
                    } else {
                        ((ype) yphVar.l().ai(300)).u("Connection reset request already requested for a crash");
                    }
                }
            }
        } catch (Exception e) {
            ((ype) ((ype) ((ype) ima.b.g()).p(e)).ai((char) 297)).u("Error cleaning up on crash");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
