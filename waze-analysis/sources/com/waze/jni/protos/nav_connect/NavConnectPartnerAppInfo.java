package com.waze.jni.protos.nav_connect;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavConnectPartnerAppInfo extends du<NavConnectPartnerAppInfo, Builder> implements NavConnectPartnerAppInfoOrBuilder {
    private static final NavConnectPartnerAppInfo DEFAULT_INSTANCE;
    public static final int ICON_DATA_FIELD_NUMBER = 3;
    public static final int ISV_BUSINESS_NAME_FIELD_NUMBER = 5;
    public static final int ISV_PRIVACY_POLICY_URL_FIELD_NUMBER = 6;
    private static volatile fo<NavConnectPartnerAppInfo> PARSER = null;
    public static final int PARTNER_APP_ID_FIELD_NUMBER = 1;
    public static final int PRIVACY_POLICY_URL_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String partnerAppId_ = "";
    private String title_ = "";
    private v iconData_ = v.f13054a;
    private String privacyPolicyUrl_ = "";
    private String isvBusinessName_ = "";
    private String isvPrivacyPolicyUrl_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfo$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavConnectPartnerAppInfo, Builder> implements NavConnectPartnerAppInfoOrBuilder {
        private Builder() {
            super(NavConnectPartnerAppInfo.DEFAULT_INSTANCE);
        }

        public Builder clearIconData() {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).clearIconData();
            return this;
        }

        public Builder clearIsvBusinessName() {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).clearIsvBusinessName();
            return this;
        }

        public Builder clearIsvPrivacyPolicyUrl() {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).clearIsvPrivacyPolicyUrl();
            return this;
        }

        public Builder clearPartnerAppId() {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).clearPartnerAppId();
            return this;
        }

        public Builder clearPrivacyPolicyUrl() {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).clearPrivacyPolicyUrl();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).clearTitle();
            return this;
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public v getIconData() {
            return ((NavConnectPartnerAppInfo) this.instance).getIconData();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public String getIsvBusinessName() {
            return ((NavConnectPartnerAppInfo) this.instance).getIsvBusinessName();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public v getIsvBusinessNameBytes() {
            return ((NavConnectPartnerAppInfo) this.instance).getIsvBusinessNameBytes();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public String getIsvPrivacyPolicyUrl() {
            return ((NavConnectPartnerAppInfo) this.instance).getIsvPrivacyPolicyUrl();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public v getIsvPrivacyPolicyUrlBytes() {
            return ((NavConnectPartnerAppInfo) this.instance).getIsvPrivacyPolicyUrlBytes();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public String getPartnerAppId() {
            return ((NavConnectPartnerAppInfo) this.instance).getPartnerAppId();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public v getPartnerAppIdBytes() {
            return ((NavConnectPartnerAppInfo) this.instance).getPartnerAppIdBytes();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public String getPrivacyPolicyUrl() {
            return ((NavConnectPartnerAppInfo) this.instance).getPrivacyPolicyUrl();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public v getPrivacyPolicyUrlBytes() {
            return ((NavConnectPartnerAppInfo) this.instance).getPrivacyPolicyUrlBytes();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public String getTitle() {
            return ((NavConnectPartnerAppInfo) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
        public v getTitleBytes() {
            return ((NavConnectPartnerAppInfo) this.instance).getTitleBytes();
        }

        public Builder setIconData(v vVar) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setIconData(vVar);
            return this;
        }

        public Builder setIsvBusinessName(String str) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setIsvBusinessName(str);
            return this;
        }

        public Builder setIsvBusinessNameBytes(v vVar) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setIsvBusinessNameBytes(vVar);
            return this;
        }

        public Builder setIsvPrivacyPolicyUrl(String str) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setIsvPrivacyPolicyUrl(str);
            return this;
        }

        public Builder setIsvPrivacyPolicyUrlBytes(v vVar) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setIsvPrivacyPolicyUrlBytes(vVar);
            return this;
        }

        public Builder setPartnerAppId(String str) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setPartnerAppId(str);
            return this;
        }

        public Builder setPartnerAppIdBytes(v vVar) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setPartnerAppIdBytes(vVar);
            return this;
        }

        public Builder setPrivacyPolicyUrl(String str) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setPrivacyPolicyUrl(str);
            return this;
        }

        public Builder setPrivacyPolicyUrlBytes(v vVar) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setPrivacyPolicyUrlBytes(vVar);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((NavConnectPartnerAppInfo) this.instance).setTitleBytes(vVar);
            return this;
        }
    }

    static {
        NavConnectPartnerAppInfo navConnectPartnerAppInfo = new NavConnectPartnerAppInfo();
        DEFAULT_INSTANCE = navConnectPartnerAppInfo;
        du.registerDefaultInstance(NavConnectPartnerAppInfo.class, navConnectPartnerAppInfo);
    }

    private NavConnectPartnerAppInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconData() {
        this.iconData_ = getDefaultInstance().getIconData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsvBusinessName() {
        this.isvBusinessName_ = getDefaultInstance().getIsvBusinessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsvPrivacyPolicyUrl() {
        this.isvPrivacyPolicyUrl_ = getDefaultInstance().getIsvPrivacyPolicyUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartnerAppId() {
        this.partnerAppId_ = getDefaultInstance().getPartnerAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivacyPolicyUrl() {
        this.privacyPolicyUrl_ = getDefaultInstance().getPrivacyPolicyUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static NavConnectPartnerAppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavConnectPartnerAppInfo parseDelimitedFrom(InputStream inputStream) {
        return (NavConnectPartnerAppInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavConnectPartnerAppInfo parseFrom(v vVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavConnectPartnerAppInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconData(v vVar) {
        Objects.requireNonNull(vVar);
        this.iconData_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvBusinessName(String str) {
        Objects.requireNonNull(str);
        this.isvBusinessName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvBusinessNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.isvBusinessName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvPrivacyPolicyUrl(String str) {
        Objects.requireNonNull(str);
        this.isvPrivacyPolicyUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsvPrivacyPolicyUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.isvPrivacyPolicyUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerAppId(String str) {
        Objects.requireNonNull(str);
        this.partnerAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerAppIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.partnerAppId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyPolicyUrl(String str) {
        Objects.requireNonNull(str);
        this.privacyPolicyUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivacyPolicyUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.privacyPolicyUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"partnerAppId_", "title_", "iconData_", "privacyPolicyUrl_", "isvBusinessName_", "isvPrivacyPolicyUrl_"});
        }
        if (iOrdinal == 3) {
            return new NavConnectPartnerAppInfo();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<NavConnectPartnerAppInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavConnectPartnerAppInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public v getIconData() {
        return this.iconData_;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public String getIsvBusinessName() {
        return this.isvBusinessName_;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public v getIsvBusinessNameBytes() {
        return v.s(this.isvBusinessName_);
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public String getIsvPrivacyPolicyUrl() {
        return this.isvPrivacyPolicyUrl_;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public v getIsvPrivacyPolicyUrlBytes() {
        return v.s(this.isvPrivacyPolicyUrl_);
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public String getPartnerAppId() {
        return this.partnerAppId_;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public v getPartnerAppIdBytes() {
        return v.s(this.partnerAppId_);
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl_;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public v getPrivacyPolicyUrlBytes() {
        return v.s(this.privacyPolicyUrl_);
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.nav_connect.NavConnectPartnerAppInfoOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    public static Builder newBuilder(NavConnectPartnerAppInfo navConnectPartnerAppInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navConnectPartnerAppInfo);
    }

    public static NavConnectPartnerAppInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavConnectPartnerAppInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavConnectPartnerAppInfo parseFrom(v vVar, de deVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavConnectPartnerAppInfo parseFrom(z zVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavConnectPartnerAppInfo parseFrom(z zVar, de deVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NavConnectPartnerAppInfo parseFrom(InputStream inputStream) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavConnectPartnerAppInfo parseFrom(InputStream inputStream, de deVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavConnectPartnerAppInfo parseFrom(ByteBuffer byteBuffer) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavConnectPartnerAppInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NavConnectPartnerAppInfo parseFrom(byte[] bArr) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavConnectPartnerAppInfo parseFrom(byte[] bArr, de deVar) {
        return (NavConnectPartnerAppInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
