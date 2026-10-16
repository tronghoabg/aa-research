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
public final class cf extends du<cf, ce> implements fj {
    private static final cf DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fo<cf> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ch params_;
    private int version_;

    static {
        cf cfVar = new cf();
        DEFAULT_INSTANCE = cfVar;
        du.registerDefaultInstance(cf.class, cfVar);
    }

    private cf() {
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

    public static cf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(ch chVar) {
        Objects.requireNonNull(chVar);
        ch chVar2 = this.params_;
        if (chVar2 != null && chVar2 != ch.getDefaultInstance()) {
            cg cgVarNewBuilder = ch.newBuilder(chVar2);
            cgVarNewBuilder.mergeFrom((cg) chVar);
            chVar = cgVarNewBuilder.buildPartial();
        }
        this.params_ = chVar;
        this.bitField0_ |= 1;
    }

    public static ce newBuilder() {
        return (ce) DEFAULT_INSTANCE.createBuilder();
    }

    public static cf parseDelimitedFrom(InputStream inputStream) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(com.google.v.v vVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(ch chVar) {
        Objects.requireNonNull(chVar);
        this.params_ = chVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iOrdinal == 3) {
            return new cf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ce(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ch getParams() {
        ch chVar = this.params_;
        return chVar == null ? ch.getDefaultInstance() : chVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ce newBuilder(cf cfVar) {
        return (ce) DEFAULT_INSTANCE.createBuilder(cfVar);
    }

    public static cf parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(com.google.v.v vVar, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cf parseFrom(com.google.v.z zVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cf parseFrom(com.google.v.z zVar, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cf parseFrom(InputStream inputStream) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(InputStream inputStream, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(ByteBuffer byteBuffer) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cf parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cf parseFrom(byte[] bArr) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cf parseFrom(byte[] bArr, de deVar) {
        return (cf) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
