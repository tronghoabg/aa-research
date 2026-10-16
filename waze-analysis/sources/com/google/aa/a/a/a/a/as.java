package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as extends du<as, ar> implements at {
    public static final int BRAND_FIELD_NUMBER = 1;
    private static final as DEFAULT_INSTANCE;
    private static volatile fo<as> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String brand_ = "";
    private String version_ = "";

    static {
        as asVar = new as();
        DEFAULT_INSTANCE = asVar;
        du.registerDefaultInstance(as.class, asVar);
    }

    private as() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.bitField0_ &= -2;
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = getDefaultInstance().getVersion();
    }

    public static as getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ar newBuilder() {
        return (ar) DEFAULT_INSTANCE.createBuilder();
    }

    public static as parseDelimitedFrom(InputStream inputStream) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(com.google.v.v vVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<as> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.brand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBytes(com.google.v.v vVar) {
        this.brand_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(com.google.v.v vVar) {
        this.version_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "brand_", "version_"});
        }
        if (iOrdinal == 3) {
            return new as();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ar(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<as> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (as.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBrand() {
        return this.brand_;
    }

    public com.google.v.v getBrandBytes() {
        return com.google.v.v.s(this.brand_);
    }

    public String getVersion() {
        return this.version_;
    }

    public com.google.v.v getVersionBytes() {
        return com.google.v.v.s(this.version_);
    }

    public boolean hasBrand() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ar newBuilder(as asVar) {
        return (ar) DEFAULT_INSTANCE.createBuilder(asVar);
    }

    public static as parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (as) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static as parseFrom(com.google.v.z zVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static as parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static as parseFrom(InputStream inputStream) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static as parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static as parseFrom(ByteBuffer byteBuffer) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static as parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static as parseFrom(byte[] bArr) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static as parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (as) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
