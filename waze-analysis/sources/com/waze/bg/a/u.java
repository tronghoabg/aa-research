package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u extends com.google.v.du<u, t> implements fj {
    public static final int ALERTER_SHOWN_TOKEN_FIELD_NUMBER = 3;
    public static final int CRASH_PRONE_INFO_FIELD_NUMBER = 4;
    private static final u DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<u> PARSER = null;
    public static final int SHOWN_TIME_FIELD_NUMBER = 2;
    public static final int SPEED_LIMIT_DECREASE_INFO_FIELD_NUMBER = 5;
    private Object additionalInfo_;
    private int bitField0_;
    private long id_;
    private gc shownTime_;
    private int additionalInfoCase_ = 0;
    private String alerterShownToken_ = "";

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        com.google.v.du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalInfo() {
        this.additionalInfoCase_ = 0;
        this.additionalInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterShownToken() {
        this.bitField0_ &= -5;
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
    public void clearShownTime() {
        this.shownTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimitDecreaseInfo() {
        if (this.additionalInfoCase_ == 5) {
            this.additionalInfoCase_ = 0;
            this.additionalInfo_ = null;
        }
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrashProneInfo(ag agVar) {
        Objects.requireNonNull(agVar);
        if (this.additionalInfoCase_ == 4 && this.additionalInfo_ != ag.getDefaultInstance()) {
            af afVarNewBuilder = ag.newBuilder((ag) this.additionalInfo_);
            afVarNewBuilder.mergeFrom((af) agVar);
            agVar = afVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = agVar;
        this.additionalInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShownTime(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.shownTime_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.shownTime_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedLimitDecreaseInfo(bj bjVar) {
        Objects.requireNonNull(bjVar);
        if (this.additionalInfoCase_ == 5 && this.additionalInfo_ != bj.getDefaultInstance()) {
            bi biVarNewBuilder = bj.newBuilder((bj) this.additionalInfo_);
            biVarNewBuilder.mergeFrom((bi) bjVar);
            bjVar = biVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = bjVar;
        this.additionalInfoCase_ = 5;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(com.google.v.v vVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterShownToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.alerterShownToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterShownTokenBytes(com.google.v.v vVar) {
        this.alerterShownToken_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashProneInfo(ag agVar) {
        Objects.requireNonNull(agVar);
        this.additionalInfo_ = agVar;
        this.additionalInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownTime(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.shownTime_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitDecreaseInfo(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.additionalInfo_ = bjVar;
        this.additionalInfoCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004<\u0000\u0005<\u0000", new Object[]{"additionalInfo_", "additionalInfoCase_", "bitField0_", "id_", "shownTime_", "alerterShownToken_", ag.class, bj.class});
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
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public s getAdditionalInfoCase() {
        int i2 = this.additionalInfoCase_;
        if (i2 == 0) {
            return s.f16575c;
        }
        if (i2 == 4) {
            return s.f16573a;
        }
        if (i2 != 5) {
            return null;
        }
        return s.f16574b;
    }

    public String getAlerterShownToken() {
        return this.alerterShownToken_;
    }

    public com.google.v.v getAlerterShownTokenBytes() {
        return com.google.v.v.s(this.alerterShownToken_);
    }

    public ag getCrashProneInfo() {
        return this.additionalInfoCase_ == 4 ? (ag) this.additionalInfo_ : ag.getDefaultInstance();
    }

    public long getId() {
        return this.id_;
    }

    public gc getShownTime() {
        gc gcVar = this.shownTime_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public bj getSpeedLimitDecreaseInfo() {
        return this.additionalInfoCase_ == 5 ? (bj) this.additionalInfo_ : bj.getDefaultInstance();
    }

    public boolean hasAlerterShownToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCrashProneInfo() {
        return this.additionalInfoCase_ == 4;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShownTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSpeedLimitDecreaseInfo() {
        return this.additionalInfoCase_ == 5;
    }

    public static t newBuilder(u uVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(com.google.v.z zVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (u) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
