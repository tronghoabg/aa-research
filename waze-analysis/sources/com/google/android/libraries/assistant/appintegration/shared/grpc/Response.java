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
public final class Response extends du<Response, Builder> implements ResponseOrBuilder {
    private static final Response DEFAULT_INSTANCE;
    public static final int ON_UPDATE_FIELD_NUMBER = 1;
    private static volatile fo<Response> PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private AppIntegrationService.AppIntegrationCallbackEvent onUpdate_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.grpc.Response$1, reason: invalid class name */
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
        Response response = new Response();
        DEFAULT_INSTANCE = response;
        du.registerDefaultInstance(Response.class, response);
    }

    private Response() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnUpdate() {
        this.onUpdate_ = null;
        this.bitField0_ &= -2;
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnUpdate(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
        Objects.requireNonNull(appIntegrationCallbackEvent);
        AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent2 = this.onUpdate_;
        if (appIntegrationCallbackEvent2 != null && appIntegrationCallbackEvent2 != AppIntegrationService.AppIntegrationCallbackEvent.getDefaultInstance()) {
            AppIntegrationService.AppIntegrationCallbackEvent.Builder builderNewBuilder = AppIntegrationService.AppIntegrationCallbackEvent.newBuilder(appIntegrationCallbackEvent2);
            builderNewBuilder.mergeFrom((AppIntegrationService.AppIntegrationCallbackEvent.Builder) appIntegrationCallbackEvent);
            appIntegrationCallbackEvent = builderNewBuilder.buildPartial();
        }
        this.onUpdate_ = appIntegrationCallbackEvent;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Response parseDelimitedFrom(InputStream inputStream) {
        return (Response) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Response parseFrom(v vVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Response> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnUpdate(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
        Objects.requireNonNull(appIntegrationCallbackEvent);
        this.onUpdate_ = appIntegrationCallbackEvent;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "onUpdate_"});
            case 3:
                return new Response();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<Response> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (Response.class) {
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

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.ResponseOrBuilder
    public AppIntegrationService.AppIntegrationCallbackEvent getOnUpdate() {
        AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent = this.onUpdate_;
        return appIntegrationCallbackEvent == null ? AppIntegrationService.AppIntegrationCallbackEvent.getDefaultInstance() : appIntegrationCallbackEvent;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.ResponseOrBuilder
    public boolean hasOnUpdate() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Response response) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(response);
    }

    public static Response parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Response) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Response parseFrom(v vVar, de deVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Response parseFrom(z zVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Response parseFrom(z zVar, de deVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Response parseFrom(InputStream inputStream) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Response parseFrom(InputStream inputStream, de deVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Response parseFrom(ByteBuffer byteBuffer) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Response parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Response, Builder> implements ResponseOrBuilder {
        private Builder() {
            super(Response.DEFAULT_INSTANCE);
        }

        public Builder clearOnUpdate() {
            copyOnWrite();
            ((Response) this.instance).clearOnUpdate();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.ResponseOrBuilder
        public AppIntegrationService.AppIntegrationCallbackEvent getOnUpdate() {
            return ((Response) this.instance).getOnUpdate();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.grpc.ResponseOrBuilder
        public boolean hasOnUpdate() {
            return ((Response) this.instance).hasOnUpdate();
        }

        public Builder mergeOnUpdate(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
            copyOnWrite();
            ((Response) this.instance).mergeOnUpdate(appIntegrationCallbackEvent);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOnUpdate(AppIntegrationService.AppIntegrationCallbackEvent.Builder builder) {
            copyOnWrite();
            ((Response) this.instance).setOnUpdate((AppIntegrationService.AppIntegrationCallbackEvent) builder.build());
            return this;
        }

        public Builder setOnUpdate(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
            copyOnWrite();
            ((Response) this.instance).setOnUpdate(appIntegrationCallbackEvent);
            return this;
        }
    }

    public static Response parseFrom(byte[] bArr) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Response parseFrom(byte[] bArr, de deVar) {
        return (Response) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
