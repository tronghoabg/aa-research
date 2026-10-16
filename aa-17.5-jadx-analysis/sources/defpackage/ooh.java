package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ooh implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ ooh(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        ComponentName componentName;
        switch (this.a) {
            case 0:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    boc.a(dao.b(R.drawable.gs_more_vert_vd_theme_24, buxVar, 0), null, null, 0L, buxVar, 56, 12);
                } else {
                    buxVar.s();
                }
                return afak.a;
            case 1:
                return mlq.B((bux) obj, ((Integer) obj2).intValue());
            case 2:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    brp.b(vq.e(R.string.remove_widget, buxVar2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar2, 0, 0, 262142);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 3:
                return mlq.B((bux) obj, ((Integer) obj2).intValue());
            case 4:
                ((Integer) obj).intValue();
                oqb oqbVar = (oqb) obj2;
                oqbVar.getClass();
                return Integer.valueOf(oqbVar.a);
            case 5:
                yfq yfqVar = (yfq) obj;
                Set set = (Set) obj2;
                int i = oqc.c;
                yfqVar.getClass();
                set.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : yfqVar) {
                    oqb oqbVar2 = (oqb) obj3;
                    AppWidgetProviderInfo appWidgetProviderInfo = oqbVar2.b;
                    if (appWidgetProviderInfo == null || (componentName = appWidgetProviderInfo.provider) == null) {
                        componentName = oqbVar2.e;
                    }
                    if (!woy.cn(set, componentName)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 6:
                Integer num = (Integer) obj;
                Map map = (Map) obj2;
                yph yphVar = oxs.a;
                boolean zContainsKey = map.containsKey(oxs.g(nsn.w));
                if (nsr.c().b().m() != nsv.f) {
                    zContainsKey |= map.containsKey(oxs.g(nsn.x));
                }
                return Boolean.valueOf(num.intValue() == 2 || (zContainsKey || map.containsKey(oxs.g(nsn.c)) || (acmd.s() && map.containsKey(oxs.g(nsn.b)))));
            case 7:
                afco afcoVar = tby.a;
                return new aezu(obj, obj2);
            case 8:
                Set set2 = (Set) obj;
                Iterable iterable = (Iterable) obj2;
                afco afcoVar2 = tby.a;
                set2.getClass();
                iterable.getClass();
                return woy.aS(set2, iterable);
            case 9:
                afco afcoVar3 = tby.a;
                return true;
            case 10:
                afco afcoVar4 = tby.a;
                return true;
            case 11:
                tiq tiqVar = (tiq) obj;
                tiqVar.getClass();
                tiqVar.b = (afec) obj2;
                return afak.a;
            case 12:
                String str = (String) obj;
                afcm afcmVar = (afcm) obj2;
                str.getClass();
                afcmVar.getClass();
                if (str.length() == 0) {
                    return afcmVar.toString();
                }
                return str + ", " + afcmVar;
            case 13:
                afco afcoVar5 = (afco) obj;
                afcm afcmVar2 = (afcm) obj2;
                return afcmVar2 instanceof aitq ? afcoVar5.plus(((aitq) afcmVar2).a()) : afcoVar5.plus(afcmVar2);
            case 14:
                return Boolean.valueOf(affa.f(obj, obj2));
            default:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }
}
