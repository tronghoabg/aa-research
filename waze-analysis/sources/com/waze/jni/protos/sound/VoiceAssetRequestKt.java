package com.waze.jni.protos.sound;

import com.google.v.v;
import com.waze.jni.protos.sound.VoiceAssetRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VoiceAssetRequestKt {
    public static final VoiceAssetRequestKt INSTANCE = new VoiceAssetRequestKt();

    private VoiceAssetRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VoiceAssetRequest.Builder _builder;

        private Dsl(VoiceAssetRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VoiceAssetRequest _build() {
            VoiceAssetRequest voiceAssetRequestBuild = this._builder.build();
            x.e(voiceAssetRequestBuild, "build(...)");
            return voiceAssetRequestBuild;
        }

        public final void clearBytes() {
            this._builder.clearBytes();
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final v getBytes() {
            v bytes = this._builder.getBytes();
            x.e(bytes, "getBytes(...)");
            return bytes;
        }

        public final String getRequestId() {
            String requestId = this._builder.getRequestId();
            x.e(requestId, "getRequestId(...)");
            return requestId;
        }

        public final VoiceAssetRequest.Type getType() {
            VoiceAssetRequest.Type type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final void setBytes(v vVar) {
            x.f(vVar, "value");
            this._builder.setBytes(vVar);
        }

        public final void setRequestId(String str) {
            x.f(str, "value");
            this._builder.setRequestId(str);
        }

        public final void setType(VoiceAssetRequest.Type type) {
            x.f(type, "value");
            this._builder.setType(type);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VoiceAssetRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VoiceAssetRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
