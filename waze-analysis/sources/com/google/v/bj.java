package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends dq<bj, az> implements fj {
    private static final bj DEFAULT_INSTANCE;
    public static final int DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER = 8;
    public static final int ENFORCE_NAMING_STYLE_FIELD_NUMBER = 7;
    public static final int ENFORCE_PROTO_LIMITS_FIELD_NUMBER = 9;
    public static final int ENUM_TYPE_FIELD_NUMBER = 2;
    public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
    public static final int JSON_FORMAT_FIELD_NUMBER = 6;
    public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
    private static volatile fo<bj> PARSER = null;
    public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
    private int bitField0_;
    private int defaultSymbolVisibility_;
    private int enforceNamingStyle_;
    private int enforceProtoLimits_;
    private int enumType_;
    private int fieldPresence_;
    private int jsonFormat_;
    private byte memoizedIsInitialized = 2;
    private int messageEncoding_;
    private int repeatedFieldEncoding_;
    private int utf8Validation_;

    static {
        bj bjVar = new bj();
        DEFAULT_INSTANCE = bjVar;
        du.registerDefaultInstance(bj.class, bjVar);
    }

    private bj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultSymbolVisibility() {
        this.bitField0_ &= -129;
        this.defaultSymbolVisibility_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnforceNamingStyle() {
        this.bitField0_ &= -65;
        this.enforceNamingStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnforceProtoLimits() {
        this.bitField0_ &= -257;
        this.enforceProtoLimits_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.bitField0_ &= -3;
        this.enumType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPresence() {
        this.bitField0_ &= -2;
        this.fieldPresence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonFormat() {
        this.bitField0_ &= -33;
        this.jsonFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageEncoding() {
        this.bitField0_ &= -17;
        this.messageEncoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepeatedFieldEncoding() {
        this.bitField0_ &= -5;
        this.repeatedFieldEncoding_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtf8Validation() {
        this.bitField0_ &= -9;
        this.utf8Validation_ = 0;
    }

    public static bj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static az newBuilder() {
        return (az) DEFAULT_INSTANCE.createBuilder();
    }

    public static bj parseDelimitedFrom(InputStream inputStream) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(v vVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultSymbolVisibility(bi biVar) {
        this.defaultSymbolVisibility_ = biVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnforceNamingStyle(ba baVar) {
        this.enforceNamingStyle_ = baVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnforceProtoLimits(bf bfVar) {
        this.enforceProtoLimits_ = bfVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(bb bbVar) {
        this.enumType_ = bbVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPresence(bc bcVar) {
        this.fieldPresence_ = bcVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonFormat(bd bdVar) {
        this.jsonFormat_ = bdVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageEncoding(be beVar) {
        this.messageEncoding_ = beVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepeatedFieldEncoding(bg bgVar) {
        this.repeatedFieldEncoding_ = bgVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtf8Validation(bh bhVar) {
        this.utf8Validation_ = bhVar.getNumber();
        this.bitField0_ |= 8;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"bitField0_", "fieldPresence_", ai.f12657g, "enumType_", ai.f12656f, "repeatedFieldEncoding_", ai.f12661k, "utf8Validation_", ai.f12662l, "messageEncoding_", ai.f12659i, "jsonFormat_", ai.f12658h, "enforceNamingStyle_", ai.f12655e, "defaultSymbolVisibility_", ai.m, "enforceProtoLimits_", ai.f12660j});
            case 3:
                return new bj();
            case 4:
                return new az(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<bj> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bj.class) {
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

    public bi getDefaultSymbolVisibility() {
        bi biVarA = bi.a(this.defaultSymbolVisibility_);
        return biVarA == null ? bi.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN : biVarA;
    }

    public ba getEnforceNamingStyle() {
        ba baVarA = ba.a(this.enforceNamingStyle_);
        return baVarA == null ? ba.ENFORCE_NAMING_STYLE_UNKNOWN : baVarA;
    }

    public bf getEnforceProtoLimits() {
        bf bfVarA = bf.a(this.enforceProtoLimits_);
        return bfVarA == null ? bf.PROTO_LIMITS_UNKNOWN : bfVarA;
    }

    public bb getEnumType() {
        bb bbVarA = bb.a(this.enumType_);
        return bbVarA == null ? bb.ENUM_TYPE_UNKNOWN : bbVarA;
    }

    public bc getFieldPresence() {
        bc bcVarA = bc.a(this.fieldPresence_);
        return bcVarA == null ? bc.FIELD_PRESENCE_UNKNOWN : bcVarA;
    }

    public bd getJsonFormat() {
        bd bdVarA = bd.a(this.jsonFormat_);
        return bdVarA == null ? bd.JSON_FORMAT_UNKNOWN : bdVarA;
    }

    public be getMessageEncoding() {
        be beVarA = be.a(this.messageEncoding_);
        return beVarA == null ? be.MESSAGE_ENCODING_UNKNOWN : beVarA;
    }

    public bg getRepeatedFieldEncoding() {
        bg bgVarA = bg.a(this.repeatedFieldEncoding_);
        return bgVarA == null ? bg.REPEATED_FIELD_ENCODING_UNKNOWN : bgVarA;
    }

    public bh getUtf8Validation() {
        bh bhVarA = bh.a(this.utf8Validation_);
        return bhVarA == null ? bh.UTF8_VALIDATION_UNKNOWN : bhVarA;
    }

    public boolean hasDefaultSymbolVisibility() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasEnforceNamingStyle() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasEnforceProtoLimits() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasEnumType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFieldPresence() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasJsonFormat() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMessageEncoding() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRepeatedFieldEncoding() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 8) != 0;
    }

    public static az newBuilder(bj bjVar) {
        return (az) DEFAULT_INSTANCE.createBuilder(bjVar);
    }

    public static bj parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(v vVar, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bj parseFrom(z zVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bj parseFrom(z zVar, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bj parseFrom(InputStream inputStream) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(InputStream inputStream, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(ByteBuffer byteBuffer) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bj parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bj parseFrom(byte[] bArr) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bj parseFrom(byte[] bArr, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
