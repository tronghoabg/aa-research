package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cq extends com.google.v.du<cq, cp> implements com.google.v.fj {
    public static final int DATASET_FIELD_NUMBER = 2;
    private static final cq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cq> PARSER = null;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int provider_ = 4369;
    private String dataset_ = "";

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        com.google.v.du.registerDefaultInstance(cq.class, cqVar);
    }

    private cq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataset() {
        this.bitField0_ &= -3;
        this.dataset_ = getDefaultInstance().getDataset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -2;
        this.provider_ = 4369;
    }

    public static cq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cp newBuilder() {
        return (cp) DEFAULT_INSTANCE.createBuilder();
    }

    public static cq parseDelimitedFrom(InputStream inputStream) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(com.google.v.v vVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cq> parser() {
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
    public void setProvider(ar arVar) {
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
            ar arVar = ar.PROVIDER_ANY;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "provider_", c.f11204h, "dataset_"});
        }
        if (iOrdinal == 3) {
            return new cq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cq.class) {
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

    public ar getProvider() {
        ar arVarA = ar.a(this.provider_);
        return arVarA == null ? ar.PROVIDER_UNKNOWN : arVarA;
    }

    public boolean hasDataset() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cp newBuilder(cq cqVar) {
        return (cp) DEFAULT_INSTANCE.createBuilder(cqVar);
    }

    public static cq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cq parseFrom(com.google.v.z zVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cq parseFrom(InputStream inputStream) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(ByteBuffer byteBuffer) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cq parseFrom(byte[] bArr) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
