package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class qkn implements mnr {
    public static final yph a = yph.c("GH.SimToNSAdapter");
    boolean c;
    BroadcastReceiver d;
    erb e;
    private ljv f;
    private int g;
    public final Map b = new HashMap();
    private final mnp h = new qkm(this, 0);

    public static String b(moa moaVar) {
        return moaVar.O() == null ? "com.google.android.projection.gearhead" : moaVar.O();
    }

    @Override // defpackage.mnr
    public final PendingIntent a(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        Context context = mki.a.c;
        int i2 = this.g;
        this.g = i2 + 1;
        return PendingIntent.getBroadcast(context, i2, intent, (i >= 31 ? 33554432 : 0) | 268435456);
    }

    @Override // defpackage.lhg
    public final void c() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 7493)).u("starting");
        mlq.e().f(this.h);
        ljv ljvVarB = this.f;
        if (ljvVarB == null) {
            ljvVarB = lnm.z().b();
            this.f = ljvVarB;
        }
        ljvVarB.f();
        if (this.e == null) {
            this.e = new erb(this.f);
        }
        Context context = mki.a.c;
        if (this.d == null) {
            this.d = new qkl(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gearhead.ACTION_HANDLE_NOTIFICATION_INTENT");
            dup.e(context, this.d, intentFilter, null, true != actj.A() ? 2 : 4);
            ((ype) ((ype) yphVar.f()).ai((char) 7494)).u("receiver active");
        }
        this.c = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 7495)).u("stopping");
        if (this.c) {
            Context context = mki.a.c;
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
                this.d = null;
            }
            mlq.e().k(this.h);
            this.b.clear();
            this.f.g();
            this.c = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, ljv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.moa r7) {
        /*
            r6 = this;
            android.util.Pair r0 = new android.util.Pair
            long r1 = r7.A()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            yzr r2 = r7.J()
            r0.<init>(r1, r2)
            java.util.Map r1 = r6.b
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L95
            erb r2 = r6.e
            yzr r3 = r7.J()
            ykd r4 = new ykd
            r4.<init>(r6)
            int r6 = r3.ordinal()
            r3 = 2
            if (r6 == r3) goto L6b
            r2 = 3
            if (r6 == r2) goto L65
            r2 = 4
            if (r6 == r2) goto L5f
            r2 = 5
            if (r6 == r2) goto L65
            r2 = 6
            if (r6 == r2) goto L59
            r2 = 13
            if (r6 == r2) goto L53
            r2 = 27
            if (r6 == r2) goto L4d
            r2 = 29
            if (r6 == r2) goto L4d
            r2 = 23
            if (r6 == r2) goto L5f
            r2 = 24
            if (r6 == r2) goto L4d
            r6 = 0
            goto L78
        L4d:
            qki r6 = new qki
            r6.<init>(r4)
            goto L78
        L53:
            qkg r6 = new qkg
            r6.<init>(r4)
            goto L78
        L59:
            qjz r6 = new qjz
            r6.<init>(r4)
            goto L78
        L5f:
            qkf r6 = new qkf
            r6.<init>(r4)
            goto L78
        L65:
            qke r6 = new qke
            r6.<init>(r4)
            goto L78
        L6b:
            java.lang.Object r6 = r2.a
            qkd r2 = new qkd
            omu r3 = new omu
            r3.<init>()
            r2.<init>(r4, r6, r3)
            r6 = r2
        L78:
            if (r6 != 0) goto L92
            yph r6 = defpackage.qkn.a
            yop r0 = r6.l()
            boolean r0 = r0.Z()
            if (r0 == 0) goto Lf5
            java.lang.String r7 = j$.util.Objects.toString(r7)
            java.lang.String r0 = "%s not supported"
            r1 = 7490(0x1d42, float:1.0496E-41)
            defpackage.a.bQ(r6, r0, r7, r1)
            return
        L92:
            r1.put(r0, r6)
        L95:
            java.lang.Object r6 = r1.get(r0)
            qkj r6 = (defpackage.qkj) r6
            moa r0 = r6.d()
            nur r6 = r6.e(r7)
            if (r6 != 0) goto Lbd
            yph r6 = defpackage.qkn.a
            yop r0 = r6.l()
            boolean r0 = r0.Z()
            if (r0 == 0) goto Lf5
            java.lang.String r7 = j$.util.Objects.toString(r7)
            java.lang.String r0 = "unable to add, null notification for %s"
            r1 = 7489(0x1d41, float:1.0494E-41)
            defpackage.a.bQ(r6, r0, r7, r1)
            return
        Lbd:
            mcb r1 = defpackage.mcb.b()
            java.lang.String r2 = r6.f
            mca r1 = r1.a(r2)
            yzr r3 = r7.J()
            java.lang.String r3 = r3.name()
            long r4 = r7.A()
            r1.e(r3, r4, r6)
            if (r0 == 0) goto Lf5
            java.lang.String r6 = b(r0)
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto Lf5
            nuj r0 = defpackage.nuj.b()
            yzr r1 = r7.J()
            java.lang.String r1 = r1.name()
            long r2 = r7.A()
            r0.g(r1, r2, r6)
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkn.e(moa):void");
    }
}
