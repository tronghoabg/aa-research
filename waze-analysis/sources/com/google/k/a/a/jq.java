package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jq extends com.google.v.du<jq, jp> implements jr {
    private static final jq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jq> PARSER = null;
    public static final int RESTRICTION_TYPE_FIELD_NUMBER = 2;
    public static final int TRAVEL_PATTERN_FIELD_NUMBER = 14;
    private int bitField0_;
    private int restrictionType_ = 17;
    private np travelPattern_;

    static {
        jq jqVar = new jq();
        DEFAULT_INSTANCE = jqVar;
        com.google.v.du.registerDefaultInstance(jq.class, jqVar);
    }

    private jq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionType() {
        this.bitField0_ &= -3;
        this.restrictionType_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelPattern() {
        this.travelPattern_ = null;
        this.bitField0_ &= -2;
    }

    public static jq getDefaultInstance() {
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

    public static jp newBuilder() {
        return (jp) DEFAULT_INSTANCE.createBuilder();
    }

    public static jq parseDelimitedFrom(InputStream inputStream) {
        return (jq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jq parseFrom(com.google.v.v vVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionType(com.google.k.a.a.b.gh ghVar) {
        this.restrictionType_ = ghVar.getNumber();
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u000e\u0002\u0000\u0000\u0000\u0002᠌\u0001\u000eဉ\u0000", new Object[]{"bitField0_", "restrictionType_", com.google.k.a.a.b.gh.b(), "travelPattern_"});
        }
        if (iOrdinal == 3) {
            return new jq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.a.a.b.gh getRestrictionType() {
        com.google.k.a.a.b.gh ghVarA = com.google.k.a.a.b.gh.a(this.restrictionType_);
        return ghVarA == null ? com.google.k.a.a.b.gh.RESTRICTION_TRAVEL_RESTRICTED : ghVarA;
    }

    public np getTravelPattern() {
        np npVar = this.travelPattern_;
        return npVar == null ? np.getDefaultInstance() : npVar;
    }

    public boolean hasRestrictionType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTravelPattern() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jp newBuilder(jq jqVar) {
        return (jp) DEFAULT_INSTANCE.createBuilder(jqVar);
    }

    public static jq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jq parseFrom(com.google.v.z zVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jq parseFrom(InputStream inputStream) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jq parseFrom(ByteBuffer byteBuffer) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jq parseFrom(byte[] bArr) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
