package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bt extends com.google.v.du<bt, bs> implements com.google.v.fj {
    private static final bt DEFAULT_INSTANCE;
    public static final int DISPLAY_BRIEF_EXPLANATION_FIELD_NUMBER = 1;
    public static final int DISPLAY_VERBOSE_EXPLANATION_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bt> PARSER;
    private int bitField0_;
    private String displayBriefExplanation_ = "";
    private String displayVerboseExplanation_ = "";

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        com.google.v.du.registerDefaultInstance(bt.class, btVar);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayBriefExplanation() {
        this.bitField0_ &= -2;
        this.displayBriefExplanation_ = getDefaultInstance().getDisplayBriefExplanation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayVerboseExplanation() {
        this.bitField0_ &= -3;
        this.displayVerboseExplanation_ = getDefaultInstance().getDisplayVerboseExplanation();
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

    public static bt parseFrom(com.google.v.v vVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayBriefExplanation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.displayBriefExplanation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayBriefExplanationBytes(com.google.v.v vVar) {
        this.displayBriefExplanation_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayVerboseExplanation(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.displayVerboseExplanation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayVerboseExplanationBytes(com.google.v.v vVar) {
        this.displayVerboseExplanation_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "displayBriefExplanation_", "displayVerboseExplanation_"});
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
        com.google.v.fo<bt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDisplayBriefExplanation() {
        return this.displayBriefExplanation_;
    }

    public com.google.v.v getDisplayBriefExplanationBytes() {
        return com.google.v.v.s(this.displayBriefExplanation_);
    }

    public String getDisplayVerboseExplanation() {
        return this.displayVerboseExplanation_;
    }

    public com.google.v.v getDisplayVerboseExplanationBytes() {
        return com.google.v.v.s(this.displayVerboseExplanation_);
    }

    public boolean hasDisplayBriefExplanation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayVerboseExplanation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bs newBuilder(bt btVar) {
        return (bs) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(com.google.v.z zVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
