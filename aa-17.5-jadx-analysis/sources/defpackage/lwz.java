package defpackage;

import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lwz extends lxb {
    private static final yph f = yph.c("GH.ImStreamItem");
    public final MessagingInfo a;
    public final int b;
    public final StatusBarNotification c;
    private final List g;

    public lwz(lwy lwyVar) {
        super(lwyVar);
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        woy.N(lwyVar.c <= lwyVar.a.e.size());
        MessagingInfo messagingInfo = lwyVar.a;
        this.a = messagingInfo;
        this.b = lwyVar.c;
        jrk.a(mki.a.c, lwyVar.i).getClass();
        this.c = lwyVar.b;
        List list = lwyVar.d;
        if (list != null) {
            arrayList.addAll(list);
        }
        q();
        ((lxb) this).d.putBoolean("group_conversation", messagingInfo.m);
    }

    @Override // defpackage.lue
    public final int a() {
        return this.a.e.size() - this.b;
    }

    @Override // defpackage.lue
    public final long b() {
        return ((qjl) this.a.e.get(r2.size() - 1)).d;
    }

    @Override // defpackage.lue
    public final lue d(int i) {
        int iA = a();
        if (i > iA) {
            ((ype) ((ype) f.h()).ai(4423)).B("We are trying to read %d messages when we only have %d.", i, iA);
            String str = this.l;
            lxr.e();
            lxr.i(yzz.MESSAGING, yzy.nr, str);
            i = iA;
        }
        if (a() == 0) {
            ((ype) f.l().ai((char) 4422)).u("createWithMessagesRead. Conversation already read.");
            return this;
        }
        oit.a();
        long epochMilli = Instant.now().toEpochMilli();
        lwy lwyVar = new lwy();
        lwyVar.a(this);
        qjk qjkVar = new qjk();
        qjkVar.b(this.a);
        qjkVar.d = epochMilli;
        lwyVar.a = new MessagingInfo(qjkVar);
        lwyVar.m = epochMilli;
        lwyVar.c = this.b + i;
        return new lwz(lwyVar);
    }

    @Override // defpackage.lue
    public final yfq e() {
        return yfq.o(this.a.e);
    }

    @Override // defpackage.lue
    public final String f() {
        return this.a.f;
    }

    @Override // defpackage.lue
    public final boolean h(moa moaVar) {
        if (moaVar == null || !(moaVar instanceof lwz)) {
            return false;
        }
        lwz lwzVar = (lwz) moaVar;
        MessagingInfo messagingInfo = lwzVar.a;
        MessagingInfo messagingInfo2 = this.a;
        if (messagingInfo2.e.size() == messagingInfo.e.size()) {
            for (int i = 0; i < messagingInfo2.e.size(); i++) {
                qjl qjlVar = (qjl) messagingInfo2.e.get(i);
                qjl qjlVar2 = (qjl) messagingInfo.e.get(i);
                if (!qjlVar.c.equals(qjlVar2.c) || !qjlVar.a.equals(qjlVar2.a) || qjlVar.d != qjlVar2.d || !Objects.equals(qjlVar.f, qjlVar2.f)) {
                    return false;
                }
            }
            if (a() == lwzVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final List n() {
        return yfq.o(this.g);
    }

    public final synchronized void o() {
        this.g.clear();
    }

    public final synchronized void p(List list) {
        List list2 = this.g;
        list2.clear();
        list2.addAll(list);
    }
}
