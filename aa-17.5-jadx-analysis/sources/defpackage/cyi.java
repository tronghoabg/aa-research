package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cyi {
    public final Object a;
    public Object b;

    public cyi(byte[] bArr) {
        this.a = new ArrayList();
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.b = fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cfx] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a(cxb cxbVar) {
        if (cxbVar.C > 0) {
            if (cxbVar.av() == 5 && !cxbVar.ai() && !cxbVar.al() && !cxbVar.D && cxbVar.an()) {
                cxx cxxVar = cxbVar.v;
                if ((cxxVar.a() & 256) != 0) {
                    for (cfx cfxVar = cxxVar.f; cfxVar != null; cfxVar = cfxVar.u) {
                        if ((cfxVar.r & 256) != 0) {
                            cwe cweVarN = cfxVar;
                            ?? bywVar = 0;
                            while (cweVarN != 0) {
                                if (cweVarN instanceof cwl) {
                                    cwl cwlVar = (cwl) cweVarN;
                                    cwlVar.es(bzi.r(cwlVar, 256));
                                } else if ((cweVarN.r & 256) != 0 && (cweVarN instanceof cwe)) {
                                    cfx cfxVar2 = cweVarN.C;
                                    int i = 0;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                    while (cfxVar2 != null) {
                                        if ((cfxVar2.r & 256) != 0) {
                                            i++;
                                            bywVar = bywVar;
                                            if (i == 1) {
                                                cweVarN = cfxVar2;
                                            } else {
                                                if (bywVar == 0) {
                                                    bywVar = new byw(new cfx[16]);
                                                }
                                                if (cweVarN != 0) {
                                                    bywVar.n(cweVarN);
                                                }
                                                bywVar.n(cfxVar2);
                                                cweVarN = 0;
                                            }
                                        }
                                        cfxVar2 = cfxVar2.u;
                                        cweVarN = cweVarN;
                                        bywVar = bywVar;
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cweVarN = bzi.n(bywVar);
                            }
                        }
                        if ((cfxVar.s & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            cxbVar.B = false;
            byw bywVarK = cxbVar.k();
            Object[] objArr = bywVarK.a;
            int i2 = bywVarK.b;
            for (int i3 = 0; i3 < i2; i3++) {
                a((cxb) objArr[i3]);
            }
        }
    }

    public final void b(cxb cxbVar) {
        if (cxbVar.C > 0) {
            ((byw) this.a).n(cxbVar);
            cxbVar.B = true;
        }
    }

    public final boolean c() {
        return ((byw) this.a).b != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void d(Object obj, float f) {
        ?? r0 = this.a;
        r0.add(obj);
        if (((float[]) this.b).length < r0.size()) {
            float[] fArrCopyOf = Arrays.copyOf((float[]) this.b, r0.size() + 2);
            fArrCopyOf.getClass();
            this.b = fArrCopyOf;
        }
        ((float[]) this.b)[r0.size() - 1] = f;
    }

    public cyi(deu deuVar) {
        this.a = deuVar;
        this.b = deuVar;
    }

    public cyi() {
        this.a = new byw(new cxb[16]);
    }
}
