package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class br extends com.google.v.du<br, bq> implements com.google.v.fj {
    private static final br DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<br> PARSER = null;
    public static final int REROUTE_EXPLANATION_TEXT_DATA_FIELD_NUMBER = 1;
    public static final int REROUTE_EXPLANATION_VOICE_DATA_FIELD_NUMBER = 2;
    private int bitField0_;
    private bt rerouteExplanationTextData_;
    private com.google.v.v rerouteExplanationVoiceData_ = com.google.v.v.f13054a;

    static {
        br brVar = new br();
        DEFAULT_INSTANCE = brVar;
        com.google.v.du.registerDefaultInstance(br.class, brVar);
    }

    private br() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteExplanationTextData() {
        this.rerouteExplanationTextData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteExplanationVoiceData() {
        this.bitField0_ &= -3;
        this.rerouteExplanationVoiceData_ = getDefaultInstance().getRerouteExplanationVoiceData();
    }

    public static br getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteExplanationTextData(bt btVar) {
        Objects.requireNonNull(btVar);
        bt btVar2 = this.rerouteExplanationTextData_;
        if (btVar2 != null && btVar2 != bt.getDefaultInstance()) {
            bs bsVarNewBuilder = bt.newBuilder(btVar2);
            bsVarNewBuilder.mergeFrom((bs) btVar);
            btVar = bsVarNewBuilder.buildPartial();
        }
        this.rerouteExplanationTextData_ = btVar;
        this.bitField0_ |= 1;
    }

    public static bq newBuilder() {
        return (bq) DEFAULT_INSTANCE.createBuilder();
    }

    public static br parseDelimitedFrom(InputStream inputStream) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(com.google.v.v vVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<br> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteExplanationTextData(bt btVar) {
        Objects.requireNonNull(btVar);
        this.rerouteExplanationTextData_ = btVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteExplanationVoiceData(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.rerouteExplanationVoiceData_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "rerouteExplanationTextData_", "rerouteExplanationVoiceData_"});
        }
        if (iOrdinal == 3) {
            return new br();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<br> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (br.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bt getRerouteExplanationTextData() {
        bt btVar = this.rerouteExplanationTextData_;
        return btVar == null ? bt.getDefaultInstance() : btVar;
    }

    public com.google.v.v getRerouteExplanationVoiceData() {
        return this.rerouteExplanationVoiceData_;
    }

    public boolean hasRerouteExplanationTextData() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRerouteExplanationVoiceData() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bq newBuilder(br brVar) {
        return (bq) DEFAULT_INSTANCE.createBuilder(brVar);
    }

    public static br parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (br) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static br parseFrom(com.google.v.z zVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static br parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static br parseFrom(InputStream inputStream) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static br parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static br parseFrom(ByteBuffer byteBuffer) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static br parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static br parseFrom(byte[] bArr) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static br parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (br) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
