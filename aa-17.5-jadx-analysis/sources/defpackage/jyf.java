package defpackage;

import android.content.ComponentName;
import androidx.car.app.messaging.model.ConversationItem;

/* loaded from: classes2.dex */
public final class jyf implements gse {
    @Override // defpackage.gse
    public final aiyk a(geu geuVar, ConversationItem conversationItem) {
        if (!lwo.a.a().b(conversationItem)) {
            return new jxz(null, 4);
        }
        jxv.a();
        String packageName = ((ComponentName) jxv.f(geuVar, null, false).b).getPackageName();
        packageName.getClass();
        String id = conversationItem.getId();
        id.getClass();
        return new jyc(new ajaq(new jya(null, geuVar, packageName, conversationItem), aiyr.b(new aiyb(new jye(aizc.b(new jxz(afak.a, 4), mlq.e().e()), (afck) null, new lwb(packageName, id), 0)), new jxa(5))), geuVar, conversationItem, 0);
    }
}
