package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dq extends com.google.v.du<dq, Cdo> implements fj {
    private static final dq DEFAULT_INSTANCE;
    private static volatile fo<dq> PARSER = null;
    public static final int WEATHER_DEFAULT_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int WEATHER_FLOOD_CONFIGURATION_FIELD_NUMBER = 5;
    public static final int WEATHER_FOG_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int WEATHER_HAIL_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int WEATHER_HEAVY_RAIN_CONFIGURATION_FIELD_NUMBER = 4;
    private int weatherTypeConfigurationCase_ = 0;
    private Object weatherTypeConfiguration_;

    static {
        dq dqVar = new dq();
        DEFAULT_INSTANCE = dqVar;
        com.google.v.du.registerDefaultInstance(dq.class, dqVar);
    }

    private dq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherDefaultConfiguration() {
        if (this.weatherTypeConfigurationCase_ == 1) {
            this.weatherTypeConfigurationCase_ = 0;
            this.weatherTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherFloodConfiguration() {
        if (this.weatherTypeConfigurationCase_ == 5) {
            this.weatherTypeConfigurationCase_ = 0;
            this.weatherTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherFogConfiguration() {
        if (this.weatherTypeConfigurationCase_ == 2) {
            this.weatherTypeConfigurationCase_ = 0;
            this.weatherTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherHailConfiguration() {
        if (this.weatherTypeConfigurationCase_ == 3) {
            this.weatherTypeConfigurationCase_ = 0;
            this.weatherTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherHeavyRainConfiguration() {
        if (this.weatherTypeConfigurationCase_ == 4) {
            this.weatherTypeConfigurationCase_ = 0;
            this.weatherTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeatherTypeConfiguration() {
        this.weatherTypeConfigurationCase_ = 0;
        this.weatherTypeConfiguration_ = null;
    }

    public static dq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherDefaultConfiguration(ds dsVar) {
        Objects.requireNonNull(dsVar);
        if (this.weatherTypeConfigurationCase_ == 1 && this.weatherTypeConfiguration_ != ds.getDefaultInstance()) {
            dr drVarNewBuilder = ds.newBuilder((ds) this.weatherTypeConfiguration_);
            drVarNewBuilder.mergeFrom((dr) dsVar);
            dsVar = drVarNewBuilder.buildPartial();
        }
        this.weatherTypeConfiguration_ = dsVar;
        this.weatherTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherFloodConfiguration(du duVar) {
        Objects.requireNonNull(duVar);
        if (this.weatherTypeConfigurationCase_ == 5 && this.weatherTypeConfiguration_ != du.getDefaultInstance()) {
            dt dtVarNewBuilder = du.newBuilder((du) this.weatherTypeConfiguration_);
            dtVarNewBuilder.mergeFrom((dt) duVar);
            duVar = dtVarNewBuilder.buildPartial();
        }
        this.weatherTypeConfiguration_ = duVar;
        this.weatherTypeConfigurationCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherFogConfiguration(dw dwVar) {
        Objects.requireNonNull(dwVar);
        if (this.weatherTypeConfigurationCase_ == 2 && this.weatherTypeConfiguration_ != dw.getDefaultInstance()) {
            dv dvVarNewBuilder = dw.newBuilder((dw) this.weatherTypeConfiguration_);
            dvVarNewBuilder.mergeFrom((dv) dwVar);
            dwVar = dvVarNewBuilder.buildPartial();
        }
        this.weatherTypeConfiguration_ = dwVar;
        this.weatherTypeConfigurationCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherHailConfiguration(dy dyVar) {
        Objects.requireNonNull(dyVar);
        if (this.weatherTypeConfigurationCase_ == 3 && this.weatherTypeConfiguration_ != dy.getDefaultInstance()) {
            dx dxVarNewBuilder = dy.newBuilder((dy) this.weatherTypeConfiguration_);
            dxVarNewBuilder.mergeFrom((dx) dyVar);
            dyVar = dxVarNewBuilder.buildPartial();
        }
        this.weatherTypeConfiguration_ = dyVar;
        this.weatherTypeConfigurationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeatherHeavyRainConfiguration(ea eaVar) {
        Objects.requireNonNull(eaVar);
        if (this.weatherTypeConfigurationCase_ == 4 && this.weatherTypeConfiguration_ != ea.getDefaultInstance()) {
            dz dzVarNewBuilder = ea.newBuilder((ea) this.weatherTypeConfiguration_);
            dzVarNewBuilder.mergeFrom((dz) eaVar);
            eaVar = dzVarNewBuilder.buildPartial();
        }
        this.weatherTypeConfiguration_ = eaVar;
        this.weatherTypeConfigurationCase_ = 4;
    }

    public static Cdo newBuilder() {
        return (Cdo) DEFAULT_INSTANCE.createBuilder();
    }

    public static dq parseDelimitedFrom(InputStream inputStream) {
        return (dq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dq parseFrom(com.google.v.v vVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherDefaultConfiguration(ds dsVar) {
        Objects.requireNonNull(dsVar);
        this.weatherTypeConfiguration_ = dsVar;
        this.weatherTypeConfigurationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherFloodConfiguration(du duVar) {
        Objects.requireNonNull(duVar);
        this.weatherTypeConfiguration_ = duVar;
        this.weatherTypeConfigurationCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherFogConfiguration(dw dwVar) {
        Objects.requireNonNull(dwVar);
        this.weatherTypeConfiguration_ = dwVar;
        this.weatherTypeConfigurationCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherHailConfiguration(dy dyVar) {
        Objects.requireNonNull(dyVar);
        this.weatherTypeConfiguration_ = dyVar;
        this.weatherTypeConfigurationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeatherHeavyRainConfiguration(ea eaVar) {
        Objects.requireNonNull(eaVar);
        this.weatherTypeConfiguration_ = eaVar;
        this.weatherTypeConfigurationCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"weatherTypeConfiguration_", "weatherTypeConfigurationCase_", ds.class, dw.class, dy.class, ea.class, du.class});
        }
        if (iOrdinal == 3) {
            return new dq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new Cdo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ds getWeatherDefaultConfiguration() {
        return this.weatherTypeConfigurationCase_ == 1 ? (ds) this.weatherTypeConfiguration_ : ds.getDefaultInstance();
    }

    public du getWeatherFloodConfiguration() {
        return this.weatherTypeConfigurationCase_ == 5 ? (du) this.weatherTypeConfiguration_ : du.getDefaultInstance();
    }

    public dw getWeatherFogConfiguration() {
        return this.weatherTypeConfigurationCase_ == 2 ? (dw) this.weatherTypeConfiguration_ : dw.getDefaultInstance();
    }

    public dy getWeatherHailConfiguration() {
        return this.weatherTypeConfigurationCase_ == 3 ? (dy) this.weatherTypeConfiguration_ : dy.getDefaultInstance();
    }

    public ea getWeatherHeavyRainConfiguration() {
        return this.weatherTypeConfigurationCase_ == 4 ? (ea) this.weatherTypeConfiguration_ : ea.getDefaultInstance();
    }

    public dp getWeatherTypeConfigurationCase() {
        int i2 = this.weatherTypeConfigurationCase_;
        if (i2 == 0) {
            return dp.f15077f;
        }
        if (i2 == 1) {
            return dp.f15072a;
        }
        if (i2 == 2) {
            return dp.f15073b;
        }
        if (i2 == 3) {
            return dp.f15074c;
        }
        if (i2 == 4) {
            return dp.f15075d;
        }
        if (i2 != 5) {
            return null;
        }
        return dp.f15076e;
    }

    public boolean hasWeatherDefaultConfiguration() {
        return this.weatherTypeConfigurationCase_ == 1;
    }

    public boolean hasWeatherFloodConfiguration() {
        return this.weatherTypeConfigurationCase_ == 5;
    }

    public boolean hasWeatherFogConfiguration() {
        return this.weatherTypeConfigurationCase_ == 2;
    }

    public boolean hasWeatherHailConfiguration() {
        return this.weatherTypeConfigurationCase_ == 3;
    }

    public boolean hasWeatherHeavyRainConfiguration() {
        return this.weatherTypeConfigurationCase_ == 4;
    }

    public static Cdo newBuilder(dq dqVar) {
        return (Cdo) DEFAULT_INSTANCE.createBuilder(dqVar);
    }

    public static dq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dq parseFrom(com.google.v.z zVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dq parseFrom(InputStream inputStream) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dq parseFrom(ByteBuffer byteBuffer) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dq parseFrom(byte[] bArr) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
