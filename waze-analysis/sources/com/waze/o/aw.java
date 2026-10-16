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
public final class aw extends du<aw, av> implements fj {
    public static final int CHATCONTEXT_FIELD_NUMBER = 1;
    private static final aw DEFAULT_INSTANCE;
    private static volatile fo<aw> PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    public static final int USER_FIRST_NAME_FIELD_NUMBER = 5;
    public static final int WAZE_VOICE_GENDER_FIELD_NUMBER = 4;
    private int bitField0_;
    private u chatContext_;
    private bx trigger_;
    private String userFirstName_ = "";
    private int wazeVoiceGender_;

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        du.registerDefaultInstance(aw.class, awVar);
    }

    private aw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatContext() {
        this.chatContext_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrigger() {
        this.trigger_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserFirstName() {
        this.bitField0_ &= -9;
        this.userFirstName_ = getDefaultInstance().getUserFirstName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeVoiceGender() {
        this.bitField0_ &= -5;
        this.wazeVoiceGender_ = 0;
    }

    public static aw getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrigger(bx bxVar) {
        Objects.requireNonNull(bxVar);
        bx bxVar2 = this.trigger_;
        if (bxVar2 != null && bxVar2 != bx.getDefaultInstance()) {
            bj bjVarNewBuilder = bx.newBuilder(bxVar2);
            bjVarNewBuilder.mergeFrom((bj) bxVar);
            bxVar = bjVarNewBuilder.buildPartial();
        }
        this.trigger_ = bxVar;
        this.bitField0_ |= 2;
    }

    public static av newBuilder() {
        return (av) DEFAULT_INSTANCE.createBuilder();
    }

    public static aw parseDelimitedFrom(InputStream inputStream) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(com.google.v.v vVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatContext(u uVar) {
        Objects.requireNonNull(uVar);
        this.chatContext_ = uVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrigger(bx bxVar) {
        Objects.requireNonNull(bxVar);
        this.trigger_ = bxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserFirstName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.userFirstName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserFirstNameBytes(com.google.v.v vVar) {
        this.userFirstName_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeVoiceGender(com.waze.u.a.t tVar) {
        this.wazeVoiceGender_ = tVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "chatContext_", "trigger_", "wazeVoiceGender_", com.waze.u.a.t.a(), "userFirstName_"});
        }
        if (iOrdinal == 3) {
            return new aw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new av(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public u getChatContext() {
        u uVar = this.chatContext_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public bx getTrigger() {
        bx bxVar = this.trigger_;
        return bxVar == null ? bx.getDefaultInstance() : bxVar;
    }

    public String getUserFirstName() {
        return this.userFirstName_;
    }

    public com.google.v.v getUserFirstNameBytes() {
        return com.google.v.v.s(this.userFirstName_);
    }

    public com.waze.u.a.t getWazeVoiceGender() {
        com.waze.u.a.t tVarB = com.waze.u.a.t.b(this.wazeVoiceGender_);
        return tVarB == null ? com.waze.u.a.t.WAZE_VOICE_GENDER_UNSPECIFIED : tVarB;
    }

    public boolean hasChatContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrigger() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserFirstName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWazeVoiceGender() {
        return (this.bitField0_ & 4) != 0;
    }

    public static av newBuilder(aw awVar) {
        return (av) DEFAULT_INSTANCE.createBuilder(awVar);
    }

    public static aw parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(com.google.v.v vVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aw parseFrom(com.google.v.z zVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aw parseFrom(com.google.v.z zVar, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aw parseFrom(InputStream inputStream) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(InputStream inputStream, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(ByteBuffer byteBuffer) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aw parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aw parseFrom(byte[] bArr) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aw parseFrom(byte[] bArr, de deVar) {
        return (aw) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
