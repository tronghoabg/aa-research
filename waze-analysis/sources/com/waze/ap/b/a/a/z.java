package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z extends com.google.v.du<z, y> implements fj {
    public static final int ALERTER_DISABLED_FIELD_NUMBER = 1;
    private static final z DEFAULT_INSTANCE;
    private static volatile fo<z> PARSER = null;
    public static final int PIN_DISABLED_FIELD_NUMBER = 2;
    private boolean alerterDisabled_;
    private int bitField0_;
    private boolean pinDisabled_;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.v.du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterDisabled() {
        this.bitField0_ &= -2;
        this.alerterDisabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinDisabled() {
        this.bitField0_ &= -3;
        this.pinDisabled_ = false;
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterDisabled(boolean z) {
        this.bitField0_ |= 1;
        this.alerterDisabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinDisabled(boolean z) {
        this.bitField0_ |= 2;
        this.pinDisabled_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "alerterDisabled_", "pinDisabled_"});
        }
        if (iOrdinal == 3) {
            return new z();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new y(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<z> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (z.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAlerterDisabled() {
        return this.alerterDisabled_;
    }

    public boolean getPinDisabled() {
        return this.pinDisabled_;
    }

    public boolean hasAlerterDisabled() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPinDisabled() {
        return (this.bitField0_ & 2) != 0;
    }

    public static y newBuilder(z zVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (z) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
