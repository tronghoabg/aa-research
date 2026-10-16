package defpackage;

import android.telephony.SmsMessage;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class lxd extends lxb {
    private static final yph t = yph.c("GH.SmsStreamItem");
    public final List a;
    public final List b;
    public Long c;
    public final String f;
    public final String g;
    private final long u;

    public lxd(lxc lxcVar) {
        super(lxcVar);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.f = lxcVar.f;
        this.g = lxcVar.g;
        this.u = lxcVar.d;
        List list = lxcVar.a;
        if (list != null) {
            arrayList2.addAll(list);
        }
        this.c = lxcVar.c;
        List list2 = lxcVar.b;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        q();
    }

    private final void n(List list, yfl yflVar) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            long timestampMillis = 0;
            for (SmsMessage smsMessage : (SmsMessage[]) list.get(i)) {
                timestampMillis = smsMessage.getTimestampMillis();
                sb.append(smsMessage.getDisplayMessageBody());
            }
            String str = this.f;
            yflVar.i(new qjl(str, str, sb.toString(), timestampMillis));
        }
    }

    @Override // defpackage.lue
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.lue
    public final long b() {
        return this.u;
    }

    @Override // defpackage.lue
    public final lue d(int i) {
        if (a() <= 0) {
            ((ype) t.l().ai((char) 4429)).u("createWithMessagesRead. Conversation already read.");
            oit.a();
            this.c = Long.valueOf(Instant.now().toEpochMilli());
            return this;
        }
        List list = this.b;
        if (i > list.size()) {
            ((ype) ((ype) t.h()).ai((char) 4428)).u("markMessagesRead. numMessages greater than unread messages.");
            i = list.size();
        }
        lxc lxcVar = new lxc();
        lxcVar.b(this);
        oit.a();
        lxcVar.m = Instant.now().toEpochMilli();
        lxcVar.a = list.subList(i, list.size());
        lxcVar.b = list.subList(0, i);
        oit.a();
        lxcVar.c = Long.valueOf(Instant.now().toEpochMilli());
        lxcVar.d = this.u;
        lxcVar.i = this.l;
        lxcVar.f = this.f;
        lxcVar.g = this.g;
        return new lxd(lxcVar);
    }

    @Override // defpackage.lue
    public final yfq e() {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        n(this.a, yflVar);
        n(this.b, yflVar);
        return yflVar.g();
    }

    @Override // defpackage.lue
    public final String f() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lue
    public final boolean h(moa moaVar) {
        if (!(moaVar instanceof lxd)) {
            return false;
        }
        yfq yfqVarE = ((lxd) moaVar).e();
        yfq yfqVarE2 = e();
        int i = ((yls) yfqVarE2).c;
        if (i != ((yls) yfqVarE).c) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            qjl qjlVar = (qjl) yfqVarE2.get(i2);
            qjl qjlVar2 = (qjl) yfqVarE.get(i2);
            if (!qjlVar.c.equals(qjlVar2.c) || !qjlVar.a.equals(qjlVar2.a) || qjlVar.d != qjlVar2.d) {
                return false;
            }
        }
        return true;
    }
}
