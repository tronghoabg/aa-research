package com.google.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ey extends du<ey, ev> implements fj {
    private static final ey DEFAULT_INSTANCE;
    public static final int LARGE_ENUM_FIELD_NUMBER = 3;
    public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
    public static final int NEST_IN_FILE_CLASS_FIELD_NUMBER = 5;
    private static volatile fo<ey> PARSER = null;
    public static final int USE_OLD_OUTER_CLASSNAME_DEFAULT_FIELD_NUMBER = 4;
    public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean largeEnum_;
    private boolean legacyClosedEnum_;
    private int nestInFileClass_;
    private boolean useOldOuterClassnameDefault_;
    private int utf8Validation_;

    static {
        ey eyVar = new ey();
        DEFAULT_INSTANCE = eyVar;
        du.registerDefaultInstance(ey.class, eyVar);
    }

    private ey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeEnum() {
        this.bitField0_ &= -5;
        this.largeEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyClosedEnum() {
        this.bitField0_ &= -2;
        this.legacyClosedEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestInFileClass() {
        this.bitField0_ &= -17;
        this.nestInFileClass_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseOldOuterClassnameDefault() {
        this.bitField0_ &= -9;
        this.useOldOuterClassnameDefault_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtf8Validation() {
        this.bitField0_ &= -3;
        this.utf8Validation_ = 0;
    }

    public static ey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ev newBuilder() {
        return (ev) DEFAULT_INSTANCE.createBuilder();
    }

    public static ey parseDelimitedFrom(InputStream inputStream) {
        return (ey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ey parseFrom(v vVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeEnum(boolean z) {
        this.bitField0_ |= 4;
        this.largeEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyClosedEnum(boolean z) {
        this.bitField0_ |= 1;
        this.legacyClosedEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNestInFileClass(ew ewVar) {
        this.nestInFileClass_ = ewVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseOldOuterClassnameDefault(boolean z) {
        this.bitField0_ |= 8;
        this.useOldOuterClassnameDefault_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtf8Validation(ex exVar) {
        this.utf8Validation_ = exVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "legacyClosedEnum_", "utf8Validation_", cl.f12820h, "largeEnum_", "useOldOuterClassnameDefault_", "nestInFileClass_", cl.f12819g});
        }
        if (iOrdinal == 3) {
            return new ey();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ev(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ey> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ey.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getLargeEnum() {
        return this.largeEnum_;
    }

    public boolean getLegacyClosedEnum() {
        return this.legacyClosedEnum_;
    }

    public ew getNestInFileClass() {
        ew ewVarA = ew.a(this.nestInFileClass_);
        return ewVarA == null ? ew.NEST_IN_FILE_CLASS_UNKNOWN : ewVarA;
    }

    public boolean getUseOldOuterClassnameDefault() {
        return this.useOldOuterClassnameDefault_;
    }

    public ex getUtf8Validation() {
        ex exVarA = ex.a(this.utf8Validation_);
        return exVarA == null ? ex.UTF8_VALIDATION_UNKNOWN : exVarA;
    }

    public boolean hasLargeEnum() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLegacyClosedEnum() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNestInFileClass() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUseOldOuterClassnameDefault() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUtf8Validation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ev newBuilder(ey eyVar) {
        return (ev) DEFAULT_INSTANCE.createBuilder(eyVar);
    }

    public static ey parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ey parseFrom(v vVar, de deVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ey parseFrom(z zVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ey parseFrom(z zVar, de deVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ey parseFrom(InputStream inputStream) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ey parseFrom(InputStream inputStream, de deVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ey parseFrom(ByteBuffer byteBuffer) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ey parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ey parseFrom(byte[] bArr) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ey parseFrom(byte[] bArr, de deVar) {
        return (ey) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
