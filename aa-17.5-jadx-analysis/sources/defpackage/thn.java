package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.external.model.GoogleTab;
import com.android.car.libraries.apphost.external.model.GoogleTabContents;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class thn implements tho {
    public static final yob a = yob.c("com/google/android/libraries/auto/template/TabsTemplateConverter");
    private final afec b;

    public thn(afec afecVar) {
        this.b = afecVar;
    }

    public static final GoogleTabTemplate c(List list, thl thlVar, wa waVar, Action action) {
        ((ynz) a.e().ai(9077)).u("Creating tab template");
        gjw gjwVar = new gjw(waVar);
        gjwVar.c = action;
        gjwVar.b = thlVar == null;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (thlVar != null) {
                    gjwVar.e = new GoogleTabContents(new gjv(thlVar.b, (byte[]) null));
                    String str = thlVar.a;
                    if (str.isEmpty()) {
                        throw new IllegalArgumentException("The content ID cannot be null or empty");
                    }
                    gjwVar.f = str;
                }
                return gjwVar.a();
            }
            thk thkVar = (thk) it.next();
            String str2 = thlVar != null ? thlVar.a : null;
            String str3 = thkVar.e;
            boolean zF = affa.f(str2, str3);
            gju gjuVar = new gju();
            gjuVar.c = str3;
            gjuVar.a = CarText.create(thkVar.a);
            IconCompat iconCompat = zF ? thkVar.c : thkVar.b;
            gjuVar.b = iconCompat != null ? new CarIcon(new tj(iconCompat)) : null;
            if (gjuVar.c == null) {
                throw new IllegalStateException("A content ID must be set for the tab");
            }
            gjwVar.d.add(new GoogleTab(gjuVar));
        }
    }

    public final tho b(Object obj) {
        Object objInvoke = this.b.invoke(obj);
        objInvoke.getClass();
        return (tho) objInvoke;
    }

    @Override // defpackage.tho
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eqj a(qw qwVar, aabf aabfVar) {
        Action actionA;
        aabfVar.getClass();
        byte[] bArr = null;
        eqj eqjVarC = eqy.c((eqj) aabfVar.c, new nje(this, qwVar, 17, bArr));
        thm thmVar = new thm(aabfVar, 0);
        Object obj = aabfVar.d;
        if (obj != null) {
            sw swVar = new sw();
            swVar.c(new CarIcon(new tj((IconCompat) obj)));
            actionA = swVar.a();
        } else {
            actionA = Action.APP_ICON;
            actionA.getClass();
        }
        eqj eqjVar = (eqj) aabfVar.e;
        Object objE = eqjVar.e();
        if (objE == null) {
            throw new IllegalStateException("LiveData value type is not nullable");
        }
        return tby.u(tby.d(eqjVar, eqjVarC, new mxw(thmVar, actionA, 11, bArr)), c((List) objE, (thl) eqjVarC.e(), thmVar, actionA));
    }
}
