package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac extends com.google.v.du<ac, ab> implements fj {
    public static final int COMMENTER_INFO_FIELD_NUMBER = 1;
    private static final ac DEFAULT_INSTANCE;
    private static volatile fo<ac> PARSER;
    private int bitField0_;
    private bh commenterInfo_;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        com.google.v.du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommenterInfo() {
        this.commenterInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommenterInfo(bh bhVar) {
        Objects.requireNonNull(bhVar);
        bh bhVar2 = this.commenterInfo_;
        if (bhVar2 != null && bhVar2 != bh.getDefaultInstance()) {
            bg bgVarNewBuilder = bh.newBuilder(bhVar2);
            bgVarNewBuilder.mergeFrom((bg) bhVar);
            bhVar = bgVarNewBuilder.buildPartial();
        }
        this.commenterInfo_ = bhVar;
        this.bitField0_ |= 1;
    }

    public static ab newBuilder() {
        return (ab) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommenterInfo(bh bhVar) {
        Objects.requireNonNull(bhVar);
        this.commenterInfo_ = bhVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "commenterInfo_"});
        }
        if (iOrdinal == 3) {
            return new ac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ab(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bh getCommenterInfo() {
        bh bhVar = this.commenterInfo_;
        return bhVar == null ? bh.getDefaultInstance() : bhVar;
    }

    public boolean hasCommenterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ab newBuilder(ac acVar) {
        return (ab) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
