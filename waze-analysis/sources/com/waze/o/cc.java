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
public final class cc extends du<cc, cb> implements fj {
    private static final cc DEFAULT_INSTANCE;
    public static final int IS_SUCCEEDED_FIELD_NUMBER = 1;
    private static volatile fo<cc> PARSER;
    private int bitField0_;
    private boolean isSucceeded_;

    static {
        cc ccVar = new cc();
        DEFAULT_INSTANCE = ccVar;
        du.registerDefaultInstance(cc.class, ccVar);
    }

    private cc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSucceeded() {
        this.bitField0_ &= -2;
        this.isSucceeded_ = false;
    }

    public static cc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cb newBuilder() {
        return (cb) DEFAULT_INSTANCE.createBuilder();
    }

    public static cc parseDelimitedFrom(InputStream inputStream) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(com.google.v.v vVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSucceeded(boolean z) {
        this.bitField0_ |= 1;
        this.isSucceeded_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isSucceeded_"});
        }
        if (iOrdinal == 3) {
            return new cc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsSucceeded() {
        return this.isSucceeded_;
    }

    public boolean hasIsSucceeded() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cb newBuilder(cc ccVar) {
        return (cb) DEFAULT_INSTANCE.createBuilder(ccVar);
    }

    public static cc parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(com.google.v.v vVar, de deVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cc parseFrom(com.google.v.z zVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cc parseFrom(com.google.v.z zVar, de deVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cc parseFrom(InputStream inputStream) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(InputStream inputStream, de deVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(ByteBuffer byteBuffer) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cc parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cc parseFrom(byte[] bArr) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cc parseFrom(byte[] bArr, de deVar) {
        return (cc) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
