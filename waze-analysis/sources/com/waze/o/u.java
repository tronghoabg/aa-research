package com.waze.o;

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
public final class u extends du<u, t> implements fj {
    public static final int ACCEPTED_LANGUAGE_FIELD_NUMBER = 2;
    public static final int AUDIO_CONFIGURATION_FIELD_NUMBER = 8;
    public static final int CURRENT_STREET_NAME_FIELD_NUMBER = 6;
    private static final u DEFAULT_INSTANCE;
    public static final int FAVORITE_FIELD_NUMBER = 1;
    public static final int IS_LONG_TERM_MEMORY_ENABLED_FIELD_NUMBER = 7;
    public static final int MEASUREMENT_SYSTEM_FIELD_NUMBER = 5;
    public static final int NAVIGATION_INFO_FIELD_NUMBER = 4;
    private static volatile fo<u> PARSER = null;
    public static final int USER_POSITION_FIELD_NUMBER = 3;
    private com.waze.u.a.g audioConfiguration_;
    private int bitField0_;
    private boolean isLongTermMemoryEnabled_;
    private int measurementSystem_;
    private al navigationInfo_;
    private i.b.s userPosition_;
    private eo<ai> favorite_ = emptyProtobufList();
    private String acceptedLanguage_ = "";
    private String currentStreetName_ = "";

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFavorite(Iterable<? extends ai> iterable) {
        ensureFavoriteIsMutable();
        com.google.v.c.addAll(iterable, this.favorite_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorite(int i2, ai aiVar) {
        Objects.requireNonNull(aiVar);
        ensureFavoriteIsMutable();
        this.favorite_.add(i2, aiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptedLanguage() {
        this.bitField0_ &= -2;
        this.acceptedLanguage_ = getDefaultInstance().getAcceptedLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioConfiguration() {
        this.audioConfiguration_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentStreetName() {
        this.bitField0_ &= -17;
        this.currentStreetName_ = getDefaultInstance().getCurrentStreetName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorite() {
        this.favorite_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLongTermMemoryEnabled() {
        this.bitField0_ &= -33;
        this.isLongTermMemoryEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasurementSystem() {
        this.bitField0_ &= -9;
        this.measurementSystem_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationInfo() {
        this.navigationInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureFavoriteIsMutable() {
        eo<ai> eoVar = this.favorite_;
        if (eoVar.c()) {
            return;
        }
        this.favorite_ = du.mutableCopy(eoVar);
    }

    public static u getDefaultInstance() {
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
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationInfo(al alVar) {
        Objects.requireNonNull(alVar);
        al alVar2 = this.navigationInfo_;
        if (alVar2 != null && alVar2 != al.getDefaultInstance()) {
            ak akVarNewBuilder = al.newBuilder(alVar2);
            akVarNewBuilder.mergeFrom((ak) alVar);
            alVar = akVarNewBuilder.buildPartial();
        }
        this.navigationInfo_ = alVar;
        this.bitField0_ |= 4;
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

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(com.google.v.v vVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFavorite(int i2) {
        ensureFavoriteIsMutable();
        this.favorite_.remove(i2);
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
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentStreetName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.currentStreetName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentStreetNameBytes(com.google.v.v vVar) {
        this.currentStreetName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavorite(int i2, ai aiVar) {
        Objects.requireNonNull(aiVar);
        ensureFavoriteIsMutable();
        this.favorite_.set(i2, aiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLongTermMemoryEnabled(boolean z) {
        this.bitField0_ |= 32;
        this.isLongTermMemoryEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasurementSystem(com.waze.ca.a aVar) {
        this.measurementSystem_ = aVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationInfo(al alVar) {
        Objects.requireNonNull(alVar);
        this.navigationInfo_ = alVar;
        this.bitField0_ |= 4;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဇ\u0005\bဉ\u0006", new Object[]{"bitField0_", "favorite_", ai.class, "acceptedLanguage_", "userPosition_", "navigationInfo_", "measurementSystem_", com.waze.ca.a.a(), "currentStreetName_", "isLongTermMemoryEnabled_", "audioConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new t(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<u> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (u.class) {
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

    public ai getFavorite(int i2) {
        return this.favorite_.get(i2);
    }

    public int getFavoriteCount() {
        return this.favorite_.size();
    }

    public List<ai> getFavoriteList() {
        return this.favorite_;
    }

    public aj getFavoriteOrBuilder(int i2) {
        return this.favorite_.get(i2);
    }

    public List<? extends aj> getFavoriteOrBuilderList() {
        return this.favorite_;
    }

    public boolean getIsLongTermMemoryEnabled() {
        return this.isLongTermMemoryEnabled_;
    }

    public com.waze.ca.a getMeasurementSystem() {
        com.waze.ca.a aVarB = com.waze.ca.a.b(this.measurementSystem_);
        return aVarB == null ? com.waze.ca.a.MEASUREMENT_SYSTEM_UNSPECIFIED : aVarB;
    }

    public al getNavigationInfo() {
        al alVar = this.navigationInfo_;
        return alVar == null ? al.getDefaultInstance() : alVar;
    }

    public i.b.s getUserPosition() {
        i.b.s sVar = this.userPosition_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasAcceptedLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAudioConfiguration() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCurrentStreetName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsLongTermMemoryEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMeasurementSystem() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNavigationInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserPosition() {
        return (this.bitField0_ & 2) != 0;
    }

    public static t newBuilder(u uVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(com.google.v.v vVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(com.google.v.z zVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(com.google.v.z zVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFavorite(ai aiVar) {
        Objects.requireNonNull(aiVar);
        ensureFavoriteIsMutable();
        this.favorite_.add(aiVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
