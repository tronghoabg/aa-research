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
public final class cm extends du<cm, cl> implements fj {
    private static final cm DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fo<cm> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.v keyValue_ = com.google.v.v.f13054a;
    private cq params_;
    private int version_;

    static {
        cm cmVar = new cm();
        DEFAULT_INSTANCE = cmVar;
        du.registerDefaultInstance(cm.class, cmVar);
    }

    private cm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
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

    public static cm getDefaultInstance() {
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

    public static cl newBuilder() {
        return (cl) DEFAULT_INSTANCE.createBuilder();
    }

    public static cm parseDelimitedFrom(InputStream inputStream) {
        return (cm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cm parseFrom(com.google.v.v vVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.keyValue_ = vVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (iOrdinal == 3) {
            return new cm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getKeyValue() {
        return this.keyValue_;
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

    public static cl newBuilder(cm cmVar) {
        return (cl) DEFAULT_INSTANCE.createBuilder(cmVar);
    }

    public static cm parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cm parseFrom(com.google.v.v vVar, de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cm parseFrom(com.google.v.z zVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cm parseFrom(com.google.v.z zVar, de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cm parseFrom(InputStream inputStream) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cm parseFrom(InputStream inputStream, de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cm parseFrom(ByteBuffer byteBuffer) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cm parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cm parseFrom(byte[] bArr) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cm parseFrom(byte[] bArr, de deVar) {
        return (cm) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
