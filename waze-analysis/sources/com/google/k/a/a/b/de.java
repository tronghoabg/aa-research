package com.google.k.a.a.b;

import com.google.k.a.a.mu;
import com.google.k.a.a.mv;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class de extends com.google.v.du<de, dd> implements com.google.v.fj {
    public static final int CURVATURE_FIELD_NUMBER = 2;
    private static final de DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<de> PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.k.a.a.bp curvature_;
    private mv track_;

    static {
        de deVar = new de();
        DEFAULT_INSTANCE = deVar;
        com.google.v.du.registerDefaultInstance(de.class, deVar);
    }

    private de() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurvature() {
        this.curvature_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
        this.bitField0_ &= -2;
    }

    public static de getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurvature(com.google.k.a.a.bp bpVar) {
        Objects.requireNonNull(bpVar);
        com.google.k.a.a.bp bpVar2 = this.curvature_;
        if (bpVar2 != null && bpVar2 != com.google.k.a.a.bp.getDefaultInstance()) {
            com.google.k.a.a.bo boVarNewBuilder = com.google.k.a.a.bp.newBuilder(bpVar2);
            boVarNewBuilder.mergeFrom((com.google.k.a.a.bo) bpVar);
            bpVar = boVarNewBuilder.buildPartial();
        }
        this.curvature_ = bpVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(mv mvVar) {
        Objects.requireNonNull(mvVar);
        mv mvVar2 = this.track_;
        if (mvVar2 != null && mvVar2 != mv.getDefaultInstance()) {
            mu muVarNewBuilder = mv.newBuilder(mvVar2);
            muVarNewBuilder.mergeFrom((mu) mvVar);
            mvVar = muVarNewBuilder.buildPartial();
        }
        this.track_ = mvVar;
        this.bitField0_ |= 1;
    }

    public static dd newBuilder() {
        return (dd) DEFAULT_INSTANCE.createBuilder();
    }

    public static de parseDelimitedFrom(InputStream inputStream) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(com.google.v.v vVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<de> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurvature(com.google.k.a.a.bp bpVar) {
        Objects.requireNonNull(bpVar);
        this.curvature_ = bpVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(mv mvVar) {
        Objects.requireNonNull(mvVar);
        this.track_ = mvVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "track_", "curvature_"});
        }
        if (iOrdinal == 3) {
            return new de();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<de> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (de.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.a.a.bp getCurvature() {
        com.google.k.a.a.bp bpVar = this.curvature_;
        return bpVar == null ? com.google.k.a.a.bp.getDefaultInstance() : bpVar;
    }

    public mv getTrack() {
        mv mvVar = this.track_;
        return mvVar == null ? mv.getDefaultInstance() : mvVar;
    }

    public boolean hasCurvature() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrack() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dd newBuilder(de deVar) {
        return (dd) DEFAULT_INSTANCE.createBuilder(deVar);
    }

    public static de parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static de parseFrom(com.google.v.z zVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static de parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static de parseFrom(InputStream inputStream) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static de parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static de parseFrom(ByteBuffer byteBuffer) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static de parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static de parseFrom(byte[] bArr) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static de parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (de) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
