package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813l0 extends AbstractC1807j0 {
    @Override // com.google.protobuf.AbstractC1807j0
    public final GeneratedMessageLite.GeneratedExtension a(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i5) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i5);
    }

    @Override // com.google.protobuf.AbstractC1807j0
    public final C1845w0 b(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.AbstractC1807j0
    public final Object c(Object obj, B b5, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, C1845w0 c1845w0, Object obj2, X1 x12) throws IOException {
        Object objValueOf;
        Object objF;
        ArrayList arrayList;
        int number = generatedExtension.getNumber();
        D0 d02 = generatedExtension.descriptor;
        if (d02.f27543d && d02.f27544e) {
            switch (AbstractC1810k0.f27697a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    b5.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    b5.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    b5.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    b5.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    b5.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    b5.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    b5.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    b5.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    b5.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    b5.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    b5.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    b5.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    b5.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    b5.h(arrayList);
                    obj2 = E1.j(obj, number, arrayList, generatedExtension.descriptor.f27540a, obj2, x12);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.f27542c);
            }
            c1845w0.p(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (AbstractC1810k0.f27697a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    b5.x(1);
                    objValueOf = Double.valueOf(b5.f27516a.readDouble());
                    break;
                case 2:
                    b5.x(5);
                    objValueOf = Float.valueOf(b5.f27516a.readFloat());
                    break;
                case 3:
                    b5.x(0);
                    objValueOf = Long.valueOf(b5.f27516a.readInt64());
                    break;
                case 4:
                    b5.x(0);
                    objValueOf = Long.valueOf(b5.f27516a.readUInt64());
                    break;
                case 5:
                    b5.x(0);
                    objValueOf = Integer.valueOf(b5.f27516a.readInt32());
                    break;
                case 6:
                    b5.x(1);
                    objValueOf = Long.valueOf(b5.f27516a.readFixed64());
                    break;
                case 7:
                    b5.x(5);
                    objValueOf = Integer.valueOf(b5.f27516a.readFixed32());
                    break;
                case 8:
                    b5.x(0);
                    objValueOf = Boolean.valueOf(b5.f27516a.readBool());
                    break;
                case 9:
                    b5.x(0);
                    objValueOf = Integer.valueOf(b5.f27516a.readUInt32());
                    break;
                case 10:
                    b5.x(5);
                    objValueOf = Integer.valueOf(b5.f27516a.readSFixed32());
                    break;
                case 11:
                    b5.x(1);
                    objValueOf = Long.valueOf(b5.f27516a.readSFixed64());
                    break;
                case 12:
                    b5.x(0);
                    objValueOf = Integer.valueOf(b5.f27516a.readSInt32());
                    break;
                case 13:
                    b5.x(0);
                    objValueOf = Long.valueOf(b5.f27516a.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = b5.e();
                    break;
                case 16:
                    b5.x(2);
                    objValueOf = b5.f27516a.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object objF2 = c1845w0.f(generatedExtension.descriptor);
                        if (objF2 instanceof GeneratedMessageLite) {
                            D1 d1B = C1846w1.f27770c.b(objF2);
                            if (!((GeneratedMessageLite) objF2).isMutable()) {
                                Object objNewInstance = d1B.newInstance();
                                d1B.c(objNewInstance, objF2);
                                c1845w0.p(generatedExtension.descriptor, objNewInstance);
                                objF2 = objNewInstance;
                            }
                            b5.x(3);
                            b5.b(objF2, d1B, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    b5.x(3);
                    D1 d1A = C1846w1.f27770c.a(cls);
                    Object objNewInstance2 = d1A.newInstance();
                    b5.b(objNewInstance2, d1A, extensionRegistryLite);
                    d1A.a(objNewInstance2);
                    objValueOf = objNewInstance2;
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object objF3 = c1845w0.f(generatedExtension.descriptor);
                        if (objF3 instanceof GeneratedMessageLite) {
                            D1 d1B2 = C1846w1.f27770c.b(objF3);
                            if (!((GeneratedMessageLite) objF3).isMutable()) {
                                Object objNewInstance3 = d1B2.newInstance();
                                d1B2.c(objNewInstance3, objF3);
                                c1845w0.p(generatedExtension.descriptor, objNewInstance3);
                                objF3 = objNewInstance3;
                            }
                            b5.x(2);
                            b5.c(objF3, d1B2, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    objValueOf = b5.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            b5.x(0);
            int int32 = b5.f27516a.readInt32();
            if (generatedExtension.descriptor.f27540a.findValueByNumber(int32) == null) {
                return E1.n(obj, number, int32, obj2, x12);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (generatedExtension.isRepeated()) {
            c1845w0.a(generatedExtension.descriptor, objValueOf);
            return obj2;
        }
        int i5 = AbstractC1810k0.f27697a[generatedExtension.getLiteType().ordinal()];
        if ((i5 == 17 || i5 == 18) && (objF = c1845w0.f(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(objF, objValueOf);
        }
        c1845w0.p(generatedExtension.descriptor, objValueOf);
        return obj2;
    }

    @Override // com.google.protobuf.AbstractC1807j0
    public final void d(q2 q2Var, Map.Entry entry) throws IOException {
        D0 d02 = (D0) entry.getKey();
        boolean z2 = d02.f27543d;
        WireFormat.FieldType fieldType = d02.f27542c;
        int i5 = d02.f27541b;
        if (z2) {
            int i10 = AbstractC1810k0.f27697a[fieldType.ordinal()];
            boolean z10 = d02.f27544e;
            switch (i10) {
                case 1:
                    E1.q(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 2:
                    E1.u(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 3:
                    E1.x(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 4:
                    E1.F(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 5:
                    E1.w(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 6:
                    E1.t(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 7:
                    E1.s(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 8:
                    E1.o(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 9:
                    E1.E(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 10:
                    E1.z(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 11:
                    E1.A(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 12:
                    E1.B(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 13:
                    E1.C(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 14:
                    E1.w(i5, (List) entry.getValue(), q2Var, z10);
                    break;
                case 15:
                    E1.p(i5, (List) entry.getValue(), q2Var);
                    break;
                case 16:
                    E1.D(i5, (List) entry.getValue(), q2Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        E1.v(i5, (List) entry.getValue(), q2Var, C1846w1.f27770c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        E1.y(i5, (List) entry.getValue(), q2Var, C1846w1.f27770c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (AbstractC1810k0.f27697a[fieldType.ordinal()]) {
            case 1:
                ((L) q2Var).f27587a.writeDouble(i5, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((L) q2Var).f27587a.writeFloat(i5, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((L) q2Var).f(i5, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((L) q2Var).f27587a.writeUInt64(i5, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((L) q2Var).e(i5, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((L) q2Var).c(i5, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((L) q2Var).b(i5, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((L) q2Var).f27587a.writeBool(i5, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((L) q2Var).f27587a.writeUInt32(i5, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((L) q2Var).f27587a.writeSFixed32(i5, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((L) q2Var).f27587a.writeSFixed64(i5, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((L) q2Var).f27587a.writeSInt32(i5, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((L) q2Var).f27587a.writeSInt64(i5, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((L) q2Var).e(i5, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((L) q2Var).a(i5, (ByteString) entry.getValue());
                break;
            case 16:
                ((L) q2Var).f27587a.writeString(i5, (String) entry.getValue());
                break;
            case 17:
                ((L) q2Var).d(i5, entry.getValue(), C1846w1.f27770c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((L) q2Var).g(i5, entry.getValue(), C1846w1.f27770c.a(entry.getValue().getClass()));
                break;
        }
    }
}
