package com.google.aa.a.a.a.a;

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
public final class af extends du<af, ad> implements fj {
    public static final int BUILD_VERSION_FIELD_NUMBER = 1;
    private static final af DEFAULT_INSTANCE;
    public static final int G1_DESKTOP_CLIENT_TYPE_FIELD_NUMBER = 2;
    private static volatile fo<af> PARSER;
    private int bitField0_;
    private String buildVersion_ = "";
    private int g1DesktopClientType_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildVersion() {
        this.bitField0_ &= -2;
        this.buildVersion_ = getDefaultInstance().getBuildVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearG1DesktopClientType() {
        this.bitField0_ &= -3;
        this.g1DesktopClientType_ = 0;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ad newBuilder() {
        return (ad) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.buildVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildVersionBytes(com.google.v.v vVar) {
        this.buildVersion_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setG1DesktopClientType(ae aeVar) {
        this.g1DesktopClientType_ = aeVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "buildVersion_", "g1DesktopClientType_", i.f3790h});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ad(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBuildVersion() {
        return this.buildVersion_;
    }

    public com.google.v.v getBuildVersionBytes() {
        return com.google.v.v.s(this.buildVersion_);
    }

    public ae getG1DesktopClientType() {
        ae aeVarA = ae.a(this.g1DesktopClientType_);
        return aeVarA == null ? ae.CLIENT_UNKNOWN : aeVarA;
    }

    public boolean hasBuildVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasG1DesktopClientType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ad newBuilder(af afVar) {
        return (ad) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
