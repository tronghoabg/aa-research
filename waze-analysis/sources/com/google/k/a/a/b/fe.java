package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fe extends com.google.v.du<fe, fc> implements ff {
    public static final int CURRENCY_FIELD_NUMBER = 3;
    private static final fe DEFAULT_INSTANCE;
    public static final int LOWER_PRICE_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 15000834;
    private static volatile com.google.v.fo<fe> PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 4;
    public static final int UPPER_PRICE_FIELD_NUMBER = 2;
    public static final com.google.v.ds<com.google.w.n.a.b, fe> messageSetExtension;
    private int bitField0_;
    private String currency_ = "";
    private double lowerPrice_;
    private int units_;
    private double upperPrice_;

    static {
        fe feVar = new fe();
        DEFAULT_INSTANCE = feVar;
        com.google.v.du.registerDefaultInstance(fe.class, feVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, fe.class);
    }

    private fe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrency() {
        this.bitField0_ &= -5;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowerPrice() {
        this.bitField0_ &= -2;
        this.lowerPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnits() {
        this.bitField0_ &= -9;
        this.units_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpperPrice() {
        this.bitField0_ &= -3;
        this.upperPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static fe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fc newBuilder() {
        return (fc) DEFAULT_INSTANCE.createBuilder();
    }

    public static fe parseDelimitedFrom(InputStream inputStream) {
        return (fe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fe parseFrom(com.google.v.v vVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.currency_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyBytes(com.google.v.v vVar) {
        this.currency_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowerPrice(double d2) {
        this.bitField0_ |= 1;
        this.lowerPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnits(fd fdVar) {
        this.units_ = fdVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpperPrice(double d2) {
        this.bitField0_ |= 2;
        this.upperPrice_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "lowerPrice_", "upperPrice_", "currency_", "units_", dq.f11273e});
        }
        if (iOrdinal == 3) {
            return new fe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCurrency() {
        return this.currency_;
    }

    public com.google.v.v getCurrencyBytes() {
        return com.google.v.v.s(this.currency_);
    }

    public double getLowerPrice() {
        return this.lowerPrice_;
    }

    public fd getUnits() {
        fd fdVarA = fd.a(this.units_);
        return fdVarA == null ? fd.ANY_UNITS : fdVarA;
    }

    public double getUpperPrice() {
        return this.upperPrice_;
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLowerPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUnits() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUpperPrice() {
        return (this.bitField0_ & 2) != 0;
    }

    public static fc newBuilder(fe feVar) {
        return (fc) DEFAULT_INSTANCE.createBuilder(feVar);
    }

    public static fe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fe parseFrom(com.google.v.z zVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fe parseFrom(InputStream inputStream) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fe parseFrom(ByteBuffer byteBuffer) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fe parseFrom(byte[] bArr) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
