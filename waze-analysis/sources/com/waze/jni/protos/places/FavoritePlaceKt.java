package com.waze.jni.protos.places;

import com.waze.jni.protos.places.FavoritePlace;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FavoritePlaceKt {
    public static final FavoritePlaceKt INSTANCE = new FavoritePlaceKt();

    private FavoritePlaceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FavoritePlace.Builder _builder;

        private Dsl(FavoritePlace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ FavoritePlace _build() {
            FavoritePlace favoritePlaceBuild = this._builder.build();
            x.e(favoritePlaceBuild, "build(...)");
            return favoritePlaceBuild;
        }

        public final void clearAccessTimeSec() {
            this._builder.clearAccessTimeSec();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearModifiedTime() {
            this._builder.clearModifiedTime();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRank() {
            this._builder.clearRank();
        }

        public final void clearServerId() {
            this._builder.clearServerId();
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

        public final int getModifiedTime() {
            return this._builder.getModifiedTime();
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final int getRank() {
            return this._builder.getRank();
        }

        public final long getServerId() {
            return this._builder.getServerId();
        }

        public final FavoritePlaceType getType() {
            FavoritePlaceType type = this._builder.getType();
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

        public final void setModifiedTime(int i2) {
            this._builder.setModifiedTime(i2);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setRank(int i2) {
            this._builder.setRank(i2);
        }

        public final void setServerId(long j2) {
            this._builder.setServerId(j2);
        }

        public final void setType(FavoritePlaceType favoritePlaceType) {
            x.f(favoritePlaceType, "value");
            this._builder.setType(favoritePlaceType);
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

            public final /* synthetic */ Dsl _create(FavoritePlace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(FavoritePlace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
