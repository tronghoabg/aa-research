package com.waze.jni.protos.places;

import com.waze.jni.protos.places.RecentPlace;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RecentPlaceKt {
    public static final RecentPlaceKt INSTANCE = new RecentPlaceKt();

    private RecentPlaceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RecentPlace.Builder _builder;

        private Dsl(RecentPlace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RecentPlace _build() {
            RecentPlace recentPlaceBuild = this._builder.build();
            x.e(recentPlaceBuild, "build(...)");
            return recentPlaceBuild;
        }

        public final void clearAccessTimeSec() {
            this._builder.clearAccessTimeSec();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearImageId() {
            this._builder.clearImageId();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearShouldConfirmLocationUpdate() {
            this._builder.clearShouldConfirmLocationUpdate();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearWaypointAccessTimeSec() {
            this._builder.clearWaypointAccessTimeSec();
        }

        public final long getAccessTimeSec() {
            return this._builder.getAccessTimeSec();
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final String getImageId() {
            String imageId = this._builder.getImageId();
            x.e(imageId, "getImageId(...)");
            return imageId;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final boolean getShouldConfirmLocationUpdate() {
            return this._builder.getShouldConfirmLocationUpdate();
        }

        public final RecentPlaceType getType() {
            RecentPlaceType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final long getWaypointAccessTimeSec() {
            return this._builder.getWaypointAccessTimeSec();
        }

        public final void setAccessTimeSec(long j2) {
            this._builder.setAccessTimeSec(j2);
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final void setImageId(String str) {
            x.f(str, "value");
            this._builder.setImageId(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setShouldConfirmLocationUpdate(boolean z) {
            this._builder.setShouldConfirmLocationUpdate(z);
        }

        public final void setType(RecentPlaceType recentPlaceType) {
            x.f(recentPlaceType, "value");
            this._builder.setType(recentPlaceType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setWaypointAccessTimeSec(long j2) {
            this._builder.setWaypointAccessTimeSec(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(RecentPlace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(RecentPlace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
