package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends du<bj, bi> implements fj {
    private static final bj DEFAULT_INSTANCE;
    public static final int IS_ADVERTISEMENT_OFFLOAD_SUPPORTED_FIELD_NUMBER = 4;
    public static final int IS_EXTENDED_ADVERTISING_SUPPORTED_FIELD_NUMBER = 1;
    public static final int IS_LOW_ENERGY_SUPPORTED_FIELD_NUMBER = 3;
    public static final int IS_PERIPHERAL_ROLE_SUPPORTED_FIELD_NUMBER = 2;
    private static volatile fo<bj> PARSER;
    private int bitField0_;
    private boolean isAdvertisementOffloadSupported_;
    private boolean isExtendedAdvertisingSupported_;
    private boolean isLowEnergySupported_;
    private boolean isPeripheralRoleSupported_;

    static {
        bj bjVar = new bj();
        DEFAULT_INSTANCE = bjVar;
        du.registerDefaultInstance(bj.class, bjVar);
    }

    private bj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdvertisementOffloadSupported() {
        this.bitField0_ &= -9;
        this.isAdvertisementOffloadSupported_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExtendedAdvertisingSupported() {
        this.bitField0_ &= -2;
        this.isExtendedAdvertisingSupported_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLowEnergySupported() {
        this.bitField0_ &= -5;
        this.isLowEnergySupported_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPeripheralRoleSupported() {
        this.bitField0_ &= -3;
        this.isPeripheralRoleSupported_ = false;
    }

    public static bj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bi newBuilder() {
        return (bi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bj parseDelimitedFrom(InputStream inputStream) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(com.google.v.v vVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdvertisementOffloadSupported(boolean z) {
        this.bitField0_ |= 8;
        this.isAdvertisementOffloadSupported_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExtendedAdvertisingSupported(boolean z) {
        this.bitField0_ |= 1;
        this.isExtendedAdvertisingSupported_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLowEnergySupported(boolean z) {
        this.bitField0_ |= 4;
        this.isLowEnergySupported_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPeripheralRoleSupported(boolean z) {
        this.bitField0_ |= 2;
        this.isPeripheralRoleSupported_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "isExtendedAdvertisingSupported_", "isPeripheralRoleSupported_", "isLowEnergySupported_", "isAdvertisementOffloadSupported_"});
        }
        if (iOrdinal == 3) {
            return new bj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsAdvertisementOffloadSupported() {
        return this.isAdvertisementOffloadSupported_;
    }

    public boolean getIsExtendedAdvertisingSupported() {
        return this.isExtendedAdvertisingSupported_;
    }

    public boolean getIsLowEnergySupported() {
        return this.isLowEnergySupported_;
    }

    public boolean getIsPeripheralRoleSupported() {
        return this.isPeripheralRoleSupported_;
    }

    public boolean hasIsAdvertisementOffloadSupported() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsExtendedAdvertisingSupported() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsLowEnergySupported() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsPeripheralRoleSupported() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bi newBuilder(bj bjVar) {
        return (bi) DEFAULT_INSTANCE.createBuilder(bjVar);
    }

    public static bj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bj parseFrom(com.google.v.z zVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bj parseFrom(InputStream inputStream) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(ByteBuffer byteBuffer) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bj parseFrom(byte[] bArr) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
