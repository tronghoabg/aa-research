package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class srp {
    public static volatile xyc a;
    private static final xyc b;
    private static final rju c;
    private static final oct d;

    static {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        new HashMap();
        new HashMap();
        if (!hashSet.isEmpty()) {
            int i = xtx.a;
            throw null;
        }
        rju rjuVar = new rju(hashSet2, (byte[]) null);
        c = rjuVar;
        xyf xyfVar = new xyf(rjuVar);
        b = xyfVar;
        spn.c("TracingHelper");
        yip yipVar = new yip();
        yipVar.h();
        d = new oct(yipVar);
        a = xyfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xue a(srl srlVar, boolean z) {
        yiy yiyVarB;
        Object objC;
        abnr abnrVar = (abnr) ajey.a.n();
        if (srlVar != null) {
            abnrVar.bc(srl.b, srlVar);
        }
        Object obj = (ajey) abnrVar.q();
        if (adda.a.gu().a()) {
            oct octVar = d;
            while (true) {
                Object obj2 = octVar.a;
                if (obj == null) {
                    yiyVarB = null;
                } else {
                    ykc ykcVar = (ykc) obj2;
                    int iA = ykcVar.a(obj);
                    yiyVarB = ykcVar.c(iA).b(obj, iA);
                }
                if (yiyVarB != null && (objC = yiyVarB.c()) != null) {
                    obj = objC;
                    break;
                }
                if (((yio) ((ykc) obj2).putIfAbsent(obj, yio.a)) == null) {
                    break;
                }
            }
        }
        sro sroVar = new sro(z);
        xuc xucVarB = xue.b();
        xucVarB.a(xva.a, sroVar);
        return ((xue) xucVarB).e();
    }
}
