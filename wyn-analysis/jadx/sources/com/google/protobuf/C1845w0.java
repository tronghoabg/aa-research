package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1845w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C1845w0 f27766d = new C1845w0(0);

    /* renamed from: a, reason: collision with root package name */
    public final F1 f27767a = new F1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f27768b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27769c;

    public C1845w0() {
    }

    public static int c(WireFormat.FieldType fieldType, int i5, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i5);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return d(fieldType, obj) + iComputeTagSize;
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (AbstractC1842v0.f27756b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            return c(liteType, number, obj);
        }
        List list = (List) obj;
        int iC = 0;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC += c(liteType, number, it.next());
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iC += d(liteType, it2.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iC) + CodedOutputStream.computeTagSize(number) + iC;
    }

    public static int h(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        return (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) ? e(fieldSet$FieldDescriptorLite, value) : value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static boolean k(Map.Entry entry) {
        boolean zIsInitialized;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!fieldSet$FieldDescriptorLite.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof MessageLiteOrBuilder) {
                    zIsInitialized = ((MessageLiteOrBuilder) obj).isInitialized();
                } else {
                    if (!(obj instanceof LazyField)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(com.google.protobuf.FieldSet$FieldDescriptorLite r5, java.lang.Object r6) {
        /*
            r0 = 0
            r1 = 1
            com.google.protobuf.WireFormat$FieldType r2 = r5.getLiteType()
            com.google.protobuf.Internal.checkNotNull(r6)
            int[] r3 = com.google.protobuf.AbstractC1842v0.f27755a
            com.google.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r2 = r0
            goto L47
        L1a:
            boolean r2 = r6 instanceof com.google.protobuf.MessageLite
            if (r2 != 0) goto L22
            boolean r2 = r6 instanceof com.google.protobuf.LazyField
            if (r2 == 0) goto L18
        L22:
            r2 = r1
            goto L47
        L24:
            boolean r2 = r6 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r6 instanceof com.google.protobuf.Internal.EnumLite
            if (r2 == 0) goto L18
            goto L22
        L2d:
            boolean r2 = r6 instanceof com.google.protobuf.ByteString
            if (r2 != 0) goto L22
            boolean r2 = r6 instanceof byte[]
            if (r2 == 0) goto L18
            goto L22
        L36:
            boolean r2 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r2 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r2 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r2 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r2 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r2 = r6 instanceof java.lang.Integer
        L47:
            if (r2 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r3 = r5.getNumber()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.protobuf.WireFormat$FieldType r5 = r5.getLiteType()
            com.google.protobuf.WireFormat$JavaType r5 = r5.getJavaType()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r2.<init>(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C1845w0.q(com.google.protobuf.FieldSet$FieldDescriptorLite, java.lang.Object):void");
    }

    public static void r(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i5, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i5, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i5, fieldType.getWireType());
            s(codedOutputStream, fieldType, obj);
        }
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (AbstractC1842v0.f27756b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    break;
                }
        }
    }

    public final void a(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        List arrayList;
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        q(fieldSet$FieldDescriptorLite, obj);
        Object objF = f(fieldSet$FieldDescriptorLite);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f27767a.put(fieldSet$FieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1845w0 clone() {
        F1 f1;
        C1845w0 c1845w0 = new C1845w0();
        int i5 = 0;
        while (true) {
            f1 = this.f27767a;
            if (i5 >= f1.f27557b.size()) {
                break;
            }
            Map.Entry entryD = f1.d(i5);
            c1845w0.p((FieldSet$FieldDescriptorLite) entryD.getKey(), entryD.getValue());
            i5++;
        }
        for (Map.Entry entry : f1.e()) {
            c1845w0.p((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        c1845w0.f27769c = this.f27769c;
        return c1845w0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1845w0) {
            return this.f27767a.equals(((C1845w0) obj).f27767a);
        }
        return false;
    }

    public final Object f(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.f27767a.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int g() {
        F1 f1;
        int i5 = 0;
        int iH = 0;
        while (true) {
            f1 = this.f27767a;
            if (i5 >= f1.f27557b.size()) {
                break;
            }
            iH += h(f1.d(i5));
            i5++;
        }
        Iterator it = f1.e().iterator();
        while (it.hasNext()) {
            iH += h((Map.Entry) it.next());
        }
        return iH;
    }

    public final int hashCode() {
        return this.f27767a.hashCode();
    }

    public final int i() {
        F1 f1;
        int i5 = 0;
        int iE = 0;
        while (true) {
            f1 = this.f27767a;
            if (i5 >= f1.f27557b.size()) {
                break;
            }
            Map.Entry entryD = f1.d(i5);
            iE += e((FieldSet$FieldDescriptorLite) entryD.getKey(), entryD.getValue());
            i5++;
        }
        for (Map.Entry entry : f1.e()) {
            iE += e((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final boolean j() {
        int i5 = 0;
        while (true) {
            F1 f1 = this.f27767a;
            if (i5 >= f1.f27557b.size()) {
                Iterator it = f1.e().iterator();
                while (it.hasNext()) {
                    if (!k((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!k(f1.d(i5))) {
                return false;
            }
            i5++;
        }
    }

    public final Iterator l() {
        boolean z2 = this.f27769c;
        F1 f1 = this.f27767a;
        return z2 ? new S0(((androidx.datastore.preferences.protobuf.i0) f1.entrySet()).iterator()) : ((androidx.datastore.preferences.protobuf.i0) f1.entrySet()).iterator();
    }

    public final void m() {
        F1 f1;
        if (this.f27768b) {
            return;
        }
        int i5 = 0;
        while (true) {
            f1 = this.f27767a;
            if (i5 >= f1.f27557b.size()) {
                break;
            }
            Map.Entry entryD = f1.d(i5);
            if (entryD.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryD.getValue()).makeImmutable();
            }
            i5++;
        }
        if (!f1.f27559d) {
            for (int i10 = 0; i10 < f1.f27557b.size(); i10++) {
                Map.Entry entryD2 = f1.d(i10);
                if (((FieldSet$FieldDescriptorLite) entryD2.getKey()).isRepeated()) {
                    entryD2.setValue(DesugarCollections.unmodifiableList((List) entryD2.getValue()));
                }
            }
            for (Map.Entry entry : f1.e()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!f1.f27559d) {
            f1.f27558c = f1.f27558c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(f1.f27558c);
            f1.f27561f = f1.f27561f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(f1.f27561f);
            f1.f27559d = true;
        }
        this.f27768b = true;
    }

    public final void n(C1845w0 c1845w0) {
        F1 f1;
        int i5 = 0;
        while (true) {
            int size = c1845w0.f27767a.f27557b.size();
            f1 = c1845w0.f27767a;
            if (i5 >= size) {
                break;
            }
            o(f1.d(i5));
            i5++;
        }
        Iterator it = f1.e().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final void o(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        F1 f1 = this.f27767a;
        if (zIsRepeated) {
            Object objF = f(fieldSet$FieldDescriptorLite);
            if (objF == null) {
                objF = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objF;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            f1.put(fieldSet$FieldDescriptorLite, objF);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            f1.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object objF2 = f(fieldSet$FieldDescriptorLite);
        if (objF2 != null) {
            f1.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) objF2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        f1.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void p(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            q(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q(fieldSet$FieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f27769c = true;
        }
        this.f27767a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public C1845w0(int i5) {
        m();
        m();
    }
}
