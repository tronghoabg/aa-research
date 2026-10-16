package com.google.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends du<i, h> implements j {
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER = null;
    public static final int POWER_FIELD_NUMBER = 2;
    public static final int UNIT_FIELD_NUMBER = 3;
    public static final int UNIT_MID_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private int power_ = 1;
    private String unitMid_ = "";
    private d unit_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPower() {
        this.bitField0_ &= -2;
        this.power_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnitMid() {
        this.bitField0_ &= -5;
        this.unitMid_ = getDefaultInstance().getUnitMid();
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnit(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.unit_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.unit_ = dVar;
        this.bitField0_ |= 2;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(com.google.v.v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPower(int i2) {
        this.bitField0_ |= 1;
        this.power_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(d dVar) {
        Objects.requireNonNull(dVar);
        this.unit_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitMid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.unitMid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitMidBytes(com.google.v.v vVar) {
        this.unitMid_ = vVar.u();
        this.bitField0_ |= 4;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0002\u0002င\u0000\u0003ᐉ\u0001", new Object[]{"bitField0_", "unitMid_", "power_", "unit_"});
            case 3:
                return new i();
            case 4:
                return new h(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<i> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (i.class) {
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

    public int getPower() {
        return this.power_;
    }

    public d getUnit() {
        d dVar = this.unit_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    @Deprecated
    public String getUnitMid() {
        return this.unitMid_;
    }

    @Deprecated
    public com.google.v.v getUnitMidBytes() {
        return com.google.v.v.s(this.unitMid_);
    }

    public boolean hasPower() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasUnitMid() {
        return (this.bitField0_ & 4) != 0;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(com.google.v.v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
