package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mt extends com.google.v.du<mt, mn> implements com.google.v.fj {
    private static final mt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<mt> PARSER = null;
    public static final int TOLL_CLUSTER_SEQUENCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private ms tollClusterSequence_;

    static {
        mt mtVar = new mt();
        DEFAULT_INSTANCE = mtVar;
        com.google.v.du.registerDefaultInstance(mt.class, mtVar);
    }

    private mt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollClusterSequence() {
        this.tollClusterSequence_ = null;
        this.bitField0_ &= -2;
    }

    public static mt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollClusterSequence(ms msVar) {
        Objects.requireNonNull(msVar);
        ms msVar2 = this.tollClusterSequence_;
        if (msVar2 != null && msVar2 != ms.getDefaultInstance()) {
            mr mrVarNewBuilder = ms.newBuilder(msVar2);
            mrVarNewBuilder.mergeFrom((mr) msVar);
            msVar = mrVarNewBuilder.buildPartial();
        }
        this.tollClusterSequence_ = msVar;
        this.bitField0_ |= 1;
    }

    public static mn newBuilder() {
        return (mn) DEFAULT_INSTANCE.createBuilder();
    }

    public static mt parseDelimitedFrom(InputStream inputStream) {
        return (mt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mt parseFrom(com.google.v.v vVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollClusterSequence(ms msVar) {
        Objects.requireNonNull(msVar);
        this.tollClusterSequence_ = msVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "tollClusterSequence_"});
            case 3:
                return new mt();
            case 4:
                return new mn(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<mt> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (mt.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public ms getTollClusterSequence() {
        ms msVar = this.tollClusterSequence_;
        return msVar == null ? ms.getDefaultInstance() : msVar;
    }

    public boolean hasTollClusterSequence() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mn newBuilder(mt mtVar) {
        return (mn) DEFAULT_INSTANCE.createBuilder(mtVar);
    }

    public static mt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mt parseFrom(com.google.v.z zVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mt parseFrom(InputStream inputStream) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mt parseFrom(ByteBuffer byteBuffer) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mt parseFrom(byte[] bArr) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
