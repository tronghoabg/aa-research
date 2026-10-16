package com.waze.jni.protos.favorites;

import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IsHomeWorkSetResultKt {
    public static final IsHomeWorkSetResultKt INSTANCE = new IsHomeWorkSetResultKt();

    private IsHomeWorkSetResultKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final IsHomeWorkSetResult.Builder _builder;

        private Dsl(IsHomeWorkSetResult.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ IsHomeWorkSetResult _build() {
            IsHomeWorkSetResult isHomeWorkSetResultBuild = this._builder.build();
            x.e(isHomeWorkSetResultBuild, "build(...)");
            return isHomeWorkSetResultBuild;
        }

        public final void clearIsHomeSet() {
            this._builder.clearIsHomeSet();
        }

        public final void clearIsWorkSet() {
            this._builder.clearIsWorkSet();
        }

        public final boolean getIsHomeSet() {
            return this._builder.getIsHomeSet();
        }

        public final boolean getIsWorkSet() {
            return this._builder.getIsWorkSet();
        }

        public final void setIsHomeSet(boolean z) {
            this._builder.setIsHomeSet(z);
        }

        public final void setIsWorkSet(boolean z) {
            this._builder.setIsWorkSet(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(IsHomeWorkSetResult.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(IsHomeWorkSetResult.Builder builder, o oVar) {
            this(builder);
        }
    }
}
