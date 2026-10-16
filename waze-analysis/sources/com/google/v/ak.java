package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak extends du<ak, ag> implements fj {
    private static final ak DEFAULT_INSTANCE;
    public static final int ENUM_NAME_USES_STRING_VIEW_FIELD_NUMBER = 3;
    public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
    private static volatile fo<ak> PARSER = null;
    public static final int REPEATED_TYPE_FIELD_NUMBER = 4;
    public static final int STRING_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean enumNameUsesStringView_;
    private boolean legacyClosedEnum_;
    private int repeatedType_;
    private int stringType_;

    static {
        ak akVar = new ak();
        DEFAULT_INSTANCE = akVar;
        du.registerDefaultInstance(ak.class, akVar);
    }

    private ak() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumNameUsesStringView() {
        this.bitField0_ &= -5;
        this.enumNameUsesStringView_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyClosedEnum() {
        this.bitField0_ &= -2;
        this.legacyClosedEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRepeatedType() {
        this.bitField0_ &= -9;
        this.repeatedType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringType() {
        this.bitField0_ &= -3;
        this.stringType_ = 0;
    }

    public static ak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ak parseDelimitedFrom(InputStream inputStream) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(v vVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumNameUsesStringView(boolean z) {
        this.bitField0_ |= 4;
        this.enumNameUsesStringView_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyClosedEnum(boolean z) {
        this.bitField0_ |= 1;
        this.legacyClosedEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRepeatedType(ah ahVar) {
        this.repeatedType_ = ahVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringType(aj ajVar) {
        this.stringType_ = ajVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "legacyClosedEnum_", "stringType_", ai.f12651a, "enumNameUsesStringView_", "repeatedType_", ai.f12652b});
        }
        if (iOrdinal == 3) {
            return new ak();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getEnumNameUsesStringView() {
        return this.enumNameUsesStringView_;
    }

    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    public ah getRepeatedType() {
        ah ahVarA = ah.a(this.repeatedType_);
        return ahVarA == null ? ah.REPEATED_TYPE_UNKNOWN : ahVarA;
    }

    public aj getStringType() {
        aj ajVarA = aj.a(this.stringType_);
        return ajVarA == null ? aj.STRING_TYPE_UNKNOWN : ajVarA;
    }

    public boolean hasEnumNameUsesStringView() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLegacyClosedEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRepeatedType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStringType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ag newBuilder(ak akVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(akVar);
    }

    public static ak parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(v vVar, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ak parseFrom(z zVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ak parseFrom(z zVar, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ak parseFrom(InputStream inputStream) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(InputStream inputStream, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(ByteBuffer byteBuffer) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ak parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ak parseFrom(byte[] bArr) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ak parseFrom(byte[] bArr, de deVar) {
        return (ak) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
