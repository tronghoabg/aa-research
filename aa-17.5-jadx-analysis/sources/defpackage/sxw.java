package defpackage;

import android.text.TextUtils;
import j$.time.Instant;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class sxw {
    public static final ygr a = ygr.p(qnj.STARTUP, qnj.TELEDOCTOR);
    public final String b;
    public final qnl c;
    public final xxh d;
    public final sxt e;
    public boolean f;
    private final ygr g;
    private final Random h;
    private String i;

    public sxw(String str, qnl qnlVar, qnz qnzVar, sxt sxtVar, ygr ygrVar) {
        this.f = true;
        woy.aa(true ^ TextUtils.isEmpty(str), "Given String is empty or null");
        this.b = str;
        qnlVar.getClass();
        this.c = qnlVar;
        this.d = xxh.g(qnzVar);
        this.e = sxtVar;
        ygrVar.getClass();
        this.g = ygrVar;
        this.f = false;
        this.h = new Random();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(sxy sxyVar) {
        sym symVar;
        long j;
        sxx sxxVar = new sxx(sxyVar);
        sxxVar.g = this;
        sxy sxyVarA = sxxVar.a();
        if (this.g.contains(sxyVarA.a)) {
            String str = this.b;
            int i = 0;
            while (true) {
                if (i >= sxyVarA.b().size()) {
                    symVar = null;
                    break;
                }
                symVar = (sym) sxyVarA.b().get(i);
                if (symVar.d.equals(str)) {
                    break;
                }
                i++;
            }
            if (symVar == null) {
                j = 0;
            } else {
                syn synVar = symVar.e;
                if (synVar == null) {
                    synVar = syn.a;
                }
                j = synVar.d;
            }
            if (j <= Instant.now().toEpochMilli()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:103|25|(3:115|26|(1:28))|37|111|38|39|101|42|(2:44|(3:46|47|(1:(2:50|(2:52|(1:55))(1:56))(1:58)))(1:57))(0)|59|(1:64)|(2:107|66)|70|(1:72)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        r0 = new defpackage.sxx(r2);
        r0.d(r21, 6);
        r0 = defpackage.xxh.h(r0.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0116, code lost:
    
        r7 = 6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:42:0x0117, B:44:0x011e, B:46:0x0134), top: B:101:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d A[PHI: r2
  0x014d: PHI (r2v4 sxy) = (r2v3 sxy), (r2v6 sxy) binds: [B:43:0x011c, B:49:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9 A[Catch: all -> 0x019f, TryCatch #10 {all -> 0x019f, blocks: (B:59:0x014e, B:64:0x015e, B:83:0x01aa, B:88:0x01cc, B:87:0x01b9), top: B:117:0x00ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sxv b(defpackage.sxy r19, defpackage.rjg r20, defpackage.sxt r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxw.b(sxy, rjg, sxt):sxv");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final sxy c(sxy sxyVar, sxt sxtVar, rjg rjgVar) {
        long millis;
        long epochMilli = Instant.now().toEpochMilli();
        qnl qnlVar = sxtVar.a;
        int i = sxyVar.a(qnlVar).b;
        int i2 = 5;
        if (i == 5) {
            millis = TimeUnit.SECONDS.toMillis(sxtVar.b);
        } else {
            millis = 3600000;
        }
        long j = millis + epochMilli;
        abnp abnpVarN = sym.a.n();
        String str = this.b;
        abnpVarN.t();
        sym symVar = (sym) abnpVarN.b;
        str.getClass();
        symVar.d = str;
        abnpVarN.t();
        ((sym) abnpVarN.b).c = qnlVar.a();
        abnp abnpVarN2 = syn.a.n();
        abnpVarN2.t();
        syn synVar = (syn) abnpVarN2.b;
        synVar.e = aclh.e(i);
        synVar.b |= 4;
        abnpVarN2.t();
        syn synVar2 = (syn) abnpVarN2.b;
        synVar2.b |= 1;
        synVar2.c = epochMilli;
        abnpVarN2.t();
        syn synVar3 = (syn) abnpVarN2.b;
        synVar3.b |= 2;
        synVar3.d = j;
        syn synVar4 = (syn) abnpVarN2.q();
        abnpVarN.t();
        sym symVar2 = (sym) abnpVarN.b;
        synVar4.getClass();
        symVar2.e = synVar4;
        symVar2.b |= 1;
        sym symVar3 = (sym) abnpVarN.q();
        try {
            ((zeu) ((wgx) rjgVar.a).a(new rgf(symVar3, i2), rjgVar.b)).s();
            sxx sxxVar = new sxx(sxyVar);
            int i3 = yfq.d;
            yfl yflVar = new yfl(4);
            yflVar.k(sxxVar.e);
            yflVar.i(symVar3);
            sxxVar.e = yflVar.g();
            return sxxVar.a();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Update of recent fix data failed", e);
        }
    }
}
