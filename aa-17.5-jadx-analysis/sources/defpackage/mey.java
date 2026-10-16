package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ListTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mey implements tho {
    private static final yob a = yob.c("com/google/android/apps/auto/components/phone/numbers/NumbersTemplateConverter");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.tho
    public final /* bridge */ /* synthetic */ eqj a(qw qwVar, Object obj) {
        mex mexVar = (mex) obj;
        mexVar.getClass();
        ((ynz) a.e().ai(4821)).u("Creating number selector template");
        uj ujVar = new uj();
        ua uaVar = new ua();
        uaVar.e(mexVar.d);
        uaVar.c(new sw(Action.BACK).a());
        ujVar.d(uaVar.a());
        qn qnVar = qwVar.a;
        qnVar.getClass();
        ug ugVar = new ug();
        for (kzt kztVar : mexVar.e) {
            vf vfVar = new vf();
            vfVar.i(kztVar.d);
            vfVar.g(new mel(kztVar.a, 5));
            vfVar.d(kztVar.b);
            Object obj2 = kztVar.c;
            if (obj2 != null) {
                vfVar.e(leh.a.a().b() ? thq.d(qnVar, R.drawable.call_icon, new mcm(jtu.b(hiu.a), 9)) : thq.a((IconCompat) obj2, new oin(15)), 2);
            }
            ugVar.b(vfVar.a());
        }
        ujVar.f(ugVar.a());
        ListTemplate listTemplateA = ujVar.a();
        afco afcoVar = tby.a;
        return new eqm(listTemplateA);
    }
}
