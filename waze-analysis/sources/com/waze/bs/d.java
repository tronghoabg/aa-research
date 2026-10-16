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
public final class d extends du<d, c> implements fj {
    public static final int ACCEPTED_LANGUAGE_FIELD_NUMBER = 1;
    public static final int AUDIO_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int DEBUG_SESSION_DATA_FIELD_NUMBER = 100;
    private static final d DEFAULT_INSTANCE;
    private static volatile fo<d> PARSER;
    private String acceptedLanguage_ = "";
    private com.waze.u.a.g audioConfiguration_;
    private int bitField0_;
    private ah debugSessionData_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptedLanguage() {
        this.bitField0_ &= -2;
        this.acceptedLanguage_ = getDefaultInstance().getAcceptedLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioConfiguration() {
        this.audioConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugSessionData() {
        this.debugSessionData_ = null;
        this.bitField0_ &= -5;
    }

    public static d getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDebugSessionData(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.debugSessionData_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder(ahVar2);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.debugSessionData_ = ahVar;
        this.bitField0_ |= 4;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(com.google.v.v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugSessionData(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.debugSessionData_ = ahVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001d\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001dဉ\u0002", new Object[]{"bitField0_", "acceptedLanguage_", "audioConfiguration_", "debugSessionData_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
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

    public ah getDebugSessionData() {
        ah ahVar = this.debugSessionData_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public boolean hasAcceptedLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAudioConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDebugSessionData() {
        return (this.bitField0_ & 4) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(com.google.v.v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(com.google.v.z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(com.google.v.z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
