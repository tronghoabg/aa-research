package dg;

import cg.C1610B;
import ef.C2515C;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.G;
import tf.p;

/* loaded from: classes5.dex */
public final class h extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1610B f34315i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G f34316j;
    public final /* synthetic */ G k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G f34317l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1610B c1610b, G g9, G g10, G g11) {
        super(2);
        this.f34315i = c1610b;
        this.f34316j = g9;
        this.k = g10;
        this.f34317l = g11;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b5 = this.f34315i.readByte();
            boolean z2 = (b5 & 1) == 1;
            boolean z10 = (b5 & 2) == 2;
            boolean z11 = (b5 & 4) == 4;
            long j8 = z2 ? 5L : 1L;
            if (z10) {
                j8 += 4;
            }
            if (z11) {
                j8 += 4;
            }
            if (jLongValue < j8) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z2) {
                this.f34316j.f39740a = Long.valueOf(r2.readIntLe() * 1000);
            }
            if (z10) {
                this.k.f39740a = Long.valueOf(r2.readIntLe() * 1000);
            }
            if (z11) {
                this.f34317l.f39740a = Long.valueOf(r2.readIntLe() * 1000);
            }
        }
        return C2515C.f34653a;
    }
}
