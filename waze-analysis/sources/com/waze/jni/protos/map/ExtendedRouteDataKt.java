package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ExtendedRouteData;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import i.b.l.sl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedRouteDataKt {
    public static final ExtendedRouteDataKt INSTANCE = new ExtendedRouteDataKt();

    private ExtendedRouteDataKt() {
    }

    /* renamed from: -initializerouteStyle, reason: not valid java name */
    public final ExtendedRouteData.RouteStyle m26487initializerouteStyle(l<? super RouteStyleKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RouteStyleKt.Dsl.Companion companion = RouteStyleKt.Dsl.Companion;
        ExtendedRouteData.RouteStyle.Builder builderNewBuilder = ExtendedRouteData.RouteStyle.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RouteStyleKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class RouteStyleKt {
        public static final RouteStyleKt INSTANCE = new RouteStyleKt();

        private RouteStyleKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final ExtendedRouteData.RouteStyle.Builder _builder;

            private Dsl(ExtendedRouteData.RouteStyle.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ ExtendedRouteData.RouteStyle _build() {
                ExtendedRouteData.RouteStyle routeStyleBuild = this._builder.build();
                x.e(routeStyleBuild, "build(...)");
                return routeStyleBuild;
            }

            public final void clearType() {
                this._builder.clearType();
            }

            public final ExtendedRouteData.RouteStyle.Type getType() {
                ExtendedRouteData.RouteStyle.Type type = this._builder.getType();
                x.e(type, "getType(...)");
                return type;
            }

            public final int getTypeValue() {
                return this._builder.getTypeValue();
            }

            public final void setType(ExtendedRouteData.RouteStyle.Type type) {
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

                public final /* synthetic */ Dsl _create(ExtendedRouteData.RouteStyle.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(ExtendedRouteData.RouteStyle.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ExtendedRouteData.Builder _builder;

        private Dsl(ExtendedRouteData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ExtendedRouteData _build() {
            ExtendedRouteData extendedRouteDataBuild = this._builder.build();
            x.e(extendedRouteDataBuild, "build(...)");
            return extendedRouteDataBuild;
        }

        public final void clearAnimationParams() {
            this._builder.clearAnimationParams();
        }

        public final void clearOptions() {
            this._builder.clearOptions();
        }

        public final void clearRouteProto() {
            this._builder.clearRouteProto();
        }

        public final void clearStyle() {
            this._builder.clearStyle();
        }

        public final AnimationParams getAnimationParams() {
            AnimationParams animationParams = this._builder.getAnimationParams();
            x.e(animationParams, "getAnimationParams(...)");
            return animationParams;
        }

        public final AnimationParams getAnimationParamsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedRouteDataKtKt.getAnimationParamsOrNull(dsl._builder);
        }

        public final RouteOption getOptions() {
            RouteOption options = this._builder.getOptions();
            x.e(options, "getOptions(...)");
            return options;
        }

        public final RouteOption getOptionsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedRouteDataKtKt.getOptionsOrNull(dsl._builder);
        }

        public final sl getRouteProto() {
            sl routeProto = this._builder.getRouteProto();
            x.e(routeProto, "getRouteProto(...)");
            return routeProto;
        }

        public final sl getRouteProtoOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedRouteDataKtKt.getRouteProtoOrNull(dsl._builder);
        }

        public final ExtendedRouteData.RouteStyle getStyle() {
            ExtendedRouteData.RouteStyle style = this._builder.getStyle();
            x.e(style, "getStyle(...)");
            return style;
        }

        public final ExtendedRouteData.RouteStyle getStyleOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return ExtendedRouteDataKtKt.getStyleOrNull(dsl._builder);
        }

        public final boolean hasAnimationParams() {
            return this._builder.hasAnimationParams();
        }

        public final boolean hasOptions() {
            return this._builder.hasOptions();
        }

        public final boolean hasRouteProto() {
            return this._builder.hasRouteProto();
        }

        public final boolean hasStyle() {
            return this._builder.hasStyle();
        }

        public final void setAnimationParams(AnimationParams animationParams) {
            x.f(animationParams, "value");
            this._builder.setAnimationParams(animationParams);
        }

        public final void setOptions(RouteOption routeOption) {
            x.f(routeOption, "value");
            this._builder.setOptions(routeOption);
        }

        public final void setRouteProto(sl slVar) {
            x.f(slVar, "value");
            this._builder.setRouteProto(slVar);
        }

        public final void setStyle(ExtendedRouteData.RouteStyle routeStyle) {
            x.f(routeStyle, "value");
            this._builder.setStyle(routeStyle);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ExtendedRouteData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(ExtendedRouteData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
