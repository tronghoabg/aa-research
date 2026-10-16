package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ak extends com.google.v.du<ak, aj> implements fj {
    public static final int ALERTER_SHOWN_TOKEN_FIELD_NUMBER = 7;
    public static final int ALERT_INFO_FIELD_NUMBER = 2;
    public static final int ALERT_REPORTING_INFO_FIELD_NUMBER = 3;
    public static final int ALERT_UUID_FIELD_NUMBER = 6;
    public static final int CRASH_PRONE_INFO_FIELD_NUMBER = 4;
    private static final ak DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NOTIFY_ALERTER_SHOWN_FIELD_NUMBER = 5;
    private static volatile fo<ak> PARSER;
    private Object additionalInfo_;
    private k alertInfo_;
    private int bitField0_;
    private long id_;
    private boolean notifyAlerterShown_;
    private int additionalInfoCase_ = 0;
    private String alertUuid_ = "";
    private String alerterShownToken_ = "";

    static {
        ak akVar = new ak();
        DEFAULT_INSTANCE = akVar;
        com.google.v.du.registerDefaultInstance(ak.class, akVar);
    }

    private ak() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalInfo() {
        this.additionalInfoCase_ = 0;
        this.additionalInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertInfo() {
        this.alertInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertReportingInfo() {
        if (this.additionalInfoCase_ == 3) {
            this.additionalInfoCase_ = 0;
            this.additionalInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertUuid() {
        this.bitField0_ &= -9;
        this.alertUuid_ = getDefaultInstance().getAlertUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterShownToken() {
        this.bitField0_ &= -17;
        this.alerterShownToken_ = getDefaultInstance().getAlerterShownToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashProneInfo() {
        if (this.additionalInfoCase_ == 4) {
            this.additionalInfoCase_ = 0;
            this.additionalInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotifyAlerterShown() {
        this.bitField0_ &= -5;
        this.notifyAlerterShown_ = false;
    }

    public static ak getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertInfo(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.alertInfo_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder(kVar2);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.alertInfo_ = kVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertReportingInfo(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.additionalInfoCase_ == 3 && this.additionalInfo_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.additionalInfo_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = mVar;
        this.additionalInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrashProneInfo(ae aeVar) {
        Objects.requireNonNull(aeVar);
        if (this.additionalInfoCase_ == 4 && this.additionalInfo_ != ae.getDefaultInstance()) {
            ad adVarNewBuilder = ae.newBuilder((ae) this.additionalInfo_);
            adVarNewBuilder.mergeFrom((ad) aeVar);
            aeVar = adVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = aeVar;
        this.additionalInfoCase_ = 4;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ak parseDelimitedFrom(InputStream inputStream) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(com.google.v.v vVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ak> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertInfo(k kVar) {
        Objects.requireNonNull(kVar);
        this.alertInfo_ = kVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertReportingInfo(m mVar) {
        Objects.requireNonNull(mVar);
        this.additionalInfo_ = mVar;
        this.additionalInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.alertUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuidBytes(com.google.v.v vVar) {
        this.alertUuid_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterShownToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.alerterShownToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterShownTokenBytes(com.google.v.v vVar) {
        this.alerterShownToken_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashProneInfo(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.additionalInfo_ = aeVar;
        this.additionalInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotifyAlerterShown(boolean z) {
        this.bitField0_ |= 4;
        this.notifyAlerterShown_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005ဇ\u0002\u0006ဈ\u0003\u0007ဈ\u0004", new Object[]{"additionalInfo_", "additionalInfoCase_", "bitField0_", "id_", "alertInfo_", m.class, ae.class, "notifyAlerterShown_", "alertUuid_", "alerterShownToken_"});
        }
        if (iOrdinal == 3) {
            return new ak();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ak> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ak.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ai getAdditionalInfoCase() {
        int i2 = this.additionalInfoCase_;
        if (i2 == 0) {
            return ai.f16326c;
        }
        if (i2 == 3) {
            return ai.f16324a;
        }
        if (i2 != 4) {
            return null;
        }
        return ai.f16325b;
    }

    public k getAlertInfo() {
        k kVar = this.alertInfo_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public m getAlertReportingInfo() {
        return this.additionalInfoCase_ == 3 ? (m) this.additionalInfo_ : m.getDefaultInstance();
    }

    public String getAlertUuid() {
        return this.alertUuid_;
    }

    public com.google.v.v getAlertUuidBytes() {
        return com.google.v.v.s(this.alertUuid_);
    }

    public String getAlerterShownToken() {
        return this.alerterShownToken_;
    }

    public com.google.v.v getAlerterShownTokenBytes() {
        return com.google.v.v.s(this.alerterShownToken_);
    }

    public ae getCrashProneInfo() {
        return this.additionalInfoCase_ == 4 ? (ae) this.additionalInfo_ : ae.getDefaultInstance();
    }

    public long getId() {
        return this.id_;
    }

    public boolean getNotifyAlerterShown() {
        return this.notifyAlerterShown_;
    }

    public boolean hasAlertInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAlertReportingInfo() {
        return this.additionalInfoCase_ == 3;
    }

    public boolean hasAlertUuid() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAlerterShownToken() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCrashProneInfo() {
        return this.additionalInfoCase_ == 4;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNotifyAlerterShown() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aj newBuilder(ak akVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(akVar);
    }

    public static ak parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ak) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ak parseFrom(com.google.v.z zVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ak parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ak parseFrom(InputStream inputStream) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ak parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ak parseFrom(ByteBuffer byteBuffer) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ak parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ak parseFrom(byte[] bArr) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ak parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ak) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
