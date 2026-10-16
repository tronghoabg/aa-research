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
public final class cb extends du<cb, ca> implements fj {
    private static final cb DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fo<cb> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private cd params_;
    private int version_;

    static {
        cb cbVar = new cb();
        DEFAULT_INSTANCE = cbVar;
        du.registerDefaultInstance(cb.class, cbVar);
    }

    private cb() {
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

    public static cb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(cd cdVar) {
        Objects.requireNonNull(cdVar);
        cd cdVar2 = this.params_;
        if (cdVar2 != null && cdVar2 != cd.getDefaultInstance()) {
            cc ccVarNewBuilder = cd.newBuilder(cdVar2);
            ccVarNewBuilder.mergeFrom((cc) cdVar);
            cdVar = ccVarNewBuilder.buildPartial();
        }
        this.params_ = cdVar;
        this.bitField0_ |= 1;
    }

    public static ca newBuilder() {
        return (ca) DEFAULT_INSTANCE.createBuilder();
    }

    public static cb parseDelimitedFrom(InputStream inputStream) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(com.google.v.v vVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(cd cdVar) {
        Objects.requireNonNull(cdVar);
        this.params_ = cdVar;
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
            return new cb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ca(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cd getParams() {
        cd cdVar = this.params_;
        return cdVar == null ? cd.getDefaultInstance() : cdVar;
    }

    public int getVersion() {
        return this.version_;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ca newBuilder(cb cbVar) {
        return (ca) DEFAULT_INSTANCE.createBuilder(cbVar);
    }

    public static cb parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(com.google.v.v vVar, de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cb parseFrom(com.google.v.z zVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cb parseFrom(com.google.v.z zVar, de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cb parseFrom(InputStream inputStream) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(InputStream inputStream, de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(ByteBuffer byteBuffer) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cb parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cb parseFrom(byte[] bArr) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cb parseFrom(byte[] bArr, de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
