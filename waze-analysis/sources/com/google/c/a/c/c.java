package com.google.c.a.c;

import com.google.k.a.a.b.bv;
import com.google.k.a.a.b.bw;
import com.google.k.a.a.b.er;
import com.google.k.a.a.b.es;
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
/* loaded from: classes4.dex */
public final class c extends du<c, b> implements d {
    private static final c DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int GEOCODING_ADDRESS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile fo<c> PARSER = null;
    public static final int PLACE_ID_FIELD_NUMBER = 4;
    public static final int POSITION_FIELD_NUMBER = 3;
    private int bitField0_;
    private bw featureId_;
    private es position_;
    private byte memoizedIsInitialized = 2;
    private String placeId_ = "";
    private String name_ = "";
    private String geocodingAddress_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureId() {
        this.featureId_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeocodingAddress() {
        this.bitField0_ &= -9;
        this.geocodingAddress_ = getDefaultInstance().getGeocodingAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceId() {
        this.bitField0_ &= -2;
        this.placeId_ = getDefaultInstance().getPlaceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -17;
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.featureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.position_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.position_ = esVar;
        this.bitField0_ |= 16;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeocodingAddress(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.geocodingAddress_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeocodingAddressBytes(v vVar) {
        this.geocodingAddress_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.placeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceIdBytes(v vVar) {
        this.placeId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(es esVar) {
        Objects.requireNonNull(esVar);
        this.position_ = esVar;
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ဈ\u0003\u0003ᐉ\u0004\u0004ဈ\u0000\u0005ဈ\u0002", new Object[]{"bitField0_", "featureId_", "geocodingAddress_", "position_", "placeId_", "name_"});
            case 3:
                return new c();
            case 4:
                return new b(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<c> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (c.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public bw getFeatureId() {
        bw bwVar = this.featureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public String getGeocodingAddress() {
        return this.geocodingAddress_;
    }

    public v getGeocodingAddressBytes() {
        return v.s(this.geocodingAddress_);
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getPlaceId() {
        return this.placeId_;
    }

    public v getPlaceIdBytes() {
        return v.s(this.placeId_);
    }

    public es getPosition() {
        es esVar = this.position_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public boolean hasFeatureId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGeocodingAddress() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlaceId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 16) != 0;
    }

    public static b newBuilder(c cVar) {
        return (b) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
