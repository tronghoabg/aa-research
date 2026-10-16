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
public final class ai extends du<ai, ag> implements fj {
    public static final int ACTION_RESULT_FIELD_NUMBER = 101;
    public static final int CHAT_CONTEXT_FIELD_NUMBER = 2;
    public static final int CHAT_ID_FIELD_NUMBER = 1;
    private static final ai DEFAULT_INSTANCE;
    private static volatile fo<ai> PARSER = null;
    public static final int USER_PROMPT_FIELD_NUMBER = 100;
    private int bitField0_;
    private af chatContext_;
    private Object request_;
    private int requestCase_ = 0;
    private String chatId_ = "";

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionResult() {
        if (this.requestCase_ == 101) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatContext() {
        this.chatContext_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatId() {
        this.bitField0_ &= -2;
        this.chatId_ = getDefaultInstance().getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.requestCase_ = 0;
        this.request_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPrompt() {
        if (this.requestCase_ == 100) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionResult(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.requestCase_ == 101 && this.request_ != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder((f) this.request_);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.request_ = fVar;
        this.requestCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatContext(af afVar) {
        Objects.requireNonNull(afVar);
        af afVar2 = this.chatContext_;
        if (afVar2 != null && afVar2 != af.getDefaultInstance()) {
            ae aeVarNewBuilder = af.newBuilder(afVar2);
            aeVarNewBuilder.mergeFrom((ae) afVar);
            afVar = aeVarNewBuilder.buildPartial();
        }
        this.chatContext_ = afVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPrompt(com.waze.u.a.s sVar) {
        Objects.requireNonNull(sVar);
        if (this.requestCase_ == 100 && this.request_ != com.waze.u.a.s.getDefaultInstance()) {
            com.waze.u.a.n nVarNewBuilder = com.waze.u.a.s.newBuilder((com.waze.u.a.s) this.request_);
            nVarNewBuilder.mergeFrom((com.waze.u.a.n) sVar);
            sVar = nVarNewBuilder.buildPartial();
        }
        this.request_ = sVar;
        this.requestCase_ = 100;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionResult(f fVar) {
        Objects.requireNonNull(fVar);
        this.request_ = fVar;
        this.requestCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatContext(af afVar) {
        Objects.requireNonNull(afVar);
        this.chatContext_ = afVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.chatId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatIdBytes(com.google.v.v vVar) {
        this.chatId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPrompt(com.waze.u.a.s sVar) {
        Objects.requireNonNull(sVar);
        this.request_ = sVar;
        this.requestCase_ = 100;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001e\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001d<\u0000e<\u0000", new Object[]{"request_", "requestCase_", "bitField0_", "chatId_", "chatContext_", com.waze.u.a.s.class, f.class});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getActionResult() {
        return this.requestCase_ == 101 ? (f) this.request_ : f.getDefaultInstance();
    }

    public af getChatContext() {
        af afVar = this.chatContext_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public String getChatId() {
        return this.chatId_;
    }

    public com.google.v.v getChatIdBytes() {
        return com.google.v.v.s(this.chatId_);
    }

    public ah getRequestCase() {
        int i2 = this.requestCase_;
        if (i2 == 0) {
            return ah.f17118c;
        }
        if (i2 == 100) {
            return ah.f17116a;
        }
        if (i2 != 101) {
            return null;
        }
        return ah.f17117b;
    }

    public com.waze.u.a.s getUserPrompt() {
        return this.requestCase_ == 100 ? (com.waze.u.a.s) this.request_ : com.waze.u.a.s.getDefaultInstance();
    }

    public boolean hasActionResult() {
        return this.requestCase_ == 101;
    }

    public boolean hasChatContext() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasChatId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserPrompt() {
        return this.requestCase_ == 100;
    }

    public static ag newBuilder(ai aiVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
