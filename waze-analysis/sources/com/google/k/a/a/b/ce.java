package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ce extends com.google.v.du<ce, cd> implements com.google.v.fj {
    private static final ce DEFAULT_INSTANCE;
    public static final int INTERNAL_FIELD_NUMBER = 15;
    private static volatile com.google.v.fo<ce> PARSER;
    private int bitField0_;
    private co internal_;

    static {
        ce ceVar = new ce();
        DEFAULT_INSTANCE = ceVar;
        com.google.v.du.registerDefaultInstance(ce.class, ceVar);
    }

    private ce() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternal() {
        this.internal_ = null;
        this.bitField0_ &= -2;
    }

    public static ce getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInternal(co coVar) {
        Objects.requireNonNull(coVar);
        co coVar2 = this.internal_;
        if (coVar2 != null && coVar2 != co.getDefaultInstance()) {
            cn cnVarNewBuilder = co.newBuilder(coVar2);
            cnVarNewBuilder.mergeFrom((cn) coVar);
            coVar = cnVarNewBuilder.buildPartial();
        }
        this.internal_ = coVar;
        this.bitField0_ |= 1;
    }

    public static cd newBuilder() {
        return (cd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ce parseDelimitedFrom(InputStream inputStream) {
        return (ce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ce parseFrom(com.google.v.v vVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ce> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternal(co coVar) {
        Objects.requireNonNull(coVar);
        this.internal_ = coVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"bitField0_", "internal_"});
        }
        if (iOrdinal == 3) {
            return new ce();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ce> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ce.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public co getInternal() {
        co coVar = this.internal_;
        return coVar == null ? co.getDefaultInstance() : coVar;
    }

    public boolean hasInternal() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cd newBuilder(ce ceVar) {
        return (cd) DEFAULT_INSTANCE.createBuilder(ceVar);
    }

    public static ce parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ce) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ce parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ce parseFrom(com.google.v.z zVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ce parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ce parseFrom(InputStream inputStream) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ce parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ce parseFrom(ByteBuffer byteBuffer) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ce parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ce parseFrom(byte[] bArr) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ce parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ce) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
