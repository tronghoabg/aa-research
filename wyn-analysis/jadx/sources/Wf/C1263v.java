package Wf;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Wf.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1263v implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1263v f15642a = new C1263v();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15643b = new h0("kotlin.time.Duration", Uf.e.f12814x);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Cf.h hVar = Cf.a.f2200b;
        String value = decoder.w();
        AbstractC3340k.e(value, "value");
        try {
            long jN = Fe.b.N(value);
            if (jN == Cf.a.f2203e) {
                throw new IllegalStateException("invariant failed");
            }
            return new Cf.a(jN);
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Invalid ISO duration string format: '", value, "'."), e7);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15643b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j8 = ((Cf.a) obj).f2204a;
        Cf.h hVar = Cf.a.f2200b;
        StringBuilder sb2 = new StringBuilder();
        if (j8 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jK = j8 < 0 ? Cf.a.k(j8) : j8;
        long jI = Cf.a.i(jK, Cf.c.f2210f);
        boolean z2 = false;
        int i5 = Cf.a.f(jK) ? 0 : (int) (Cf.a.i(jK, Cf.c.f2209e) % 60);
        int i10 = Cf.a.f(jK) ? 0 : (int) (Cf.a.i(jK, Cf.c.f2208d) % 60);
        int iE = Cf.a.e(jK);
        if (Cf.a.f(j8)) {
            jI = 9999999999999L;
        }
        boolean z10 = jI != 0;
        boolean z11 = (i10 == 0 && iE == 0) ? false : true;
        if (i5 != 0 || (z11 && z10)) {
            z2 = true;
        }
        if (z10) {
            sb2.append(jI);
            sb2.append('H');
        }
        if (z2) {
            sb2.append(i5);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z2)) {
            Cf.a.b(sb2, i10, iE, 9, "S", true);
        }
        encoder.F(sb2.toString());
    }
}
