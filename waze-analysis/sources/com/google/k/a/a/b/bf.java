package com.google.k.a.a.b;

import com.google.k.a.a.nl;
import com.google.k.a.a.np;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends com.google.v.du<bf, be> implements bg {
    private static final bf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bf> PARSER = null;
    public static final int TRAVEL_PATTERN_FIELD_NUMBER = 1;
    private int bitField0_;
    private np travelPattern_;

    static {
        bf bfVar = new bf();
        DEFAULT_INSTANCE = bfVar;
        com.google.v.du.registerDefaultInstance(bf.class, bfVar);
    }

    private bf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelPattern() {
        this.travelPattern_ = null;
        this.bitField0_ &= -2;
    }

    public static bf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTravelPattern(np npVar) {
        Objects.requireNonNull(npVar);
        np npVar2 = this.travelPattern_;
        if (npVar2 != null && npVar2 != np.getDefaultInstance()) {
            nl nlVarNewBuilder = np.newBuilder(npVar2);
            nlVarNewBuilder.mergeFrom((nl) npVar);
            npVar = nlVarNewBuilder.buildPartial();
        }
        this.travelPattern_ = npVar;
        this.bitField0_ |= 1;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bf parseDelimitedFrom(InputStream inputStream) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(com.google.v.v vVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelPattern(np npVar) {
        Objects.requireNonNull(npVar);
        this.travelPattern_ = npVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "travelPattern_"});
        }
        if (iOrdinal == 3) {
            return new bf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public np getTravelPattern() {
        np npVar = this.travelPattern_;
        return npVar == null ? np.getDefaultInstance() : npVar;
    }

    public boolean hasTravelPattern() {
        return (this.bitField0_ & 1) != 0;
    }

    public static be newBuilder(bf bfVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bfVar);
    }

    public static bf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bf parseFrom(com.google.v.z zVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bf parseFrom(InputStream inputStream) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(ByteBuffer byteBuffer) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bf parseFrom(byte[] bArr) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
