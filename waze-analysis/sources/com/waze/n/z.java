package com.waze.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l.a.brd;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z extends du<z, y> implements aa {
    private static final z DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile fo<z> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private b metadata_;
    private brf payload_;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
        this.bitField0_ &= -2;
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.metadata_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.metadata_ = bVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayload(brf brfVar) {
        Objects.requireNonNull(brfVar);
        brf brfVar2 = this.payload_;
        if (brfVar2 != null && brfVar2 != brf.getDefaultInstance()) {
            brd brdVarNewBuilder = brf.newBuilder(brfVar2);
            brdVarNewBuilder.mergeFrom((brd) brfVar);
            brfVar = brdVarNewBuilder.buildPartial();
        }
        this.payload_ = brfVar;
        this.bitField0_ |= 1;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(b bVar) {
        Objects.requireNonNull(bVar);
        this.metadata_ = bVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(brf brfVar) {
        Objects.requireNonNull(brfVar);
        this.payload_ = brfVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "payload_", "metadata_"});
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
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getMetadata() {
        b bVar = this.metadata_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public brf getPayload() {
        brf brfVar = this.payload_;
        return brfVar == null ? brf.getDefaultInstance() : brfVar;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPayload() {
        return (this.bitField0_ & 1) != 0;
    }

    public static y newBuilder(z zVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
