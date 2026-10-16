package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class cq extends du<cq, cp> implements fj {
    private static final cq DEFAULT_INSTANCE;
    private static volatile fo<cq> PARSER = null;
    public static final int SALT_SIZE_FIELD_NUMBER = 1;
    private int saltSize_;

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        du.registerDefaultInstance(cq.class, cqVar);
    }

    private cq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaltSize() {
        this.saltSize_ = 0;
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
        return (cq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaltSize(int i2) {
        this.saltSize_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
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
        fo<cq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getSaltSize() {
        return this.saltSize_;
    }

    public static cp newBuilder(cq cqVar) {
        return (cp) DEFAULT_INSTANCE.createBuilder(cqVar);
    }

    public static cq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(com.google.v.v vVar, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cq parseFrom(com.google.v.z zVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cq parseFrom(com.google.v.z zVar, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cq parseFrom(InputStream inputStream) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(InputStream inputStream, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(ByteBuffer byteBuffer) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cq parseFrom(byte[] bArr) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cq parseFrom(byte[] bArr, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
