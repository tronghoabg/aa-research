package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gz extends com.google.v.du<gz, gx> implements ha {
    public static final int ACCIDENT_BEGIN_FRACTION_FIELD_NUMBER = 1;
    public static final int ACCIDENT_END_FRACTION_FIELD_NUMBER = 2;
    private static final gz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gz> PARSER = null;
    public static final int SOURCE_AUTHORITY_FIELD_NUMBER = 3;
    private float accidentBeginFraction_;
    private float accidentEndFraction_;
    private int bitField0_;
    private int sourceAuthority_;

    static {
        gz gzVar = new gz();
        DEFAULT_INSTANCE = gzVar;
        com.google.v.du.registerDefaultInstance(gz.class, gzVar);
    }

    private gz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccidentBeginFraction() {
        this.bitField0_ &= -2;
        this.accidentBeginFraction_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccidentEndFraction() {
        this.bitField0_ &= -3;
        this.accidentEndFraction_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceAuthority() {
        this.bitField0_ &= -5;
        this.sourceAuthority_ = 0;
    }

    public static gz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gx newBuilder() {
        return (gx) DEFAULT_INSTANCE.createBuilder();
    }

    public static gz parseDelimitedFrom(InputStream inputStream) {
        return (gz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gz parseFrom(com.google.v.v vVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccidentBeginFraction(float f2) {
        this.bitField0_ |= 1;
        this.accidentBeginFraction_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccidentEndFraction(float f2) {
        this.bitField0_ |= 2;
        this.accidentEndFraction_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceAuthority(gy gyVar) {
        this.sourceAuthority_ = gyVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "accidentBeginFraction_", "accidentEndFraction_", "sourceAuthority_", dq.q});
        }
        if (iOrdinal == 3) {
            return new gz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getAccidentBeginFraction() {
        return this.accidentBeginFraction_;
    }

    public float getAccidentEndFraction() {
        return this.accidentEndFraction_;
    }

    public gy getSourceAuthority() {
        gy gyVarA = gy.a(this.sourceAuthority_);
        return gyVarA == null ? gy.SOURCE_AUTHORITY_UNSPECIFIED : gyVarA;
    }

    public boolean hasAccidentBeginFraction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAccidentEndFraction() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSourceAuthority() {
        return (this.bitField0_ & 4) != 0;
    }

    public static gx newBuilder(gz gzVar) {
        return (gx) DEFAULT_INSTANCE.createBuilder(gzVar);
    }

    public static gz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gz parseFrom(com.google.v.z zVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gz parseFrom(InputStream inputStream) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gz parseFrom(ByteBuffer byteBuffer) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gz parseFrom(byte[] bArr) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
