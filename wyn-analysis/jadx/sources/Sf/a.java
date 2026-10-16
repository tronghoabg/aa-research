package Sf;

import Af.r;
import Wf.AbstractC1240b0;
import ef.C2532p;
import ff.m;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import za.C4658a;

/* loaded from: classes5.dex */
public final class a implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11114a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11115b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11116c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11117d;

    public a(KClass serializableClass, KSerializer[] kSerializerArr) {
        AbstractC3340k.e(serializableClass, "serializableClass");
        this.f11115b = serializableClass;
        this.f11116c = m.c0(kSerializerArr);
        this.f11117d = new Uf.b(Fe.g.s("kotlinx.serialization.ContextualSerializer", Uf.i.f12829p, new SerialDescriptor[0], new r(this, 8)), serializableClass);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        switch (this.f11114a) {
            case 0:
                C4658a c4658aA = decoder.a();
                List list = (List) this.f11116c;
                KClass kClass = (KClass) this.f11115b;
                c4658aA.f(kClass, list);
                AbstractC1240b0.j(kClass);
                throw null;
            default:
                int iE = decoder.e(getDescriptor());
                Enum[] enumArr = (Enum[]) this.f11115b;
                if (iE >= 0 && iE < enumArr.length) {
                    return enumArr[iE];
                }
                throw new f(iE + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f11114a) {
            case 0:
                return (Uf.b) this.f11117d;
            default:
                return (SerialDescriptor) ((C2532p) this.f11117d).getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f11114a) {
            case 0:
                AbstractC3340k.e(value, "value");
                C4658a c4658aA = encoder.a();
                List list = (List) this.f11116c;
                KClass kClass = (KClass) this.f11115b;
                c4658aA.f(kClass, list);
                AbstractC1240b0.j(kClass);
                throw null;
            default:
                Enum value2 = (Enum) value;
                AbstractC3340k.e(value2, "value");
                Enum[] enumArr = (Enum[]) this.f11115b;
                int iY0 = m.y0(value2, enumArr);
                if (iY0 != -1) {
                    encoder.l(getDescriptor(), iY0);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value2);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().h());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                AbstractC3340k.d(string, "toString(...)");
                sb2.append(string);
                throw new f(sb2.toString());
        }
    }

    public String toString() {
        switch (this.f11114a) {
            case 1:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
            default:
                return super.toString();
        }
    }

    public a(String str, Enum[] values) {
        AbstractC3340k.e(values, "values");
        this.f11115b = values;
        this.f11117d = Fe.c.z(new Bf.g(2, this, str));
    }
}
