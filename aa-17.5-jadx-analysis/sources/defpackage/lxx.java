package defpackage;

import android.content.Context;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lxx {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.MsgTemplateFactory");

    /* JADX WARN: Multi-variable type inference failed */
    public static final ListTemplate a(Context context, yfq yfqVar, luj lujVar, boolean z, Map map) {
        ug ugVar = new ug();
        ynp ynpVarListIterator = yfqVar.listIterator(0);
        ynpVarListIterator.getClass();
        while (ynpVarListIterator.hasNext()) {
            E next = ynpVarListIterator.next();
            next.getClass();
            lug lugVar = (lug) next;
            if (!lugVar.d.isEmpty()) {
                ConversationItem conversationItemA = jxt.a(lujVar, lugVar);
                if (map != null) {
                    CarIcon carIcon = new CarIcon(new tj(IconCompat.m(context, 2131233094)));
                    kqz kqzVar = (kqz) map.get(conversationItemA.getId());
                    if (kqzVar != null) {
                        sw swVar = new sw();
                        swVar.c(carIcon);
                        swVar.d(new jsu(context, kqzVar, 8, null));
                        Action actionA = swVar.a();
                        sv svVar = new sv(conversationItemA);
                        List list = svVar.h;
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.add(actionA);
                        wf.f.a(arrayList);
                        list.add(actionA);
                        conversationItemA = new ConversationItem(svVar);
                    }
                }
                ugVar.b(conversationItemA);
            }
        }
        ugVar.c(context.getString(R.string.no_messages_notification_backend));
        ItemList itemListA = ugVar.a();
        String str = lujVar.b;
        Optional optionalC = lxs.b().c(str, lujVar.a, lujVar.d);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MESSAGING_APP, yzy.mW);
        rrbVarH.z(itemListA.getItems().size());
        ohsVarJ.F(rrbVarH.l());
        uj ujVar = new uj();
        if (optionalC.isPresent()) {
            ((ype) b.f()).y("Compose is available for app: %s", str);
            ujVar.b((Action) optionalC.get());
        }
        ujVar.f(itemListA);
        if (z) {
            ua uaVar = new ua();
            uaVar.e(str);
            sw swVar2 = new sw();
            swVar2.c(lujVar.c.i(context, -1));
            uaVar.c(swVar2.a());
            ujVar.d(uaVar.a());
        }
        return ujVar.a();
    }
}
