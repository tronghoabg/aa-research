package com.waze.jni.protos.sound;

import com.google.v.de;
import com.google.v.dm;
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
/* loaded from: classes6.dex */
public final class VoiceAssetResult extends du<VoiceAssetResult, Builder> implements VoiceAssetResultOrBuilder {
    private static final VoiceAssetResult DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 3;
    private static volatile fo<VoiceAssetResult> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private Object result_;
    private int resultCase_ = 0;
    private String requestId_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.sound.VoiceAssetResult$1, reason: invalid class name */
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
    public interface FailureOrBuilder extends fj {
        String getReason();

        v getReasonBytes();
    }

    /* compiled from: WazeSource */
    public enum ResultCase {
        SUCCESS(2),
        FAILURE(3),
        RESULT_NOT_SET(0);

        private final int value;

        ResultCase(int i2) {
            this.value = i2;
        }

        public static ResultCase forNumber(int i2) {
            if (i2 == 0) {
                return RESULT_NOT_SET;
            }
            if (i2 == 2) {
                return SUCCESS;
            }
            if (i2 != 3) {
                return null;
            }
            return FAILURE;
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* compiled from: WazeSource */
    public interface SuccessOrBuilder extends fj {
        String getUrl();

        v getUrlBytes();
    }

    static {
        VoiceAssetResult voiceAssetResult = new VoiceAssetResult();
        DEFAULT_INSTANCE = voiceAssetResult;
        du.registerDefaultInstance(VoiceAssetResult.class, voiceAssetResult);
    }

    private VoiceAssetResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailure() {
        if (this.resultCase_ == 3) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static VoiceAssetResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailure(Failure failure) {
        Objects.requireNonNull(failure);
        if (this.resultCase_ == 3 && this.result_ != Failure.getDefaultInstance()) {
            Failure.Builder builderNewBuilder = Failure.newBuilder((Failure) this.result_);
            builderNewBuilder.mergeFrom((Failure.Builder) failure);
            failure = builderNewBuilder.buildPartial();
        }
        this.result_ = failure;
        this.resultCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuccess(Success success) {
        Objects.requireNonNull(success);
        if (this.resultCase_ == 2 && this.result_ != Success.getDefaultInstance()) {
            Success.Builder builderNewBuilder = Success.newBuilder((Success) this.result_);
            builderNewBuilder.mergeFrom((Success.Builder) success);
            success = builderNewBuilder.buildPartial();
        }
        this.result_ = success;
        this.resultCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VoiceAssetResult parseDelimitedFrom(InputStream inputStream) {
        return (VoiceAssetResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceAssetResult parseFrom(v vVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VoiceAssetResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailure(Failure failure) {
        Objects.requireNonNull(failure);
        this.result_ = failure;
        this.resultCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.requestId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(Success success) {
        Objects.requireNonNull(success);
        this.result_ = success;
        this.resultCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"result_", "resultCase_", "requestId_", Success.class, Failure.class});
        }
        if (iOrdinal == 3) {
            return new VoiceAssetResult();
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
        fo<VoiceAssetResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VoiceAssetResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public Failure getFailure() {
        return this.resultCase_ == 3 ? (Failure) this.result_ : Failure.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public String getRequestId() {
        return this.requestId_;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public v getRequestIdBytes() {
        return v.s(this.requestId_);
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public ResultCase getResultCase() {
        return ResultCase.forNumber(this.resultCase_);
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public Success getSuccess() {
        return this.resultCase_ == 2 ? (Success) this.result_ : Success.getDefaultInstance();
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public boolean hasFailure() {
        return this.resultCase_ == 3;
    }

    @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
    public boolean hasSuccess() {
        return this.resultCase_ == 2;
    }

    /* compiled from: WazeSource */
    public final class Failure extends du<Failure, Builder> implements FailureOrBuilder {
        private static final Failure DEFAULT_INSTANCE;
        private static volatile fo<Failure> PARSER = null;
        public static final int REASON_FIELD_NUMBER = 1;
        private String reason_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<Failure, Builder> implements FailureOrBuilder {
            private Builder() {
                super(Failure.DEFAULT_INSTANCE);
            }

            public Builder clearReason() {
                copyOnWrite();
                ((Failure) this.instance).clearReason();
                return this;
            }

            @Override // com.waze.jni.protos.sound.VoiceAssetResult.FailureOrBuilder
            public String getReason() {
                return ((Failure) this.instance).getReason();
            }

            @Override // com.waze.jni.protos.sound.VoiceAssetResult.FailureOrBuilder
            public v getReasonBytes() {
                return ((Failure) this.instance).getReasonBytes();
            }

            public Builder setReason(String str) {
                copyOnWrite();
                ((Failure) this.instance).setReason(str);
                return this;
            }

            public Builder setReasonBytes(v vVar) {
                copyOnWrite();
                ((Failure) this.instance).setReasonBytes(vVar);
                return this;
            }
        }

        static {
            Failure failure = new Failure();
            DEFAULT_INSTANCE = failure;
            du.registerDefaultInstance(Failure.class, failure);
        }

        private Failure() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        public static Failure getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Failure parseDelimitedFrom(InputStream inputStream) {
            return (Failure) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Failure parseFrom(v vVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Failure> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            Objects.requireNonNull(str);
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.reason_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"reason_"});
            }
            if (iOrdinal == 3) {
                return new Failure();
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
            fo<Failure> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Failure.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResult.FailureOrBuilder
        public String getReason() {
            return this.reason_;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResult.FailureOrBuilder
        public v getReasonBytes() {
            return v.s(this.reason_);
        }

        public static Builder newBuilder(Failure failure) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(failure);
        }

        public static Failure parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Failure) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Failure parseFrom(v vVar, de deVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Failure parseFrom(z zVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Failure parseFrom(z zVar, de deVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Failure parseFrom(InputStream inputStream) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Failure parseFrom(InputStream inputStream, de deVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Failure parseFrom(ByteBuffer byteBuffer) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Failure parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Failure parseFrom(byte[] bArr) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Failure parseFrom(byte[] bArr, de deVar) {
            return (Failure) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    /* compiled from: WazeSource */
    public final class Success extends du<Success, Builder> implements SuccessOrBuilder {
        private static final Success DEFAULT_INSTANCE;
        private static volatile fo<Success> PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private String url_ = "";

        /* compiled from: WazeSource */
        public final class Builder extends dm<Success, Builder> implements SuccessOrBuilder {
            private Builder() {
                super(Success.DEFAULT_INSTANCE);
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((Success) this.instance).clearUrl();
                return this;
            }

            @Override // com.waze.jni.protos.sound.VoiceAssetResult.SuccessOrBuilder
            public String getUrl() {
                return ((Success) this.instance).getUrl();
            }

            @Override // com.waze.jni.protos.sound.VoiceAssetResult.SuccessOrBuilder
            public v getUrlBytes() {
                return ((Success) this.instance).getUrlBytes();
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((Success) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(v vVar) {
                copyOnWrite();
                ((Success) this.instance).setUrlBytes(vVar);
                return this;
            }
        }

        static {
            Success success = new Success();
            DEFAULT_INSTANCE = success;
            du.registerDefaultInstance(Success.class, success);
        }

        private Success() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static Success getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Success parseDelimitedFrom(InputStream inputStream) {
            return (Success) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Success parseFrom(v vVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, vVar);
        }

        public static fo<Success> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            Objects.requireNonNull(str);
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(v vVar) {
            checkByteStringIsUtf8(vVar);
            this.url_ = vVar.u();
        }

        @Override // com.google.v.du
        protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
            fo dnVar;
            int iOrdinal = dtVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"url_"});
            }
            if (iOrdinal == 3) {
                return new Success();
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
            fo<Success> foVar = PARSER;
            if (foVar != null) {
                return foVar;
            }
            synchronized (Success.class) {
                dnVar = PARSER;
                if (dnVar == null) {
                    dnVar = new dn(DEFAULT_INSTANCE);
                    PARSER = dnVar;
                }
            }
            return dnVar;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResult.SuccessOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResult.SuccessOrBuilder
        public v getUrlBytes() {
            return v.s(this.url_);
        }

        public static Builder newBuilder(Success success) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(success);
        }

        public static Success parseDelimitedFrom(InputStream inputStream, de deVar) {
            return (Success) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Success parseFrom(v vVar, de deVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
        }

        public static Success parseFrom(z zVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, zVar);
        }

        public static Success parseFrom(z zVar, de deVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
        }

        public static Success parseFrom(InputStream inputStream) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Success parseFrom(InputStream inputStream, de deVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
        }

        public static Success parseFrom(ByteBuffer byteBuffer) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Success parseFrom(ByteBuffer byteBuffer, de deVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
        }

        public static Success parseFrom(byte[] bArr) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Success parseFrom(byte[] bArr, de deVar) {
            return (Success) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
        }
    }

    public static Builder newBuilder(VoiceAssetResult voiceAssetResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(voiceAssetResult);
    }

    public static VoiceAssetResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VoiceAssetResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceAssetResult parseFrom(v vVar, de deVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VoiceAssetResult parseFrom(z zVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VoiceAssetResult parseFrom(z zVar, de deVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static VoiceAssetResult parseFrom(InputStream inputStream) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VoiceAssetResult parseFrom(InputStream inputStream, de deVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VoiceAssetResult parseFrom(ByteBuffer byteBuffer) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VoiceAssetResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<VoiceAssetResult, Builder> implements VoiceAssetResultOrBuilder {
        private Builder() {
            super(VoiceAssetResult.DEFAULT_INSTANCE);
        }

        public Builder clearFailure() {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).clearFailure();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).clearRequestId();
            return this;
        }

        public Builder clearResult() {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).clearResult();
            return this;
        }

        public Builder clearSuccess() {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).clearSuccess();
            return this;
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public Failure getFailure() {
            return ((VoiceAssetResult) this.instance).getFailure();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public String getRequestId() {
            return ((VoiceAssetResult) this.instance).getRequestId();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public v getRequestIdBytes() {
            return ((VoiceAssetResult) this.instance).getRequestIdBytes();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public ResultCase getResultCase() {
            return ((VoiceAssetResult) this.instance).getResultCase();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public Success getSuccess() {
            return ((VoiceAssetResult) this.instance).getSuccess();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public boolean hasFailure() {
            return ((VoiceAssetResult) this.instance).hasFailure();
        }

        @Override // com.waze.jni.protos.sound.VoiceAssetResultOrBuilder
        public boolean hasSuccess() {
            return ((VoiceAssetResult) this.instance).hasSuccess();
        }

        public Builder mergeFailure(Failure failure) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).mergeFailure(failure);
            return this;
        }

        public Builder mergeSuccess(Success success) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).mergeSuccess(success);
            return this;
        }

        public Builder setFailure(Failure.Builder builder) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).setFailure(builder.build());
            return this;
        }

        public Builder setRequestId(String str) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).setRequestId(str);
            return this;
        }

        public Builder setRequestIdBytes(v vVar) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).setRequestIdBytes(vVar);
            return this;
        }

        public Builder setSuccess(Success.Builder builder) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).setSuccess(builder.build());
            return this;
        }

        public Builder setFailure(Failure failure) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).setFailure(failure);
            return this;
        }

        public Builder setSuccess(Success success) {
            copyOnWrite();
            ((VoiceAssetResult) this.instance).setSuccess(success);
            return this;
        }
    }

    public static VoiceAssetResult parseFrom(byte[] bArr) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VoiceAssetResult parseFrom(byte[] bArr, de deVar) {
        return (VoiceAssetResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
