package com.waze.ap.b.a.a;

import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends com.google.v.du<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    public static final int HAZARD_ON_ROAD_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile fo<c> PARSER = null;
    public static final int WEATHER_CONFIGURATION_FIELD_NUMBER = 2;
    private int alertTypeConfigurationCase_ = 0;
    private Object alertTypeConfiguration_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        com.google.v.du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertTypeConfiguration() {
        this.alertTypeConfigurationCase_ = 0;
        this.alertTypeConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardOnRoadConfiguration() {
        if (this.alertTypeConfigurationCase_ == 1) {
            this.alertTypeConfigurationCase_ = 0;
            this.alertTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherConfiguration() {
        if (this.alertTypeConfigurationCase_ == 2) {
            this.alertTypeConfigurationCase_ = 0;
            this.alertTypeConfiguration_ = null;
        }
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardOnRoadConfiguration(ay ayVar) {
        Objects.requireNonNull(ayVar);
        if (this.alertTypeConfigurationCase_ == 1 && this.alertTypeConfiguration_ != ay.getDefaultInstance()) {
            aw awVarNewBuilder = ay.newBuilder((ay) this.alertTypeConfiguration_);
            awVarNewBuilder.mergeFrom((aw) ayVar);
            ayVar = awVarNewBuilder.buildPartial();
        }
        this.alertTypeConfiguration_ = ayVar;
        this.alertTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherConfiguration(dq dqVar) {
        Objects.requireNonNull(dqVar);
        if (this.alertTypeConfigurationCase_ == 2 && this.alertTypeConfiguration_ != dq.getDefaultInstance()) {
            Cdo cdoNewBuilder = dq.newBuilder((dq) this.alertTypeConfiguration_);
            cdoNewBuilder.mergeFrom((Cdo) dqVar);
            dqVar = cdoNewBuilder.buildPartial();
        }
        this.alertTypeConfiguration_ = dqVar;
        this.alertTypeConfigurationCase_ = 2;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardOnRoadConfiguration(ay ayVar) {
        Objects.requireNonNull(ayVar);
        this.alertTypeConfiguration_ = ayVar;
        this.alertTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherConfiguration(dq dqVar) {
        Objects.requireNonNull(dqVar);
        this.alertTypeConfiguration_ = dqVar;
        this.alertTypeConfigurationCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"alertTypeConfiguration_", "alertTypeConfigurationCase_", ay.class, dq.class});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new b(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public a getAlertTypeConfigurationCase() {
        int i2 = this.alertTypeConfigurationCase_;
        if (i2 == 0) {
            return a.f15012c;
        }
        if (i2 == 1) {
            return a.f15010a;
        }
        if (i2 != 2) {
            return null;
        }
        return a.f15011b;
    }

    public ay getHazardOnRoadConfiguration() {
        return this.alertTypeConfigurationCase_ == 1 ? (ay) this.alertTypeConfiguration_ : ay.getDefaultInstance();
    }

    public dq getWeatherConfiguration() {
        return this.alertTypeConfigurationCase_ == 2 ? (dq) this.alertTypeConfiguration_ : dq.getDefaultInstance();
    }

    public boolean hasHazardOnRoadConfiguration() {
        return this.alertTypeConfigurationCase_ == 1;
    }

    public boolean hasWeatherConfiguration() {
        return this.alertTypeConfigurationCase_ == 2;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
