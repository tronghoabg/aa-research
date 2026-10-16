package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sak {
    public volatile int a;
    private final Context b;
    private final rpz c;

    public sak(Context context, byte[] bArr) {
        this.b = context.getApplicationContext();
        this.c = rpz.a(context);
    }

    public final synchronized void a() {
        this.c.b();
    }

    protected final synchronized void b() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            SharedPreferences sharedPreferences = this.b.getSharedPreferences("gearhead_analytics", 0);
            this.a = sharedPreferences.getInt("car_session", 0);
            sharedPreferences.edit().putInt("car_session", this.a + 1).commit();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public final void c(int i, int i2, xob xobVar) {
        List listAx;
        xnx xnxVar;
        List listAx2;
        List listAx3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Iterator<E> it = xobVar.c.iterator();
        while (true) {
            listAx = null;
            if (!it.hasNext()) {
                xnxVar = null;
                break;
            }
            xnz xnzVar = (xnz) it.next();
            if ((xnzVar.b & 2) != 0) {
                xnxVar = xnzVar.d;
                if (xnxVar == null) {
                    xnxVar = xnx.c;
                }
            }
        }
        if (xnxVar != null) {
            listAx = wub.ax(woy.dO(new abof(xnxVar.f, xnx.a)));
            listAx3 = wub.ax(woy.dO(new abof(xnxVar.g, xnx.b)));
            aboh abohVar = xnxVar.d;
            kpi kpiVar = new kpi(5);
            abohVar.getClass();
            xny[] xnyVarArr = (xny[]) yrm.aq(new yhi(abohVar, kpiVar)).toArray((Object[]) Array.newInstance((Class<?>) xny.class, 0));
            if (xnyVarArr == null) {
                throw new NullPointerException("null reference");
            }
            listAx2 = wub.ax(woy.dP(xnyVarArr));
        } else {
            listAx2 = null;
            listAx3 = null;
        }
        abnp abnpVarN = yxb.a.n();
        abnp abnpVarN2 = yxq.a.n();
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar = xobVar.q;
            if (xgrVar == null) {
                xgrVar = xgr.a;
            }
            str = xgrVar.c;
        } else {
            str = xobVar.d;
        }
        abnpVarN2.t();
        yxq yxqVar = (yxq) abnpVarN2.b;
        str.getClass();
        yxqVar.b |= 1;
        yxqVar.c = str;
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar2 = xobVar.q;
            if (xgrVar2 == null) {
                xgrVar2 = xgr.a;
            }
            str2 = xgrVar2.d;
        } else {
            str2 = xobVar.e;
        }
        abnpVarN2.t();
        yxq yxqVar2 = (yxq) abnpVarN2.b;
        str2.getClass();
        yxqVar2.b |= 2;
        yxqVar2.d = str2;
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar3 = xobVar.q;
            if (xgrVar3 == null) {
                xgrVar3 = xgr.a;
            }
            str3 = xgrVar3.e;
        } else {
            str3 = xobVar.f;
        }
        abnpVarN2.t();
        yxq yxqVar3 = (yxq) abnpVarN2.b;
        str3.getClass();
        yxqVar3.b |= 4;
        yxqVar3.e = str3;
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar4 = xobVar.q;
            if (xgrVar4 == null) {
                xgrVar4 = xgr.a;
            }
            str4 = xgrVar4.i;
        } else {
            str4 = xobVar.k;
        }
        abnpVarN2.t();
        yxq yxqVar4 = (yxq) abnpVarN2.b;
        str4.getClass();
        yxqVar4.b |= 32;
        yxqVar4.h = str4;
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar5 = xobVar.q;
            if (xgrVar5 == null) {
                xgrVar5 = xgr.a;
            }
            str5 = xgrVar5.g;
        } else {
            str5 = xobVar.i;
        }
        abnpVarN2.t();
        yxq yxqVar5 = (yxq) abnpVarN2.b;
        str5.getClass();
        yxqVar5.b |= 8;
        yxqVar5.f = str5;
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar6 = xobVar.q;
            if (xgrVar6 == null) {
                xgrVar6 = xgr.a;
            }
            str6 = xgrVar6.h;
        } else {
            str6 = xobVar.j;
        }
        abnpVarN2.t();
        yxq yxqVar6 = (yxq) abnpVarN2.b;
        str6.getClass();
        yxqVar6.b |= 16;
        yxqVar6.g = str6;
        if ((xobVar.b & 16384) != 0) {
            xgr xgrVar7 = xobVar.q;
            if (xgrVar7 == null) {
                xgrVar7 = xgr.a;
            }
            str7 = xgrVar7.j;
        } else {
            str7 = xobVar.l;
        }
        abnpVarN2.t();
        yxq yxqVar7 = (yxq) abnpVarN2.b;
        str7.getClass();
        yxqVar7.b |= 64;
        yxqVar7.i = str7;
        abnpVarN2.t();
        yxq yxqVar8 = (yxq) abnpVarN2.b;
        yxqVar8.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        yxqVar8.j = i;
        abnpVarN2.t();
        yxq yxqVar9 = (yxq) abnpVarN2.b;
        yxqVar9.b |= 1024;
        yxqVar9.k = i2;
        String str8 = xobVar.o;
        abnpVarN2.t();
        yxq yxqVar10 = (yxq) abnpVarN2.b;
        str8.getClass();
        yxqVar10.b |= 2048;
        yxqVar10.l = str8;
        xje xjeVarB = xje.b(xobVar.h);
        if (xjeVarB == null) {
            xjeVarB = xje.DRIVER_POSITION_LEFT;
        }
        abnpVarN2.t();
        yxq yxqVar11 = (yxq) abnpVarN2.b;
        yxqVar11.b |= 4096;
        yxqVar11.m = xjeVarB.e;
        if (listAx != null) {
            abnpVarN2.t();
            yxq yxqVar12 = (yxq) abnpVarN2.b;
            abod abodVar = yxqVar12.n;
            if (!abodVar.c()) {
                int size = abodVar.size();
                yxqVar12.n = abodVar.d(size + size);
            }
            abmc.i(listAx, yxqVar12.n);
        }
        if (listAx3 != null) {
            abnpVarN2.t();
            yxq yxqVar13 = (yxq) abnpVarN2.b;
            abod abodVar2 = yxqVar13.o;
            if (!abodVar2.c()) {
                int size2 = abodVar2.size();
                yxqVar13.o = abodVar2.d(size2 + size2);
            }
            abmc.i(listAx3, yxqVar13.o);
        }
        if (listAx2 != null) {
            abnpVarN2.t();
            yxq yxqVar14 = (yxq) abnpVarN2.b;
            abod abodVar3 = yxqVar14.p;
            if (!abodVar3.c()) {
                int size3 = abodVar3.size();
                yxqVar14.p = abodVar3.d(size3 + size3);
            }
            abmc.i(listAx2, yxqVar14.p);
        }
        abnp abnpVarN3 = yxt.a.n();
        abnpVarN3.t();
        yxt yxtVar = (yxt) abnpVarN3.b;
        yxq yxqVar15 = (yxq) abnpVarN2.q();
        yxqVar15.getClass();
        yxtVar.d = yxqVar15;
        yxtVar.b |= 2;
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yxt yxtVar2 = (yxt) abnpVarN3.q();
        yxtVar2.getClass();
        yxbVar.e = yxtVar2;
        yxbVar.b |= 1;
        yxc yxcVar = yxc.CONNECT_CAR_INFO;
        int i3 = yfq.d;
        f(abnpVarN, yxcVar, yls.a);
    }

    public final void d(yxb yxbVar, yxc yxcVar) {
        abnp abnpVarK = yxbVar.K();
        int i = yfq.d;
        f(abnpVarK, yxcVar, yls.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(rqy rqyVar) {
        yfl yflVar = new yfl(4);
        yno it = rqyVar.d().iterator();
        while (it.hasNext()) {
            yflVar.i(Integer.valueOf(((acai) it.next()).a()));
        }
        f(rqyVar.g(), rqyVar.e(), yflVar.g());
    }

    public final void f(abnp abnpVar, yxc yxcVar, List list) {
        int i = this.a;
        abnpVar.t();
        yxb yxbVar = (yxb) abnpVar.b;
        yxb yxbVar2 = yxb.a;
        yxbVar.b |= 8388608;
        yxbVar.x = i;
        this.c.e(yxcVar, (yxb) abnpVar.q(), list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sak(Context context) {
        this(context, null);
        qst.a(context);
    }
}
