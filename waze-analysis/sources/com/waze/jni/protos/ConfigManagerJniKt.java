package com.waze.jni.protos;

import com.waze.jni.protos.ConfigManagerJni;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ConfigManagerJniKt {
    public static final ConfigManagerJniKt INSTANCE = new ConfigManagerJniKt();

    private ConfigManagerJniKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ConfigManagerJni.Builder _builder;

        private Dsl(ConfigManagerJni.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ConfigManagerJni _build() {
            ConfigManagerJni configManagerJniBuild = this._builder.build();
            x.e(configManagerJniBuild, "build(...)");
            return configManagerJniBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ConfigManagerJni.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ConfigManagerJni.Builder builder, o oVar) {
            this(builder);
        }
    }
}
