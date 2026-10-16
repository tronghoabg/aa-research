package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hi extends com.google.v.du<hi, hh> implements com.google.v.fj {
    private static final hi DEFAULT_INSTANCE;
    public static final int LOWER_AMOUNT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<hi> PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 3;
    public static final int UPPER_AMOUNT_FIELD_NUMBER = 2;
    private int bitField0_;
    private double lowerAmount_;
    private int unit_;
    private double upperAmount_;

    static {
        hi hiVar = new hi();
        DEFAULT_INSTANCE = hiVar;
        com.google.v.du.registerDefaultInstance(hi.class, hiVar);
    }

    private hi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowerAmount() {
        this.bitField0_ &= -2;
        this.lowerAmount_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.bitField0_ &= -5;
        this.unit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpperAmount() {
        this.bitField0_ &= -3;
        this.upperAmount_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static hi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hh newBuilder() {
        return (hh) DEFAULT_INSTANCE.createBuilder();
    }

    public static hi parseDelimitedFrom(InputStream inputStream) {
        return (hi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hi parseFrom(com.google.v.v vVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowerAmount(double d2) {
        this.bitField0_ |= 1;
        this.lowerAmount_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(hg hgVar) {
        this.unit_ = hgVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpperAmount(double d2) {
        this.bitField0_ |= 2;
        this.upperAmount_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "lowerAmount_", "upperAmount_", "unit_", ha.f11887d});
        }
        if (iOrdinal == 3) {
            return new hi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getLowerAmount() {
        return this.lowerAmount_;
    }

    public hg getUnit() {
        hg hgVarA = hg.a(this.unit_);
        return hgVarA == null ? hg.UNDEFINED_MASS_UNIT : hgVarA;
    }

    public double getUpperAmount() {
        return this.upperAmount_;
    }

    public boolean hasLowerAmount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnit() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUpperAmount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hh newBuilder(hi hiVar) {
        return (hh) DEFAULT_INSTANCE.createBuilder(hiVar);
    }

    public static hi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hi parseFrom(com.google.v.z zVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hi parseFrom(InputStream inputStream) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hi parseFrom(ByteBuffer byteBuffer) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hi parseFrom(byte[] bArr) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
