package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dp extends com.google.v.du<dp, Cdo> implements com.google.v.fj {
    public static final int DATASET_FIELD_NUMBER = 2;
    private static final dp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dp> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    private int bitField0_;
    private String dataset_ = "";
    private int provider_;

    static {
        dp dpVar = new dp();
        DEFAULT_INSTANCE = dpVar;
        com.google.v.du.registerDefaultInstance(dp.class, dpVar);
    }

    private dp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataset() {
        this.bitField0_ &= -3;
        this.dataset_ = getDefaultInstance().getDataset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -2;
        this.provider_ = 0;
    }

    public static dp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Cdo newBuilder() {
        return (Cdo) DEFAULT_INSTANCE.createBuilder();
    }

    public static dp parseDelimitedFrom(InputStream inputStream) {
        return (dp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dp parseFrom(com.google.v.v vVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataset(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.dataset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatasetBytes(com.google.v.v vVar) {
        this.dataset_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(com.google.k.a.a.b.ar arVar) {
        this.provider_ = arVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "provider_", com.google.k.a.a.b.ar.b(), "dataset_"});
        }
        if (iOrdinal == 3) {
            return new dp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new Cdo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDataset() {
        return this.dataset_;
    }

    public com.google.v.v getDatasetBytes() {
        return com.google.v.v.s(this.dataset_);
    }

    public com.google.k.a.a.b.ar getProvider() {
        com.google.k.a.a.b.ar arVarA = com.google.k.a.a.b.ar.a(this.provider_);
        return arVarA == null ? com.google.k.a.a.b.ar.PROVIDER_ANY : arVarA;
    }

    public boolean hasDataset() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Cdo newBuilder(dp dpVar) {
        return (Cdo) DEFAULT_INSTANCE.createBuilder(dpVar);
    }

    public static dp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dp parseFrom(com.google.v.z zVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dp parseFrom(InputStream inputStream) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dp parseFrom(ByteBuffer byteBuffer) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dp parseFrom(byte[] bArr) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
