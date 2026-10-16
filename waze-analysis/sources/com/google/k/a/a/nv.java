package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nv extends com.google.v.du<nv, nu> implements com.google.v.fj {
    private static final nv DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 24882046;
    private static volatile com.google.v.fo<nv> PARSER = null;
    public static final int SOURCE_TRUST_FIELD_NUMBER = 1;
    public static final com.google.v.ds<com.google.w.n.a.b, nv> messageSetExtension;
    private int bitField0_;
    private nt sourceTrust_;

    static {
        nv nvVar = new nv();
        DEFAULT_INSTANCE = nvVar;
        com.google.v.du.registerDefaultInstance(nv.class, nvVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, nv.class);
    }

    private nv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceTrust() {
        this.sourceTrust_ = null;
        this.bitField0_ &= -2;
    }

    public static nv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceTrust(nt ntVar) {
        Objects.requireNonNull(ntVar);
        nt ntVar2 = this.sourceTrust_;
        if (ntVar2 != null && ntVar2 != nt.getDefaultInstance()) {
            nr nrVarNewBuilder = nt.newBuilder(ntVar2);
            nrVarNewBuilder.mergeFrom((nr) ntVar);
            ntVar = nrVarNewBuilder.buildPartial();
        }
        this.sourceTrust_ = ntVar;
        this.bitField0_ |= 1;
    }

    public static nu newBuilder() {
        return (nu) DEFAULT_INSTANCE.createBuilder();
    }

    public static nv parseDelimitedFrom(InputStream inputStream) {
        return (nv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nv parseFrom(com.google.v.v vVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceTrust(nt ntVar) {
        Objects.requireNonNull(ntVar);
        this.sourceTrust_ = ntVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "sourceTrust_"});
        }
        if (iOrdinal == 3) {
            return new nv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public nt getSourceTrust() {
        nt ntVar = this.sourceTrust_;
        return ntVar == null ? nt.getDefaultInstance() : ntVar;
    }

    public boolean hasSourceTrust() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nu newBuilder(nv nvVar) {
        return (nu) DEFAULT_INSTANCE.createBuilder(nvVar);
    }

    public static nv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nv parseFrom(com.google.v.z zVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nv parseFrom(InputStream inputStream) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nv parseFrom(ByteBuffer byteBuffer) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nv parseFrom(byte[] bArr) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
