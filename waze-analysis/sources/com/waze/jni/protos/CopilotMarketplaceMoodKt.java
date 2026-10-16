package com.waze.jni.protos;

import com.waze.jni.protos.CopilotMarketplaceMood;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceMoodKt {
    public static final CopilotMarketplaceMoodKt INSTANCE = new CopilotMarketplaceMoodKt();

    private CopilotMarketplaceMoodKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CopilotMarketplaceMood.Builder _builder;

        private Dsl(CopilotMarketplaceMood.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CopilotMarketplaceMood _build() {
            CopilotMarketplaceMood copilotMarketplaceMoodBuild = this._builder.build();
            x.e(copilotMarketplaceMoodBuild, "build(...)");
            return copilotMarketplaceMoodBuild;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearIsAds() {
            this._builder.clearIsAds();
        }

        public final void clearIsHidden() {
            this._builder.clearIsHidden();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final boolean getIsAds() {
            return this._builder.getIsAds();
        }

        public final boolean getIsHidden() {
            return this._builder.getIsHidden();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final void setIsAds(boolean z) {
            this._builder.setIsAds(z);
        }

        public final void setIsHidden(boolean z) {
            this._builder.setIsHidden(z);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CopilotMarketplaceMood.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CopilotMarketplaceMood.Builder builder, o oVar) {
            this(builder);
        }
    }
}
