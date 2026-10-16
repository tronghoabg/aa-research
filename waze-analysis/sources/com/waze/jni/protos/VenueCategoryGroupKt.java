package com.waze.jni.protos;

import com.waze.jni.protos.VenueCategoryGroup;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueCategoryGroupKt {
    public static final VenueCategoryGroupKt INSTANCE = new VenueCategoryGroupKt();

    private VenueCategoryGroupKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VenueCategoryGroup.Builder _builder;

        private Dsl(VenueCategoryGroup.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VenueCategoryGroup _build() {
            VenueCategoryGroup venueCategoryGroupBuild = this._builder.build();
            x.e(venueCategoryGroupBuild, "build(...)");
            return venueCategoryGroupBuild;
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearLabel() {
            this._builder.clearLabel();
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final String getLabel() {
            String label = this._builder.getLabel();
            x.e(label, "getLabel(...)");
            return label;
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        public final void setLabel(String str) {
            x.f(str, "value");
            this._builder.setLabel(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VenueCategoryGroup.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VenueCategoryGroup.Builder builder, o oVar) {
            this(builder);
        }
    }
}
