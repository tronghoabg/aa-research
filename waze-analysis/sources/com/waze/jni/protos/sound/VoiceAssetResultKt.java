package com.waze.jni.protos.sound;

import com.waze.jni.protos.sound.VoiceAssetResult;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetResultKt {
    public static final VoiceAssetResultKt INSTANCE = new VoiceAssetResultKt();

    private VoiceAssetResultKt() {
    }

    /* renamed from: -initializefailure, reason: not valid java name */
    public final VoiceAssetResult.Failure m28430initializefailure(l<? super FailureKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FailureKt.Dsl.Companion companion = FailureKt.Dsl.Companion;
        VoiceAssetResult.Failure.Builder builderNewBuilder = VoiceAssetResult.Failure.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FailureKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializesuccess, reason: not valid java name */
    public final VoiceAssetResult.Success m28431initializesuccess(l<? super SuccessKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SuccessKt.Dsl.Companion companion = SuccessKt.Dsl.Companion;
        VoiceAssetResult.Success.Builder builderNewBuilder = VoiceAssetResult.Success.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SuccessKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class FailureKt {
        public static final FailureKt INSTANCE = new FailureKt();

        private FailureKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final VoiceAssetResult.Failure.Builder _builder;

            private Dsl(VoiceAssetResult.Failure.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ VoiceAssetResult.Failure _build() {
                VoiceAssetResult.Failure failureBuild = this._builder.build();
                x.e(failureBuild, "build(...)");
                return failureBuild;
            }

            public final void clearReason() {
                this._builder.clearReason();
            }

            public final String getReason() {
                String reason = this._builder.getReason();
                x.e(reason, "getReason(...)");
                return reason;
            }

            public final void setReason(String str) {
                x.f(str, "value");
                this._builder.setReason(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(VoiceAssetResult.Failure.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(VoiceAssetResult.Failure.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class SuccessKt {
        public static final SuccessKt INSTANCE = new SuccessKt();

        private SuccessKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final VoiceAssetResult.Success.Builder _builder;

            private Dsl(VoiceAssetResult.Success.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ VoiceAssetResult.Success _build() {
                VoiceAssetResult.Success successBuild = this._builder.build();
                x.e(successBuild, "build(...)");
                return successBuild;
            }

            public final void clearUrl() {
                this._builder.clearUrl();
            }

            public final String getUrl() {
                String url = this._builder.getUrl();
                x.e(url, "getUrl(...)");
                return url;
            }

            public final void setUrl(String str) {
                x.f(str, "value");
                this._builder.setUrl(str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(VoiceAssetResult.Success.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(VoiceAssetResult.Success.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VoiceAssetResult.Builder _builder;

        private Dsl(VoiceAssetResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VoiceAssetResult _build() {
            VoiceAssetResult voiceAssetResultBuild = this._builder.build();
            x.e(voiceAssetResultBuild, "build(...)");
            return voiceAssetResultBuild;
        }

        public final void clearFailure() {
            this._builder.clearFailure();
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }

        public final void clearResult() {
            this._builder.clearResult();
        }

        public final void clearSuccess() {
            this._builder.clearSuccess();
        }

        public final VoiceAssetResult.Failure getFailure() {
            VoiceAssetResult.Failure failure = this._builder.getFailure();
            x.e(failure, "getFailure(...)");
            return failure;
        }

        public final String getRequestId() {
            String requestId = this._builder.getRequestId();
            x.e(requestId, "getRequestId(...)");
            return requestId;
        }

        public final VoiceAssetResult.ResultCase getResultCase() {
            VoiceAssetResult.ResultCase resultCase = this._builder.getResultCase();
            x.e(resultCase, "getResultCase(...)");
            return resultCase;
        }

        public final VoiceAssetResult.Success getSuccess() {
            VoiceAssetResult.Success success = this._builder.getSuccess();
            x.e(success, "getSuccess(...)");
            return success;
        }

        public final boolean hasFailure() {
            return this._builder.hasFailure();
        }

        public final boolean hasSuccess() {
            return this._builder.hasSuccess();
        }

        public final void setFailure(VoiceAssetResult.Failure failure) {
            x.f(failure, "value");
            this._builder.setFailure(failure);
        }

        public final void setRequestId(String str) {
            x.f(str, "value");
            this._builder.setRequestId(str);
        }

        public final void setSuccess(VoiceAssetResult.Success success) {
            x.f(success, "value");
            this._builder.setSuccess(success);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VoiceAssetResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VoiceAssetResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
