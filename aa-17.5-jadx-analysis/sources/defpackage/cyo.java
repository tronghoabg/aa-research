package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class cyo implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ cyo(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                cxb cxbVar = (cxb) obj;
                if (cxbVar.am()) {
                    cxbVar.W(false);
                }
                return afak.a;
            case 1:
                cxb cxbVar2 = (cxb) obj;
                if (cxbVar2.am()) {
                    cxbVar2.W(false);
                }
                return afak.a;
            case 2:
                cxb cxbVar3 = (cxb) obj;
                if (cxbVar3.am()) {
                    cxbVar3.U(false);
                }
                return afak.a;
            case 3:
                cxb cxbVar4 = (cxb) obj;
                if (cxbVar4.am()) {
                    cxbVar4.U(false);
                }
                return afak.a;
            case 4:
                ccx ccxVar = (ccx) obj;
                czz.al(ccxVar, daa.a);
                return ((Context) czz.al(ccxVar, daa.b)).getResources();
            case 5:
                return ((cym) czz.al((ccx) obj, dbc.a)).K();
            case 6:
                return Boolean.valueOf(dbg.a(obj));
            case 7:
                return afak.a;
            case 8:
                deu deuVar = dev.a;
                return Boolean.valueOf(!(((deq) obj) instanceof dfg));
            case 9:
                dfd dfdVar = (dfd) obj;
                return "[" + dfdVar.a + ", " + dfdVar.b + ")";
            case 10:
                dhz dhzVar = (dhz) obj;
                return "'" + dhzVar.a() + "' " + dhzVar.b();
            case 11:
                dhz dhzVar2 = (dhz) obj;
                return "'" + dhzVar2.a() + "' " + dhzVar2.b();
            case 12:
                return afak.a;
            case 13:
                return afak.a;
            case 14:
                return afak.a;
            case 15:
                return afak.a;
            case 16:
                File file = (File) obj;
                Set set = egi.a;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new ehh();
            case 17:
                ((Context) obj).getClass();
                return afbe.a;
            case 18:
                fdk fdkVar = fdk.a;
                return false;
            case 19:
                ksj ksjVar = (ksj) obj;
                krr krrVar = krr.a;
                ksjVar.getClass();
                return ksjVar.A();
            default:
                ksj ksjVar2 = (ksj) obj;
                krr krrVar2 = krr.a;
                ksjVar2.getClass();
                return ksjVar2.h();
        }
    }
}
