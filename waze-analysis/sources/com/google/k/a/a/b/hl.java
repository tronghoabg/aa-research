package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hl extends com.google.v.du<hl, hj> implements hm {
    private static final hl DEFAULT_INSTANCE;
    public static final int ENCLOSURE_TYPE_FIELD_NUMBER = 1;
    public static final int END_FRACTION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<hl> PARSER = null;
    public static final int START_FRACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private int enclosureType_;
    private double endFraction_ = 1.0d;
    private double startFraction_;

    static {
        hl hlVar = new hl();
        DEFAULT_INSTANCE = hlVar;
        com.google.v.du.registerDefaultInstance(hl.class, hlVar);
    }

    private hl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnclosureType() {
        this.bitField0_ &= -2;
        this.enclosureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndFraction() {
        this.bitField0_ &= -5;
        this.endFraction_ = 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartFraction() {
        this.bitField0_ &= -3;
        this.startFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static hl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hj newBuilder() {
        return (hj) DEFAULT_INSTANCE.createBuilder();
    }

    public static hl parseDelimitedFrom(InputStream inputStream) {
        return (hl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hl parseFrom(com.google.v.v vVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnclosureType(hk hkVar) {
        this.enclosureType_ = hkVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndFraction(double d2) {
        this.bitField0_ |= 4;
        this.endFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartFraction(double d2) {
        this.bitField0_ |= 2;
        this.startFraction_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"bitField0_", "enclosureType_", dq.t, "startFraction_", "endFraction_"});
        }
        if (iOrdinal == 3) {
            return new hl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hk getEnclosureType() {
        hk hkVarA = hk.a(this.enclosureType_);
        return hkVarA == null ? hk.ENCLOSURE_TYPE_UNSPECIFIED : hkVarA;
    }

    public double getEndFraction() {
        return this.endFraction_;
    }

    public double getStartFraction() {
        return this.startFraction_;
    }

    public boolean hasEnclosureType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasEndFraction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStartFraction() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hj newBuilder(hl hlVar) {
        return (hj) DEFAULT_INSTANCE.createBuilder(hlVar);
    }

    public static hl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hl parseFrom(com.google.v.z zVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hl parseFrom(InputStream inputStream) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hl parseFrom(ByteBuffer byteBuffer) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hl parseFrom(byte[] bArr) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
