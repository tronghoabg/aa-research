package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends com.google.v.du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    private static volatile fo<b> PARSER = null;
    public static final int QUESTION_FIELD_NUMBER = 2;
    public static final int REALTIME_ALERT_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.waze.bg.b.l question_;
    private ak realtimeAlert_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.v.du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestion() {
        this.question_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealtimeAlert() {
        this.realtimeAlert_ = null;
        this.bitField0_ &= -2;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuestion(com.waze.bg.b.l lVar) {
        Objects.requireNonNull(lVar);
        com.waze.bg.b.l lVar2 = this.question_;
        if (lVar2 != null && lVar2 != com.waze.bg.b.l.getDefaultInstance()) {
            com.waze.bg.b.j jVarNewBuilder = com.waze.bg.b.l.newBuilder(lVar2);
            jVarNewBuilder.mergeFrom((com.waze.bg.b.j) lVar);
            lVar = jVarNewBuilder.buildPartial();
        }
        this.question_ = lVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRealtimeAlert(ak akVar) {
        Objects.requireNonNull(akVar);
        ak akVar2 = this.realtimeAlert_;
        if (akVar2 != null && akVar2 != ak.getDefaultInstance()) {
            aj ajVarNewBuilder = ak.newBuilder(akVar2);
            ajVarNewBuilder.mergeFrom((aj) akVar);
            akVar = ajVarNewBuilder.buildPartial();
        }
        this.realtimeAlert_ = akVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestion(com.waze.bg.b.l lVar) {
        Objects.requireNonNull(lVar);
        this.question_ = lVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealtimeAlert(ak akVar) {
        Objects.requireNonNull(akVar);
        this.realtimeAlert_ = akVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "realtimeAlert_", "question_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.b.l getQuestion() {
        com.waze.bg.b.l lVar = this.question_;
        return lVar == null ? com.waze.bg.b.l.getDefaultInstance() : lVar;
    }

    public ak getRealtimeAlert() {
        ak akVar = this.realtimeAlert_;
        return akVar == null ? ak.getDefaultInstance() : akVar;
    }

    public boolean hasQuestion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRealtimeAlert() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
