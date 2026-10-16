package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: classes.dex */
public final class rxa implements rwz {
    private static final ypf c = ols.R("CAR.ANALYTICS");
    public final rpz a;
    public int b = -1;
    private final Context d;

    public rxa(qst qstVar, Context context) {
        if (qstVar == null) {
            throw new IllegalArgumentException("args must not be null");
        }
        this.d = context;
        this.a = rpz.a(context.getApplicationContext());
    }

    @Override // defpackage.rwz
    public final void a(byte[] bArr, yxc yxcVar) {
        try {
            abmc abmcVarH = yxb.a.n().h(bArr, abnj.a());
            int i = yfq.d;
            g((abnp) abmcVarH, yxcVar, yls.a);
        } catch (abon unused) {
            c.h().ai(8462).u("Error reading event proto");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rwz
    public final void b(rqy rqyVar) {
        yfl yflVar = new yfl(4);
        yno it = rqyVar.d().iterator();
        while (it.hasNext()) {
            yflVar.i(Integer.valueOf(((acai) it.next()).a()));
        }
        g(rqyVar.g(), rqyVar.e(), yflVar.g());
    }

    @Override // defpackage.rwz
    public final void c(yze yzeVar, yzf yzfVar, long j, long j2) {
        yzeVar.getClass();
        yzfVar.getClass();
        abnp abnpVarN = yzg.a.n();
        abnpVarN.t();
        yzg yzgVar = (yzg) abnpVarN.b;
        yzgVar.b |= 1;
        yzgVar.c = yzeVar.D;
        abnpVarN.t();
        yzg yzgVar2 = (yzg) abnpVarN.b;
        yzgVar2.b |= 2;
        yzgVar2.d = yzfVar.az;
        abnpVarN.t();
        yzg yzgVar3 = (yzg) abnpVarN.b;
        yzgVar3.b |= 4;
        yzgVar3.e = j;
        abnpVarN.t();
        yzg yzgVar4 = (yzg) abnpVarN.b;
        yzgVar4.b |= 8;
        yzgVar4.f = j2;
        yzg yzgVar5 = (yzg) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzgVar5.getClass();
        yxbVar.s = yzgVar5;
        yxbVar.b |= 65536;
        yxc yxcVar = yxc.OUT_OF_CAR_LIFECYCLE_ERROR;
        int i = yfq.d;
        g(abnpVarN2, yxcVar, yls.a);
    }

    @Override // defpackage.rwz
    public final void d(yzz yzzVar, yzy yzyVar) {
        abnp abnpVarN = zab.a.n();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = yzzVar.he;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        zab zabVar3 = (zab) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        zabVar3.getClass();
        yxbVar.o = zabVar3;
        yxbVar.b |= 4096;
        yxc yxcVar = yxc.UI;
        int i = yfq.d;
        g(abnpVarN2, yxcVar, yls.a);
    }

    @Override // defpackage.rwz
    public final void e(yyv yyvVar) {
        abnp abnpVarN = yyz.a.n();
        abnpVarN.t();
        yyz yyzVar = (yyz) abnpVarN.b;
        yyzVar.b |= 1;
        yyzVar.c = 23;
        abnpVarN.t();
        yyz yyzVar2 = (yyz) abnpVarN.b;
        yyzVar2.b |= 2;
        yyzVar2.d = yyvVar.fI;
        f((yyz) abnpVarN.q());
    }

    public final void f(yyz yyzVar) {
        yyzVar.getClass();
        woy.Z(1 == (yyzVar.b & 1));
        woy.Z((yyzVar.b & 2) != 0);
        abnp abnpVarN = yxb.a.n();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yxbVar.p = yyzVar;
        yxbVar.b |= 8192;
        yxc yxcVar = yxc.NON_UI;
        int i = yfq.d;
        g(abnpVarN, yxcVar, yls.a);
    }

    @Deprecated
    public final void g(abnp abnpVar, yxc yxcVar, List list) {
        String strB;
        int i;
        if ((((yxb) abnpVar.b).c & 131072) != 0) {
            throw new IllegalArgumentException("GearheadInfo already set, please add logic to merge it in.");
        }
        Context context = this.d;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        Context applicationContext = context.getApplicationContext();
        try {
            strB = qtr.b(applicationContext, skn.a(applicationContext).b(applicationContext.getPackageName()));
        } catch (IllegalStateException | SecurityException unused) {
            strB = "";
        }
        try {
            i = packageManager.getPackageInfo(strB, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused2) {
            i = -1;
        }
        abnp abnpVarN = yyj.a.n();
        abnpVarN.t();
        yyj yyjVar = (yyj) abnpVarN.b;
        yyjVar.b |= 1;
        yyjVar.c = i;
        yyj yyjVar2 = (yyj) abnpVarN.q();
        abnpVar.t();
        yxb yxbVar = (yxb) abnpVar.b;
        yyjVar2.getClass();
        yxbVar.Q = yyjVar2;
        yxbVar.c |= 131072;
        int i2 = this.b;
        abnpVar.t();
        yxb yxbVar2 = (yxb) abnpVar.b;
        yxbVar2.b |= 8388608;
        yxbVar2.x = i2;
        this.a.e(yxcVar, (yxb) abnpVar.q(), list);
    }
}
