package Sf;

import Af.q;
import R8.v;
import ef.EnumC2526j;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class d implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f11119a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11120b;

    public d(KClass baseClass) {
        AbstractC3340k.e(baseClass, "baseClass");
        this.f11119a = baseClass;
        this.f11120b = Fe.c.y(EnumC2526j.f34668b, new q(this, 1));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Vf.a aVarB = decoder.b(getDescriptor());
        String strL = null;
        while (true) {
            int iM = aVarB.m(getDescriptor());
            if (iM == -1) {
                throw new IllegalArgumentException(v.f("Polymorphic value has not been read for class ", strL).toString());
            }
            if (iM != 0) {
                if (iM == 1) {
                    if (strL == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    android.support.v4.media.session.b.e0(this, aVarB, strL);
                    throw null;
                }
                StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (strL == null) {
                    strL = "unknown class";
                }
                sb2.append(strL);
                sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb2.append(iM);
                throw new f(sb2.toString());
            }
            strL = aVarB.l(getDescriptor(), iM);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ef.i, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f11120b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        AbstractC3340k.e(value, "value");
        android.support.v4.media.session.b.f0(this, encoder, value);
        throw null;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f11119a + ')';
    }
}
