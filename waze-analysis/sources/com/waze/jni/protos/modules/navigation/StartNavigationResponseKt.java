package com.waze.jni.protos.modules.navigation;

import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class StartNavigationResponseKt {
    public static final StartNavigationResponseKt INSTANCE = new StartNavigationResponseKt();

    private StartNavigationResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StartNavigationResponse.Builder _builder;

        private Dsl(StartNavigationResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ StartNavigationResponse _build() {
            StartNavigationResponse startNavigationResponseBuild = this._builder.build();
            x.e(startNavigationResponseBuild, "build(...)");
            return startNavigationResponseBuild;
        }

        public final void clearCode() {
            this._builder.clearCode();
        }

        public final void clearServerDesc() {
            this._builder.clearServerDesc();
        }

        public final int getCode() {
            return this._builder.getCode();
        }

        public final String getServerDesc() {
            String serverDesc = this._builder.getServerDesc();
            x.e(serverDesc, "getServerDesc(...)");
            return serverDesc;
        }

        public final void setCode(int i2) {
            this._builder.setCode(i2);
        }

        public final void setServerDesc(String str) {
            x.f(str, "value");
            this._builder.setServerDesc(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(StartNavigationResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(StartNavigationResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
