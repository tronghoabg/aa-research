package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public final class aiik {
    private aiik() {
    }

    public static final Object a(afco afcoVar, afeg afegVar) throws Throwable {
        aius aiusVarA;
        afco afcoVarB;
        long jL;
        if (((afcl) afcoVar.get(afcl.k)) == null) {
            ThreadLocal threadLocal = aiwj.a;
            aiusVarA = aiwj.a();
            afcoVarB = aits.b(aivb.a, afcoVar.plus(aiusVarA));
        } else {
            ThreadLocal threadLocal2 = aiwj.a;
            aiusVarA = (aius) aiwj.a.get();
            afcoVarB = aits.b(aivb.a, afcoVar);
        }
        aitb aitbVar = new aitb(afcoVarB, Thread.currentThread(), aiusVarA);
        ahno.a(1, afegVar, aitbVar, aitbVar);
        aius aiusVar = aitbVar.c;
        if (aiusVar != null) {
            aiusVar.o(false);
        }
        while (true) {
            if (aiusVar != null) {
                try {
                    jL = aiusVar.l();
                } catch (Throwable th) {
                    aius aiusVar2 = aitbVar.c;
                    if (aiusVar2 != null) {
                        aiusVar2.m(false);
                    }
                    throw th;
                }
            } else {
                jL = Long.MAX_VALUE;
            }
            if (aitbVar.x()) {
                break;
            }
            LockSupport.parkNanos(aitbVar, jL);
            if (Thread.interrupted()) {
                aitbVar.L(new InterruptedException());
            }
        }
        aius aiusVar3 = aitbVar.c;
        if (aiusVar3 != null) {
            aiusVar3.m(false);
        }
        Object objB = aivp.b(aitbVar.hN());
        aito aitoVar = objB instanceof aito ? (aito) objB : null;
        if (aitoVar == null) {
            return objB;
        }
        throw aitoVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aigl replaceArgumentsOfUpperBound(defpackage.aigl r15, defpackage.aiiy r16, java.util.Set<? extends defpackage.agee> r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiik.replaceArgumentsOfUpperBound(aigl, aiiy, java.util.Set, boolean):aigl");
    }

    public /* synthetic */ aiik(afeu afeuVar) {
        this();
    }
}
