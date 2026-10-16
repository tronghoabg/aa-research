package com.google.android.libraries.assistant.appintegration.shared.grpc;

import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
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
/* loaded from: classes4.dex */
public final class Request extends du<Request, Builder> implements RequestOrBuilder {
    private static final Request DEFAULT_INSTANCE;
    public static final int IS_TNG_MORRIS_FIELD_NUMBER = 4;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile fo<Request> PARSER = null;
    public static final int SEND_TOKEN_FIELD_NUMBER = 3;
    public static final int SENT_DATA_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isTngMorris_;
    private byte memoizedIsInitialized = 2;
    private String packageName_ = "";
    private boolean sendToken_;
    private AppIntegrationService.AppIntegrationData sentData_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.grpc.Request$1, reason: invalid class name */
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

    static {
        Request request = new Request();
        DEFAULT_INSTANCE = request;
        du.registerDefaultInstance(Request.class, request);
    }

    private Request() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTngMorris() {
        this.bitField0_ &= -9;
        this.isTngMorris_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendToken() {
        this.bitField0_ &= -5;
        this.sendToken_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSentData() {
        this.sentData_ = null;
        this.bitField0_ &= -3;
    }

    public static Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSentData(AppIntegrationService.AppIntegrationData appIntegrationData) {
        Objects.requireNonNull(appIntegrationData);
        AppIntegrationService.AppIntegrationData appIntegrationData2 = this.sentData_;
        if (appIntegrationData2 != null && appIntegrationData2 != AppIntegrationService.AppIntegrationData.getDefaultInstance()) {
            AppIntegrationService.AppIntegrationData.Builder builderNewBuilder = AppIntegrationService.AppIntegrationData.newBuilder(appIntegrationData2);
            builderNewBuilder.mergeFrom((AppIntegrationService.AppIntegrationData.Builder) appIntegrationData);
            appIntegrationData = builderNewBuilder.buildPartial();
        }
        this.sentData_ = appIntegrationData;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Request parseDelimitedFrom(InputStream inputStream) {
        return (Request) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Request parseFrom(v vVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Request> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTngMorris(boolean z) {
        this.bitField0_ |= 8;
        this.isTngMorris_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(v vVar) {
        this.packageName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendToken(boolean z) {
        this.bitField0_ |= 4;
        this.sendToken_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentData(AppIntegrationService.AppIntegrationData appIntegrationData) {
        Objects.requireNonNull(appIntegrationData);
        this.sentData_ = appIntegrationData;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "packageName_", "sentData_", "sendToken_", "isTngMorris_"});
            case 3:
                return new Request();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<Request> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (Request.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public boolean getIsTngMorris() {
        return this.isTngMorris_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public v getPackageNameBytes() {
        return v.s(this.packageName_);
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public boolean getSendToken() {
        return this.sendToken_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public AppIntegrationService.AppIntegrationData getSentData() {
        AppIntegrationService.AppIntegrationData appIntegrationData = this.sentData_;
        return appIntegrationData == null ? AppIntegrationService.AppIntegrationData.getDefaultInstance() : appIntegrationData;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public boolean hasIsTngMorris() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public boolean hasSendToken() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
    public boolean hasSentData() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(Request request) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(request);
    }

    public static Request parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Request) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Request parseFrom(v vVar, de deVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Request parseFrom(z zVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Request parseFrom(z zVar, de deVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Request parseFrom(InputStream inputStream) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Request parseFrom(InputStream inputStream, de deVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Request parseFrom(ByteBuffer byteBuffer) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Request parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Request, Builder> implements RequestOrBuilder {
        private Builder() {
            super(Request.DEFAULT_INSTANCE);
        }

        public Builder clearIsTngMorris() {
            copyOnWrite();
            ((Request) this.instance).clearIsTngMorris();
            return this;
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((Request) this.instance).clearPackageName();
            return this;
        }

        public Builder clearSendToken() {
            copyOnWrite();
            ((Request) this.instance).clearSendToken();
            return this;
        }

        public Builder clearSentData() {
            copyOnWrite();
            ((Request) this.instance).clearSentData();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public boolean getIsTngMorris() {
            return ((Request) this.instance).getIsTngMorris();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public String getPackageName() {
            return ((Request) this.instance).getPackageName();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public v getPackageNameBytes() {
            return ((Request) this.instance).getPackageNameBytes();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public boolean getSendToken() {
            return ((Request) this.instance).getSendToken();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public AppIntegrationService.AppIntegrationData getSentData() {
            return ((Request) this.instance).getSentData();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public boolean hasIsTngMorris() {
            return ((Request) this.instance).hasIsTngMorris();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public boolean hasPackageName() {
            return ((Request) this.instance).hasPackageName();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public boolean hasSendToken() {
            return ((Request) this.instance).hasSendToken();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.RequestOrBuilder
        public boolean hasSentData() {
            return ((Request) this.instance).hasSentData();
        }

        public Builder mergeSentData(AppIntegrationService.AppIntegrationData appIntegrationData) {
            copyOnWrite();
            ((Request) this.instance).mergeSentData(appIntegrationData);
            return this;
        }

        public Builder setIsTngMorris(boolean z) {
            copyOnWrite();
            ((Request) this.instance).setIsTngMorris(z);
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((Request) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(v vVar) {
            copyOnWrite();
            ((Request) this.instance).setPackageNameBytes(vVar);
            return this;
        }

        public Builder setSendToken(boolean z) {
            copyOnWrite();
            ((Request) this.instance).setSendToken(z);
            return this;
        }

        public Builder setSentData(AppIntegrationService.AppIntegrationData.Builder builder) {
            copyOnWrite();
            ((Request) this.instance).setSentData(builder.build());
            return this;
        }

        public Builder setSentData(AppIntegrationService.AppIntegrationData appIntegrationData) {
            copyOnWrite();
            ((Request) this.instance).setSentData(appIntegrationData);
            return this;
        }
    }

    public static Request parseFrom(byte[] bArr) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Request parseFrom(byte[] bArr, de deVar) {
        return (Request) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
