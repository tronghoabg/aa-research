package Yf;

import ef.C2535s;
import ef.C2537u;
import ef.C2539w;
import ef.C2542z;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;
import za.C4658a;

/* loaded from: classes5.dex */
public final class n extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public final J5.f f16870a;

    /* renamed from: b, reason: collision with root package name */
    public final C4658a f16871b;

    public n(J5.f fVar, Xf.c json) {
        AbstractC3340k.e(json, "json");
        this.f16870a = fVar;
        this.f16871b = json.f16253b;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final byte E() {
        C2535s c2535s;
        J5.f fVar = this.f16870a;
        String strL = fVar.l();
        try {
            AbstractC3340k.e(strL, "<this>");
            C2537u c2537uZ = xg.g.Z(strL);
            if (c2537uZ != null) {
                int i5 = c2537uZ.f34686a;
                c2535s = Integer.compare(Integer.MIN_VALUE ^ i5, -2147483393) > 0 ? null : new C2535s((byte) i5);
            }
            if (c2535s != null) {
                return c2535s.f34684a;
            }
            Bf.r.e0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            J5.f.r(fVar, AbstractC3256n.f('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, Vf.a
    public final C4658a a() {
        return this.f16871b;
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final int h() {
        J5.f fVar = this.f16870a;
        String strL = fVar.l();
        try {
            AbstractC3340k.e(strL, "<this>");
            C2537u c2537uZ = xg.g.Z(strL);
            if (c2537uZ != null) {
                return c2537uZ.f34686a;
            }
            Bf.r.e0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            J5.f.r(fVar, AbstractC3256n.f('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final long k() {
        J5.f fVar = this.f16870a;
        String strL = fVar.l();
        try {
            AbstractC3340k.e(strL, "<this>");
            C2539w c2539wA0 = xg.g.a0(strL);
            if (c2539wA0 != null) {
                return c2539wA0.f34688a;
            }
            Bf.r.e0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            J5.f.r(fVar, AbstractC3256n.f('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // Vf.a
    public final int m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // android.support.v4.media.session.b, kotlinx.serialization.encoding.Decoder
    public final short p() {
        C2542z c2542z;
        J5.f fVar = this.f16870a;
        String strL = fVar.l();
        try {
            AbstractC3340k.e(strL, "<this>");
            C2537u c2537uZ = xg.g.Z(strL);
            if (c2537uZ != null) {
                int i5 = c2537uZ.f34686a;
                c2542z = Integer.compare(Integer.MIN_VALUE ^ i5, -2147418113) > 0 ? null : new C2542z((short) i5);
            }
            if (c2542z != null) {
                return c2542z.f34691a;
            }
            Bf.r.e0(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            J5.f.r(fVar, AbstractC3256n.f('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
