package com.waze.bg.a.b;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s extends du<s, q> implements fj {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 4;
    public static final int CONVERSATION_INITIATION_TIME_FIELD_NUMBER = 2;
    public static final int CONVERSATION_REPORT_DETAILS_FIELD_NUMBER = 3;
    private static final s DEFAULT_INSTANCE;
    public static final int GENDER_FIELD_NUMBER = 6;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 5;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile fo<s> PARSER;
    private int bitField0_;
    private gc conversationInitiationTime_;
    private Object details_;
    private h message_;
    private int detailsCase_ = 0;
    private String conversationId_ = "";
    private String languageCode_ = "";
    private int gender_ = 1;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.bitField0_ &= -5;
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationInitiationTime() {
        this.conversationInitiationTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationReportDetails() {
        if (this.detailsCase_ == 3) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.detailsCase_ = 0;
        this.details_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGender() {
        this.bitField0_ &= -17;
        this.gender_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.bitField0_ &= -9;
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = null;
        this.bitField0_ &= -2;
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationInitiationTime(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.conversationInitiationTime_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.conversationInitiationTime_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConversationReportDetails(com.waze.bg.a.b.a.d dVar) {
        Objects.requireNonNull(dVar);
        if (this.detailsCase_ == 3 && this.details_ != com.waze.bg.a.b.a.d.getDefaultInstance()) {
            com.waze.bg.a.b.a.c cVarNewBuilder = com.waze.bg.a.b.a.d.newBuilder((com.waze.bg.a.b.a.d) this.details_);
            cVarNewBuilder.mergeFrom((com.waze.bg.a.b.a.c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.details_ = dVar;
        this.detailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessage(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.message_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            f fVarNewBuilder = h.newBuilder(hVar2);
            fVarNewBuilder.mergeFrom((f) hVar);
            hVar = fVarNewBuilder.buildPartial();
        }
        this.message_ = hVar;
        this.bitField0_ |= 1;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        this.conversationId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationInitiationTime(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.conversationInitiationTime_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationReportDetails(com.waze.bg.a.b.a.d dVar) {
        Objects.requireNonNull(dVar);
        this.details_ = dVar;
        this.detailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGender(e eVar) {
        this.gender_ = eVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(com.google.v.v vVar) {
        this.languageCode_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(h hVar) {
        Objects.requireNonNull(hVar);
        this.message_ = hVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004ဈ\u0002\u0005ဈ\u0003\u0006᠌\u0004", new Object[]{"details_", "detailsCase_", "bitField0_", "message_", "conversationInitiationTime_", com.waze.bg.a.b.a.d.class, "conversationId_", "languageCode_", "gender_", d.f16338a});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConversationId() {
        return this.conversationId_;
    }

    public com.google.v.v getConversationIdBytes() {
        return com.google.v.v.s(this.conversationId_);
    }

    public gc getConversationInitiationTime() {
        gc gcVar = this.conversationInitiationTime_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public com.waze.bg.a.b.a.d getConversationReportDetails() {
        return this.detailsCase_ == 3 ? (com.waze.bg.a.b.a.d) this.details_ : com.waze.bg.a.b.a.d.getDefaultInstance();
    }

    public r getDetailsCase() {
        int i2 = this.detailsCase_;
        if (i2 == 0) {
            return r.f16359b;
        }
        if (i2 != 3) {
            return null;
        }
        return r.f16358a;
    }

    public e getGender() {
        e eVarA = e.a(this.gender_);
        return eVarA == null ? e.GENDER_MALE : eVarA;
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public com.google.v.v getLanguageCodeBytes() {
        return com.google.v.v.s(this.languageCode_);
    }

    public h getMessage() {
        h hVar = this.message_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public boolean hasConversationId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasConversationInitiationTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasConversationReportDetails() {
        return this.detailsCase_ == 3;
    }

    public boolean hasGender() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasLanguageCode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static q newBuilder(s sVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
