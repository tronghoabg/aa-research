package com.google.android.c.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends du<f, a> implements fj {
    public static final int ARCHITECTURE_FIELD_NUMBER = 2;
    public static final int BUILD_TYPE_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    private static volatile fo<f> PARSER = null;
    public static final int SCREEN_DENSITY_FIELD_NUMBER = 3;
    private int architecture_;
    private int bitField0_;
    private int buildType_;
    private int screenDensity_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArchitecture() {
        this.bitField0_ &= -3;
        this.architecture_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildType() {
        this.bitField0_ &= -2;
        this.buildType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenDensity() {
        this.bitField0_ &= -5;
        this.screenDensity_ = 0;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchitecture(b bVar) {
        this.architecture_ = bVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildType(d dVar) {
        this.buildType_ = dVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenDensity(e eVar) {
        this.screenDensity_ = eVar.getNumber();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "buildType_", c.f3860a, "architecture_", c.f3861b, "screenDensity_", c.f3862c});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getArchitecture() {
        b bVarA = b.a(this.architecture_);
        return bVarA == null ? b.ARCH_UNKNOWN : bVarA;
    }

    public d getBuildType() {
        d dVarA = d.a(this.buildType_);
        return dVarA == null ? d.BUILD_TYPE_UNKNOWN : dVarA;
    }

    public e getScreenDensity() {
        e eVarA = e.a(this.screenDensity_);
        return eVarA == null ? e.DENSITY_UNKNOWN : eVarA;
    }

    public boolean hasArchitecture() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBuildType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasScreenDensity() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(f fVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
