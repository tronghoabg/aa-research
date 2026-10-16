package com.waze.jni.protos.copilot.data;

import com.waze.jni.protos.copilot.data.AnalyticsSource;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnalyticsSourceKt {
    public static final AnalyticsSourceKt INSTANCE = new AnalyticsSourceKt();

    private AnalyticsSourceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AnalyticsSource.Builder _builder;

        private Dsl(AnalyticsSource.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AnalyticsSource _build() {
            AnalyticsSource analyticsSourceBuild = this._builder.build();
            x.e(analyticsSourceBuild, "build(...)");
            return analyticsSourceBuild;
        }

        public final void clearSource() {
            this._builder.clearSource();
        }

        public final AnalyticsSource.AssetChangeSource getSource() {
            AnalyticsSource.AssetChangeSource source = this._builder.getSource();
            x.e(source, "getSource(...)");
            return source;
        }

        public final int getSourceValue() {
            return this._builder.getSourceValue();
        }

        public final void setSource(AnalyticsSource.AssetChangeSource assetChangeSource) {
            x.f(assetChangeSource, "value");
            this._builder.setSource(assetChangeSource);
        }

        public final void setSourceValue(int i2) {
            this._builder.setSourceValue(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AnalyticsSource.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(AnalyticsSource.Builder builder, o oVar) {
            this(builder);
        }
    }
}
