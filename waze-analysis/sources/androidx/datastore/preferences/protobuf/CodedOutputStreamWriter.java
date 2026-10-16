package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
@CheckReturnValue
/* loaded from: classes3.dex */
final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream;
        codedOutputStream.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        Object obj = codedOutputStream.wrapper;
        return obj != null ? (CodedOutputStreamWriter) obj : new CodedOutputStreamWriter(codedOutputStream);
    }

    private void writeBoolListInternal(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeBool(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeBoolNoTag(list.get(i3).booleanValue());
            i3++;
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int i2, boolean z, V v, MapEntryLite.Metadata<Boolean, V> metadata) {
        this.output.writeTag(i2, 2);
        Boolean boolValueOf = Boolean.valueOf(z);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, boolValueOf, v));
        MapEntryLite.writeTo(this.output, metadata, boolValueOf, v);
    }

    private <V> void writeDeterministicIntegerMap(int i2, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = it.next().intValue();
            i3++;
        }
        Arrays.sort(iArr);
        for (int i4 = 0; i4 < size; i4++) {
            Integer numValueOf = Integer.valueOf(iArr[i4]);
            V v = map.get(numValueOf);
            this.output.writeTag(i2, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, numValueOf, v));
            MapEntryLite.writeTo(this.output, metadata, numValueOf, v);
        }
    }

    private <V> void writeDeterministicLongMap(int i2, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = it.next().longValue();
            i3++;
        }
        Arrays.sort(jArr);
        for (int i4 = 0; i4 < size; i4++) {
            Long lValueOf = Long.valueOf(jArr[i4]);
            V v = map.get(lValueOf);
            this.output.writeTag(i2, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, lValueOf, v));
            MapEntryLite.writeTo(this.output, metadata, lValueOf, v);
        }
    }

    private <K, V> void writeDeterministicMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        WireFormat.FieldType fieldType = WireFormat.FieldType.DOUBLE;
        switch (metadata.keyType.ordinal()) {
            case 2:
            case 3:
            case 5:
            case 15:
            case 17:
                writeDeterministicLongMap(i2, metadata, map);
                return;
            case 4:
            case 6:
            case 12:
            case 14:
            case 16:
                writeDeterministicIntegerMap(i2, metadata, map);
                return;
            case 7:
                V v = map.get(false);
                if (v != null) {
                    writeDeterministicBooleanMapEntry(i2, false, v, metadata);
                }
                V v2 = map.get(true);
                if (v2 != null) {
                    writeDeterministicBooleanMapEntry(i2, true, v2, metadata);
                    return;
                }
                return;
            case 8:
                writeDeterministicStringMap(i2, metadata, map);
                return;
            case 9:
            case 10:
            case 11:
            case 13:
            default:
                WireFormat.FieldType fieldType2 = metadata.keyType;
                Objects.toString(fieldType2);
                throw new IllegalArgumentException("does not support key type: ".concat(String.valueOf(fieldType2)));
        }
    }

    private <V> void writeDeterministicStringMap(int i2, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            strArr[i3] = it.next();
            i3++;
        }
        Arrays.sort(strArr);
        for (int i4 = 0; i4 < size; i4++) {
            String str = strArr[i4];
            V v = map.get(str);
            this.output.writeTag(i2, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v));
            MapEntryLite.writeTo(this.output, metadata, str, v);
        }
    }

    private void writeDoubleListInternal(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeDouble(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeDoubleNoTag(list.get(i3).doubleValue());
            i3++;
        }
    }

    private void writeEnumListInternal(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeEnum(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i4).intValue());
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i3 < list.size()) {
            this.output.writeEnumNoTag(list.get(i3).intValue());
            i3++;
        }
    }

    private void writeFixed32ListInternal(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeFixed32(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeFixed32NoTag(list.get(i3).intValue());
            i3++;
        }
    }

    private void writeFixed64ListInternal(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeFixed64(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeFixed64NoTag(list.get(i3).longValue());
            i3++;
        }
    }

    private void writeFloatListInternal(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeFloat(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeFloatNoTag(list.get(i3).floatValue());
            i3++;
        }
    }

    private void writeInt32ListInternal(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeInt32(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i4).intValue());
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i3 < list.size()) {
            this.output.writeInt32NoTag(list.get(i3).intValue());
            i3++;
        }
    }

    private void writeInt64ListInternal(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeInt64(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i4).longValue());
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i3 < list.size()) {
            this.output.writeInt64NoTag(list.get(i3).longValue());
            i3++;
        }
    }

    private void writeLazyString(int i2, Object obj) {
        boolean z = obj instanceof String;
        CodedOutputStream codedOutputStream = this.output;
        if (z) {
            codedOutputStream.writeString(i2, (String) obj);
        } else {
            codedOutputStream.writeBytes(i2, (ByteString) obj);
        }
    }

    private void writeSFixed32ListInternal(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeSFixed32(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeSFixed32NoTag(list.get(i3).intValue());
            i3++;
        }
    }

    private void writeSFixed64ListInternal(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeSFixed64(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.output.writeUInt32NoTag(i4);
        while (i3 < list.size()) {
            this.output.writeSFixed64NoTag(list.get(i3).longValue());
            i3++;
        }
    }

    private void writeSInt64ListInternal(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeSInt64(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i4).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i3 < list.size()) {
            this.output.writeSInt64NoTag(list.get(i3).longValue());
            i3++;
        }
    }

    private void writeUInt64ListInternal(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeUInt64(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i4).longValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i3 < list.size()) {
            this.output.writeUInt64NoTag(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int i2, boolean z) {
        this.output.writeBool(i2, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int i2, List<Boolean> list, boolean z) {
        if (list instanceof BooleanArrayList) {
            writeBoolListInternal(i2, (BooleanArrayList) list, z);
        } else {
            writeBoolListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int i2, ByteString byteString) {
        this.output.writeBytes(i2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int i2, List<ByteString> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.output.writeBytes(i2, list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int i2, double d2) {
        this.output.writeDouble(i2, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int i2, List<Double> list, boolean z) {
        if (list instanceof DoubleArrayList) {
            writeDoubleListInternal(i2, (DoubleArrayList) list, z);
        } else {
            writeDoubleListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int i2) {
        this.output.writeTag(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int i2, int i3) {
        this.output.writeEnum(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int i2, List<Integer> list, boolean z) {
        if (list instanceof IntArrayList) {
            writeEnumListInternal(i2, (IntArrayList) list, z);
        } else {
            writeEnumListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int i2, int i3) {
        this.output.writeFixed32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int i2, List<Integer> list, boolean z) {
        if (list instanceof IntArrayList) {
            writeFixed32ListInternal(i2, (IntArrayList) list, z);
        } else {
            writeFixed32ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int i2, long j2) {
        this.output.writeFixed64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int i2, List<Long> list, boolean z) {
        if (list instanceof LongArrayList) {
            writeFixed64ListInternal(i2, (LongArrayList) list, z);
        } else {
            writeFixed64ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int i2, float f2) {
        this.output.writeFloat(i2, f2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int i2, List<Float> list, boolean z) {
        if (list instanceof FloatArrayList) {
            writeFloatListInternal(i2, (FloatArrayList) list, z);
        } else {
            writeFloatListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i2, Object obj, Schema schema) {
        this.output.writeTag(i2, 3);
        schema.writeTo((AbstractMessageLite) obj, this);
        this.output.writeTag(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroupList(int i2, List<?> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            writeGroup(i2, list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i2, int i3) {
        this.output.writeInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int i2, List<Integer> list, boolean z) {
        if (list instanceof IntArrayList) {
            writeInt32ListInternal(i2, (IntArrayList) list, z);
        } else {
            writeInt32ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int i2, long j2) {
        this.output.writeInt64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int i2, List<Long> list, boolean z) {
        if (list instanceof LongArrayList) {
            writeInt64ListInternal(i2, (LongArrayList) list, z);
        } else {
            writeInt64ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i2, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i2, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i2, Object obj, Schema schema) {
        AbstractMessageLite abstractMessageLite = (AbstractMessageLite) obj;
        this.output.writeTag(i2, 2);
        this.output.writeUInt32NoTag(abstractMessageLite.getSerializedSize(schema));
        schema.writeTo(abstractMessageLite, this);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i2, List<?> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            writeMessage(i2, list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i2, Object obj) {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.output;
        if (z) {
            codedOutputStream.writeRawMessageSetExtension(i2, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i2, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int i2, int i3) {
        this.output.writeSFixed32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int i2, List<Integer> list, boolean z) {
        if (list instanceof IntArrayList) {
            writeSFixed32ListInternal(i2, (IntArrayList) list, z);
        } else {
            writeSFixed32ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int i2, long j2) {
        this.output.writeSFixed64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int i2, List<Long> list, boolean z) {
        if (list instanceof LongArrayList) {
            writeSFixed64ListInternal(i2, (LongArrayList) list, z);
        } else {
            writeSFixed64ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int i2, int i3) {
        this.output.writeSInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int i2, List<Integer> list, boolean z) {
        if (list instanceof IntArrayList) {
            writeSInt32ListInternal(i2, (IntArrayList) list, z);
        } else {
            writeSInt32ListInternal(i2, list, z);
        }
    }

    public void writeSInt32ListInternal(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeSInt32(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i4).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i3 < list.size()) {
            this.output.writeSInt32NoTag(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int i2, long j2) {
        this.output.writeSInt64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int i2, List<Long> list, boolean z) {
        if (list instanceof LongArrayList) {
            writeSInt64ListInternal(i2, (LongArrayList) list, z);
        } else {
            writeSInt64ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int i2) {
        this.output.writeTag(i2, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int i2, String str) {
        this.output.writeString(i2, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int i2, List<String> list) {
        int i3 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i3 < list.size()) {
                this.output.writeString(i2, list.get(i3));
                i3++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < list.size()) {
                writeLazyString(i2, lazyStringList.getRaw(i3));
                i3++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int i2, int i3) {
        this.output.writeUInt32(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int i2, List<Integer> list, boolean z) {
        if (list instanceof IntArrayList) {
            writeUInt32ListInternal(i2, (IntArrayList) list, z);
        } else {
            writeUInt32ListInternal(i2, list, z);
        }
    }

    public void writeUInt32ListInternal(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.output.writeUInt32(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.output.writeTag(i2, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i4).intValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i3 < list.size()) {
            this.output.writeUInt32NoTag(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int i2, long j2) {
        this.output.writeUInt64(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int i2, List<Long> list, boolean z) {
        if (list instanceof LongArrayList) {
            writeUInt64ListInternal(i2, (LongArrayList) list, z);
        } else {
            writeUInt64ListInternal(i2, list, z);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroup(int i2, Object obj) {
        this.output.writeGroup(i2, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i2, List<?> list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            writeGroup(i2, list.get(i3), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i2, List<?> list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            writeMessage(i2, list.get(i3), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i2, Object obj) {
        this.output.writeMessage(i2, (MessageLite) obj);
    }

    private void writeBoolListInternal(int i2, BooleanArrayList booleanArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < booleanArrayList.size(); i5++) {
                booleanArrayList.getBoolean(i5);
                i4++;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < booleanArrayList.size()) {
                this.output.writeBoolNoTag(booleanArrayList.getBoolean(i3));
                i3++;
            }
            return;
        }
        while (i3 < booleanArrayList.size()) {
            this.output.writeBool(i2, booleanArrayList.getBoolean(i3));
            i3++;
        }
    }

    private void writeDoubleListInternal(int i2, DoubleArrayList doubleArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < doubleArrayList.size(); i5++) {
                doubleArrayList.getDouble(i5);
                i4 += 8;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < doubleArrayList.size()) {
                this.output.writeDoubleNoTag(doubleArrayList.getDouble(i3));
                i3++;
            }
            return;
        }
        while (i3 < doubleArrayList.size()) {
            this.output.writeDouble(i2, doubleArrayList.getDouble(i3));
            i3++;
        }
    }

    private void writeFixed32ListInternal(int i2, IntArrayList intArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                intArrayList.getInt(i5);
                i4 += 4;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < intArrayList.size()) {
                this.output.writeFixed32NoTag(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.output.writeFixed32(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    private void writeFixed64ListInternal(int i2, LongArrayList longArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                longArrayList.getLong(i5);
                i4 += 8;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < longArrayList.size()) {
                this.output.writeFixed64NoTag(longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.output.writeFixed64(i2, longArrayList.getLong(i3));
            i3++;
        }
    }

    private void writeFloatListInternal(int i2, FloatArrayList floatArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < floatArrayList.size(); i5++) {
                floatArrayList.getFloat(i5);
                i4 += 4;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < floatArrayList.size()) {
                this.output.writeFloatNoTag(floatArrayList.getFloat(i3));
                i3++;
            }
            return;
        }
        while (i3 < floatArrayList.size()) {
            this.output.writeFloat(i2, floatArrayList.getFloat(i3));
            i3++;
        }
    }

    private void writeSFixed32ListInternal(int i2, IntArrayList intArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                intArrayList.getInt(i5);
                i4 += 4;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < intArrayList.size()) {
                this.output.writeSFixed32NoTag(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.output.writeSFixed32(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    private void writeSFixed64ListInternal(int i2, LongArrayList longArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                longArrayList.getLong(i5);
                i4 += 8;
            }
            this.output.writeUInt32NoTag(i4);
            while (i3 < longArrayList.size()) {
                this.output.writeSFixed64NoTag(longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.output.writeSFixed64(i2, longArrayList.getLong(i3));
            i3++;
        }
    }

    private void writeEnumListInternal(int i2, IntArrayList intArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i3 < intArrayList.size()) {
                this.output.writeEnumNoTag(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.output.writeEnum(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    private void writeInt32ListInternal(int i2, IntArrayList intArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i3 < intArrayList.size()) {
                this.output.writeInt32NoTag(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.output.writeInt32(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    private void writeInt64ListInternal(int i2, LongArrayList longArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i3 < longArrayList.size()) {
                this.output.writeInt64NoTag(longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.output.writeInt64(i2, longArrayList.getLong(i3));
            i3++;
        }
    }

    private void writeSInt32ListInternal(int i2, IntArrayList intArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeSInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
            while (i3 < intArrayList.size()) {
                this.output.writeSInt32NoTag(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.output.writeSInt32(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    private void writeSInt64ListInternal(int i2, LongArrayList longArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i3 < longArrayList.size()) {
                this.output.writeSInt64NoTag(longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.output.writeSInt64(i2, longArrayList.getLong(i3));
            i3++;
        }
    }

    private void writeUInt32ListInternal(int i2, IntArrayList intArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeUInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < intArrayList.size(); i4++) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i4));
            }
            this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
            while (i3 < intArrayList.size()) {
                this.output.writeUInt32NoTag(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.output.writeUInt32(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    private void writeUInt64ListInternal(int i2, LongArrayList longArrayList, boolean z) {
        int i3 = 0;
        if (z) {
            this.output.writeTag(i2, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i4 = 0; i4 < longArrayList.size(); i4++) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i4));
            }
            this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i3 < longArrayList.size()) {
                this.output.writeUInt64NoTag(longArrayList.getLong(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.output.writeUInt64(i2, longArrayList.getLong(i3));
            i3++;
        }
    }
}
