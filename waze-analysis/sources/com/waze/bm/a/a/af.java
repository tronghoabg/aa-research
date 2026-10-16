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
public final class af extends du<af, ae> implements fj {
    public static final int ACCEPTED_LANGUAGE_FIELD_NUMBER = 2;
    public static final int AUDIO_CONFIGURATION_FIELD_NUMBER = 8;
    public static final int CURRENT_STREET_NAME_FIELD_NUMBER = 6;
    private static final af DEFAULT_INSTANCE;
    public static final int IS_LONG_TERM_MEMORY_ENABLED_FIELD_NUMBER = 7;
    private static volatile fo<af> PARSER = null;
    public static final int USER_POSITION_FIELD_NUMBER = 3;
    private com.waze.u.a.g audioConfiguration_;
    private int bitField0_;
    private boolean isLongTermMemoryEnabled_;
    private i.b.s userPosition_;
    private String acceptedLanguage_ = "";
    private String currentStreetName_ = "";

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptedLanguage() {
        this.bitField0_ &= -2;
        this.acceptedLanguage_ = getDefaultInstance().getAcceptedLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioConfiguration() {
        this.audioConfiguration_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentStreetName() {
        this.bitField0_ &= -5;
        this.currentStreetName_ = getDefaultInstance().getCurrentStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLongTermMemoryEnabled() {
        this.bitField0_ &= -9;
        this.isLongTermMemoryEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = null;
        this.bitField0_ &= -3;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudioConfiguration(com.waze.u.a.g gVar) {
        Objects.requireNonNull(gVar);
        com.waze.u.a.g gVar2 = this.audioConfiguration_;
        if (gVar2 != null && gVar2 != com.waze.u.a.g.getDefaultInstance()) {
            com.waze.u.a.c cVarNewBuilder = com.waze.u.a.g.newBuilder(gVar2);
            cVarNewBuilder.mergeFrom((com.waze.u.a.c) gVar);
            gVar = cVarNewBuilder.buildPartial();
        }
        this.audioConfiguration_ = gVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.userPosition_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.userPosition_ = sVar;
        this.bitField0_ |= 2;
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
    public void setAcceptedLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.acceptedLanguage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcceptedLanguageBytes(com.google.v.v vVar) {
        this.acceptedLanguage_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioConfiguration(com.waze.u.a.g gVar) {
        Objects.requireNonNull(gVar);
        this.audioConfiguration_ = gVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.currentStreetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentStreetNameBytes(com.google.v.v vVar) {
        this.currentStreetName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLongTermMemoryEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.isLongTermMemoryEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.userPosition_ = sVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဉ\u0001\u0006ဈ\u0002\u0007ဇ\u0003\bဉ\u0004", new Object[]{"bitField0_", "acceptedLanguage_", "userPosition_", "currentStreetName_", "isLongTermMemoryEnabled_", "audioConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
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
    }

    public String getAcceptedLanguage() {
        return this.acceptedLanguage_;
    }

    public com.google.v.v getAcceptedLanguageBytes() {
        return com.google.v.v.s(this.acceptedLanguage_);
    }

    public com.waze.u.a.g getAudioConfiguration() {
        com.waze.u.a.g gVar = this.audioConfiguration_;
        return gVar == null ? com.waze.u.a.g.getDefaultInstance() : gVar;
    }

    public String getCurrentStreetName() {
        return this.currentStreetName_;
    }

    public com.google.v.v getCurrentStreetNameBytes() {
        return com.google.v.v.s(this.currentStreetName_);
    }

    public boolean getIsLongTermMemoryEnabled() {
        return this.isLongTermMemoryEnabled_;
    }

    public i.b.s getUserPosition() {
        i.b.s sVar = this.userPosition_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasAcceptedLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAudioConfiguration() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCurrentStreetName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsLongTermMemoryEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUserPosition() {
        return (this.bitField0_ & 2) != 0;
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
