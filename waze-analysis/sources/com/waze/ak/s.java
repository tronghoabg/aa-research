package com.waze.ak;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends du<s, r> implements fj {
    private static final s DEFAULT_INSTANCE;
    public static final int INITIAL_ANNOUNCEMENT_FIELD_NUMBER = 2;
    private static volatile fo<s> PARSER = null;
    public static final int VOICE_INSTRUCTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private x initialAnnouncement_;
    private eo<ah> voiceInstructions_ = emptyProtobufList();

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVoiceInstructions(Iterable<? extends ah> iterable) {
        ensureVoiceInstructionsIsMutable();
        com.google.v.c.addAll(iterable, this.voiceInstructions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoiceInstructions(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensureVoiceInstructionsIsMutable();
        this.voiceInstructions_.add(i2, ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitialAnnouncement() {
        this.initialAnnouncement_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceInstructions() {
        this.voiceInstructions_ = emptyProtobufList();
    }

    private void ensureVoiceInstructionsIsMutable() {
        eo<ah> eoVar = this.voiceInstructions_;
        if (eoVar.c()) {
            return;
        }
        this.voiceInstructions_ = du.mutableCopy(eoVar);
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInitialAnnouncement(x xVar) {
        Objects.requireNonNull(xVar);
        x xVar2 = this.initialAnnouncement_;
        if (xVar2 != null && xVar2 != x.getDefaultInstance()) {
            w wVarNewBuilder = x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.initialAnnouncement_ = xVar;
        this.bitField0_ |= 1;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
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
    public void removeVoiceInstructions(int i2) {
        ensureVoiceInstructionsIsMutable();
        this.voiceInstructions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitialAnnouncement(x xVar) {
        Objects.requireNonNull(xVar);
        this.initialAnnouncement_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceInstructions(int i2, ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensureVoiceInstructionsIsMutable();
        this.voiceInstructions_.set(i2, ahVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "voiceInstructions_", ah.class, "initialAnnouncement_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
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

    public x getInitialAnnouncement() {
        x xVar = this.initialAnnouncement_;
        return xVar == null ? x.getDefaultInstance() : xVar;
    }

    public ah getVoiceInstructions(int i2) {
        return this.voiceInstructions_.get(i2);
    }

    public int getVoiceInstructionsCount() {
        return this.voiceInstructions_.size();
    }

    public List<ah> getVoiceInstructionsList() {
        return this.voiceInstructions_;
    }

    public ai getVoiceInstructionsOrBuilder(int i2) {
        return this.voiceInstructions_.get(i2);
    }

    public List<? extends ai> getVoiceInstructionsOrBuilderList() {
        return this.voiceInstructions_;
    }

    public boolean hasInitialAnnouncement() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoiceInstructions(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ensureVoiceInstructionsIsMutable();
        this.voiceInstructions_.add(ahVar);
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
