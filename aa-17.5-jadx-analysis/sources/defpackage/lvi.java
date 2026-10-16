package defpackage;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lvi extends lvg {
    public static final /* synthetic */ int r = 0;
    private static final yph s = yph.c("GH.ImConversation");
    public final MessagingInfo m;
    public final int n;
    public final String o;
    public final StatusBarNotification p;
    public final int q;
    private final List t;

    public lvi(lvh lvhVar) {
        super(lvhVar);
        ArrayList arrayList = new ArrayList();
        this.t = arrayList;
        woy.N(lvhVar.p <= lvhVar.l.e.size());
        this.o = lvhVar.o;
        MessagingInfo messagingInfo = lvhVar.l;
        this.m = messagingInfo;
        this.n = lvhVar.p;
        this.q = lvhVar.m;
        jrk.a(mki.a.c, lvhVar.o).getClass();
        this.p = lvhVar.n;
        List list = lvhVar.q;
        if (list != null) {
            arrayList.addAll(list);
        }
        g();
        boolean z = messagingInfo.m;
        Bundle bundle = this.b;
        bundle.getClass();
        bundle.putBoolean("group_conversation", z);
    }

    @Override // defpackage.lvg
    public final int a() {
        return this.m.e.size() - this.n;
    }

    @Override // defpackage.lvg
    public final long b() {
        return ((qjl) this.m.e.get(r2.size() - 1)).d;
    }

    @Override // defpackage.lvg
    public final lvg c(int i) {
        int iA = a();
        if (i > iA) {
            ((ype) ((ype) s.h()).ai(4292)).B("We are trying to read %d messages when we only have %d.", i, iA);
            String str = this.o;
            lxr.e();
            lxr.i(yzz.MESSAGING, yzy.nr, str);
            i = iA;
        }
        if (a() == 0) {
            ((ype) s.l().ai((char) 4291)).u("createWithMessagesRead. Conversation already read.");
            return this;
        }
        oit.a();
        long epochMilli = Instant.now().toEpochMilli();
        lvh lvhVar = new lvh();
        lvhVar.c(this);
        qjk qjkVar = new qjk();
        qjkVar.b(this.m);
        qjkVar.d = epochMilli;
        lvhVar.l = new MessagingInfo(qjkVar);
        lvhVar.p = this.n + i;
        return new lvi(lvhVar);
    }

    @Override // defpackage.lvg
    public final yfq d() {
        return yfq.o(this.m.e);
    }

    @Override // defpackage.lvg
    public final String e() {
        return this.m.f;
    }

    @Override // defpackage.lvg
    public final String f() {
        return this.o;
    }

    @Override // defpackage.lvg
    public final boolean l(lvg lvgVar) {
        if (lvgVar == null || !(lvgVar instanceof lvi)) {
            return false;
        }
        lvi lviVar = (lvi) lvgVar;
        MessagingInfo messagingInfo = lviVar.m;
        MessagingInfo messagingInfo2 = this.m;
        if (messagingInfo2.e.size() != messagingInfo.e.size()) {
            return false;
        }
        if (this.t.size() == lviVar.t.size()) {
            for (int i = 0; i < messagingInfo2.e.size(); i++) {
                qjl qjlVar = (qjl) messagingInfo2.e.get(i);
                qjl qjlVar2 = (qjl) messagingInfo.e.get(i);
                if (!qjlVar.c.equals(qjlVar2.c) || !qjlVar.a.equals(qjlVar2.a) || qjlVar.d != qjlVar2.d || !Objects.equals(qjlVar.f, qjlVar2.f)) {
                    return false;
                }
            }
            if (a() == lviVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final List q() {
        return yfq.o(this.t);
    }

    public final synchronized void r() {
        this.t.clear();
    }

    public final synchronized void s(List list) {
        List list2 = this.t;
        list2.clear();
        list2.addAll(list);
    }
}
