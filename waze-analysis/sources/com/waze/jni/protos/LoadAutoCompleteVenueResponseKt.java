package com.waze.jni.protos;

import com.waze.jni.protos.LoadAutoCompleteVenueResponse;
import com.waze.jni.protos.places.Place;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadAutoCompleteVenueResponseKt {
    public static final LoadAutoCompleteVenueResponseKt INSTANCE = new LoadAutoCompleteVenueResponseKt();

    private LoadAutoCompleteVenueResponseKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LoadAutoCompleteVenueResponse.Builder _builder;

        private Dsl(LoadAutoCompleteVenueResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LoadAutoCompleteVenueResponse _build() {
            LoadAutoCompleteVenueResponse loadAutoCompleteVenueResponseBuild = this._builder.build();
            x.e(loadAutoCompleteVenueResponseBuild, "build(...)");
            return loadAutoCompleteVenueResponseBuild;
        }

        public final void clearPlace() {
            this._builder.clearPlace();
        }

        public final Place getPlace() {
            Place place = this._builder.getPlace();
            x.e(place, "getPlace(...)");
            return place;
        }

        public final Place getPlaceOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return LoadAutoCompleteVenueResponseKtKt.getPlaceOrNull(dsl._builder);
        }

        public final boolean hasPlace() {
            return this._builder.hasPlace();
        }

        public final void setPlace(Place place) {
            x.f(place, "value");
            this._builder.setPlace(place);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LoadAutoCompleteVenueResponse.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LoadAutoCompleteVenueResponse.Builder builder, o oVar) {
            this(builder);
        }
    }
}
