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
public final class cu extends du<cu, ct> implements fj {
    private static final cu DEFAULT_INSTANCE;
    public static final int IS_ADVERTISEMENT_OFFLOAD_SUPPORTED_FIELD_NUMBER = 4;
    public static final int IS_EXTENDED_ADVERTISING_SUPPORTED_FIELD_NUMBER = 1;
    public static final int IS_LOW_ENERGY_SUPPORTED_FIELD_NUMBER = 3;
    public static final int IS_PERIPHERAL_ROLE_SUPPORTED_FIELD_NUMBER = 2;
    private static volatile fo<cu> PARSER;
    private int bitField0_;
    private boolean isAdvertisementOffloadSupported_;
    private boolean isExtendedAdvertisingSupported_;
    private boolean isLowEnergySupported_;
    private boolean isPeripheralRoleSupported_;

    static {
        cu cuVar = new cu();
        DEFAULT_INSTANCE = cuVar;
        du.registerDefaultInstance(cu.class, cuVar);
    }

    private cu() {
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

    public static cu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cu parseDelimitedFrom(InputStream inputStream) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(com.google.v.v vVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cu> parser() {
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
            return new cu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ct(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cu.class) {
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

    public static ct newBuilder(cu cuVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cuVar);
    }

    public static cu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cu parseFrom(com.google.v.z zVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cu parseFrom(InputStream inputStream) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(ByteBuffer byteBuffer) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cu parseFrom(byte[] bArr) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cu) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
