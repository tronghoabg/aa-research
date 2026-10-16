package defpackage;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class mes implements tho {
    private static final yob a = yob.c("com/google/android/apps/auto/components/phone/favorites/FavoritesTemplateConverter");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence, java.lang.Object] */
    public static final wb b(Context context, List list, Boolean bool) {
        ((ynz) a.e().ai(4817)).u("Creating favorites template");
        if (affa.f(bool, false)) {
            um umVar = new um(context.getString(R.string.phone_missing_contacts_permission));
            umVar.d(thq.d(context, R.drawable.gs_warning_vd_theme_24, new oin(16)));
            return umVar.a();
        }
        tz tzVar = new tz();
        tzVar.b();
        if (list == null || bool == null) {
            tzVar.c();
        } else {
            ug ugVar = new ug();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kex kexVar = (kex) it.next();
                tw twVar = new tw();
                twVar.b(thq.a((IconCompat) kexVar.c, new oin(15)));
                twVar.e(kexVar.b);
                twVar.d(new mel(kexVar.a, 3));
                ugVar.b(twVar.a());
            }
            tzVar.b = ugVar.a();
        }
        return tzVar.a();
    }

    @Override // defpackage.tho
    public final /* bridge */ /* synthetic */ eqj a(qw qwVar, Object obj) {
        mer merVar = (mer) obj;
        merVar.getClass();
        kus kusVar = new kus(qwVar, 17);
        eqj eqjVar = merVar.h;
        eqm eqmVar = merVar.f;
        eqj eqjVarD = tby.d(eqjVar, eqmVar, kusVar);
        qn qnVar = qwVar.a;
        qnVar.getClass();
        return tby.u(eqjVarD, b(qnVar, (List) eqjVar.e(), (Boolean) eqmVar.e()));
    }
}
