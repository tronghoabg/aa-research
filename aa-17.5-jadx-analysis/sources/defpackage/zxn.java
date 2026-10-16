package defpackage;

import android.util.Log;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zxn extends zsm {
    private final acbe b;
    private final zxs c;
    private final zys d;
    private final String e;
    private final zwj f;
    private acbg g = null;

    public zxn(acbe acbeVar, zxs zxsVar, zys zysVar, String str, zwj zwjVar) {
        this.b = acbeVar;
        this.c = zxsVar;
        this.d = zysVar;
        this.e = str;
        this.f = zwjVar;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final void a() throws Throwable {
        g("onComplete");
        this.c.c(this.g, true);
        this.g = null;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final void b() throws Throwable {
        g("onPermanentFailure");
        this.c.c(this.g, false);
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxn)) {
            return false;
        }
        zxn zxnVar = (zxn) obj;
        return a.C(this.b, zxnVar.b) && a.C(this.g, zxnVar.g);
    }

    @Override // defpackage.zsr
    public final int h() {
        return 147;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.g});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
        acbg acbgVar;
        if (adeb.c()) {
            abnp abnpVarN = acbg.a.n();
            abnp abnpVarN2 = acbf.a.n();
            acbe acbeVar = this.b;
            abnpVarN2.t();
            acbf acbfVar = (acbf) abnpVarN2.b;
            acbfVar.c = acbeVar.k;
            acbfVar.b |= 1;
            if (acbeVar.equals(acbe.PREMIUM_MAP_LOAD)) {
                String str = this.e;
                if (!ysi.R(str)) {
                    abnpVarN.t();
                    acbg acbgVar2 = (acbg) abnpVarN.b;
                    str.getClass();
                    acbgVar2.b |= 2;
                    acbgVar2.d = str;
                    abnpVarN2.t();
                    acbf acbfVar2 = (acbf) abnpVarN2.b;
                    str.getClass();
                    acbfVar2.b |= 16;
                    acbfVar2.d = str;
                }
            }
            zwj zwjVar = this.f;
            if (zwjVar != null) {
                String strA = zwjVar.a();
                abnpVarN2.t();
                acbf acbfVar3 = (acbf) abnpVarN2.b;
                strA.getClass();
                acbfVar3.b |= 32;
                acbfVar3.e = strA;
            }
            abnp abnpVarN3 = aahs.a.n();
            abnpVarN3.S(vjj.b);
            abms abmsVarF = ((aahs) abnpVarN3.q()).f();
            abnpVarN.t();
            acbg acbgVar3 = (acbg) abnpVarN.b;
            acbgVar3.b |= 4;
            acbgVar3.e = abmsVarF;
            abnpVarN.t();
            acbg acbgVar4 = (acbg) abnpVarN.b;
            acbf acbfVar4 = (acbf) abnpVarN2.q();
            acbfVar4.getClass();
            acbgVar4.b();
            acbgVar4.c.add(acbfVar4);
            acbgVar = (acbg) abnpVarN.q();
        } else {
            zxs zxsVar = this.c;
            acbe acbeVar2 = this.b;
            acbg acbgVarA = zxsVar.a();
            if (acbgVarA == null) {
                acbgVar = null;
            } else {
                abnp abnpVarN4 = acbg.a.n();
                for (int i = 0; i < acbgVarA.c.size(); i++) {
                    acbf acbfVar5 = (acbf) acbgVarA.c.get(i);
                    acbe acbeVarB = acbe.b(acbfVar5.c);
                    if (acbeVarB == null) {
                        acbeVarB = acbe.UNKNOWN_EVENT_TYPE;
                    }
                    if (acbeVarB == acbeVar2) {
                        abnpVarN4.an(acbfVar5);
                        if (acbeVar2 == acbe.PREMIUM_MAP_LOAD) {
                            String str2 = acbfVar5.d;
                            abnpVarN4.t();
                            acbg acbgVar5 = (acbg) abnpVarN4.b;
                            str2.getClass();
                            acbgVar5.b |= 2;
                            acbgVar5.d = str2;
                        }
                    }
                }
                abnp abnpVarN5 = aahs.a.n();
                abnpVarN5.S(vjj.b);
                abms abmsVarF2 = ((aahs) abnpVarN5.q()).f();
                abnpVarN4.t();
                acbg acbgVar6 = (acbg) abnpVarN4.b;
                acbgVar6.b |= 4;
                acbgVar6.e = abmsVarF2;
                acbgVar = (acbg) abnpVarN4.q();
            }
        }
        this.g = acbgVar;
        if (acbgVar == null || acbgVar.c.size() == 0) {
            return;
        }
        String str3 = zxs.a;
        if (zrn.e(str3, 4)) {
            Log.i(str3, String.format("writeRequestData(%s,%s)", this.b, acbgVar));
        }
        zrp.b(dataOutputStream, acbgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    @Override // defpackage.zsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.io.DataInputStream r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxn.j(java.io.DataInputStream):void");
    }

    @Override // defpackage.zsm
    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("requestEventType", this.b);
        zsaVarA.b("requestQuotaEvents", this.g);
        return zsaVarA.toString();
    }
}
