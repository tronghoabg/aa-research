package com.waze.jni.protos.view.bottom;

import com.waze.jni.protos.view.bottom.BottomNotificationJni;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BottomNotificationJniKt {
    public static final BottomNotificationJniKt INSTANCE = new BottomNotificationJniKt();

    private BottomNotificationJniKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BottomNotificationJni.Builder _builder;

        private Dsl(BottomNotificationJni.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ BottomNotificationJni _build() {
            BottomNotificationJni bottomNotificationJniBuild = this._builder.build();
            x.e(bottomNotificationJniBuild, "build(...)");
            return bottomNotificationJniBuild;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(BottomNotificationJni.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(BottomNotificationJni.Builder builder, o oVar) {
            this(builder);
        }
    }
}
