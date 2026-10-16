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
public final class an extends du<an, am> implements fj {
    public static final int CHAT_CONTEXT_FIELD_NUMBER = 1;
    private static final an DEFAULT_INSTANCE;
    private static volatile fo<an> PARSER = null;
    public static final int TRIGGER_FIELD_NUMBER = 2;
    private int bitField0_;
    private af chatContext_;
    private aw trigger_;

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        du.registerDefaultInstance(an.class, anVar);
    }

    private an() {
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

    public static an getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrigger(aw awVar) {
        Objects.requireNonNull(awVar);
        aw awVar2 = this.trigger_;
        if (awVar2 != null && awVar2 != aw.getDefaultInstance()) {
            aq aqVarNewBuilder = aw.newBuilder(awVar2);
            aqVarNewBuilder.mergeFrom((aq) awVar);
            awVar = aqVarNewBuilder.buildPartial();
        }
        this.trigger_ = awVar;
        this.bitField0_ |= 2;
    }

    public static am newBuilder() {
        return (am) DEFAULT_INSTANCE.createBuilder();
    }

    public static an parseDelimitedFrom(InputStream inputStream) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(com.google.v.v vVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<an> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatContext(af afVar) {
        Objects.requireNonNull(afVar);
        this.chatContext_ = afVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrigger(aw awVar) {
        Objects.requireNonNull(awVar);
        this.trigger_ = awVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "chatContext_", "trigger_"});
        }
        if (iOrdinal == 3) {
            return new an();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new am(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<an> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (an.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public af getChatContext() {
        af afVar = this.chatContext_;
        return afVar == null ? af.getDefaultInstance() : afVar;
    }

    public aw getTrigger() {
        aw awVar = this.trigger_;
        return awVar == null ? aw.getDefaultInstance() : awVar;
    }

    public boolean hasChatContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrigger() {
        return (this.bitField0_ & 2) != 0;
    }

    public static am newBuilder(an anVar) {
        return (am) DEFAULT_INSTANCE.createBuilder(anVar);
    }

    public static an parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(com.google.v.v vVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static an parseFrom(com.google.v.z zVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static an parseFrom(com.google.v.z zVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static an parseFrom(InputStream inputStream) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(InputStream inputStream, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(ByteBuffer byteBuffer) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static an parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static an parseFrom(byte[] bArr) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static an parseFrom(byte[] bArr, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
