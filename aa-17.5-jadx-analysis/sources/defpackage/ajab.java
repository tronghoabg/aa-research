package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ajab extends ajah implements aiye, ajay, aizz, aizk {
    private final aisx a;
    private int b;

    public ajab(Object obj) {
        this.a = new aisx(obj, aisy.a);
    }

    private final boolean f(Object obj, Object obj2) {
        int i;
        ajaj[] ajajVarArr;
        ajcz ajczVar;
        synchronized (this) {
            aisx aisxVar = this.a;
            Object obj3 = aisxVar.a;
            if (obj != null && !affa.f(obj3, obj)) {
                return false;
            }
            if (affa.f(obj3, obj2)) {
                return true;
            }
            aisxVar.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) != 0) {
                this.b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.b = i3;
            ajaj[] ajajVarArr2 = this.d;
            while (true) {
                ajad[] ajadVarArr = (ajad[]) ajajVarArr2;
                if (ajadVarArr != null) {
                    for (ajad ajadVar : ajadVarArr) {
                        if (ajadVar != null) {
                            while (true) {
                                AtomicReference atomicReference = ajadVar.a;
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (ajczVar = ajac.b)) {
                                    ajcz ajczVar2 = ajac.a;
                                    if (obj4 != ajczVar2) {
                                        if (a.h(atomicReference, obj4, ajczVar2)) {
                                            ((aitg) obj4).w(afak.a);
                                            break;
                                        }
                                    } else {
                                        if (a.h(atomicReference, obj4, ajczVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.b;
                    if (i == i3) {
                        this.b = i3 + 1;
                        return true;
                    }
                    ajajVarArr = this.d;
                }
                ajajVarArr2 = ajajVarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.aizk, defpackage.aiyl
    public final Object a(Object obj, afck afckVar) {
        d(obj);
        return afak.a;
    }

    @Override // defpackage.aizz
    public final Object b() {
        ajcz ajczVar = ajbb.a;
        Object obj = this.a.a;
        if (obj == ajczVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.aizk
    public final boolean c(Object obj) {
        d(obj);
        return true;
    }

    public final void d(Object obj) {
        if (obj == null) {
            obj = ajbb.a;
        }
        f(null, obj);
    }

    public final boolean e(Object obj, Object obj2) {
        if (obj == null) {
            obj = ajbb.a;
        }
        if (obj2 == null) {
            obj2 = ajbb.a;
        }
        return f(obj, obj2);
    }

    @Override // defpackage.ajay
    public final aiyk hQ(afco afcoVar, int i, int i2) {
        return ajac.b(this, afcoVar, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        if (defpackage.affa.f(r13, r14) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e3: INVOKE (r12v0 ?? I:ajah), (r7 I:ajaj) VIRTUAL call: ajah.o(ajaj):void A[MD:(ajaj):void (m)] (LINE:228), block:B:56:0x00e3 */
    /* JADX WARN: Path cross not found for [B:30:0x0072, B:45:0x00ac], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:34:0x007d, B:36:0x0083], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:34:0x007d], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:43:0x009b], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:45:0x00ac, B:30:0x0072], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00d9, B:55:0x00e2), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00d9, B:55:0x00e2), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00d9, B:55:0x00e2), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00aa -> B:30:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d7 -> B:30:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.aiyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hR(defpackage.aiyl r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajab.hR(aiyl, afck):java.lang.Object");
    }

    @Override // defpackage.ajah
    public final /* synthetic */ ajaj i() {
        return new ajad();
    }

    @Override // defpackage.ajah
    public final /* bridge */ /* synthetic */ ajaj[] m() {
        return new ajad[2];
    }
}
