package com.waze.bg.e;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends du<e, d> implements f {
    private static final e DEFAULT_INSTANCE;
    public static final int DISTANCE_IN_METERS_FIELD_NUMBER = 4;
    public static final int DURATION_IN_SECONDS_FIELD_NUMBER = 5;
    public static final int ENTRY_NAME_FIELD_NUMBER = 2;
    public static final int EXIT_NAME_FIELD_NUMBER = 3;
    public static final int FREEFLOW_DURATION_IN_SECONDS_FIELD_NUMBER = 7;
    public static final int HISTORIC_DURATION_IN_SECONDS_FIELD_NUMBER = 6;
    public static final int LEVEL_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<e> PARSER = null;
    public static final int PREDOMINANT_DIRECTION_FIELD_NUMBER = 8;
    public static final int PREDOMINANT_ROAD_TYPE_FIELD_NUMBER = 9;
    private int bitField0_;
    private int distanceInMeters_;
    private int durationInSeconds_;
    private int freeflowDurationInSeconds_;
    private int historicDurationInSeconds_;
    private int level_;
    private int predominantDirection_;
    private String name_ = "";
    private String entryName_ = "";
    private String exitName_ = "";
    private int predominantRoadType_ = 1;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceInMeters() {
        this.bitField0_ &= -9;
        this.distanceInMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationInSeconds() {
        this.bitField0_ &= -17;
        this.durationInSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryName() {
        this.bitField0_ &= -3;
        this.entryName_ = getDefaultInstance().getEntryName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExitName() {
        this.bitField0_ &= -5;
        this.exitName_ = getDefaultInstance().getExitName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeflowDurationInSeconds() {
        this.bitField0_ &= -65;
        this.freeflowDurationInSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistoricDurationInSeconds() {
        this.bitField0_ &= -33;
        this.historicDurationInSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.bitField0_ &= -513;
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredominantDirection() {
        this.bitField0_ &= -129;
        this.predominantDirection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredominantRoadType() {
        this.bitField0_ &= -257;
        this.predominantRoadType_ = 1;
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceInMeters(int i2) {
        this.bitField0_ |= 8;
        this.distanceInMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationInSeconds(int i2) {
        this.bitField0_ |= 16;
        this.durationInSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.entryName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryNameBytes(v vVar) {
        this.entryName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.exitName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExitNameBytes(v vVar) {
        this.exitName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeflowDurationInSeconds(int i2) {
        this.bitField0_ |= 64;
        this.freeflowDurationInSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoricDurationInSeconds(int i2) {
        this.bitField0_ |= 32;
        this.historicDurationInSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(h hVar) {
        this.level_ = hVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredominantDirection(a aVar) {
        this.predominantDirection_ = aVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredominantRoadType(i.a.a.g gVar) {
        this.predominantRoadType_ = gVar.getNumber();
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\b᠌\u0007\t᠌\b\n᠌\t", new Object[]{"bitField0_", "name_", "entryName_", "exitName_", "distanceInMeters_", "durationInSeconds_", "historicDurationInSeconds_", "freeflowDurationInSeconds_", "predominantDirection_", g.f16741b, "predominantRoadType_", i.a.a.g.a(), "level_", g.f16740a});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getDistanceInMeters() {
        return this.distanceInMeters_;
    }

    public int getDurationInSeconds() {
        return this.durationInSeconds_;
    }

    public String getEntryName() {
        return this.entryName_;
    }

    public v getEntryNameBytes() {
        return v.s(this.entryName_);
    }

    public String getExitName() {
        return this.exitName_;
    }

    public v getExitNameBytes() {
        return v.s(this.exitName_);
    }

    public int getFreeflowDurationInSeconds() {
        return this.freeflowDurationInSeconds_;
    }

    public int getHistoricDurationInSeconds() {
        return this.historicDurationInSeconds_;
    }

    public h getLevel() {
        h hVarA = h.a(this.level_);
        return hVarA == null ? h.UNSPECIFIED_LEVEL : hVarA;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public a getPredominantDirection() {
        a aVarA = a.a(this.predominantDirection_);
        return aVarA == null ? a.UNSPECIFIED_DIRECTION : aVarA;
    }

    public i.a.a.g getPredominantRoadType() {
        i.a.a.g gVarB = i.a.a.g.b(this.predominantRoadType_);
        return gVarB == null ? i.a.a.g.STREET : gVarB;
    }

    public boolean hasDistanceInMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDurationInSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEntryName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasExitName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFreeflowDurationInSeconds() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHistoricDurationInSeconds() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLevel() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPredominantDirection() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasPredominantRoadType() {
        return (this.bitField0_ & 256) != 0;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
