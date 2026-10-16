package com.waze.jni.protos;

import com.waze.jni.protos.NativeManagerDefinitions;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeManagerDefinitionsKt {
    public static final NativeManagerDefinitionsKt INSTANCE = new NativeManagerDefinitionsKt();

    private NativeManagerDefinitionsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeManagerDefinitions.Builder _builder;

        private Dsl(NativeManagerDefinitions.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeManagerDefinitions _build() {
            NativeManagerDefinitions nativeManagerDefinitionsBuild = this._builder.build();
            x.e(nativeManagerDefinitionsBuild, "build(...)");
            return nativeManagerDefinitionsBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NativeManagerDefinitions.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NativeManagerDefinitions.Builder builder, o oVar) {
            this(builder);
        }
    }
}
