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
public final class x extends du<x, v> implements fj {
    public static final int ACTION_RESULT_FIELD_NUMBER = 101;
    public static final int CHATCONTEXT_FIELD_NUMBER = 2;
    public static final int CHAT_ID_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE;
    private static volatile fo<x> PARSER = null;
    public static final int USER_PROMPT_FIELD_NUMBER = 100;
    private int bitField0_;
    private u chatContext_;
    private Object request_;
    private int requestCase_ = 0;
    private String chatId_ = "";

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
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

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionResult(c cVar) {
        Objects.requireNonNull(cVar);
        if (this.requestCase_ == 101 && this.request_ != c.getDefaultInstance()) {
            a aVarNewBuilder = c.newBuilder((c) this.request_);
            aVarNewBuilder.mergeFrom((a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.request_ = cVar;
        this.requestCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatContext(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.chatContext_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.chatContext_ = uVar;
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

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionResult(c cVar) {
        Objects.requireNonNull(cVar);
        this.request_ = cVar;
        this.requestCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatContext(u uVar) {
        Objects.requireNonNull(uVar);
        this.chatContext_ = uVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001e\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001d<\u0000e<\u0000", new Object[]{"request_", "requestCase_", "bitField0_", "chatId_", "chatContext_", com.waze.u.a.s.class, c.class});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getActionResult() {
        return this.requestCase_ == 101 ? (c) this.request_ : c.getDefaultInstance();
    }

    public u getChatContext() {
        u uVar = this.chatContext_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public String getChatId() {
        return this.chatId_;
    }

    public com.google.v.v getChatIdBytes() {
        return com.google.v.v.s(this.chatId_);
    }

    public w getRequestCase() {
        int i2 = this.requestCase_;
        if (i2 == 0) {
            return w.f32921c;
        }
        if (i2 == 100) {
            return w.f32919a;
        }
        if (i2 != 101) {
            return null;
        }
        return w.f32920b;
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

    public static v newBuilder(x xVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
