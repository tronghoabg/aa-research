package com.waze.jni.protos;

import com.waze.jni.protos.NetworkCommandTrace;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NetworkCommandTraceKt {
    public static final NetworkCommandTraceKt INSTANCE = new NetworkCommandTraceKt();

    private NetworkCommandTraceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NetworkCommandTrace.Builder _builder;

        private Dsl(NetworkCommandTrace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NetworkCommandTrace _build() {
            NetworkCommandTrace networkCommandTraceBuild = this._builder.build();
            x.e(networkCommandTraceBuild, "build(...)");
            return networkCommandTraceBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNetworkLatencyMs() {
            this._builder.clearNetworkLatencyMs();
        }

        public final void clearQueueLatencyMs() {
            this._builder.clearQueueLatencyMs();
        }

        public final void clearRetryCount() {
            this._builder.clearRetryCount();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final int getNetworkLatencyMs() {
            return this._builder.getNetworkLatencyMs();
        }

        public final int getQueueLatencyMs() {
            return this._builder.getQueueLatencyMs();
        }

        public final int getRetryCount() {
            return this._builder.getRetryCount();
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setNetworkLatencyMs(int i2) {
            this._builder.setNetworkLatencyMs(i2);
        }

        public final void setQueueLatencyMs(int i2) {
            this._builder.setQueueLatencyMs(i2);
        }

        public final void setRetryCount(int i2) {
            this._builder.setRetryCount(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NetworkCommandTrace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NetworkCommandTrace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
