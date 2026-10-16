package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ad extends com.google.v.du<ad, ac> implements fj {
    public static final int ALERTER_FIELD_NUMBER = 1;
    private static final ad DEFAULT_INSTANCE;
    private static volatile fo<ad> PARSER = null;
    public static final int PIN_FIELD_NUMBER = 2;
    private int alerter_;
    private int bitField0_;
    private int pin_;

    static {
        ad adVar = new ad();
        DEFAULT_INSTANCE = adVar;
        com.google.v.du.registerDefaultInstance(ad.class, adVar);
    }

    private ad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerter() {
        this.bitField0_ &= -2;
        this.alerter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPin() {
        this.bitField0_ &= -3;
        this.pin_ = 0;
    }

    public static ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ac newBuilder() {
        return (ac) DEFAULT_INSTANCE.createBuilder();
    }

    public static ad parseDelimitedFrom(InputStream inputStream) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(com.google.v.v vVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerter(ah ahVar) {
        this.alerter_ = ahVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterValue(int i2) {
        this.bitField0_ |= 1;
        this.alerter_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPin(ah ahVar) {
        this.pin_ = ahVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinValue(int i2) {
        this.bitField0_ |= 2;
        this.pin_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "alerter_", "pin_"});
        }
        if (iOrdinal == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ah getAlerter() {
        ah ahVarA = ah.a(this.alerter_);
        return ahVarA == null ? ah.UNRECOGNIZED : ahVarA;
    }

    public int getAlerterValue() {
        return this.alerter_;
    }

    public ah getPin() {
        ah ahVarA = ah.a(this.pin_);
        return ahVarA == null ? ah.UNRECOGNIZED : ahVarA;
    }

    public int getPinValue() {
        return this.pin_;
    }

    public boolean hasAlerter() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPin() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ac newBuilder(ad adVar) {
        return (ac) DEFAULT_INSTANCE.createBuilder(adVar);
    }

    public static ad parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ad parseFrom(com.google.v.z zVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ad parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ad parseFrom(InputStream inputStream) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ad parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ad parseFrom(ByteBuffer byteBuffer) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ad parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ad parseFrom(byte[] bArr) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ad parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
