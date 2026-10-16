package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;

/* loaded from: classes3.dex */
public final /* synthetic */ class wiz implements win {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wiz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.win
    public final void a(aacq aacqVar) {
        if (this.b == 0) {
            boolean zO = aacqVar.o();
            Object obj = this.a;
            if (!zO) {
                ((wjb) obj).f(false);
                return;
            }
            wjb wjbVar = (wjb) obj;
            wjbVar.o = aacqVar;
            wjbVar.g.a();
            wjbVar.f(true);
            return;
        }
        Object obj2 = this.a;
        wjy wjyVarB = ((wii) obj2).b();
        if (wjyVarB == null) {
            Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
            return;
        }
        if (!aacqVar.o()) {
            wjyVarB.g(false);
            return;
        }
        wik wikVar = (wik) obj2;
        wikVar.e = aacqVar;
        wikVar.d.a();
        wjyVarB.f(wikVar.i(), (Fragment) obj2);
    }
}
