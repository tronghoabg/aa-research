package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class co extends com.google.v.du<co, cn> implements com.google.v.fj {
    private static final co DEFAULT_INSTANCE;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<co> PARSER = null;
    public static final int SOURCE_SUMMARY_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isAuto_;
    private cq sourceSummary_;

    static {
        co coVar = new co();
        DEFAULT_INSTANCE = coVar;
        com.google.v.du.registerDefaultInstance(co.class, coVar);
    }

    private co() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceSummary() {
        this.sourceSummary_ = null;
        this.bitField0_ &= -2;
    }

    public static co getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceSummary(cq cqVar) {
        Objects.requireNonNull(cqVar);
        cq cqVar2 = this.sourceSummary_;
        if (cqVar2 != null && cqVar2 != cq.getDefaultInstance()) {
            cp cpVarNewBuilder = cq.newBuilder(cqVar2);
            cpVarNewBuilder.mergeFrom((cp) cqVar);
            cqVar = cpVarNewBuilder.buildPartial();
        }
        this.sourceSummary_ = cqVar;
        this.bitField0_ |= 1;
    }

    public static cn newBuilder() {
        return (cn) DEFAULT_INSTANCE.createBuilder();
    }

    public static co parseDelimitedFrom(InputStream inputStream) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(com.google.v.v vVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<co> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z) {
        this.bitField0_ |= 2;
        this.isAuto_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceSummary(cq cqVar) {
        Objects.requireNonNull(cqVar);
        this.sourceSummary_ = cqVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "sourceSummary_", "isAuto_"});
        }
        if (iOrdinal == 3) {
            return new co();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<co> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (co.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public cq getSourceSummary() {
        cq cqVar = this.sourceSummary_;
        return cqVar == null ? cq.getDefaultInstance() : cqVar;
    }

    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSourceSummary() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cn newBuilder(co coVar) {
        return (cn) DEFAULT_INSTANCE.createBuilder(coVar);
    }

    public static co parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static co parseFrom(com.google.v.z zVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static co parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static co parseFrom(InputStream inputStream) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(ByteBuffer byteBuffer) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static co parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static co parseFrom(byte[] bArr) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static co parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
