package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import com.waze.strings.DisplayStrings;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class au extends com.google.v.du<au, as> implements com.google.v.fj {
    private static final au DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 15303159;
    private static volatile com.google.v.fo<au> PARSER = null;
    public static final int PRECISION_FIELD_NUMBER = 2;
    public static final int SECONDS_FIELD_NUMBER = 1;
    public static final com.google.v.ds<com.google.w.n.a.b, au> messageSetExtension;
    private int bitField0_;
    private int precision_ = DisplayStrings.DS_STREETSROAD_WITHOUT_A_NAME;
    private double seconds_;

    static {
        au auVar = new au();
        DEFAULT_INSTANCE = auVar;
        com.google.v.du.registerDefaultInstance(au.class, auVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, au.class);
    }

    private au() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecision() {
        this.bitField0_ &= -3;
        this.precision_ = DisplayStrings.DS_STREETSROAD_WITHOUT_A_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.bitField0_ &= -2;
        this.seconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static au getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static as newBuilder() {
        return (as) DEFAULT_INSTANCE.createBuilder();
    }

    public static au parseDelimitedFrom(InputStream inputStream) {
        return (au) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static au parseFrom(com.google.v.v vVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<au> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecision(at atVar) {
        this.precision_ = atVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(double d2) {
        this.bitField0_ |= 1;
        this.seconds_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "seconds_", "precision_", c.f11205i});
        }
        if (iOrdinal == 3) {
            return new au();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new as(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<au> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (au.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public at getPrecision() {
        at atVarA = at.a(this.precision_);
        return atVarA == null ? at.PRECISION_SECOND : atVarA;
    }

    public double getSeconds() {
        return this.seconds_;
    }

    public boolean hasPrecision() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static as newBuilder(au auVar) {
        return (as) DEFAULT_INSTANCE.createBuilder(auVar);
    }

    public static au parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (au) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static au parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static au parseFrom(com.google.v.z zVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static au parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static au parseFrom(InputStream inputStream) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static au parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static au parseFrom(ByteBuffer byteBuffer) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static au parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static au parseFrom(byte[] bArr) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static au parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (au) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
