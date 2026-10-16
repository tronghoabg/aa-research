package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ay extends com.google.v.du<ay, aw> implements fj {
    private static final ay DEFAULT_INSTANCE;
    public static final int HAZARD_CONSTRUCTION_CONFIGURATION_FIELD_NUMBER = 101;
    public static final int HAZARD_DEFAULT_CONFIGURATION_FIELD_NUMBER = 100;
    public static final int HAZARD_SHOULDER_VEHICLE_STOPPED_CONFIGURATION_FIELD_NUMBER = 102;
    private static volatile fo<ay> PARSER;
    private int hazardOnRoadTypeConfigurationCase_ = 0;
    private Object hazardOnRoadTypeConfiguration_;

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        com.google.v.du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardConstructionConfiguration() {
        if (this.hazardOnRoadTypeConfigurationCase_ == 101) {
            this.hazardOnRoadTypeConfigurationCase_ = 0;
            this.hazardOnRoadTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardDefaultConfiguration() {
        if (this.hazardOnRoadTypeConfigurationCase_ == 100) {
            this.hazardOnRoadTypeConfigurationCase_ = 0;
            this.hazardOnRoadTypeConfiguration_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardOnRoadTypeConfiguration() {
        this.hazardOnRoadTypeConfigurationCase_ = 0;
        this.hazardOnRoadTypeConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHazardShoulderVehicleStoppedConfiguration() {
        if (this.hazardOnRoadTypeConfigurationCase_ == 102) {
            this.hazardOnRoadTypeConfigurationCase_ = 0;
            this.hazardOnRoadTypeConfiguration_ = null;
        }
    }

    public static ay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardConstructionConfiguration(at atVar) {
        Objects.requireNonNull(atVar);
        if (this.hazardOnRoadTypeConfigurationCase_ == 101 && this.hazardOnRoadTypeConfiguration_ != at.getDefaultInstance()) {
            as asVarNewBuilder = at.newBuilder((at) this.hazardOnRoadTypeConfiguration_);
            asVarNewBuilder.mergeFrom((as) atVar);
            atVar = asVarNewBuilder.buildPartial();
        }
        this.hazardOnRoadTypeConfiguration_ = atVar;
        this.hazardOnRoadTypeConfigurationCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardDefaultConfiguration(av avVar) {
        Objects.requireNonNull(avVar);
        if (this.hazardOnRoadTypeConfigurationCase_ == 100 && this.hazardOnRoadTypeConfiguration_ != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder((av) this.hazardOnRoadTypeConfiguration_);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.hazardOnRoadTypeConfiguration_ = avVar;
        this.hazardOnRoadTypeConfigurationCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHazardShoulderVehicleStoppedConfiguration(ba baVar) {
        Objects.requireNonNull(baVar);
        if (this.hazardOnRoadTypeConfigurationCase_ == 102 && this.hazardOnRoadTypeConfiguration_ != ba.getDefaultInstance()) {
            az azVarNewBuilder = ba.newBuilder((ba) this.hazardOnRoadTypeConfiguration_);
            azVarNewBuilder.mergeFrom((az) baVar);
            baVar = azVarNewBuilder.buildPartial();
        }
        this.hazardOnRoadTypeConfiguration_ = baVar;
        this.hazardOnRoadTypeConfigurationCase_ = 102;
    }

    public static aw newBuilder() {
        return (aw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(com.google.v.v vVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardConstructionConfiguration(at atVar) {
        Objects.requireNonNull(atVar);
        this.hazardOnRoadTypeConfiguration_ = atVar;
        this.hazardOnRoadTypeConfigurationCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardDefaultConfiguration(av avVar) {
        Objects.requireNonNull(avVar);
        this.hazardOnRoadTypeConfiguration_ = avVar;
        this.hazardOnRoadTypeConfigurationCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHazardShoulderVehicleStoppedConfiguration(ba baVar) {
        Objects.requireNonNull(baVar);
        this.hazardOnRoadTypeConfiguration_ = baVar;
        this.hazardOnRoadTypeConfigurationCase_ = 102;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000df\u0003\u0000\u0000\u0000d<\u0000e<\u0000f<\u0000", new Object[]{"hazardOnRoadTypeConfiguration_", "hazardOnRoadTypeConfigurationCase_", av.class, at.class, ba.class});
        }
        if (iOrdinal == 3) {
            return new ay();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ay.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public at getHazardConstructionConfiguration() {
        return this.hazardOnRoadTypeConfigurationCase_ == 101 ? (at) this.hazardOnRoadTypeConfiguration_ : at.getDefaultInstance();
    }

    public av getHazardDefaultConfiguration() {
        return this.hazardOnRoadTypeConfigurationCase_ == 100 ? (av) this.hazardOnRoadTypeConfiguration_ : av.getDefaultInstance();
    }

    public ax getHazardOnRoadTypeConfigurationCase() {
        int i2 = this.hazardOnRoadTypeConfigurationCase_;
        if (i2 == 0) {
            return ax.f15023d;
        }
        switch (i2) {
            case 100:
                return ax.f15020a;
            case 101:
                return ax.f15021b;
            case 102:
                return ax.f15022c;
            default:
                return null;
        }
    }

    public ba getHazardShoulderVehicleStoppedConfiguration() {
        return this.hazardOnRoadTypeConfigurationCase_ == 102 ? (ba) this.hazardOnRoadTypeConfiguration_ : ba.getDefaultInstance();
    }

    public boolean hasHazardConstructionConfiguration() {
        return this.hazardOnRoadTypeConfigurationCase_ == 101;
    }

    public boolean hasHazardDefaultConfiguration() {
        return this.hazardOnRoadTypeConfigurationCase_ == 100;
    }

    public boolean hasHazardShoulderVehicleStoppedConfiguration() {
        return this.hazardOnRoadTypeConfigurationCase_ == 102;
    }

    public static aw newBuilder(ay ayVar) {
        return (aw) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(com.google.v.z zVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
