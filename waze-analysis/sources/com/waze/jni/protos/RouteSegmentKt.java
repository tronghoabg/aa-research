package com.waze.jni.protos;

import com.waze.jni.protos.RouteSegment;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteSegmentKt {
    public static final RouteSegmentKt INSTANCE = new RouteSegmentKt();

    private RouteSegmentKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RouteSegment.Builder _builder;

        private Dsl(RouteSegment.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RouteSegment _build() {
            RouteSegment routeSegmentBuild = this._builder.build();
            x.e(routeSegmentBuild, "build(...)");
            return routeSegmentBuild;
        }

        public final void clearInstruction() {
            this._builder.clearInstruction();
        }

        public final void clearLengthMeters() {
            this._builder.clearLengthMeters();
        }

        public final NavigationInstruction getInstruction() {
            NavigationInstruction instruction = this._builder.getInstruction();
            x.e(instruction, "getInstruction(...)");
            return instruction;
        }

        public final NavigationInstruction getInstructionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return RouteSegmentKtKt.getInstructionOrNull(dsl._builder);
        }

        public final int getLengthMeters() {
            return this._builder.getLengthMeters();
        }

        public final boolean hasInstruction() {
            return this._builder.hasInstruction();
        }

        public final boolean hasLengthMeters() {
            return this._builder.hasLengthMeters();
        }

        public final void setInstruction(NavigationInstruction navigationInstruction) {
            x.f(navigationInstruction, "value");
            this._builder.setInstruction(navigationInstruction);
        }

        public final void setLengthMeters(int i2) {
            this._builder.setLengthMeters(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RouteSegment.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RouteSegment.Builder builder, o oVar) {
            this(builder);
        }
    }
}
