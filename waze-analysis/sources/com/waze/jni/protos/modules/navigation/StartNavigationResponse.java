package com.waze.jni.protos.modules.navigation;

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
public final class StartNavigationResponse extends du<StartNavigationResponse, Builder> implements StartNavigationResponseOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final StartNavigationResponse DEFAULT_INSTANCE;
    private static volatile fo<StartNavigationResponse> PARSER = null;
    public static final int SERVER_DESC_FIELD_NUMBER = 2;
    private int code_;
    private String serverDesc_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.modules.navigation.StartNavigationResponse$1, reason: invalid class name */
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
    public final class Builder extends dm<StartNavigationResponse, Builder> implements StartNavigationResponseOrBuilder {
        private Builder() {
            super(StartNavigationResponse.DEFAULT_INSTANCE);
        }

        public Builder clearCode() {
            copyOnWrite();
            ((StartNavigationResponse) this.instance).clearCode();
            return this;
        }

        public Builder clearServerDesc() {
            copyOnWrite();
            ((StartNavigationResponse) this.instance).clearServerDesc();
            return this;
        }

        @Override // com.waze.jni.protos.modules.navigation.StartNavigationResponseOrBuilder
        public int getCode() {
            return ((StartNavigationResponse) this.instance).getCode();
        }

        @Override // com.waze.jni.protos.modules.navigation.StartNavigationResponseOrBuilder
        public String getServerDesc() {
            return ((StartNavigationResponse) this.instance).getServerDesc();
        }

        @Override // com.waze.jni.protos.modules.navigation.StartNavigationResponseOrBuilder
        public v getServerDescBytes() {
            return ((StartNavigationResponse) this.instance).getServerDescBytes();
        }

        public Builder setCode(int i2) {
            copyOnWrite();
            ((StartNavigationResponse) this.instance).setCode(i2);
            return this;
        }

        public Builder setServerDesc(String str) {
            copyOnWrite();
            ((StartNavigationResponse) this.instance).setServerDesc(str);
            return this;
        }

        public Builder setServerDescBytes(v vVar) {
            copyOnWrite();
            ((StartNavigationResponse) this.instance).setServerDescBytes(vVar);
            return this;
        }
    }

    static {
        StartNavigationResponse startNavigationResponse = new StartNavigationResponse();
        DEFAULT_INSTANCE = startNavigationResponse;
        du.registerDefaultInstance(StartNavigationResponse.class, startNavigationResponse);
    }

    private StartNavigationResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerDesc() {
        this.serverDesc_ = getDefaultInstance().getServerDesc();
    }

    public static StartNavigationResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static StartNavigationResponse parseDelimitedFrom(InputStream inputStream) {
        return (StartNavigationResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StartNavigationResponse parseFrom(v vVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<StartNavigationResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i2) {
        this.code_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerDesc(String str) {
        Objects.requireNonNull(str);
        this.serverDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerDescBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.serverDesc_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"code_", "serverDesc_"});
        }
        if (iOrdinal == 3) {
            return new StartNavigationResponse();
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
        fo<StartNavigationResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (StartNavigationResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.modules.navigation.StartNavigationResponseOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.waze.jni.protos.modules.navigation.StartNavigationResponseOrBuilder
    public String getServerDesc() {
        return this.serverDesc_;
    }

    @Override // com.waze.jni.protos.modules.navigation.StartNavigationResponseOrBuilder
    public v getServerDescBytes() {
        return v.s(this.serverDesc_);
    }

    public static Builder newBuilder(StartNavigationResponse startNavigationResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(startNavigationResponse);
    }

    public static StartNavigationResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (StartNavigationResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static StartNavigationResponse parseFrom(v vVar, de deVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static StartNavigationResponse parseFrom(z zVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static StartNavigationResponse parseFrom(z zVar, de deVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static StartNavigationResponse parseFrom(InputStream inputStream) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StartNavigationResponse parseFrom(InputStream inputStream, de deVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static StartNavigationResponse parseFrom(ByteBuffer byteBuffer) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static StartNavigationResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static StartNavigationResponse parseFrom(byte[] bArr) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StartNavigationResponse parseFrom(byte[] bArr, de deVar) {
        return (StartNavigationResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
