package A0;

import X.t;
import X.u;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import x.C4425r;

/* loaded from: classes.dex */
public final class p extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f227j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, int i5) {
        super(0);
        this.f226i = i5;
        this.f227j = obj;
    }

    /* JADX WARN: Finally extract failed */
    private final Object b() {
        Object[] objArr;
        int i5;
        Object[] objArr2;
        int i10;
        do {
            u uVar = (u) this.f227j;
            synchronized (uVar.f15757f) {
                if (!uVar.f15754c) {
                    uVar.f15754c = true;
                    try {
                        P.d dVar = uVar.f15757f;
                        int i11 = dVar.f8972c;
                        if (i11 > 0) {
                            Object[] objArr3 = dVar.f8970a;
                            int i12 = 0;
                            while (true) {
                                t tVar = (t) objArr3[i12];
                                C4425r c4425r = tVar.f15747g;
                                Object[] objArr4 = c4425r.f47554b;
                                long[] jArr = c4425r.f47553a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j8 = jArr[i13];
                                        i5 = i11;
                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8;
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j8 & 255) < 128) {
                                                    i10 = i14;
                                                    objArr2 = objArr3;
                                                    tVar.f15741a.invoke(objArr4[(i13 << 3) + i16]);
                                                } else {
                                                    objArr2 = objArr3;
                                                    i10 = i14;
                                                }
                                                j8 >>= i10;
                                                i16++;
                                                objArr3 = objArr2;
                                                i14 = i10;
                                            }
                                            objArr = objArr3;
                                            if (i15 != i14) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                        i11 = i5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    objArr = objArr3;
                                    i5 = i11;
                                }
                                c4425r.b();
                                i12++;
                                int i17 = i5;
                                if (i12 >= i17) {
                                    break;
                                }
                                i11 = i17;
                                objArr3 = objArr;
                            }
                        }
                        uVar.f15754c = false;
                    } catch (Throwable th) {
                        uVar.f15754c = false;
                        throw th;
                    }
                }
            }
        } while (u.a((u) this.f227j));
        return C2515C.f34653a;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0434  */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, tf.l] */
    /* JADX WARN: Type inference failed for: r0v132, types: [kotlin.jvm.internal.n, tf.a] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v6, types: [N.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object[]] */
    @Override // tf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.p.invoke():java.lang.Object");
    }
}
