package kotlinx.b.b;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import kotlinx.b.a.q;
import kotlinx.b.c.bi;
import kotlinx.b.k;
import kotlinx.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class b implements f, d {
    @Override // kotlinx.b.b.f
    public /* synthetic */ d beginCollection(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return beginStructure(qVar);
    }

    @Override // kotlinx.b.b.f
    public d beginStructure(q qVar) {
        x.f(qVar, "descriptor");
        return this;
    }

    @Override // kotlinx.b.b.f
    public void encodeBoolean(boolean z) {
        encodeValue(Boolean.valueOf(z));
    }

    @Override // kotlinx.b.b.d
    public final void encodeBooleanElement(q qVar, int i2, boolean z) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeBoolean(z);
        }
    }

    @Override // kotlinx.b.b.f
    public void encodeByte(byte b2) {
        encodeValue(Byte.valueOf(b2));
    }

    @Override // kotlinx.b.b.d
    public final void encodeByteElement(q qVar, int i2, byte b2) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeByte(b2);
        }
    }

    @Override // kotlinx.b.b.f
    public void encodeChar(char c2) {
        encodeValue(Character.valueOf(c2));
    }

    @Override // kotlinx.b.b.d
    public final void encodeCharElement(q qVar, int i2, char c2) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeChar(c2);
        }
    }

    @Override // kotlinx.b.b.f
    public void encodeDouble(double d2) {
        encodeValue(Double.valueOf(d2));
    }

    @Override // kotlinx.b.b.d
    public final void encodeDoubleElement(q qVar, int i2, double d2) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeDouble(d2);
        }
    }

    public boolean encodeElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return true;
    }

    @Override // kotlinx.b.b.f
    public void encodeEnum(q qVar, int i2) {
        x.f(qVar, "enumDescriptor");
        encodeValue(Integer.valueOf(i2));
    }

    @Override // kotlinx.b.b.f
    public void encodeFloat(float f2) {
        encodeValue(Float.valueOf(f2));
    }

    @Override // kotlinx.b.b.d
    public final void encodeFloatElement(q qVar, int i2, float f2) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeFloat(f2);
        }
    }

    @Override // kotlinx.b.b.f
    public f encodeInline(q qVar) {
        x.f(qVar, "descriptor");
        return this;
    }

    @Override // kotlinx.b.b.d
    public final f encodeInlineElement(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return encodeElement(qVar, i2) ? encodeInline(qVar.g(i2)) : bi.f50992a;
    }

    @Override // kotlinx.b.b.f
    public void encodeInt(int i2) {
        encodeValue(Integer.valueOf(i2));
    }

    @Override // kotlinx.b.b.d
    public final void encodeIntElement(q qVar, int i2, int i3) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeInt(i3);
        }
    }

    @Override // kotlinx.b.b.f
    public void encodeLong(long j2) {
        encodeValue(Long.valueOf(j2));
    }

    @Override // kotlinx.b.b.d
    public final void encodeLongElement(q qVar, int i2, long j2) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeLong(j2);
        }
    }

    @Override // kotlinx.b.b.f
    public /* synthetic */ void encodeNotNullMark() {
    }

    @Override // kotlinx.b.b.f
    public void encodeNull() {
        throw new k("'null' is not supported by default");
    }

    @Override // kotlinx.b.b.d
    public <T> void encodeNullableSerializableElement(q qVar, int i2, l<? super T> lVar, T t) {
        x.f(qVar, "descriptor");
        x.f(lVar, "serializer");
        if (encodeElement(qVar, i2)) {
            encodeNullableSerializableValue(lVar, t);
        }
    }

    public /* synthetic */ void encodeNullableSerializableValue(l lVar, Object obj) {
        x.f(lVar, "serializer");
        if (lVar.getDescriptor().k()) {
            encodeSerializableValue(lVar, obj);
        } else if (obj == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(lVar, obj);
        }
    }

    @Override // kotlinx.b.b.d
    public <T> void encodeSerializableElement(q qVar, int i2, l<? super T> lVar, T t) {
        x.f(qVar, "descriptor");
        x.f(lVar, "serializer");
        if (encodeElement(qVar, i2)) {
            encodeSerializableValue(lVar, t);
        }
    }

    @Override // kotlinx.b.b.f
    public /* synthetic */ void encodeSerializableValue(l lVar, Object obj) {
        x.f(lVar, "serializer");
        lVar.serialize(this, obj);
    }

    @Override // kotlinx.b.b.f
    public void encodeShort(short s) {
        encodeValue(Short.valueOf(s));
    }

    @Override // kotlinx.b.b.d
    public final void encodeShortElement(q qVar, int i2, short s) {
        x.f(qVar, "descriptor");
        if (encodeElement(qVar, i2)) {
            encodeShort(s);
        }
    }

    @Override // kotlinx.b.b.f
    public void encodeString(String str) {
        x.f(str, "value");
        encodeValue(str);
    }

    @Override // kotlinx.b.b.d
    public final void encodeStringElement(q qVar, int i2, String str) {
        x.f(qVar, "descriptor");
        x.f(str, "value");
        if (encodeElement(qVar, i2)) {
            encodeString(str);
        }
    }

    public void encodeValue(Object obj) {
        x.f(obj, "value");
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        int i2 = ar.f48106a;
        sb.append(new m(cls));
        sb.append(" is not supported by ");
        sb.append(new m(getClass()));
        sb.append(" encoder");
        throw new k(sb.toString());
    }

    @Override // kotlinx.b.b.d
    public void endStructure(q qVar) {
        x.f(qVar, "descriptor");
    }

    public /* synthetic */ boolean shouldEncodeElementDefault(q qVar, int i2) {
        x.f(qVar, "descriptor");
        return true;
    }
}
