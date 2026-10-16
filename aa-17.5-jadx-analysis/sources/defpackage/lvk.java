package defpackage;

import android.telephony.SmsMessage;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lvk extends lvg {
    private static final yph r = yph.c("GH.SmsConversation");
    public final List m;
    public final List n;
    public Long o;
    public final String p;
    public final String q;
    private final long s;

    public lvk(lvj lvjVar) {
        super(lvjVar);
        ArrayList arrayList = new ArrayList();
        this.m = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.n = arrayList2;
        this.p = lvjVar.p;
        this.q = lvjVar.q;
        this.s = lvjVar.o;
        List list = lvjVar.l;
        if (list != null) {
            arrayList2.addAll(list);
        }
        this.o = lvjVar.n;
        List list2 = lvjVar.m;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        g();
    }

    private final void q(List list, yfl yflVar) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            long timestampMillis = 0;
            for (SmsMessage smsMessage : (SmsMessage[]) list.get(i)) {
                timestampMillis = smsMessage.getTimestampMillis();
                sb.append(smsMessage.getDisplayMessageBody());
            }
            String str = this.p;
            yflVar.i(new qjl(str, str, sb.toString(), timestampMillis));
        }
    }

    @Override // defpackage.lvg
    public final int a() {
        return this.n.size();
    }

    @Override // defpackage.lvg
    public final long b() {
        return this.s;
    }

    @Override // defpackage.lvg
    public final lvg c(int i) {
        if (a() <= 0) {
            ((ype) r.l().ai((char) 4294)).u("createWithMessagesRead. Conversation already read.");
            oit.a();
            this.o = Long.valueOf(Instant.now().toEpochMilli());
            return this;
        }
        List list = this.n;
        if (i > list.size()) {
            ((ype) ((ype) r.h()).ai((char) 4293)).u("markMessagesRead. numMessages greater than unread messages.");
            i = list.size();
        }
        lvj lvjVar = new lvj();
        lvjVar.b(this);
        oit.a();
        Instant.now().toEpochMilli();
        lvjVar.l = list.subList(i, list.size());
        lvjVar.m = list.subList(0, i);
        oit.a();
        lvjVar.n = Long.valueOf(Instant.now().toEpochMilli());
        lvjVar.o = this.s;
        lvjVar.g = this.f;
        lvjVar.p = this.p;
        lvjVar.q = this.q;
        return new lvk(lvjVar);
    }

    @Override // defpackage.lvg
    public final yfq d() {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        q(this.m, yflVar);
        q(this.n, yflVar);
        return yflVar.g();
    }

    @Override // defpackage.lvg
    public final String e() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lvg
    public final boolean l(lvg lvgVar) {
        if (!(lvgVar instanceof lvk)) {
            return false;
        }
        yfq yfqVarD = ((lvk) lvgVar).d();
        yfq yfqVarD2 = d();
        int i = ((yls) yfqVarD2).c;
        if (i != ((yls) yfqVarD).c) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            qjl qjlVar = (qjl) yfqVarD2.get(i2);
            qjl qjlVar2 = (qjl) yfqVarD.get(i2);
            if (!qjlVar.c.equals(qjlVar2.c) || !qjlVar.a.equals(qjlVar2.a) || qjlVar.d != qjlVar2.d) {
                return false;
            }
        }
        return true;
    }
}
