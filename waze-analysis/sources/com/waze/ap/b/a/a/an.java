package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class an extends com.google.v.du<an, am> implements fj {
    public static final int CAPPING_CONFIGURATION_FIELD_NUMBER = 1;
    private static final an DEFAULT_INSTANCE;
    private static volatile fo<an> PARSER;
    private int bitField0_;
    private n cappingConfiguration_;

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        com.google.v.du.registerDefaultInstance(an.class, anVar);
    }

    private an() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCappingConfiguration() {
        this.cappingConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static an getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        n nVar2 = this.cappingConfiguration_;
        if (nVar2 != null && nVar2 != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder(nVar2);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.cappingConfiguration_ = nVar;
        this.bitField0_ |= 1;
    }

    public static am newBuilder() {
        return (am) DEFAULT_INSTANCE.createBuilder();
    }

    public static an parseDelimitedFrom(InputStream inputStream) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(com.google.v.v vVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<an> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCappingConfiguration(n nVar) {
        Objects.requireNonNull(nVar);
        this.cappingConfiguration_ = nVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "cappingConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new an();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new am(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<an> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (an.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getCappingConfiguration() {
        n nVar = this.cappingConfiguration_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public boolean hasCappingConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static am newBuilder(an anVar) {
        return (am) DEFAULT_INSTANCE.createBuilder(anVar);
    }

    public static an parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static an parseFrom(com.google.v.z zVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static an parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static an parseFrom(InputStream inputStream) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(ByteBuffer byteBuffer) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static an parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static an parseFrom(byte[] bArr) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static an parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (an) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
