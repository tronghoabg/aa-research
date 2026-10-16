package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc extends du<bc, bb> implements fj {
    private static final bc DEFAULT_INSTANCE;
    public static final int IS_SUCCESSFUL_FIELD_NUMBER = 1;
    private static volatile fo<bc> PARSER;
    private int bitField0_;
    private boolean isSuccessful_;

    static {
        bc bcVar = new bc();
        DEFAULT_INSTANCE = bcVar;
        du.registerDefaultInstance(bc.class, bcVar);
    }

    private bc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSuccessful() {
        this.bitField0_ &= -2;
        this.isSuccessful_ = false;
    }

    public static bc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bb newBuilder() {
        return (bb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bc parseDelimitedFrom(InputStream inputStream) {
        return (bc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bc parseFrom(com.google.v.v vVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSuccessful(boolean z) {
        this.bitField0_ |= 1;
        this.isSuccessful_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isSuccessful_"});
        }
        if (iOrdinal == 3) {
            return new bc();
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
        fo<bc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsSuccessful() {
        return this.isSuccessful_;
    }

    public boolean hasIsSuccessful() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bb newBuilder(bc bcVar) {
        return (bb) DEFAULT_INSTANCE.createBuilder(bcVar);
    }

    public static bc parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bc parseFrom(com.google.v.v vVar, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bc parseFrom(com.google.v.z zVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bc parseFrom(com.google.v.z zVar, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bc parseFrom(InputStream inputStream) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bc parseFrom(InputStream inputStream, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bc parseFrom(ByteBuffer byteBuffer) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bc parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bc parseFrom(byte[] bArr) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bc parseFrom(byte[] bArr, de deVar) {
        return (bc) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
