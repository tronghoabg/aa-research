package com.google.firebase.perf.f;

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
public final class b extends du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile fo<b> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -5;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(com.google.v.v vVar) {
        this.packageName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(com.google.v.v vVar) {
        this.sdkVersion_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(com.google.v.v vVar) {
        this.versionName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPackageName() {
        return this.packageName_;
    }

    public com.google.v.v getPackageNameBytes() {
        return com.google.v.v.s(this.packageName_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public com.google.v.v getSdkVersionBytes() {
        return com.google.v.v.s(this.sdkVersion_);
    }

    public String getVersionName() {
        return this.versionName_;
    }

    public com.google.v.v getVersionNameBytes() {
        return com.google.v.v.s(this.versionName_);
    }

    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVersionName() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
