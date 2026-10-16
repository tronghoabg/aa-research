package com.google.android.gms.h.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends du<i, f> implements fj {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 5;
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_CODE_FIELD_NUMBER = 3;
    public static final int VERSION_NAME_FIELD_NUMBER = 4;
    private int bitField0_;
    private int clientType_;
    private int sdkVersion_;
    private int versionCode_;
    private String callingPackage_ = "";
    private String versionName_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallingPackage() {
        this.bitField0_ &= -2;
        this.callingPackage_ = getDefaultInstance().getCallingPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientType() {
        this.bitField0_ &= -17;
        this.clientType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionCode() {
        this.bitField0_ &= -5;
        this.versionCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -9;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallingPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.callingPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallingPackageBytes(v vVar) {
        this.callingPackage_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(h hVar) {
        this.clientType_ = hVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(int i2) {
        this.bitField0_ |= 2;
        this.sdkVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionCode(int i2) {
        this.bitField0_ |= 4;
        this.versionCode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(v vVar) {
        this.versionName_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "versionCode_", "versionName_", "clientType_", g.f5486a});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCallingPackage() {
        return this.callingPackage_;
    }

    public v getCallingPackageBytes() {
        return v.s(this.callingPackage_);
    }

    public h getClientType() {
        h hVarA = h.a(this.clientType_);
        return hVarA == null ? h.UNKNOWN : hVarA;
    }

    public int getSdkVersion() {
        return this.sdkVersion_;
    }

    public int getVersionCode() {
        return this.versionCode_;
    }

    public String getVersionName() {
        return this.versionName_;
    }

    public v getVersionNameBytes() {
        return v.s(this.versionName_);
    }

    public boolean hasCallingPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVersionCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVersionName() {
        return (this.bitField0_ & 8) != 0;
    }

    public static f newBuilder(i iVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
