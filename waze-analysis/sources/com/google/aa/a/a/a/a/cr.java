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
public final class cr extends du<cr, cq> implements fj {
    public static final int BUILD_NUMBER_FIELD_NUMBER = 2;
    private static final cr DEFAULT_INSTANCE;
    public static final int MAJOR_VERSION_FIELD_NUMBER = 1;
    private static volatile fo<cr> PARSER;
    private int bitField0_;
    private int buildNumber_;
    private int majorVersion_;

    static {
        cr crVar = new cr();
        DEFAULT_INSTANCE = crVar;
        du.registerDefaultInstance(cr.class, crVar);
    }

    private cr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildNumber() {
        this.bitField0_ &= -3;
        this.buildNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMajorVersion() {
        this.bitField0_ &= -2;
        this.majorVersion_ = 0;
    }

    public static cr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cq newBuilder() {
        return (cq) DEFAULT_INSTANCE.createBuilder();
    }

    public static cr parseDelimitedFrom(InputStream inputStream) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(com.google.v.v vVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildNumber(int i2) {
        this.bitField0_ |= 2;
        this.buildNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMajorVersion(int i2) {
        this.bitField0_ |= 1;
        this.majorVersion_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "majorVersion_", "buildNumber_"});
        }
        if (iOrdinal == 3) {
            return new cr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getBuildNumber() {
        return this.buildNumber_;
    }

    public int getMajorVersion() {
        return this.majorVersion_;
    }

    public boolean hasBuildNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMajorVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cq newBuilder(cr crVar) {
        return (cq) DEFAULT_INSTANCE.createBuilder(crVar);
    }

    public static cr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cr parseFrom(com.google.v.z zVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cr parseFrom(InputStream inputStream) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cr parseFrom(ByteBuffer byteBuffer) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cr parseFrom(byte[] bArr) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cr) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
