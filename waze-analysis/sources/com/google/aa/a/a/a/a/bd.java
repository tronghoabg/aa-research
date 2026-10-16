package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bd extends du<bd, bb> implements fj {
    private static final bd DEFAULT_INSTANCE;
    private static volatile fo<bd> PARSER = null;
    public static final int USAGE_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int usageType_;

    static {
        bd bdVar = new bd();
        DEFAULT_INSTANCE = bdVar;
        du.registerDefaultInstance(bd.class, bdVar);
    }

    private bd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsageType() {
        this.bitField0_ &= -2;
        this.usageType_ = 0;
    }

    public static bd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bb newBuilder() {
        return (bb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bd parseDelimitedFrom(InputStream inputStream) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(com.google.v.v vVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsageType(bc bcVar) {
        this.usageType_ = bcVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "usageType_", i.m});
        }
        if (iOrdinal == 3) {
            return new bd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bc getUsageType() {
        bc bcVarA = bc.a(this.usageType_);
        return bcVarA == null ? bc.USAGE_UNKNOWN : bcVarA;
    }

    public boolean hasUsageType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bb newBuilder(bd bdVar) {
        return (bb) DEFAULT_INSTANCE.createBuilder(bdVar);
    }

    public static bd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bd parseFrom(com.google.v.z zVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bd parseFrom(InputStream inputStream) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bd parseFrom(ByteBuffer byteBuffer) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bd parseFrom(byte[] bArr) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bd) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
