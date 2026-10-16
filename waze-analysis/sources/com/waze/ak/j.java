package com.waze.ak;

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
/* loaded from: classes5.dex */
public final class j extends du<j, i> implements fj {
    private static final j DEFAULT_INSTANCE;
    public static final int FAVORITE_INFO_FIELD_NUMBER = 1;
    private static volatile fo<j> PARSER = null;
    public static final int VENUE_INFO_FIELD_NUMBER = 2;
    private int bitField0_;
    private o favoriteInfo_;
    private ae venueInfo_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoriteInfo() {
        this.favoriteInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueInfo() {
        this.venueInfo_ = null;
        this.bitField0_ &= -3;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFavoriteInfo(o oVar) {
        Objects.requireNonNull(oVar);
        o oVar2 = this.favoriteInfo_;
        if (oVar2 != null && oVar2 != o.getDefaultInstance()) {
            m mVarNewBuilder = o.newBuilder(oVar2);
            mVarNewBuilder.mergeFrom((m) oVar);
            oVar = mVarNewBuilder.buildPartial();
        }
        this.favoriteInfo_ = oVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueInfo(ae aeVar) {
        Objects.requireNonNull(aeVar);
        ae aeVar2 = this.venueInfo_;
        if (aeVar2 != null && aeVar2 != ae.getDefaultInstance()) {
            ad adVarNewBuilder = ae.newBuilder(aeVar2);
            adVarNewBuilder.mergeFrom((ad) aeVar);
            aeVar = adVarNewBuilder.buildPartial();
        }
        this.venueInfo_ = aeVar;
        this.bitField0_ |= 2;
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
    public void setFavoriteInfo(o oVar) {
        Objects.requireNonNull(oVar);
        this.favoriteInfo_ = oVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueInfo(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.venueInfo_ = aeVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "favoriteInfo_", "venueInfo_"});
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

    public o getFavoriteInfo() {
        o oVar = this.favoriteInfo_;
        return oVar == null ? o.getDefaultInstance() : oVar;
    }

    public ae getVenueInfo() {
        ae aeVar = this.venueInfo_;
        return aeVar == null ? ae.getDefaultInstance() : aeVar;
    }

    public boolean hasFavoriteInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenueInfo() {
        return (this.bitField0_ & 2) != 0;
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
