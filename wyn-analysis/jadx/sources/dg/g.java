package dg;

import cg.C1610B;
import ef.C2515C;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import tf.p;

/* loaded from: classes5.dex */
public final class g extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C f34310i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f34311j;
    public final /* synthetic */ F k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1610B f34312l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f34313m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F f34314n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C c10, long j8, F f10, C1610B c1610b, F f11, F f12) {
        super(2);
        this.f34310i = c10;
        this.f34311j = j8;
        this.k = f10;
        this.f34312l = c1610b;
        this.f34313m = f11;
        this.f34314n = f12;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            C c10 = this.f34310i;
            if (c10.f39736a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c10.f39736a = true;
            if (jLongValue < this.f34311j) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            F f10 = this.k;
            long longLe = f10.f39739a;
            C1610B c1610b = this.f34312l;
            if (longLe == 4294967295L) {
                longLe = c1610b.readLongLe();
            }
            f10.f39739a = longLe;
            F f11 = this.f34313m;
            f11.f39739a = f11.f39739a == 4294967295L ? c1610b.readLongLe() : 0L;
            F f12 = this.f34314n;
            f12.f39739a = f12.f39739a == 4294967295L ? c1610b.readLongLe() : 0L;
        }
        return C2515C.f34653a;
    }
}
