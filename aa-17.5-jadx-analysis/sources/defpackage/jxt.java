package defpackage;

import android.graphics.Bitmap;
import androidx.car.app.messaging.model.ConversationCallbackDelegateImpl;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes2.dex */
public final class jxt {
    public static final /* synthetic */ int a = 0;
    private static final duk b;

    static {
        duj dujVar = new duj();
        dujVar.a = "{null sender}";
        dujVar.d = "null_sender_key";
        b = new duk(dujVar);
    }

    public static ConversationItem a(luj lujVar, lug lugVar) {
        duk dukVar = lugVar.c;
        if (dukVar == null) {
            dukVar = b;
        }
        duk dukVarB = b(dukVar);
        jxs jxsVar = new jxs(lujVar, lugVar);
        sv svVar = new sv();
        svVar.b = CarText.create(lugVar.b);
        svVar.c = dukVarB;
        svVar.e = lugVar.g;
        svVar.a = lugVar.a;
        svVar.g = new ConversationCallbackDelegateImpl(jxsVar);
        Bitmap bitmap = lugVar.e;
        if (bitmap != null) {
            svVar.d = szp.q(bitmap);
        }
        Stream map = Collection.EL.stream(lugVar.d).map(new gjm(lugVar, 11));
        int i = yfq.d;
        svVar.f = (List) map.collect(ycm.a);
        return new ConversationItem(svVar);
    }

    public static duk b(duk dukVar) {
        CharSequence charSequence = dukVar.a;
        charSequence.getClass();
        if (dukVar.d != null) {
            return dukVar;
        }
        duj dujVar = new duj(dukVar);
        dujVar.d = charSequence.toString();
        return new duk(dujVar);
    }

    public static lug c(geu geuVar, ConversationItem conversationItem) {
        int dimensionPixelSize;
        Bitmap bitmapE;
        luf lufVar = new luf();
        lufVar.b(conversationItem.getId());
        lufVar.f(conversationItem.getTitle().toString());
        lufVar.d(Collection.EL.stream(conversationItem.getMessages()).allMatch(new hmd(9)));
        lufVar.c(conversationItem.isGroupConversation());
        Stream map = Collection.EL.stream(conversationItem.getMessages()).map(new jxf(geuVar, conversationItem, 2, null));
        int i = yfq.d;
        lufVar.e((yfq) map.collect(ycm.a));
        CarIcon icon = conversationItem.getIcon();
        if (icon != null && (bitmapE = hbz.e(geuVar, icon, (dimensionPixelSize = geuVar.getResources().getDimensionPixelSize(R.dimen.assistant_conversation_icon_size)), dimensionPixelSize, hmb.a, 0)) != null) {
            lufVar.b = bitmapE;
        }
        duk self = conversationItem.getSelf();
        String str = b.d;
        str.getClass();
        if (!str.equals(self.d)) {
            lufVar.a = b(self);
        }
        return lufVar.a();
    }
}
