package com.waze.jni.protos.insights_infra;

import com.waze.jni.protos.insights_infra.NotificationId;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationIdKt {
    public static final NotificationIdKt INSTANCE = new NotificationIdKt();

    private NotificationIdKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NotificationId.Builder _builder;

        private Dsl(NotificationId.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NotificationId _build() {
            NotificationId notificationIdBuild = this._builder.build();
            x.e(notificationIdBuild, "build(...)");
            return notificationIdBuild;
        }

        public final void clearFeature() {
            this._builder.clearFeature();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final Feature getFeature() {
            Feature feature = this._builder.getFeature();
            x.e(feature, "getFeature(...)");
            return feature;
        }

        public final int getFeatureValue() {
            return this._builder.getFeatureValue();
        }

        public final String getId() {
            String id = this._builder.getId();
            x.e(id, "getId(...)");
            return id;
        }

        public final void setFeature(Feature feature) {
            x.f(feature, "value");
            this._builder.setFeature(feature);
        }

        public final void setFeatureValue(int i2) {
            this._builder.setFeatureValue(i2);
        }

        public final void setId(String str) {
            x.f(str, "value");
            this._builder.setId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NotificationId.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NotificationId.Builder builder, o oVar) {
            this(builder);
        }
    }
}
