package com.google.w.k;

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
/* loaded from: classes5.dex */
public final class z extends du<z, y> implements fj {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final z DEFAULT_INSTANCE;
    public static final int DESCRIPTOR_FULL_NAME_FIELD_NUMBER = 1;
    private static volatile fo<z> PARSER;
    private int bitField0_;
    private String descriptorFullName_ = "";
    private com.google.v.v data_ = com.google.v.v.f13054a;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.bitField0_ &= -3;
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescriptorFullName() {
        this.bitField0_ &= -2;
        this.descriptorFullName_ = getDefaultInstance().getDescriptorFullName();
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.data_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptorFullName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.descriptorFullName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptorFullNameBytes(com.google.v.v vVar) {
        this.descriptorFullName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "descriptorFullName_", "data_"});
        }
        if (iOrdinal == 3) {
            return new z();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new y(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<z> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (z.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getData() {
        return this.data_;
    }

    public String getDescriptorFullName() {
        return this.descriptorFullName_;
    }

    public com.google.v.v getDescriptorFullNameBytes() {
        return com.google.v.v.s(this.descriptorFullName_);
    }

    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDescriptorFullName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static y newBuilder(z zVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
