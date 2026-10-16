package com.waze.bm.a.a;

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
/* loaded from: classes7.dex */
public final class ap extends du<ap, ao> implements fj {
    public static final int CHAT_ID_FIELD_NUMBER = 2;
    private static final ap DEFAULT_INSTANCE;
    private static volatile fo<ap> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String chatId_ = "";
    private al response_;

    static {
        ap apVar = new ap();
        DEFAULT_INSTANCE = apVar;
        du.registerDefaultInstance(ap.class, apVar);
    }

    private ap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatId() {
        this.bitField0_ &= -3;
        this.chatId_ = getDefaultInstance().getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
        this.bitField0_ &= -2;
    }

    public static ap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(al alVar) {
        Objects.requireNonNull(alVar);
        al alVar2 = this.response_;
        if (alVar2 != null && alVar2 != al.getDefaultInstance()) {
            aj ajVarNewBuilder = al.newBuilder(alVar2);
            ajVarNewBuilder.mergeFrom((aj) alVar);
            alVar = ajVarNewBuilder.buildPartial();
        }
        this.response_ = alVar;
        this.bitField0_ |= 1;
    }

    public static ao newBuilder() {
        return (ao) DEFAULT_INSTANCE.createBuilder();
    }

    public static ap parseDelimitedFrom(InputStream inputStream) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(com.google.v.v vVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.chatId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatIdBytes(com.google.v.v vVar) {
        this.chatId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(al alVar) {
        Objects.requireNonNull(alVar);
        this.response_ = alVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "response_", "chatId_"});
        }
        if (iOrdinal == 3) {
            return new ap();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ao(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ap> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ap.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getChatId() {
        return this.chatId_;
    }

    public com.google.v.v getChatIdBytes() {
        return com.google.v.v.s(this.chatId_);
    }

    public al getResponse() {
        al alVar = this.response_;
        return alVar == null ? al.getDefaultInstance() : alVar;
    }

    public boolean hasChatId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResponse() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ao newBuilder(ap apVar) {
        return (ao) DEFAULT_INSTANCE.createBuilder(apVar);
    }

    public static ap parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(com.google.v.v vVar, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ap parseFrom(com.google.v.z zVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ap parseFrom(com.google.v.z zVar, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ap parseFrom(InputStream inputStream) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(InputStream inputStream, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(ByteBuffer byteBuffer) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ap parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ap parseFrom(byte[] bArr) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ap parseFrom(byte[] bArr, de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
