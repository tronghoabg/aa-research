package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class opp {
    static final /* synthetic */ afia[] a = {new affn(opp.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/widgets/WidgetManager;", 0)};

    public static /* synthetic */ List b(abrn abrnVar) {
        Object next;
        aboh abohVar;
        String str = Build.MANUFACTURER;
        str.getClass();
        str.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        aboh abohVar2 = abrnVar.b;
        abohVar2.getClass();
        Iterator<E> it = abohVar2.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            aboh<String> abohVar3 = ((abrj) next).b;
            abohVar3.getClass();
            if (!abohVar3.isEmpty()) {
                for (String str2 : abohVar3) {
                    str2.getClass();
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    String lowerCase2 = str2.toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (affa.f(lowerCase2, lowerCase)) {
                        break loop0;
                    }
                }
            }
        }
        abrj abrjVar = (abrj) next;
        if (abrjVar != null && (abohVar = abrjVar.c) != null) {
            return abohVar;
        }
        aboh abohVar4 = abrnVar.c;
        abohVar4.getClass();
        return abohVar4;
    }

    public final opr a() {
        return (opr) opr.b.getValue(this, a[0]);
    }
}
