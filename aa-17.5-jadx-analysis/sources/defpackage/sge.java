package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class sge extends sfg {
    private final Context a;

    public sge(Context context, sff sffVar) {
        super(context, sffVar);
        this.a = context;
    }

    @Override // defpackage.sfg
    public final void a(yze yzeVar, yzf yzfVar) {
        yzeVar.getClass();
        abnp abnpVarN = yzg.a.n();
        abnpVarN.t();
        yzg yzgVar = (yzg) abnpVarN.b;
        yzgVar.b |= 1;
        yzgVar.c = yzeVar.D;
        abnpVarN.t();
        yzg yzgVar2 = (yzg) abnpVarN.b;
        yzgVar2.b |= 2;
        yzgVar2.d = yzfVar.az;
        yzg yzgVar3 = (yzg) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzgVar3.getClass();
        yxbVar.s = yzgVar3;
        yxbVar.b |= 65536;
        yxb yxbVar2 = (yxb) abnpVarN2.q();
        rpz rpzVarA = rpz.a(this.a);
        yxc yxcVar = yxc.PROJECTION_ERROR;
        int i = yfq.d;
        rpzVarA.e(yxcVar, yxbVar2, yls.a);
    }

    @Override // defpackage.sfg
    public final void b() {
    }
}
