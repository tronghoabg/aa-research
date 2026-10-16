package com.waze.bs;

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
public final class af extends du<af, ae> implements fj {
    public static final int CHAT_ID_FIELD_NUMBER = 2;
    private static final af DEFAULT_INSTANCE;
    private static volatile fo<af> PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ab response_;
    private byte memoizedIsInitialized = 2;
    private String chatId_ = "";

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
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

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(ab abVar) {
        Objects.requireNonNull(abVar);
        ab abVar2 = this.response_;
        if (abVar2 != null && abVar2 != ab.getDefaultInstance()) {
            n nVarNewBuilder = ab.newBuilder(abVar2);
            nVarNewBuilder.mergeFrom((n) abVar);
            abVar = nVarNewBuilder.buildPartial();
        }
        this.response_ = abVar;
        this.bitField0_ |= 1;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
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
    public void setResponse(ab abVar) {
        Objects.requireNonNull(abVar);
        this.response_ = abVar;
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
                return new af();
            case 4:
                return new ae(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<af> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (af.class) {
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

    public ab getResponse() {
        ab abVar = this.response_;
        return abVar == null ? ab.getDefaultInstance() : abVar;
    }

    public boolean hasChatId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResponse() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
