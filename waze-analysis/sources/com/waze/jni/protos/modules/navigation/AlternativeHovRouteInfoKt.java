package com.waze.jni.protos.modules.navigation;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlternativeHovRouteInfoKt {
    public static final AlternativeHovRouteInfoKt INSTANCE = new AlternativeHovRouteInfoKt();

    private AlternativeHovRouteInfoKt() {
    }

    /* renamed from: -initializehovInfo, reason: not valid java name */
    public final AlternativeHovRouteInfo.HovInfo m27051initializehovInfo(l<? super HovInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        HovInfoKt.Dsl.Companion companion = HovInfoKt.Dsl.Companion;
        AlternativeHovRouteInfo.HovInfo.Builder builderNewBuilder = AlternativeHovRouteInfo.HovInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        HovInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class HovInfoKt {
        public static final HovInfoKt INSTANCE = new HovInfoKt();

        private HovInfoKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final AlternativeHovRouteInfo.HovInfo.Builder _builder;

            /* compiled from: WazeSource */
            public final class RequiredPermitsProxy extends c {
                private RequiredPermitsProxy() {
                }
            }

            private Dsl(AlternativeHovRouteInfo.HovInfo.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ AlternativeHovRouteInfo.HovInfo _build() {
                AlternativeHovRouteInfo.HovInfo hovInfoBuild = this._builder.build();
                x.e(hovInfoBuild, "build(...)");
                return hovInfoBuild;
            }

            public final /* synthetic */ void addAllRequiredPermits(a aVar, Iterable iterable) {
                x.f(aVar, "<this>");
                x.f(iterable, "values");
                this._builder.addAllRequiredPermits(iterable);
            }

            public final /* synthetic */ void addRequiredPermits(a aVar, String str) {
                x.f(aVar, "<this>");
                x.f(str, "value");
                this._builder.addRequiredPermits(str);
            }

            public final void clearMinPassengers() {
                this._builder.clearMinPassengers();
            }

            public final int getMinPassengers() {
                return this._builder.getMinPassengers();
            }

            public final a<String, RequiredPermitsProxy> getRequiredPermits() {
                List<String> requiredPermitsList = this._builder.getRequiredPermitsList();
                x.e(requiredPermitsList, "getRequiredPermitsList(...)");
                return new a<>(requiredPermitsList);
            }

            public final /* synthetic */ void plusAssignAllRequiredPermits(a<String, RequiredPermitsProxy> aVar, Iterable<String> iterable) {
                x.f(aVar, "<this>");
                x.f(iterable, "values");
                addAllRequiredPermits(aVar, iterable);
            }

            public final /* synthetic */ void plusAssignRequiredPermits(a<String, RequiredPermitsProxy> aVar, String str) {
                x.f(aVar, "<this>");
                x.f(str, "value");
                addRequiredPermits(aVar, str);
            }

            public final void setMinPassengers(int i2) {
                this._builder.setMinPassengers(i2);
            }

            public final /* synthetic */ void setRequiredPermits(a aVar, int i2, String str) {
                x.f(aVar, "<this>");
                x.f(str, "value");
                this._builder.setRequiredPermits(i2, str);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(AlternativeHovRouteInfo.HovInfo.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(AlternativeHovRouteInfo.HovInfo.Builder builder, o oVar) {
                this(builder);
            }

            public final /* synthetic */ void setRequiredPermits(a aVar) {
                x.f(aVar, "<this>");
                this._builder.clearRequiredPermits();
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AlternativeHovRouteInfo.Builder _builder;

        private Dsl(AlternativeHovRouteInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AlternativeHovRouteInfo _build() {
            AlternativeHovRouteInfo alternativeHovRouteInfoBuild = this._builder.build();
            x.e(alternativeHovRouteInfoBuild, "build(...)");
            return alternativeHovRouteInfoBuild;
        }

        public final void clearDurationSeconds() {
            this._builder.clearDurationSeconds();
        }

        public final void clearHovInfo() {
            this._builder.clearHovInfo();
        }

        public final int getDurationSeconds() {
            return this._builder.getDurationSeconds();
        }

        public final AlternativeHovRouteInfo.HovInfo getHovInfo() {
            AlternativeHovRouteInfo.HovInfo hovInfo = this._builder.getHovInfo();
            x.e(hovInfo, "getHovInfo(...)");
            return hovInfo;
        }

        public final AlternativeHovRouteInfo.HovInfo getHovInfoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return AlternativeHovRouteInfoKtKt.getHovInfoOrNull(dsl._builder);
        }

        public final boolean hasHovInfo() {
            return this._builder.hasHovInfo();
        }

        public final void setDurationSeconds(int i2) {
            this._builder.setDurationSeconds(i2);
        }

        public final void setHovInfo(AlternativeHovRouteInfo.HovInfo hovInfo) {
            x.f(hovInfo, "value");
            this._builder.setHovInfo(hovInfo);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AlternativeHovRouteInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AlternativeHovRouteInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
