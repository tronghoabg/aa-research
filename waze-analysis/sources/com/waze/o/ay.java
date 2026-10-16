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
public final class ay extends du<ay, ax> implements fj {
    public static final int CHAT_ID_FIELD_NUMBER = 2;
    private static final ay DEFAULT_INSTANCE;
    private static volatile fo<ay> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private int bitField0_;
    private aa response_;
    private byte memoizedIsInitialized = 2;
    private String chatId_ = "";

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
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

    public static ay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(aa aaVar) {
        Objects.requireNonNull(aaVar);
        aa aaVar2 = this.response_;
        if (aaVar2 != null && aaVar2 != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder(aaVar2);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.response_ = aaVar;
        this.bitField0_ |= 1;
    }

    public static ax newBuilder() {
        return (ax) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(com.google.v.v vVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ay> parser() {
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
    public void setResponse(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.response_ = aaVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "response_", "chatId_"});
            case 3:
                return new ay();
            case 4:
                return new ax(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ay> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ay.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getChatId() {
        return this.chatId_;
    }

    public com.google.v.v getChatIdBytes() {
        return com.google.v.v.s(this.chatId_);
    }

    public aa getResponse() {
        aa aaVar = this.response_;
        return aaVar == null ? aa.getDefaultInstance() : aaVar;
    }

    public boolean hasChatId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResponse() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ax newBuilder(ay ayVar) {
        return (ax) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(com.google.v.v vVar, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(com.google.v.z zVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(com.google.v.z zVar, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
