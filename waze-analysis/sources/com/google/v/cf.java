package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cf extends dq<cf, ce> implements fj {
    private static final cf DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
    public static final int FEATURES_FIELD_NUMBER = 12;
    public static final int GO_API_FLAG_FIELD_NUMBER = 10;
    public static final int MAP_ENTRY_FIELD_NUMBER = 7;
    public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
    public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
    private static volatile fo<cf> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private bj features_;
    private boolean mapEntry_;
    private boolean messageSetWireFormat_;
    private boolean noStandardDescriptorAccessor_;
    private byte memoizedIsInitialized = 2;
    private String goApiFlag_ = "";
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        cf cfVar = new cf();
        DEFAULT_INSTANCE = cfVar;
        du.registerDefaultInstance(cf.class, cfVar);
    }

    private cf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends cx> iterable) {
        ensureUninterpretedOptionIsMutable();
        c.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -5;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedLegacyJsonFieldConflicts() {
        this.bitField0_ &= -33;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoApiFlag() {
        this.bitField0_ &= -17;
        this.goApiFlag_ = getDefaultInstance().getGoApiFlag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapEntry() {
        this.bitField0_ &= -9;
        this.mapEntry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageSetWireFormat() {
        this.bitField0_ &= -2;
        this.messageSetWireFormat_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoStandardDescriptorAccessor() {
        this.bitField0_ &= -3;
        this.noStandardDescriptorAccessor_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        eo<cx> eoVar = this.uninterpretedOption_;
        if (eoVar.c()) {
            return;
        }
        this.uninterpretedOption_ = du.mutableCopy(eoVar);
    }

    public static cf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.features_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            az azVarNewBuilder = bj.newBuilder(bjVar2);
            azVarNewBuilder.mergeFrom((az) bjVar);
            bjVar = azVarNewBuilder.buildPartial();
        }
        this.features_ = bjVar;
        this.bitField0_ |= 64;
    }

    public static ce newBuilder() {
        return (ce) DEFAULT_INSTANCE.createBuilder();
    }

    public static cf parseDelimitedFrom(InputStream inputStream) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(v vVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 4;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedLegacyJsonFieldConflicts(boolean z) {
        this.bitField0_ |= 32;
        this.deprecatedLegacyJsonFieldConflicts_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoApiFlag(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.goApiFlag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoApiFlagBytes(v vVar) {
        this.goApiFlag_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapEntry(boolean z) {
        this.bitField0_ |= 8;
        this.mapEntry_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageSetWireFormat(boolean z) {
        this.bitField0_ |= 1;
        this.messageSetWireFormat_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoStandardDescriptorAccessor(boolean z) {
        this.bitField0_ |= 2;
        this.noStandardDescriptorAccessor_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i2, cxVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004\u000bဇ\u0005\fᐉ\u0006ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "goApiFlag_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", cx.class});
            case 3:
                return new cf();
            case 4:
                return new ce(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<cf> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cf.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public String getGoApiFlag() {
        return this.goApiFlag_;
    }

    public v getGoApiFlagBytes() {
        return v.s(this.goApiFlag_);
    }

    public boolean getMapEntry() {
        return this.mapEntry_;
    }

    public boolean getMessageSetWireFormat() {
        return this.messageSetWireFormat_;
    }

    public boolean getNoStandardDescriptorAccessor() {
        return this.noStandardDescriptorAccessor_;
    }

    public cx getUninterpretedOption(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List<cx> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public cy getUninterpretedOptionOrBuilder(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public List<? extends cy> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasGoApiFlag() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMapEntry() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMessageSetWireFormat() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNoStandardDescriptorAccessor() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ce newBuilder(cf cfVar) {
        return (ce) DEFAULT_INSTANCE.createBuilder(cfVar);
    }

    public static cf parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(v vVar, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cf parseFrom(z zVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cf parseFrom(z zVar, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static cf parseFrom(InputStream inputStream) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(InputStream inputStream, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(ByteBuffer byteBuffer) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cf parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cf parseFrom(byte[] bArr) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cf parseFrom(byte[] bArr, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
