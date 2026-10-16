package com.waze.n;

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
public final class ai extends du<ai, ah> implements fj {
    private static final ai DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile fo<ai> PARSER = null;
    public static final int STAT_FIELD_NUMBER = 1;
    private int bitField0_;
    private d metadata_;
    private l.b.c stat_;

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.stat_ = null;
        this.bitField0_ &= -2;
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(d dVar) {
        Objects.requireNonNull(dVar);
        d dVar2 = this.metadata_;
        if (dVar2 != null && dVar2 != d.getDefaultInstance()) {
            c cVarNewBuilder = d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.metadata_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStat(l.b.c cVar) {
        Objects.requireNonNull(cVar);
        l.b.c cVar2 = this.stat_;
        if (cVar2 != null && cVar2 != l.b.c.getDefaultInstance()) {
            l.b.a aVarNewBuilder = l.b.c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((l.b.a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.stat_ = cVar;
        this.bitField0_ |= 1;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(d dVar) {
        Objects.requireNonNull(dVar);
        this.metadata_ = dVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStat(l.b.c cVar) {
        Objects.requireNonNull(cVar);
        this.stat_ = cVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "stat_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public d getMetadata() {
        d dVar = this.metadata_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public l.b.c getStat() {
        l.b.c cVar = this.stat_;
        return cVar == null ? l.b.c.getDefaultInstance() : cVar;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStat() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
