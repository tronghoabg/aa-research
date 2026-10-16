package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bw extends du<bw, bv> implements fj {
    private static final bw DEFAULT_INSTANCE;
    private static volatile fo<bw> PARSER = null;
    public static final int USER_PROMPT_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.waze.u.a.s userPrompt_;

    static {
        bw bwVar = new bw();
        DEFAULT_INSTANCE = bwVar;
        du.registerDefaultInstance(bw.class, bwVar);
    }

    private bw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPrompt() {
        this.userPrompt_ = null;
        this.bitField0_ &= -2;
    }

    public static bw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPrompt(com.waze.u.a.s sVar) {
        Objects.requireNonNull(sVar);
        com.waze.u.a.s sVar2 = this.userPrompt_;
        if (sVar2 != null && sVar2 != com.waze.u.a.s.getDefaultInstance()) {
            com.waze.u.a.n nVarNewBuilder = com.waze.u.a.s.newBuilder(sVar2);
            nVarNewBuilder.mergeFrom((com.waze.u.a.n) sVar);
            sVar = nVarNewBuilder.buildPartial();
        }
        this.userPrompt_ = sVar;
        this.bitField0_ |= 1;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bw parseDelimitedFrom(InputStream inputStream) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(com.google.v.v vVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPrompt(com.waze.u.a.s sVar) {
        Objects.requireNonNull(sVar);
        this.userPrompt_ = sVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "userPrompt_"});
        }
        if (iOrdinal == 3) {
            return new bw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.u.a.s getUserPrompt() {
        com.waze.u.a.s sVar = this.userPrompt_;
        return sVar == null ? com.waze.u.a.s.getDefaultInstance() : sVar;
    }

    public boolean hasUserPrompt() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bv newBuilder(bw bwVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bwVar);
    }

    public static bw parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(com.google.v.v vVar, de deVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bw parseFrom(com.google.v.z zVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bw parseFrom(com.google.v.z zVar, de deVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bw parseFrom(InputStream inputStream) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(InputStream inputStream, de deVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(ByteBuffer byteBuffer) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bw parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bw parseFrom(byte[] bArr) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bw parseFrom(byte[] bArr, de deVar) {
        return (bw) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
