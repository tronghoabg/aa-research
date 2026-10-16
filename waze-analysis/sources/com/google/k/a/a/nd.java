package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nd extends com.google.v.du<nd, mx> implements ne {
    private static final nd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<nd> PARSER = null;
    public static final int SLOW_DOWN_FIELD_NUMBER = 2;
    public static final int STOP_FIELD_NUMBER = 1;
    private int speedAdjustmentCase_ = 0;
    private Object speedAdjustment_;

    static {
        nd ndVar = new nd();
        DEFAULT_INSTANCE = ndVar;
        com.google.v.du.registerDefaultInstance(nd.class, ndVar);
    }

    private nd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlowDown() {
        if (this.speedAdjustmentCase_ == 2) {
            this.speedAdjustmentCase_ = 0;
            this.speedAdjustment_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedAdjustment() {
        this.speedAdjustmentCase_ = 0;
        this.speedAdjustment_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStop() {
        if (this.speedAdjustmentCase_ == 1) {
            this.speedAdjustmentCase_ = 0;
            this.speedAdjustment_ = null;
        }
    }

    public static nd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSlowDown(mz mzVar) {
        Objects.requireNonNull(mzVar);
        if (this.speedAdjustmentCase_ == 2 && this.speedAdjustment_ != mz.getDefaultInstance()) {
            my myVarNewBuilder = mz.newBuilder((mz) this.speedAdjustment_);
            myVarNewBuilder.mergeFrom((my) mzVar);
            mzVar = myVarNewBuilder.buildPartial();
        }
        this.speedAdjustment_ = mzVar;
        this.speedAdjustmentCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStop(nc ncVar) {
        Objects.requireNonNull(ncVar);
        if (this.speedAdjustmentCase_ == 1 && this.speedAdjustment_ != nc.getDefaultInstance()) {
            nb nbVarNewBuilder = nc.newBuilder((nc) this.speedAdjustment_);
            nbVarNewBuilder.mergeFrom((nb) ncVar);
            ncVar = nbVarNewBuilder.buildPartial();
        }
        this.speedAdjustment_ = ncVar;
        this.speedAdjustmentCase_ = 1;
    }

    public static mx newBuilder() {
        return (mx) DEFAULT_INSTANCE.createBuilder();
    }

    public static nd parseDelimitedFrom(InputStream inputStream) {
        return (nd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nd parseFrom(com.google.v.v vVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowDown(mz mzVar) {
        Objects.requireNonNull(mzVar);
        this.speedAdjustment_ = mzVar;
        this.speedAdjustmentCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStop(nc ncVar) {
        Objects.requireNonNull(ncVar);
        this.speedAdjustment_ = ncVar;
        this.speedAdjustmentCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"speedAdjustment_", "speedAdjustmentCase_", nc.class, mz.class});
        }
        if (iOrdinal == 3) {
            return new nd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new mx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public mz getSlowDown() {
        return this.speedAdjustmentCase_ == 2 ? (mz) this.speedAdjustment_ : mz.getDefaultInstance();
    }

    public na getSpeedAdjustmentCase() {
        int i2 = this.speedAdjustmentCase_;
        if (i2 == 0) {
            return na.f12125c;
        }
        if (i2 == 1) {
            return na.f12123a;
        }
        if (i2 != 2) {
            return null;
        }
        return na.f12124b;
    }

    public nc getStop() {
        return this.speedAdjustmentCase_ == 1 ? (nc) this.speedAdjustment_ : nc.getDefaultInstance();
    }

    public boolean hasSlowDown() {
        return this.speedAdjustmentCase_ == 2;
    }

    public boolean hasStop() {
        return this.speedAdjustmentCase_ == 1;
    }

    public static mx newBuilder(nd ndVar) {
        return (mx) DEFAULT_INSTANCE.createBuilder(ndVar);
    }

    public static nd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nd parseFrom(com.google.v.z zVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nd parseFrom(InputStream inputStream) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nd parseFrom(ByteBuffer byteBuffer) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nd parseFrom(byte[] bArr) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
