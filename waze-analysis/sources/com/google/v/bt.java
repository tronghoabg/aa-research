package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bt extends du<bt, bs> implements fj {
    private static final bt DEFAULT_INSTANCE;
    public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
    public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
    public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
    public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
    private static volatile fo<bt> PARSER = null;
    public static final int REMOVAL_ERROR_FIELD_NUMBER = 5;
    private int bitField0_;
    private int editionDeprecated_;
    private int editionIntroduced_;
    private int editionRemoved_;
    private String deprecationWarning_ = "";
    private String removalError_ = "";

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        du.registerDefaultInstance(bt.class, btVar);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecationWarning() {
        this.bitField0_ &= -5;
        this.deprecationWarning_ = getDefaultInstance().getDeprecationWarning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionDeprecated() {
        this.bitField0_ &= -3;
        this.editionDeprecated_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionIntroduced() {
        this.bitField0_ &= -2;
        this.editionIntroduced_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionRemoved() {
        this.bitField0_ &= -9;
        this.editionRemoved_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemovalError() {
        this.bitField0_ &= -17;
        this.removalError_ = getDefaultInstance().getRemovalError();
    }

    public static bt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bs newBuilder() {
        return (bs) DEFAULT_INSTANCE.createBuilder();
    }

    public static bt parseDelimitedFrom(InputStream inputStream) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(v vVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationWarning(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.deprecationWarning_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecationWarningBytes(v vVar) {
        this.deprecationWarning_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionDeprecated(am amVar) {
        this.editionDeprecated_ = amVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionIntroduced(am amVar) {
        this.editionIntroduced_ = amVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionRemoved(am amVar) {
        this.editionRemoved_ = amVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovalError(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.removalError_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovalErrorBytes(v vVar) {
        this.removalError_ = vVar.u();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            am amVar = am.EDITION_UNKNOWN;
            ei eiVar = ai.f12653c;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "editionIntroduced_", eiVar, "editionDeprecated_", eiVar, "deprecationWarning_", "editionRemoved_", eiVar, "removalError_"});
        }
        if (iOrdinal == 3) {
            return new bt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDeprecationWarning() {
        return this.deprecationWarning_;
    }

    public v getDeprecationWarningBytes() {
        return v.s(this.deprecationWarning_);
    }

    public am getEditionDeprecated() {
        am amVarA = am.a(this.editionDeprecated_);
        return amVarA == null ? am.EDITION_UNKNOWN : amVarA;
    }

    public am getEditionIntroduced() {
        am amVarA = am.a(this.editionIntroduced_);
        return amVarA == null ? am.EDITION_UNKNOWN : amVarA;
    }

    public am getEditionRemoved() {
        am amVarA = am.a(this.editionRemoved_);
        return amVarA == null ? am.EDITION_UNKNOWN : amVarA;
    }

    public String getRemovalError() {
        return this.removalError_;
    }

    public v getRemovalErrorBytes() {
        return v.s(this.removalError_);
    }

    public boolean hasDeprecationWarning() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEditionDeprecated() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEditionIntroduced() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasEditionRemoved() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRemovalError() {
        return (this.bitField0_ & 16) != 0;
    }

    public static bs newBuilder(bt btVar) {
        return (bs) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(v vVar, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(z zVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(z zVar, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, de deVar) {
        return (bt) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
