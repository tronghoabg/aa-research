package defpackage;

import defpackage.ahoh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class ahoi<FieldDescriptorType extends ahoh<FieldDescriptorType>> {
    private static final ahoi DEFAULT_INSTANCE = new ahoi(true);
    private boolean isImmutable;
    private boolean hasLazyField = false;
    private final ahpx<FieldDescriptorType, Object> fields = ahpx.newFieldMap(16);

    private ahoi(boolean z) {
        makeImmutable();
    }

    private Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int computeElementSize(ahqi ahqiVar, int i, Object obj) {
        int iComputeTagSize = ahoe.computeTagSize(i);
        if (ahqiVar == ahqi.GROUP) {
            iComputeTagSize += iComputeTagSize;
        }
        return iComputeTagSize + computeElementSizeNoTag(ahqiVar, obj);
    }

    private static int computeElementSizeNoTag(ahqi ahqiVar, Object obj) {
        ahqi ahqiVar2 = ahqi.DOUBLE;
        ahqj ahqjVar = ahqj.INT;
        switch (ahqiVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return ahoe.computeInt64SizeNoTag(((Long) obj).longValue());
            case 3:
                return ahoe.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return ahoe.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                return ahoe.computeStringSizeNoTag((String) obj);
            case 9:
                return ahoe.computeGroupSizeNoTag((ahpg) obj);
            case 10:
                return obj instanceof ahoy ? ahoe.computeLazyFieldSizeNoTag((ahoy) obj) : ahoe.computeMessageSizeNoTag((ahpg) obj);
            case 11:
                return obj instanceof ahoa ? ahoe.computeBytesSizeNoTag((ahoa) obj) : ahoe.computeByteArraySizeNoTag((byte[]) obj);
            case 12:
                return ahoe.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return obj instanceof ahor ? ahoe.computeEnumSizeNoTag(((ahor) obj).getNumber()) : ahoe.computeEnumSizeNoTag(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return ahoe.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return ahoe.computeSInt64SizeNoTag(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(ahoh<?> ahohVar, Object obj) {
        ahqi liteType = ahohVar.getLiteType();
        int number = ahohVar.getNumber();
        if (!ahohVar.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        int iComputeElementSize = 0;
        if (ahohVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iComputeElementSize += computeElementSizeNoTag(liteType, it.next());
            }
            return ahoe.computeTagSize(number) + iComputeElementSize + ahoe.computeRawVarint32Size(iComputeElementSize);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iComputeElementSize += computeElementSize(liteType, number, it2.next());
        }
        return iComputeElementSize;
    }

    public static <T extends ahoh<T>> ahoi<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    static int getWireFormatForFieldType(ahqi ahqiVar, boolean z) {
        if (z) {
            return 2;
        }
        return ahqiVar.getWireType();
    }

    private boolean isInitialized(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == ahqj.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((ahpg) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof ahpg)) {
                    if (value instanceof ahoy) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((ahpg) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void mergeFromField(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ahoy) {
            value = ((ahoy) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((ahpx<FieldDescriptorType, Object>) key, (FieldDescriptorType) field);
            return;
        }
        if (key.getLiteJavaType() != ahqj.MESSAGE) {
            this.fields.put((ahpx<FieldDescriptorType, Object>) key, (FieldDescriptorType) cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put((ahpx<FieldDescriptorType, Object>) key, (FieldDescriptorType) cloneIfMutable(value));
        } else {
            this.fields.put((ahpx<FieldDescriptorType, Object>) key, (FieldDescriptorType) key.internalMergeFrom(((ahpg) field2).toBuilder(), (ahpg) value).build());
        }
    }

    public static <T extends ahoh<T>> ahoi<T> newFieldSet() {
        return new ahoi<>();
    }

    public static Object readPrimitiveField(ahoc ahocVar, ahqi ahqiVar, boolean z) throws IOException {
        ahqi ahqiVar2 = ahqi.DOUBLE;
        ahqj ahqjVar = ahqj.INT;
        switch (ahqiVar.ordinal()) {
            case 0:
                return Double.valueOf(ahocVar.readDouble());
            case 1:
                return Float.valueOf(ahocVar.readFloat());
            case 2:
                return Long.valueOf(ahocVar.readInt64());
            case 3:
                return Long.valueOf(ahocVar.readUInt64());
            case 4:
                return Integer.valueOf(ahocVar.readInt32());
            case 5:
                return Long.valueOf(ahocVar.readFixed64());
            case 6:
                return Integer.valueOf(ahocVar.readFixed32());
            case 7:
                return Boolean.valueOf(ahocVar.readBool());
            case 8:
                return z ? ahocVar.readStringRequireUtf8() : ahocVar.readString();
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return ahocVar.readBytes();
            case 12:
                return Integer.valueOf(ahocVar.readUInt32());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(ahocVar.readSFixed32());
            case 15:
                return Long.valueOf(ahocVar.readSFixed64());
            case 16:
                return Integer.valueOf(ahocVar.readSInt32());
            case 17:
                return Long.valueOf(ahocVar.readSInt64());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void verifyType(defpackage.ahqi r2, java.lang.Object r3) {
        /*
            r3.getClass()
            ahqi r0 = defpackage.ahqi.DOUBLE
            ahqj r0 = defpackage.ahqj.INT
            ahqj r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r0 = 0
            r1 = 1
            switch(r2) {
                case 0: goto L40;
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L15;
                default: goto L14;
            }
        L14:
            goto L45
        L15:
            boolean r2 = r3 instanceof defpackage.ahpg
            if (r2 != 0) goto L2f
            boolean r2 = r3 instanceof defpackage.ahoy
            if (r2 == 0) goto L42
            goto L2f
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L2f
            boolean r2 = r3 instanceof defpackage.ahor
            if (r2 == 0) goto L42
            goto L2f
        L27:
            boolean r2 = r3 instanceof defpackage.ahoa
            if (r2 != 0) goto L2f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L42
        L2f:
            r0 = r1
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahoi.verifyType(ahqi, java.lang.Object):void");
    }

    private static void writeElement(ahoe ahoeVar, ahqi ahqiVar, int i, Object obj) throws IOException {
        if (ahqiVar == ahqi.GROUP) {
            ahoeVar.writeGroup(i, (ahpg) obj);
        } else {
            ahoeVar.writeTag(i, getWireFormatForFieldType(ahqiVar, false));
            writeElementNoTag(ahoeVar, ahqiVar, obj);
        }
    }

    private static void writeElementNoTag(ahoe ahoeVar, ahqi ahqiVar, Object obj) throws IOException {
        ahqi ahqiVar2 = ahqi.DOUBLE;
        ahqj ahqjVar = ahqj.INT;
        switch (ahqiVar.ordinal()) {
            case 0:
                ahoeVar.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 1:
                ahoeVar.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 2:
                ahoeVar.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 3:
                ahoeVar.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                ahoeVar.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 5:
                ahoeVar.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 6:
                ahoeVar.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 7:
                ahoeVar.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 8:
                ahoeVar.writeStringNoTag((String) obj);
                break;
            case 9:
                ahoeVar.writeGroupNoTag((ahpg) obj);
                break;
            case 10:
                ahoeVar.writeMessageNoTag((ahpg) obj);
                break;
            case 11:
                if (!(obj instanceof ahoa)) {
                    ahoeVar.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    ahoeVar.writeBytesNoTag((ahoa) obj);
                    break;
                }
            case 12:
                ahoeVar.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ahor)) {
                    ahoeVar.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    ahoeVar.writeEnumNoTag(((ahor) obj).getNumber());
                    break;
                }
            case 14:
                ahoeVar.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                ahoeVar.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                ahoeVar.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                ahoeVar.writeSInt64NoTag(((Long) obj).longValue());
                break;
        }
    }

    public static void writeField(ahoh<?> ahohVar, Object obj, ahoe ahoeVar) throws IOException {
        ahqi liteType = ahohVar.getLiteType();
        int number = ahohVar.getNumber();
        if (!ahohVar.isRepeated()) {
            if (obj instanceof ahoy) {
                writeElement(ahoeVar, liteType, number, ((ahoy) obj).getValue());
                return;
            } else {
                writeElement(ahoeVar, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!ahohVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeElement(ahoeVar, liteType, number, it.next());
            }
            return;
        }
        ahoeVar.writeTag(number, 2);
        Iterator it2 = list.iterator();
        int iComputeElementSizeNoTag = 0;
        while (it2.hasNext()) {
            iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it2.next());
        }
        ahoeVar.writeRawVarint32(iComputeElementSizeNoTag);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            writeElementNoTag(ahoeVar, liteType, it3.next());
        }
    }

    public void addRepeatedField(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(fielddescriptortype.getLiteType(), obj);
        Object field = getField(fielddescriptortype);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put((ahpx<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ahoi<FieldDescriptorType> m87clone() {
        ahpx<FieldDescriptorType, Object> ahpxVar;
        ahoi<FieldDescriptorType> ahoiVarNewFieldSet = newFieldSet();
        int i = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            ahpxVar = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            Map.Entry<K, Object> arrayEntryAt = ahpxVar.getArrayEntryAt(i);
            ahoiVarNewFieldSet.setField((ahoh) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i++;
        }
        Iterator it = ahpxVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ahoiVarNewFieldSet.setField((ahoh) entry.getKey(), entry.getValue());
        }
        ahoiVarNewFieldSet.hasLazyField = this.hasLazyField;
        return ahoiVarNewFieldSet;
    }

    public Object getField(FieldDescriptorType fielddescriptortype) {
        Object obj = this.fields.get(fielddescriptortype);
        return obj instanceof ahoy ? ((ahoy) obj).getValue() : obj;
    }

    public Object getRepeatedField(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fielddescriptortype);
        if (field != null) {
            return ((List) field).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fielddescriptortype);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        ahpx<FieldDescriptorType, Object> ahpxVar;
        int i = 0;
        int iComputeFieldSize = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            ahpxVar = this.fields;
            if (i >= numArrayEntries) {
                break;
            }
            Map.Entry<K, Object> arrayEntryAt = ahpxVar.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((ahoh) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i++;
        }
        Iterator it = ahpxVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((ahoh) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(fielddescriptortype) != null;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        boolean z = this.hasLazyField;
        ahpx<FieldDescriptorType, Object> ahpxVar = this.fields;
        return z ? new ahox(ahpxVar.entrySet().iterator()) : ahpxVar.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(ahoi<FieldDescriptorType> ahoiVar) {
        for (int i = 0; i < ahoiVar.fields.getNumArrayEntries(); i++) {
            mergeFromField(ahoiVar.fields.getArrayEntryAt(i));
        }
        Iterator it = ahoiVar.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((Map.Entry) it.next());
        }
    }

    public void setField(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            verifyType(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                verifyType(fielddescriptortype.getLiteType(), arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof ahoy) {
            this.hasLazyField = true;
        }
        this.fields.put((ahpx<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    private ahoi() {
    }

    public boolean isInitialized() {
        int i = 0;
        while (true) {
            int numArrayEntries = this.fields.getNumArrayEntries();
            ahpx<FieldDescriptorType, Object> ahpxVar = this.fields;
            if (i >= numArrayEntries) {
                Iterator it = ahpxVar.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!isInitialized((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!isInitialized(ahpxVar.getArrayEntryAt(i))) {
                return false;
            }
            i++;
        }
    }
}
