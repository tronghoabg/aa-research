package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends com.google.v.du<x, v> implements y {
    public static final int APPLICATION_DATA_FIELD_NUMBER = 13;
    public static final int ATTRIBUTE_DISPLAY_FIELD_NUMBER = 11;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 8;
    public static final int CANONICAL_ATTRIBUTE_ID_FIELD_NUMBER = 2;
    private static final x DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 7;
    public static final int ENUM_ID_VALUE_FIELD_NUMBER = 19;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 15;
    public static final int INT64_VALUE_FIELD_NUMBER = 14;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 6;
    public static final int ITEM_CLASS_ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<x> PARSER = null;
    public static final int PROTO_VALUE_FIELD_NUMBER = 9;
    public static final int STRING_VALUE_FIELD_NUMBER = 5;
    public static final int UINT32_VALUE_FIELD_NUMBER = 18;
    public static final int VALUE_DISPLAY_FIELD_NUMBER = 12;
    public static final int VALUE_SPACE_ID_FIELD_NUMBER = 3;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private com.google.w.n.a.b applicationData_;
    private int bitField0_;
    private boolean booleanValue_;
    private u canonicalAttributeId_;
    private double doubleValue_;
    private float floatValue_;
    private long int64Value_;
    private int integerValue_;
    private u itemClassId_;
    private ce metadata_;
    private com.google.w.n.a.b protoValue_;
    private int uint32Value_;
    private u valueSpaceId_;
    private int valueType_;
    private byte memoizedIsInitialized = 2;
    private String stringValue_ = "";
    private String enumIdValue_ = "";
    private com.google.v.eo<aa> attributeDisplay_ = emptyProtobufList();
    private com.google.v.eo<aa> valueDisplay_ = emptyProtobufList();

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.v.du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributeDisplay(Iterable<? extends aa> iterable) {
        ensureAttributeDisplayIsMutable();
        com.google.v.c.addAll(iterable, this.attributeDisplay_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValueDisplay(Iterable<? extends aa> iterable) {
        ensureValueDisplayIsMutable();
        com.google.v.c.addAll(iterable, this.valueDisplay_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributeDisplay(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureAttributeDisplayIsMutable();
        this.attributeDisplay_.add(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValueDisplay(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureValueDisplayIsMutable();
        this.valueDisplay_.add(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationData() {
        this.applicationData_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributeDisplay() {
        this.attributeDisplay_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBooleanValue() {
        this.bitField0_ &= -1025;
        this.booleanValue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanonicalAttributeId() {
        this.canonicalAttributeId_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -257;
        this.doubleValue_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumIdValue() {
        this.bitField0_ &= -2049;
        this.enumIdValue_ = getDefaultInstance().getEnumIdValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatValue() {
        this.bitField0_ &= -513;
        this.floatValue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInt64Value() {
        this.bitField0_ &= -65;
        this.int64Value_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntegerValue() {
        this.bitField0_ &= -33;
        this.integerValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemClassId() {
        this.itemClassId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtoValue() {
        this.protoValue_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -17;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUint32Value() {
        this.bitField0_ &= -129;
        this.uint32Value_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueDisplay() {
        this.valueDisplay_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueSpaceId() {
        this.valueSpaceId_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.bitField0_ &= -9;
        this.valueType_ = 0;
    }

    private void ensureAttributeDisplayIsMutable() {
        com.google.v.eo<aa> eoVar = this.attributeDisplay_;
        if (eoVar.c()) {
            return;
        }
        this.attributeDisplay_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureValueDisplayIsMutable() {
        com.google.v.eo<aa> eoVar = this.valueDisplay_;
        if (eoVar.c()) {
            return;
        }
        this.valueDisplay_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.applicationData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.applicationData_ = bVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCanonicalAttributeId(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.canonicalAttributeId_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            s sVarNewBuilder = u.newBuilder(uVar2);
            sVarNewBuilder.mergeFrom((s) uVar);
            uVar = sVarNewBuilder.buildPartial();
        }
        this.canonicalAttributeId_ = uVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeItemClassId(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.itemClassId_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            s sVarNewBuilder = u.newBuilder(uVar2);
            sVarNewBuilder.mergeFrom((s) uVar);
            uVar = sVarNewBuilder.buildPartial();
        }
        this.itemClassId_ = uVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProtoValue(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.protoValue_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.protoValue_ = bVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValueSpaceId(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.valueSpaceId_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            s sVarNewBuilder = u.newBuilder(uVar2);
            sVarNewBuilder.mergeFrom((s) uVar);
            uVar = sVarNewBuilder.buildPartial();
        }
        this.valueSpaceId_ = uVar;
        this.bitField0_ |= 4;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributeDisplay(int i2) {
        ensureAttributeDisplayIsMutable();
        this.attributeDisplay_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValueDisplay(int i2) {
        ensureValueDisplayIsMutable();
        this.valueDisplay_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.applicationData_ = bVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributeDisplay(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureAttributeDisplayIsMutable();
        this.attributeDisplay_.set(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBooleanValue(boolean z) {
        this.bitField0_ |= 1024;
        this.booleanValue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalAttributeId(u uVar) {
        Objects.requireNonNull(uVar);
        this.canonicalAttributeId_ = uVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d2) {
        this.bitField0_ |= 256;
        this.doubleValue_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumIdValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.enumIdValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumIdValueBytes(com.google.v.v vVar) {
        this.enumIdValue_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatValue(float f2) {
        this.bitField0_ |= 512;
        this.floatValue_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInt64Value(long j2) {
        this.bitField0_ |= 64;
        this.int64Value_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegerValue(int i2) {
        this.bitField0_ |= 32;
        this.integerValue_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemClassId(u uVar) {
        Objects.requireNonNull(uVar);
        this.itemClassId_ = uVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtoValue(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.protoValue_ = bVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.stringValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.v.v vVar) {
        this.stringValue_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUint32Value(int i2) {
        this.bitField0_ |= 128;
        this.uint32Value_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueDisplay(int i2, aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureValueDisplayIsMutable();
        this.valueDisplay_.set(i2, aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueSpaceId(u uVar) {
        Objects.requireNonNull(uVar);
        this.valueSpaceId_ = uVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(w wVar) {
        this.valueType_ = wVar.getNumber();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001Ǵ\u0011\u0000\u0002\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᴌ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007က\b\bဇ\n\tᐉ\f\u000b\u001b\f\u001b\rᐉ\r\u000eဂ\u0006\u000fခ\t\u0012ဆ\u0007\u0013ဈ\u000bǴဉ\u000e", new Object[]{"bitField0_", "itemClassId_", "canonicalAttributeId_", "valueSpaceId_", "valueType_", c.f11201e, "stringValue_", "integerValue_", "doubleValue_", "booleanValue_", "protoValue_", "attributeDisplay_", aa.class, "valueDisplay_", aa.class, "applicationData_", "int64Value_", "floatValue_", "uint32Value_", "enumIdValue_", "metadata_"});
            case 3:
                return new x();
            case 4:
                return new v(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<x> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (x.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    @Deprecated
    public com.google.w.n.a.b getApplicationData() {
        com.google.w.n.a.b bVar = this.applicationData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    @Deprecated
    public aa getAttributeDisplay(int i2) {
        return this.attributeDisplay_.get(i2);
    }

    @Deprecated
    public int getAttributeDisplayCount() {
        return this.attributeDisplay_.size();
    }

    @Deprecated
    public List<aa> getAttributeDisplayList() {
        return this.attributeDisplay_;
    }

    @Deprecated
    public ab getAttributeDisplayOrBuilder(int i2) {
        return this.attributeDisplay_.get(i2);
    }

    @Deprecated
    public List<? extends ab> getAttributeDisplayOrBuilderList() {
        return this.attributeDisplay_;
    }

    public boolean getBooleanValue() {
        return this.booleanValue_;
    }

    public u getCanonicalAttributeId() {
        u uVar = this.canonicalAttributeId_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public String getEnumIdValue() {
        return this.enumIdValue_;
    }

    public com.google.v.v getEnumIdValueBytes() {
        return com.google.v.v.s(this.enumIdValue_);
    }

    public float getFloatValue() {
        return this.floatValue_;
    }

    public long getInt64Value() {
        return this.int64Value_;
    }

    public int getIntegerValue() {
        return this.integerValue_;
    }

    @Deprecated
    public u getItemClassId() {
        u uVar = this.itemClassId_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    @Deprecated
    public com.google.w.n.a.b getProtoValue() {
        com.google.w.n.a.b bVar = this.protoValue_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public String getStringValue() {
        return this.stringValue_;
    }

    public com.google.v.v getStringValueBytes() {
        return com.google.v.v.s(this.stringValue_);
    }

    public int getUint32Value() {
        return this.uint32Value_;
    }

    @Deprecated
    public aa getValueDisplay(int i2) {
        return this.valueDisplay_.get(i2);
    }

    @Deprecated
    public int getValueDisplayCount() {
        return this.valueDisplay_.size();
    }

    @Deprecated
    public List<aa> getValueDisplayList() {
        return this.valueDisplay_;
    }

    @Deprecated
    public ab getValueDisplayOrBuilder(int i2) {
        return this.valueDisplay_.get(i2);
    }

    @Deprecated
    public List<? extends ab> getValueDisplayOrBuilderList() {
        return this.valueDisplay_;
    }

    @Deprecated
    public u getValueSpaceId() {
        u uVar = this.valueSpaceId_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public w getValueType() {
        w wVarA = w.a(this.valueType_);
        return wVarA == null ? w.NONE : wVarA;
    }

    @Deprecated
    public boolean hasApplicationData() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasBooleanValue() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCanonicalAttributeId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDoubleValue() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasEnumIdValue() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasFloatValue() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasInt64Value() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIntegerValue() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasItemClassId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Deprecated
    public boolean hasProtoValue() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUint32Value() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasValueSpaceId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasValueType() {
        return (this.bitField0_ & 8) != 0;
    }

    public static v newBuilder(x xVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributeDisplay(aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureAttributeDisplayIsMutable();
        this.attributeDisplay_.add(aaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValueDisplay(aa aaVar) {
        Objects.requireNonNull(aaVar);
        ensureValueDisplayIsMutable();
        this.valueDisplay_.add(aaVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (x) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
