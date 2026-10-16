package com.google.firebase.perf.f;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ff;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends du<h, f> implements fj {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final h DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    public static final int IOS_APP_INFO_FIELD_NUMBER = 4;
    private static volatile fo<h> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 8;
    public static final int WEB_APP_INFO_FIELD_NUMBER = 7;
    private b androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private t iosAppInfo_;
    private av webAppInfo_;
    private ff<String, String> customAttributes_ = ff.a();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";
    private String processName_ = "";

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -33;
        this.applicationProcessState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosAppInfo() {
        this.iosAppInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessName() {
        this.bitField0_ &= -65;
        this.processName_ = getDefaultInstance().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebAppInfo() {
        this.webAppInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private ff<String, String> internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private ff<String, String> internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.e()) {
            this.customAttributes_ = this.customAttributes_.b();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAppInfo(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.androidAppInfo_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.androidAppInfo_ = bVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIosAppInfo(t tVar) {
        Objects.requireNonNull(tVar);
        t tVar2 = this.iosAppInfo_;
        if (tVar2 != null && tVar2 != t.getDefaultInstance()) {
            s sVarNewBuilder = t.newBuilder(tVar2);
            sVarNewBuilder.mergeFrom((s) tVar);
            tVar = sVarNewBuilder.buildPartial();
        }
        this.iosAppInfo_ = tVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebAppInfo(av avVar) {
        Objects.requireNonNull(avVar);
        av avVar2 = this.webAppInfo_;
        if (avVar2 != null && avVar2 != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder(avVar2);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.webAppInfo_ = avVar;
        this.bitField0_ |= 16;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppInfo(b bVar) {
        Objects.requireNonNull(bVar);
        this.androidAppInfo_ = bVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(com.google.v.v vVar) {
        this.appInstanceId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationProcessState(i iVar) {
        this.applicationProcessState_ = iVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppIdBytes(com.google.v.v vVar) {
        this.googleAppId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosAppInfo(t tVar) {
        Objects.requireNonNull(tVar);
        this.iosAppInfo_ = tVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessNameBytes(com.google.v.v vVar) {
        this.processName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebAppInfo(av avVar) {
        Objects.requireNonNull(avVar);
        this.webAppInfo_ = avVar;
        this.bitField0_ |= 16;
    }

    public boolean containsCustomAttributes(String str) {
        Objects.requireNonNull(str);
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0005\u00062\u0007ဉ\u0004\bဈ\u0006", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "iosAppInfo_", "applicationProcessState_", m.f10455b, "customAttributes_", g.f10447a, "webAppInfo_", "processName_"});
        }
        if (iOrdinal == 3) {
            return new h();
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
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getAndroidAppInfo() {
        b bVar = this.androidAppInfo_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    public com.google.v.v getAppInstanceIdBytes() {
        return com.google.v.v.s(this.appInstanceId_);
    }

    public i getApplicationProcessState() {
        i iVarA = i.a(this.applicationProcessState_);
        return iVarA == null ? i.APPLICATION_PROCESS_STATE_UNKNOWN : iVarA;
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return DesugarCollections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        Objects.requireNonNull(str);
        String str3 = internalGetCustomAttributes().get(str);
        return str3 != null ? str3 : str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        Objects.requireNonNull(str);
        String str2 = internalGetCustomAttributes().get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException();
    }

    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    public com.google.v.v getGoogleAppIdBytes() {
        return com.google.v.v.s(this.googleAppId_);
    }

    public t getIosAppInfo() {
        t tVar = this.iosAppInfo_;
        return tVar == null ? t.getDefaultInstance() : tVar;
    }

    public String getProcessName() {
        return this.processName_;
    }

    public com.google.v.v getProcessNameBytes() {
        return com.google.v.v.s(this.processName_);
    }

    public av getWebAppInfo() {
        av avVar = this.webAppInfo_;
        return avVar == null ? av.getDefaultInstance() : avVar;
    }

    public boolean hasAndroidAppInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasApplicationProcessState() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIosAppInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasProcessName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasWebAppInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public static f newBuilder(h hVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
