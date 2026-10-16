package N;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import x.C4421n;
import x.C4422o;

/* renamed from: N.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727h0 extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0729i0 f7781i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7782j;
    public final /* synthetic */ C4421n k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0727h0(C0729i0 c0729i0, int i5, C4421n c4421n) {
        super(1);
        this.f7781i = c0729i0;
        this.f7782j = i5;
        this.k = c4421n;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        InterfaceC0742p interfaceC0742p;
        InterfaceC0742p interfaceC0742p2;
        int i5;
        InterfaceC0742p interfaceC0742p3 = (InterfaceC0742p) obj;
        C0729i0 c0729i0 = this.f7781i;
        int i10 = c0729i0.f7789e;
        int i11 = this.f7782j;
        if (i10 == i11) {
            C4421n c4421n = c0729i0.f7790f;
            C4421n c4421n2 = this.k;
            if (AbstractC3340k.a(c4421n2, c4421n) && (interfaceC0742p3 instanceof C0744s)) {
                long[] jArr = c4421n2.f47528a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j8 = jArr[i12];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((255 & j8) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    Object obj2 = c4421n2.f47529b[i16];
                                    boolean z2 = c4421n2.f47530c[i16] != i11;
                                    if (z2) {
                                        i5 = i13;
                                        C0744s c0744s = (C0744s) interfaceC0742p3;
                                        c0744s.f7910g.n(obj2, c0729i0);
                                        if (obj2 instanceof C0751z) {
                                            C0751z c0751z = (C0751z) obj2;
                                            interfaceC0742p2 = interfaceC0742p3;
                                            if (!((C4422o) c0744s.f7910g.f16739b).b(c0751z)) {
                                                c0744s.f7913j.p(c0751z);
                                            }
                                            C4422o c4422o = c0729i0.f7791g;
                                            if (c4422o != null) {
                                                c4422o.g(obj2);
                                            }
                                        } else {
                                            interfaceC0742p2 = interfaceC0742p3;
                                        }
                                    } else {
                                        interfaceC0742p2 = interfaceC0742p3;
                                        i5 = i13;
                                    }
                                    if (z2) {
                                        c4421n2.e(i16);
                                    }
                                } else {
                                    interfaceC0742p2 = interfaceC0742p3;
                                    i5 = i13;
                                }
                                j8 >>= i5;
                                i15++;
                                i13 = i5;
                                interfaceC0742p3 = interfaceC0742p2;
                            }
                            interfaceC0742p = interfaceC0742p3;
                            if (i14 != i13) {
                                break;
                            }
                        } else {
                            interfaceC0742p = interfaceC0742p3;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        interfaceC0742p3 = interfaceC0742p;
                    }
                }
            }
        }
        return C2515C.f34653a;
    }
}
