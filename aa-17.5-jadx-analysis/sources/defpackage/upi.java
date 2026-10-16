package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public final class upi implements pwq {
    public final /* synthetic */ upm a;
    private final String b;
    private final upy c;

    public upi(upm upmVar, String str, upy upyVar) {
        this.a = upmVar;
        this.b = str;
        this.c = upyVar;
    }

    @Override // defpackage.pwq
    public final void a(rjg rjgVar, pwu pwuVar) {
        ynz ynzVar = (ynz) ((ynz) upm.a.g()).ai(9586);
        int i = pwuVar.q.t;
        ynzVar.R("Resource failed to fetch directly over HTTP with URL [%s], status [%d], description [%s]", this.b, Integer.valueOf(i), pwuVar.r);
        boolean zEquals = Objects.equals(pwuVar, pwu.b);
        upy upyVar = this.c;
        if (zEquals) {
            upyVar.k(2);
        } else {
            upyVar.k(1);
        }
        upy upyVar2 = this.c;
        upyVar2.g(false);
        upyVar2.f();
        qaz qazVar = (qaz) rjgVar.a;
        ((Duration) qazVar.b).toMillis();
        ((Duration) qazVar.a).toMillis();
        ackk ackkVar = this.a.c;
        int i2 = pwuVar.a().A;
    }

    @Override // defpackage.pwq
    public final /* synthetic */ void b(rjg rjgVar, Object obj) {
        pvi pviVar = (pvi) obj;
        yop yopVarF = upm.a.f();
        String str = this.b;
        ((ynz) ((ynz) yopVarF).ai((char) 9587)).y("Resource successfully fetched directly over HTTP with URL [%s]", str);
        abnp abnpVarN = achw.a.n();
        abnpVarN.t();
        achw achwVar = (achw) abnpVarN.b;
        achwVar.b |= 4;
        achwVar.e = 0L;
        abnpVarN.t();
        achw achwVar2 = (achw) abnpVarN.b;
        achwVar2.b |= 2;
        achwVar2.d = 200;
        abnpVarN.t();
        achw achwVar3 = (achw) abnpVarN.b;
        str.getClass();
        achwVar3.b |= 1;
        achwVar3.c = str;
        abms abmsVar = pviVar.c;
        abnpVarN.t();
        achw achwVar4 = (achw) abnpVarN.b;
        abmsVar.getClass();
        achwVar4.b |= 8;
        achwVar4.f = abmsVar;
        String str2 = pviVar.d;
        if ((pviVar.b & 2) != 0 && !str2.isEmpty()) {
            List listI = xxx.c(';').i(str2);
            if (!listI.isEmpty()) {
                String str3 = (String) listI.get(0);
                abnpVarN.t();
                achw achwVar5 = (achw) abnpVarN.b;
                str3.getClass();
                achwVar5.b |= 16;
                achwVar5.g = str3;
            }
        }
        achw achwVar6 = (achw) abnpVarN.q();
        upy upyVar = this.c;
        synchronized (upyVar) {
            boolean zN = upyVar.n(achwVar6);
            upm upmVar = this.a;
            if (upmVar.m != null && zN && upyVar.b) {
                upmVar.g.execute(new unj(this, achwVar6, 4));
            }
            upyVar.g(false);
            upyVar.f();
        }
        qaz qazVar = (qaz) rjgVar.a;
        ((Duration) qazVar.b).toMillis();
        ((Duration) qazVar.a).toMillis();
        ackk ackkVar = this.a.c;
    }
}
