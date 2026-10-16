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
public final class av extends du<av, au> implements fj {
    private static final av DEFAULT_INSTANCE;
    public static final int EFFECTIVE_CONNECTION_TYPE_FIELD_NUMBER = 5;
    public static final int PAGE_URL_FIELD_NUMBER = 2;
    private static volatile fo<av> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    public static final int SERVICE_WORKER_STATUS_FIELD_NUMBER = 3;
    public static final int VISIBILITY_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int effectiveConnectionType_;
    private int serviceWorkerStatus_;
    private int visibilityState_;
    private String sdkVersion_ = "";
    private String pageUrl_ = "";

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEffectiveConnectionType() {
        this.bitField0_ &= -17;
        this.effectiveConnectionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageUrl() {
        this.bitField0_ &= -3;
        this.pageUrl_ = getDefaultInstance().getPageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -2;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceWorkerStatus() {
        this.bitField0_ &= -5;
        this.serviceWorkerStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisibilityState() {
        this.bitField0_ &= -9;
        this.visibilityState_ = 0;
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEffectiveConnectionType(n nVar) {
        this.effectiveConnectionType_ = nVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.pageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageUrlBytes(com.google.v.v vVar) {
        this.pageUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(com.google.v.v vVar) {
        this.sdkVersion_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceWorkerStatus(aj ajVar) {
        this.serviceWorkerStatus_ = ajVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibilityState(at atVar) {
        this.visibilityState_ = atVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "sdkVersion_", "pageUrl_", "serviceWorkerStatus_", m.f10458e, "visibilityState_", m.f10461h, "effectiveConnectionType_", m.f10454a});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public n getEffectiveConnectionType() {
        n nVarA = n.a(this.effectiveConnectionType_);
        return nVarA == null ? n.EFFECTIVE_CONNECTION_TYPE_UNKNOWN : nVarA;
    }

    public String getPageUrl() {
        return this.pageUrl_;
    }

    public com.google.v.v getPageUrlBytes() {
        return com.google.v.v.s(this.pageUrl_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public com.google.v.v getSdkVersionBytes() {
        return com.google.v.v.s(this.sdkVersion_);
    }

    public aj getServiceWorkerStatus() {
        aj ajVarA = aj.a(this.serviceWorkerStatus_);
        return ajVarA == null ? aj.SERVICE_WORKER_STATUS_UNKNOWN : ajVarA;
    }

    public at getVisibilityState() {
        at atVarA = at.a(this.visibilityState_);
        return atVarA == null ? at.VISIBILITY_STATE_UNKNOWN : atVarA;
    }

    public boolean hasEffectiveConnectionType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPageUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasServiceWorkerStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVisibilityState() {
        return (this.bitField0_ & 8) != 0;
    }

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, de deVar) {
        return (av) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
