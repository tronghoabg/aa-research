package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import i.b.l.qb;
import i.b.l.qc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ba extends du<ba, az> implements fj {
    private static final ba DEFAULT_INSTANCE;
    private static volatile fo<ba> PARSER = null;
    public static final int START_DRIVING_FIELD_NUMBER = 1;
    private int bitField0_;
    private qc startDriving_;

    static {
        ba baVar = new ba();
        DEFAULT_INSTANCE = baVar;
        du.registerDefaultInstance(ba.class, baVar);
    }

    private ba() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDriving() {
        this.startDriving_ = null;
        this.bitField0_ &= -2;
    }

    public static ba getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartDriving(qc qcVar) {
        Objects.requireNonNull(qcVar);
        qc qcVar2 = this.startDriving_;
        if (qcVar2 != null && qcVar2 != qc.getDefaultInstance()) {
            qb qbVarNewBuilder = qc.newBuilder(qcVar2);
            qbVarNewBuilder.mergeFrom((qb) qcVar);
            qcVar = qbVarNewBuilder.buildPartial();
        }
        this.startDriving_ = qcVar;
        this.bitField0_ |= 1;
    }

    public static az newBuilder() {
        return (az) DEFAULT_INSTANCE.createBuilder();
    }

    public static ba parseDelimitedFrom(InputStream inputStream) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(com.google.v.v vVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ba> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDriving(qc qcVar) {
        Objects.requireNonNull(qcVar);
        this.startDriving_ = qcVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "startDriving_"});
        }
        if (iOrdinal == 3) {
            return new ba();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new az(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ba> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ba.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public qc getStartDriving() {
        qc qcVar = this.startDriving_;
        return qcVar == null ? qc.getDefaultInstance() : qcVar;
    }

    public boolean hasStartDriving() {
        return (this.bitField0_ & 1) != 0;
    }

    public static az newBuilder(ba baVar) {
        return (az) DEFAULT_INSTANCE.createBuilder(baVar);
    }

    public static ba parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ba) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(com.google.v.v vVar, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ba parseFrom(com.google.v.z zVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ba parseFrom(com.google.v.z zVar, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ba parseFrom(InputStream inputStream) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ba parseFrom(InputStream inputStream, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ba parseFrom(ByteBuffer byteBuffer) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ba parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ba parseFrom(byte[] bArr) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ba parseFrom(byte[] bArr, de deVar) {
        return (ba) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
