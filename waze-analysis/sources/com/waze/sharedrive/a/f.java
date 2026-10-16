package com.waze.sharedrive.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends du<f, e> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int DRIVER_FIELD_NUMBER = 2;
    private static volatile fo<f> PARSER = null;
    public static final int SHARED_DRIVE_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.waze.sharedrive.f.a.c driver_;
    private com.waze.sharedrive.f.a.ai sharedDrive_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriver() {
        this.driver_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedDrive() {
        this.sharedDrive_ = null;
        this.bitField0_ &= -2;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriver(com.waze.sharedrive.f.a.c cVar) {
        Objects.requireNonNull(cVar);
        com.waze.sharedrive.f.a.c cVar2 = this.driver_;
        if (cVar2 != null && cVar2 != com.waze.sharedrive.f.a.c.getDefaultInstance()) {
            com.waze.sharedrive.f.a.b bVarNewBuilder = com.waze.sharedrive.f.a.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.waze.sharedrive.f.a.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.driver_ = cVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSharedDrive(com.waze.sharedrive.f.a.ai aiVar) {
        Objects.requireNonNull(aiVar);
        com.waze.sharedrive.f.a.ai aiVar2 = this.sharedDrive_;
        if (aiVar2 != null && aiVar2 != com.waze.sharedrive.f.a.ai.getDefaultInstance()) {
            com.waze.sharedrive.f.a.j jVarNewBuilder = com.waze.sharedrive.f.a.ai.newBuilder(aiVar2);
            jVarNewBuilder.mergeFrom((com.waze.sharedrive.f.a.j) aiVar);
            aiVar = jVarNewBuilder.buildPartial();
        }
        this.sharedDrive_ = aiVar;
        this.bitField0_ |= 1;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriver(com.waze.sharedrive.f.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.driver_ = cVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedDrive(com.waze.sharedrive.f.a.ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.sharedDrive_ = aiVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sharedDrive_", "driver_"});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
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

    public com.waze.sharedrive.f.a.c getDriver() {
        com.waze.sharedrive.f.a.c cVar = this.driver_;
        return cVar == null ? com.waze.sharedrive.f.a.c.getDefaultInstance() : cVar;
    }

    public com.waze.sharedrive.f.a.ai getSharedDrive() {
        com.waze.sharedrive.f.a.ai aiVar = this.sharedDrive_;
        return aiVar == null ? com.waze.sharedrive.f.a.ai.getDefaultInstance() : aiVar;
    }

    public boolean hasDriver() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSharedDrive() {
        return (this.bitField0_ & 1) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(com.google.v.z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(com.google.v.z zVar, de deVar) {
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
