package com.google.e.a.h;

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
/* loaded from: classes4.dex */
public final class co extends du<co, cn> implements fj {
    private static final co DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile fo<co> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private cq params_;
    private int version_;

    static {
        co coVar = new co();
        DEFAULT_INSTANCE = coVar;
        du.registerDefaultInstance(co.class, coVar);
    }

    private co() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static co getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(cq cqVar) {
        Objects.requireNonNull(cqVar);
        cq cqVar2 = this.params_;
        if (cqVar2 != null && cqVar2 != cq.getDefaultInstance()) {
            cp cpVarNewBuilder = cq.newBuilder(cqVar2);
            cpVarNewBuilder.mergeFrom((cp) cqVar);
            cqVar = cpVarNewBuilder.buildPartial();
        }
        this.params_ = cqVar;
        this.bitField0_ |= 1;
    }

    public static cn newBuilder() {
        return (cn) DEFAULT_INSTANCE.createBuilder();
    }

    public static co parseDelimitedFrom(InputStream inputStream) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(com.google.v.v vVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<co> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(cq cqVar) {
        Objects.requireNonNull(cqVar);
        this.params_ = cqVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i2) {
        this.version_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iOrdinal == 3) {
            return new co();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<co> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (co.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cq getParams() {
        cq cqVar = this.params_;
        return cqVar == null ? cq.getDefaultInstance() : cqVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cn newBuilder(co coVar) {
        return (cn) DEFAULT_INSTANCE.createBuilder(coVar);
    }

    public static co parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(com.google.v.v vVar, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static co parseFrom(com.google.v.z zVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static co parseFrom(com.google.v.z zVar, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static co parseFrom(InputStream inputStream) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(InputStream inputStream, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(ByteBuffer byteBuffer) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static co parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static co parseFrom(byte[] bArr) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static co parseFrom(byte[] bArr, de deVar) {
        return (co) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
