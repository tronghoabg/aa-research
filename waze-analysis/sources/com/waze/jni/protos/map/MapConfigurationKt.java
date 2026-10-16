package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapConfiguration;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapConfigurationKt {
    public static final MapConfigurationKt INSTANCE = new MapConfigurationKt();

    private MapConfigurationKt() {
    }

    /* renamed from: -initializecameraConfiguration, reason: not valid java name */
    public final MapConfiguration.CameraConfiguration m26593initializecameraConfiguration(l<? super CameraConfigurationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CameraConfigurationKt.Dsl.Companion companion = CameraConfigurationKt.Dsl.Companion;
        MapConfiguration.CameraConfiguration.Builder builderNewBuilder = MapConfiguration.CameraConfiguration.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CameraConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class CameraConfigurationKt {
        public static final CameraConfigurationKt INSTANCE = new CameraConfigurationKt();

        private CameraConfigurationKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapConfiguration.CameraConfiguration.Builder _builder;

            private Dsl(MapConfiguration.CameraConfiguration.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapConfiguration.CameraConfiguration _build() {
                MapConfiguration.CameraConfiguration cameraConfigurationBuild = this._builder.build();
                x.e(cameraConfigurationBuild, "build(...)");
                return cameraConfigurationBuild;
            }

            public final void clearHandleTouches() {
                this._builder.clearHandleTouches();
            }

            public final boolean getHandleTouches() {
                return this._builder.getHandleTouches();
            }

            public final void setHandleTouches(boolean z) {
                this._builder.setHandleTouches(z);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(MapConfiguration.CameraConfiguration.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapConfiguration.CameraConfiguration.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapConfiguration.Builder _builder;

        private Dsl(MapConfiguration.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapConfiguration _build() {
            MapConfiguration mapConfigurationBuild = this._builder.build();
            x.e(mapConfigurationBuild, "build(...)");
            return mapConfigurationBuild;
        }

        public final void clearCamera() {
            this._builder.clearCamera();
        }

        public final MapConfiguration.CameraConfiguration getCamera() {
            MapConfiguration.CameraConfiguration camera = this._builder.getCamera();
            x.e(camera, "getCamera(...)");
            return camera;
        }

        public final MapConfiguration.CameraConfiguration getCameraOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapConfigurationKtKt.getCameraOrNull(dsl._builder);
        }

        public final boolean hasCamera() {
            return this._builder.hasCamera();
        }

        public final void setCamera(MapConfiguration.CameraConfiguration cameraConfiguration) {
            x.f(cameraConfiguration, "value");
            this._builder.setCamera(cameraConfiguration);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapConfiguration.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapConfiguration.Builder builder, o oVar) {
            this(builder);
        }
    }
}
