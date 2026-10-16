package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jyg implements jxw {
    private static final yob a = yob.c("com/google/android/apps/auto/components/apphost/messaging/impl/MessagingTemplateAppReadReplyHandlerImpl");
    private final Map b = new HashMap();

    public static final void d(geu geuVar, String str) {
        lwb lwbVar = new lwb(e(geuVar), str);
        if (actj.w()) {
            ogz ogzVarB = lyl.a().b(lwbVar);
            if (ogzVarB == null) {
                ((ynz) ((ynz) a.h()).ai((char) 2824)).u("Can't find related ImConversation provided from mesquite.");
                return;
            }
            ((ynz) ((ynz) a.e()).ai((char) 2825)).u("Found related ImConversation and set as read.");
            lnm.j().h((lvg) ogzVarB.b);
            return;
        }
        ohe oheVarB = lyn.a().b(lwbVar);
        if (oheVarB == null) {
            ((ynz) ((ynz) a.h()).ai((char) 2822)).u("Can't find related ImStreamItem provided from mesquite.");
            return;
        }
        ((ynz) ((ynz) a.e()).ai((char) 2823)).u("Found related ImStreamItem and set as read.");
        lnm.k().g((lue) oheVarB.a);
    }

    private static final String e(geu geuVar) {
        jwq jwqVar = (jwq) geuVar;
        String packageName = ((gmh) jwqVar.c).a.getPackageName();
        return packageName.equals("com.google.android.projection.gearhead") ? jwqVar.b.getSessionId() : packageName;
    }

    private final kzt f(Intent intent) {
        lvd.c();
        Map map = this.b;
        String strF = lvd.f(intent);
        kzt kztVar = (kzt) map.get(strF);
        kztVar.getClass();
        woy.aa(((String) kztVar.a).equals(strF), "Conversation ID does not match cached conversation metadata. Were multiple assistant flowsinvoked at the same time?");
        return kztVar;
    }

    private final MessagingInfo g(geu geuVar, whg whgVar, ConversationItem conversationItem) {
        lug lugVarC = jxt.c(geuVar, conversationItem);
        String strE = e(geuVar);
        Intent intentB = lvd.c().b(strE, lugVarC, "com.google.android.apps.auto.components.apphost.messaging.ACTION_MARK_AS_READ");
        h(geuVar, whgVar, conversationItem);
        PendingIntent pendingIntentA = lvd.c().a(intentB);
        Intent intentB2 = lvd.c().b(strE, lugVarC, "com.google.android.apps.auto.components.apphost.messaging.ACTION_REPLY");
        h(geuVar, whgVar, conversationItem);
        MessagingInfo messagingInfoD = lvd.c().d(strE, lugVarC, pendingIntentA, lvd.c().a(intentB2));
        ((ynz) ((ynz) a.e()).ai((char) 2817)).y("createMessagingInfo: %s", messagingInfoD);
        return messagingInfoD;
    }

    private final void h(geu geuVar, whg whgVar, ConversationItem conversationItem) {
        this.b.put(conversationItem.getId(), new kzt(conversationItem.getId(), conversationItem.getConversationCallbackDelegate(), geuVar, whgVar));
    }

    private static final boolean i(whg whgVar) {
        if (!kfl.h().L()) {
            return false;
        }
        ((ynz) ((ynz) a.g()).ai((char) 2821)).u("Failed to invoke read/reply flow (Assistant already running)");
        Object obj = whgVar.b;
        yzy yzyVar = yzy.ng;
        lxr.e();
        lxr.g(yzz.CAR_APP_LIBRARY, yzyVar, (ComponentName) obj);
        return true;
    }

    @Override // defpackage.jxw
    public final void a(geu geuVar, ConversationItem conversationItem) {
        ConversationItem conversationItem2;
        yob yobVar = a;
        ((ynz) ((ynz) yobVar.f()).ai((char) 2818)).u("launchReadReplyFlow");
        jxv.a();
        whg whgVarF = jxv.f(geuVar, lua.ASSISTANT_READ_REPLY, lvx.a().b(conversationItem, e(geuVar)));
        if (i(whgVarF)) {
            return;
        }
        whgVarF.b();
        if (Collection.EL.stream(conversationItem.getMessages()).anyMatch(new hmd(10))) {
            Stream streamFilter = Collection.EL.stream(conversationItem.getMessages()).filter(new hmd(11));
            int i = yfq.d;
            yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
            sv svVar = new sv(conversationItem);
            svVar.f = yfqVar;
            conversationItem2 = new ConversationItem(svVar);
        } else {
            List<CarMessage> messages = conversationItem.getMessages();
            sv svVar2 = new sv(conversationItem);
            Stream streamSkip = Collection.EL.stream(messages).skip(messages.size() <= 3 ? 0L : messages.size() - 3);
            int i2 = yfq.d;
            svVar2.f = (List) streamSkip.collect(ycm.a);
            conversationItem2 = new ConversationItem(svVar2);
        }
        ComponentName componentName = (ComponentName) whgVarF.b;
        if (lvx.a().b(conversationItem2, componentName.getPackageName())) {
            Object obj = whgVarF.c;
            lxr.e();
            lxr.f(((lub) obj).h, yzy.KG, componentName);
        }
        ((ynz) ((ynz) yobVar.f()).ai((char) 2819)).u("Reading a message from template messaging app");
        kfl.h().H(g(geuVar, whgVarF, conversationItem2));
    }

    @Override // defpackage.jxw
    public final void b(geu geuVar, ConversationItem conversationItem) {
        ((ynz) ((ynz) a.e()).ai((char) 2820)).u("launchReplyFlow");
        jxv.a();
        whg whgVarF = jxv.f(geuVar, lua.ASSISTANT_DIRECT_REPLY, lvx.a().b(conversationItem, e(geuVar)));
        if (i(whgVarF)) {
            return;
        }
        whgVarF.b();
        kfl.h().t(g(geuVar, whgVarF, conversationItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, sr] */
    @Override // defpackage.jxw
    public final boolean c(String str, Intent intent) {
        int iHashCode = str.hashCode();
        if (iHashCode != 550133053) {
            if (iHashCode != 1715900702 || !str.equals("com.google.android.apps.auto.components.apphost.messaging.ACTION_REPLY")) {
                return false;
            }
            kzt kztVarF = f(intent);
            lvd.c();
            String strG = lvd.g(intent);
            Object obj = kztVarF.d;
            Object obj2 = kztVarF.b;
            ((jwq) obj).g.i(kztVarF.c, strG);
            ((whg) obj2).d();
            szp.u(new jlh(obj, kztVarF, 13, (byte[]) null));
            return true;
        }
        if (!str.equals("com.google.android.apps.auto.components.apphost.messaging.ACTION_MARK_AS_READ")) {
            return false;
        }
        kzt kztVarF2 = f(intent);
        Object obj3 = kztVarF2.d;
        Object obj4 = kztVarF2.b;
        Object obj5 = kztVarF2.c;
        obj5.getClass();
        ((jwq) obj3).g.b(gnk.I, new fzl(obj5, 20));
        ((whg) obj4).c();
        szp.u(new jlh(obj3, kztVarF2, 14, (byte[]) null));
        return true;
    }
}
