package com.waze.copilot;

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
/* loaded from: classes5.dex */
public final class f extends du<f, e> implements fj {
    private static final f DEFAULT_INSTANCE;
    public static final int HAS_NORMAL_TEXTURE_FIELD_NUMBER = 1;
    public static final int HAS_SHARE_TEXTURE_FIELD_NUMBER = 3;
    public static final int HAS_TAXI_TEXTURE_FIELD_NUMBER = 2;
    public static final int LIGHTING_FIELD_NUMBER = 5;
    private static volatile fo<f> PARSER = null;
    public static final int SCALE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean hasNormalTexture_;
    private boolean hasShareTexture_;
    private boolean hasTaxiTexture_;
    private h lighting_;
    private float scale_ = 1.0f;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasNormalTexture() {
        this.bitField0_ &= -2;
        this.hasNormalTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasShareTexture() {
        this.bitField0_ &= -5;
        this.hasShareTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasTaxiTexture() {
        this.bitField0_ &= -3;
        this.hasTaxiTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLighting() {
        this.lighting_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.bitField0_ &= -9;
        this.scale_ = 1.0f;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLighting(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.lighting_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder(hVar2);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.lighting_ = hVar;
        this.bitField0_ |= 16;
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
    public void setHasNormalTexture(boolean z) {
        this.bitField0_ |= 1;
        this.hasNormalTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasShareTexture(boolean z) {
        this.bitField0_ |= 4;
        this.hasShareTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasTaxiTexture(boolean z) {
        this.bitField0_ |= 2;
        this.hasTaxiTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLighting(h hVar) {
        Objects.requireNonNull(hVar);
        this.lighting_ = hVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f2) {
        this.bitField0_ |= 8;
        this.scale_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "hasNormalTexture_", "hasTaxiTexture_", "hasShareTexture_", "scale_", "lighting_"});
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

    public boolean getHasNormalTexture() {
        return this.hasNormalTexture_;
    }

    public boolean getHasShareTexture() {
        return this.hasShareTexture_;
    }

    public boolean getHasTaxiTexture() {
        return this.hasTaxiTexture_;
    }

    public h getLighting() {
        h hVar = this.lighting_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public float getScale() {
        return this.scale_;
    }

    public boolean hasHasNormalTexture() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHasShareTexture() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasHasTaxiTexture() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLighting() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasScale() {
        return (this.bitField0_ & 8) != 0;
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
