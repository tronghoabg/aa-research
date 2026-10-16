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
public final class m extends du<m, e> implements fj {
    public static final int CHAT_CONTEXT_FIELD_NUMBER = 2;
    public static final int CHAT_ID_FIELD_NUMBER = 1;
    private static final m DEFAULT_INSTANCE;
    private static volatile fo<m> PARSER = null;
    public static final int SHOW_LOCATION_PREVIEW_RESPONSE_FIELD_NUMBER = 102;
    public static final int SHOW_SEARCH_RESULTS_RESPONSE_FIELD_NUMBER = 101;
    public static final int SHOW_TRIP_OVERVIEW_RESPONSE_FIELD_NUMBER = 103;
    public static final int USER_PROMPT_FIELD_NUMBER = 100;
    private int bitField0_;
    private d chatContext_;
    private Object request_;
    private int requestCase_ = 0;
    private String chatId_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
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
    public void clearShowLocationPreviewResponse() {
        if (this.requestCase_ == 102) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSearchResultsResponse() {
        if (this.requestCase_ == 101) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTripOverviewResponse() {
        if (this.requestCase_ == 103) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPrompt() {
        if (this.requestCase_ == 100) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatContext(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.chatContext_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.chatContext_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowLocationPreviewResponse(h hVar) {
        Objects.requireNonNull(hVar);
        if (this.requestCase_ == 102 && this.request_ != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder((h) this.request_);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.request_ = hVar;
        this.requestCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowSearchResultsResponse(j jVar) {
        Objects.requireNonNull(jVar);
        if (this.requestCase_ == 101 && this.request_ != j.getDefaultInstance()) {
            i iVarNewBuilder = j.newBuilder((j) this.request_);
            iVarNewBuilder.mergeFrom((i) jVar);
            jVar = iVarNewBuilder.buildPartial();
        }
        this.request_ = jVar;
        this.requestCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowTripOverviewResponse(l lVar) {
        Objects.requireNonNull(lVar);
        if (this.requestCase_ == 103 && this.request_ != l.getDefaultInstance()) {
            k kVarNewBuilder = l.newBuilder((l) this.request_);
            kVarNewBuilder.mergeFrom((k) lVar);
            lVar = kVarNewBuilder.buildPartial();
        }
        this.request_ = lVar;
        this.requestCase_ = 103;
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

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatContext(d dVar) {
        Objects.requireNonNull(dVar);
        this.chatContext_ = dVar;
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
    public void setShowLocationPreviewResponse(h hVar) {
        Objects.requireNonNull(hVar);
        this.request_ = hVar;
        this.requestCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowSearchResultsResponse(j jVar) {
        Objects.requireNonNull(jVar);
        this.request_ = jVar;
        this.requestCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTripOverviewResponse(l lVar) {
        Objects.requireNonNull(lVar);
        this.request_ = lVar;
        this.requestCase_ = 103;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001g\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001d<\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"request_", "requestCase_", "bitField0_", "chatId_", "chatContext_", com.waze.u.a.s.class, j.class, h.class, l.class});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public d getChatContext() {
        d dVar = this.chatContext_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public String getChatId() {
        return this.chatId_;
    }

    public com.google.v.v getChatIdBytes() {
        return com.google.v.v.s(this.chatId_);
    }

    public f getRequestCase() {
        int i2 = this.requestCase_;
        if (i2 == 0) {
            return f.f17437e;
        }
        switch (i2) {
            case 100:
                return f.f17433a;
            case 101:
                return f.f17434b;
            case 102:
                return f.f17435c;
            case 103:
                return f.f17436d;
            default:
                return null;
        }
    }

    public h getShowLocationPreviewResponse() {
        return this.requestCase_ == 102 ? (h) this.request_ : h.getDefaultInstance();
    }

    public j getShowSearchResultsResponse() {
        return this.requestCase_ == 101 ? (j) this.request_ : j.getDefaultInstance();
    }

    public l getShowTripOverviewResponse() {
        return this.requestCase_ == 103 ? (l) this.request_ : l.getDefaultInstance();
    }

    public com.waze.u.a.s getUserPrompt() {
        return this.requestCase_ == 100 ? (com.waze.u.a.s) this.request_ : com.waze.u.a.s.getDefaultInstance();
    }

    public boolean hasChatContext() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasChatId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShowLocationPreviewResponse() {
        return this.requestCase_ == 102;
    }

    public boolean hasShowSearchResultsResponse() {
        return this.requestCase_ == 101;
    }

    public boolean hasShowTripOverviewResponse() {
        return this.requestCase_ == 103;
    }

    public boolean hasUserPrompt() {
        return this.requestCase_ == 100;
    }

    public static e newBuilder(m mVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
