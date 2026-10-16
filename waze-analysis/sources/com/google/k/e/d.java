package com.google.k.e;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends du<d, c> implements e {
    private static final d DEFAULT_INSTANCE;
    public static final int GCONCEPT_FIELD_NUMBER = 1;
    public static final int IS_REQUIRED_FIELD_NUMBER = 2;
    private static volatile fo<d> PARSER;
    private int bitField0_;
    private com.google.k.e.a.d gconcept_;
    private boolean isRequired_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGconcept() {
        this.gconcept_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRequired() {
        this.bitField0_ &= -3;
        this.isRequired_ = false;
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGconcept(com.google.k.e.a.d dVar) {
        Objects.requireNonNull(dVar);
        com.google.k.e.a.d dVar2 = this.gconcept_;
        if (dVar2 != null && dVar2 != com.google.k.e.a.d.getDefaultInstance()) {
            com.google.k.e.a.a aVarNewBuilder = com.google.k.e.a.d.newBuilder(dVar2);
            aVarNewBuilder.mergeFrom((com.google.k.e.a.a) dVar);
            dVar = aVarNewBuilder.buildPartial();
        }
        this.gconcept_ = dVar;
        this.bitField0_ |= 1;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGconcept(com.google.k.e.a.d dVar) {
        Objects.requireNonNull(dVar);
        this.gconcept_ = dVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRequired(boolean z) {
        this.bitField0_ |= 2;
        this.isRequired_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "gconcept_", "isRequired_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.e.a.d getGconcept() {
        com.google.k.e.a.d dVar = this.gconcept_;
        return dVar == null ? com.google.k.e.a.d.getDefaultInstance() : dVar;
    }

    public boolean getIsRequired() {
        return this.isRequired_;
    }

    public boolean hasGconcept() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsRequired() {
        return (this.bitField0_ & 2) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
