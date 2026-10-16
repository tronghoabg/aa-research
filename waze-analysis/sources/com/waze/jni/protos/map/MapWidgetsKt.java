package com.waze.jni.protos.map;

import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.map.MapWidgets;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapWidgetsKt {
    public static final MapWidgetsKt INSTANCE = new MapWidgetsKt();

    private MapWidgetsKt() {
    }

    /* renamed from: -initializepill, reason: not valid java name */
    public final MapWidgets.Pill m26882initializepill(l<? super PillKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PillKt.Dsl.Companion companion = PillKt.Dsl.Companion;
        MapWidgets.Pill.Builder builderNewBuilder = MapWidgets.Pill.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PillKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class PillKt {
        public static final PillKt INSTANCE = new PillKt();

        private PillKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final MapWidgets.Pill.Builder _builder;

            private Dsl(MapWidgets.Pill.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ MapWidgets.Pill _build() {
                MapWidgets.Pill pillBuild = this._builder.build();
                x.e(pillBuild, "build(...)");
                return pillBuild;
            }

            public final void clearImage() {
                this._builder.clearImage();
            }

            public final void clearType() {
                this._builder.clearType();
            }

            public final NativeBitmap getImage() {
                NativeBitmap image = this._builder.getImage();
                x.e(image, "getImage(...)");
                return image;
            }

            public final NativeBitmap getImageOrNull(Dsl dsl) {
                x.f(dsl, "<this>");
                return MapWidgetsKtKt.getImageOrNull(dsl._builder);
            }

            public final MapWidgets.Pill.Type getType() {
                MapWidgets.Pill.Type type = this._builder.getType();
                x.e(type, "getType(...)");
                return type;
            }

            public final int getTypeValue() {
                return this._builder.getTypeValue();
            }

            public final boolean hasImage() {
                return this._builder.hasImage();
            }

            public final void setImage(NativeBitmap nativeBitmap) {
                x.f(nativeBitmap, "value");
                this._builder.setImage(nativeBitmap);
            }

            public final void setType(MapWidgets.Pill.Type type) {
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

                public final /* synthetic */ Dsl _create(MapWidgets.Pill.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(MapWidgets.Pill.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MapWidgets.Builder _builder;

        private Dsl(MapWidgets.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MapWidgets _build() {
            MapWidgets mapWidgetsBuild = this._builder.build();
            x.e(mapWidgetsBuild, "build(...)");
            return mapWidgetsBuild;
        }

        public final void clearActivePill() {
            this._builder.clearActivePill();
        }

        public final void clearShowLoadingIndicator() {
            this._builder.clearShowLoadingIndicator();
        }

        public final void clearShowSpeedometer() {
            this._builder.clearShowSpeedometer();
        }

        public final MapWidgets.Pill getActivePill() {
            MapWidgets.Pill activePill = this._builder.getActivePill();
            x.e(activePill, "getActivePill(...)");
            return activePill;
        }

        public final MapWidgets.Pill getActivePillOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return MapWidgetsKtKt.getActivePillOrNull(dsl._builder);
        }

        public final boolean getShowLoadingIndicator() {
            return this._builder.getShowLoadingIndicator();
        }

        public final boolean getShowSpeedometer() {
            return this._builder.getShowSpeedometer();
        }

        public final boolean hasActivePill() {
            return this._builder.hasActivePill();
        }

        public final void setActivePill(MapWidgets.Pill pill) {
            x.f(pill, "value");
            this._builder.setActivePill(pill);
        }

        public final void setShowLoadingIndicator(boolean z) {
            this._builder.setShowLoadingIndicator(z);
        }

        public final void setShowSpeedometer(boolean z) {
            this._builder.setShowSpeedometer(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MapWidgets.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MapWidgets.Builder builder, o oVar) {
            this(builder);
        }
    }
}
