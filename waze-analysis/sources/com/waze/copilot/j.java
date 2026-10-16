package com.waze.copilot;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends du<j, i> implements k {
    public static final int CAR_3D_INFO_FIELD_NUMBER = 3;
    public static final int CAR_ID_FIELD_NUMBER = 1;
    public static final int CAR_NAME_FIELD_NUMBER = 2;
    private static final j DEFAULT_INSTANCE;
    public static final int DOWNLOADABLE_FIELD_NUMBER = 4;
    public static final int IS_ADS_FIELD_NUMBER = 6;
    private static volatile fo<j> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 5;
    private int bitField0_;
    private f car3DInfo_;
    private long carId_;
    private String carName_ = "";
    private b downloadable_;
    private boolean isAds_;
    private d preview_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCar3DInfo() {
        this.car3DInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarId() {
        this.bitField0_ &= -2;
        this.carId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarName() {
        this.bitField0_ &= -3;
        this.carName_ = getDefaultInstance().getCarName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadable() {
        this.downloadable_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAds() {
        this.bitField0_ &= -33;
        this.isAds_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreview() {
        this.preview_ = null;
        this.bitField0_ &= -17;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCar3DInfo(f fVar) {
        Objects.requireNonNull(fVar);
        f fVar2 = this.car3DInfo_;
        if (fVar2 != null && fVar2 != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder(fVar2);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.car3DInfo_ = fVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDownloadable(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.downloadable_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.downloadable_ = bVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreview(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.preview_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.preview_ = dVar;
        this.bitField0_ |= 16;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(com.google.v.v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCar3DInfo(f fVar) {
        Objects.requireNonNull(fVar);
        this.car3DInfo_ = fVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarId(long j2) {
        this.bitField0_ |= 1;
        this.carId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.carName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarNameBytes(com.google.v.v vVar) {
        this.carName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadable(b bVar) {
        Objects.requireNonNull(bVar);
        this.downloadable_ = bVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAds(boolean z) {
        this.bitField0_ |= 32;
        this.isAds_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreview(d dVar) {
        Objects.requireNonNull(dVar);
        this.preview_ = dVar;
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "carId_", "carName_", "car3DInfo_", "downloadable_", "preview_", "isAds_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getCar3DInfo() {
        f fVar = this.car3DInfo_;
        return fVar == null ? f.getDefaultInstance() : fVar;
    }

    public long getCarId() {
        return this.carId_;
    }

    public String getCarName() {
        return this.carName_;
    }

    public com.google.v.v getCarNameBytes() {
        return com.google.v.v.s(this.carName_);
    }

    public b getDownloadable() {
        b bVar = this.downloadable_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    @Deprecated
    public boolean getIsAds() {
        return this.isAds_;
    }

    public d getPreview() {
        d dVar = this.preview_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public boolean hasCar3DInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCarId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCarName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDownloadable() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasIsAds() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPreview() {
        return (this.bitField0_ & 16) != 0;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(com.google.v.v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(com.google.v.z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(com.google.v.z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
