package defpackage;

import android.service.notification.StatusBarNotification;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.messaging.model.ConversationItem;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes2.dex */
public final class lwo {
    public static final lwn a = new lwn();
    public static final afgl b = new lcj(mki.b, 11);
    public static final yph c = yph.c("GH.SmartActionsManager");

    public static final lwo a() {
        return a.a();
    }

    public final boolean b(ConversationItem conversationItem) {
        duk sender;
        List<CarMessage> messages = conversationItem.getMessages();
        messages.getClass();
        CarMessage carMessage = (CarMessage) woy.bL(messages);
        return (carMessage == null || (sender = carMessage.getSender()) == null || affa.f(sender, conversationItem.getSelf()) || !c(carMessage.getReceivedTimeEpochMillis())) ? false : true;
    }

    public final boolean c(long j) {
        return Duration.between(Instant.ofEpochMilli(j), Instant.now()).compareTo(Duration.ofHours(actj.c())) < 0;
    }

    public final eqj d(MessagingInfo messagingInfo, int i) {
        eqm jrdVar;
        messagingInfo.getClass();
        if (!jre.f()) {
            return eqy.b(kfl.h().N(woy.bg(messagingInfo), i), new lti(14));
        }
        StatusBarNotification statusBarNotification = messagingInfo.a;
        if (statusBarNotification == null) {
            c.l().u("Notification not found");
            afbe afbeVar = afbe.a;
            afco afcoVar = tby.a;
            return new eqm(afbeVar);
        }
        int id = statusBarNotification.getId();
        String packageName = statusBarNotification.getPackageName();
        if (packageName == null) {
            c.l().u("Package name not found");
            afbe afbeVar2 = afbe.a;
            afco afcoVar2 = tby.a;
            return new eqm(afbeVar2);
        }
        c.l().R("Fetching insights for %s %d at %d", packageName, Integer.valueOf(id), Long.valueOf(statusBarNotification.getPostTime()));
        jre jreVarA = jre.a();
        long postTime = statusBarNotification.getPostTime();
        if (lbh.d().h()) {
            ((ype) ((ype) jre.a.h()).ai(2669)).K("Returning empty insight list after stop for %s %d", packageName, id);
            int i2 = yfq.d;
            yfq yfqVar = yls.a;
            afco afcoVar3 = tby.a;
            jrdVar = new eqm(yfqVar);
        } else {
            jra jraVar = new jra(packageName, id);
            yph yphVar = jre.a;
            ((ype) yphVar.l().ai(2666)).L("Searching for insights for %s with minPostTime %d", jraVar, postTime);
            jrb jrbVar = (jrb) jreVarA.d.get(jraVar);
            if (jrbVar == null || jrbVar.a < postTime) {
                ((ype) yphVar.l().ai((char) 2667)).y("Existing insights for notification %s not found or stale. HUN may be delayed.", jraVar);
                jrdVar = new jrd(jreVarA, jraVar, postTime);
            } else {
                ((ype) yphVar.l().ai((char) 2668)).y("Found existing insights for notification %s", jraVar);
                List list = jrbVar.b;
                afco afcoVar4 = tby.a;
                jrdVar = new eqm(list);
            }
        }
        return eqy.b(jrdVar, new aia(packageName, id, 17));
    }
}
