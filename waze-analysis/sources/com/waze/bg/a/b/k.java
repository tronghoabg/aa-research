package com.waze.bg.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import i.b.af;
import i.b.ah;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends du<k, i> implements fj {
    public static final int CANCEL_DETAILS_FIELD_NUMBER = 6;
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final k DEFAULT_INSTANCE;
    public static final int FOLLOWUP_RESPONSE_FIELD_NUMBER = 4;
    public static final int FULFILLMENT_DETAILS_FIELD_NUMBER = 5;
    private static volatile fo<k> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object response_;
    private ah status_;
    private int responseCase_ = 0;
    private String conversationId_ = "";

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCancelDetails() {
        if (this.responseCase_ == 6) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.bitField0_ &= -3;
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowupResponse() {
        if (this.responseCase_ == 4) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFulfillmentDetails() {
        if (this.responseCase_ == 5) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCancelDetails(c cVar) {
        Objects.requireNonNull(cVar);
        if (this.responseCase_ == 6 && this.response_ != c.getDefaultInstance()) {
            b bVarNewBuilder = c.newBuilder((c) this.response_);
            bVarNewBuilder.mergeFrom((b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.response_ = cVar;
        this.responseCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFollowupResponse(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.responseCase_ == 4 && this.response_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.response_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.response_ = mVar;
        this.responseCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFulfillmentDetails(p pVar) {
        Objects.requireNonNull(pVar);
        if (this.responseCase_ == 5 && this.response_ != p.getDefaultInstance()) {
            n nVarNewBuilder = p.newBuilder((p) this.response_);
            nVarNewBuilder.mergeFrom((n) pVar);
            pVar = nVarNewBuilder.buildPartial();
        }
        this.response_ = pVar;
        this.responseCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            af afVarNewBuilder = ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(com.google.v.v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCancelDetails(c cVar) {
        Objects.requireNonNull(cVar);
        this.response_ = cVar;
        this.responseCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        this.conversationId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowupResponse(m mVar) {
        Objects.requireNonNull(mVar);
        this.response_ = mVar;
        this.responseCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFulfillmentDetails(p pVar) {
        Objects.requireNonNull(pVar);
        this.response_ = pVar;
        this.responseCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"response_", "responseCase_", "bitField0_", "status_", "conversationId_", m.class, p.class, c.class});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getCancelDetails() {
        return this.responseCase_ == 6 ? (c) this.response_ : c.getDefaultInstance();
    }

    public String getConversationId() {
        return this.conversationId_;
    }

    public com.google.v.v getConversationIdBytes() {
        return com.google.v.v.s(this.conversationId_);
    }

    public m getFollowupResponse() {
        return this.responseCase_ == 4 ? (m) this.response_ : m.getDefaultInstance();
    }

    public p getFulfillmentDetails() {
        return this.responseCase_ == 5 ? (p) this.response_ : p.getDefaultInstance();
    }

    public j getResponseCase() {
        int i2 = this.responseCase_;
        if (i2 == 0) {
            return j.f16353d;
        }
        if (i2 == 4) {
            return j.f16350a;
        }
        if (i2 == 5) {
            return j.f16351b;
        }
        if (i2 != 6) {
            return null;
        }
        return j.f16352c;
    }

    public ah getStatus() {
        ah ahVar = this.status_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public boolean hasCancelDetails() {
        return this.responseCase_ == 6;
    }

    public boolean hasConversationId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFollowupResponse() {
        return this.responseCase_ == 4;
    }

    public boolean hasFulfillmentDetails() {
        return this.responseCase_ == 5;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static i newBuilder(k kVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(com.google.v.v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
