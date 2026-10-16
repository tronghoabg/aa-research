package com.waze.o;

import androidx.camera.video.AudioStats;
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
public final class bi extends du<bi, bh> implements fj {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 2;
    private static final bi DEFAULT_INSTANCE;
    private static volatile fo<bi> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 1;
    public static final int ROAD_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private double price_;
    private String currencyCode_ = "";
    private String roadName_ = "";

    static {
        bi biVar = new bi();
        DEFAULT_INSTANCE = biVar;
        du.registerDefaultInstance(bi.class, biVar);
    }

    private bi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrencyCode() {
        this.bitField0_ &= -3;
        this.currencyCode_ = getDefaultInstance().getCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.bitField0_ &= -2;
        this.price_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadName() {
        this.bitField0_ &= -5;
        this.roadName_ = getDefaultInstance().getRoadName();
    }

    public static bi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bh newBuilder() {
        return (bh) DEFAULT_INSTANCE.createBuilder();
    }

    public static bi parseDelimitedFrom(InputStream inputStream) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(com.google.v.v vVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.currencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCodeBytes(com.google.v.v vVar) {
        this.currencyCode_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(double d2) {
        this.bitField0_ |= 1;
        this.price_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.roadName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadNameBytes(com.google.v.v vVar) {
        this.roadName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "price_", "currencyCode_", "roadName_"});
        }
        if (iOrdinal == 3) {
            return new bi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    public com.google.v.v getCurrencyCodeBytes() {
        return com.google.v.v.s(this.currencyCode_);
    }

    public double getPrice() {
        return this.price_;
    }

    public String getRoadName() {
        return this.roadName_;
    }

    public com.google.v.v getRoadNameBytes() {
        return com.google.v.v.s(this.roadName_);
    }

    public boolean hasCurrencyCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRoadName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bh newBuilder(bi biVar) {
        return (bh) DEFAULT_INSTANCE.createBuilder(biVar);
    }

    public static bi parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(com.google.v.v vVar, de deVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bi parseFrom(com.google.v.z zVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bi parseFrom(com.google.v.z zVar, de deVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bi parseFrom(InputStream inputStream) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(InputStream inputStream, de deVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(ByteBuffer byteBuffer) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bi parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bi parseFrom(byte[] bArr) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bi parseFrom(byte[] bArr, de deVar) {
        return (bi) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
