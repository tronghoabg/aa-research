package com.waze.jni.protos;

import com.waze.jni.protos.LoadAutoCompleteVenueRequest;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadAutoCompleteVenueRequestKt {
    public static final LoadAutoCompleteVenueRequestKt INSTANCE = new LoadAutoCompleteVenueRequestKt();

    private LoadAutoCompleteVenueRequestKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final LoadAutoCompleteVenueRequest.Builder _builder;

        private Dsl(LoadAutoCompleteVenueRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ LoadAutoCompleteVenueRequest _build() {
            LoadAutoCompleteVenueRequest loadAutoCompleteVenueRequestBuild = this._builder.build();
            x.e(loadAutoCompleteVenueRequestBuild, "build(...)");
            return loadAutoCompleteVenueRequestBuild;
        }

        public final void clearAutocompleteQuery() {
            this._builder.clearAutocompleteQuery();
        }

        public final void clearAutocompleteResponse() {
            this._builder.clearAutocompleteResponse();
        }

        public final void clearVenueContext() {
            this._builder.clearVenueContext();
        }

        public final void clearVenueId() {
            this._builder.clearVenueId();
        }

        public final String getAutocompleteQuery() {
            String autocompleteQuery = this._builder.getAutocompleteQuery();
            x.e(autocompleteQuery, "getAutocompleteQuery(...)");
            return autocompleteQuery;
        }

        public final String getAutocompleteResponse() {
            String autocompleteResponse = this._builder.getAutocompleteResponse();
            x.e(autocompleteResponse, "getAutocompleteResponse(...)");
            return autocompleteResponse;
        }

        public final String getVenueContext() {
            String venueContext = this._builder.getVenueContext();
            x.e(venueContext, "getVenueContext(...)");
            return venueContext;
        }

        public final String getVenueId() {
            String venueId = this._builder.getVenueId();
            x.e(venueId, "getVenueId(...)");
            return venueId;
        }

        public final boolean hasAutocompleteQuery() {
            return this._builder.hasAutocompleteQuery();
        }

        public final boolean hasAutocompleteResponse() {
            return this._builder.hasAutocompleteResponse();
        }

        public final boolean hasVenueContext() {
            return this._builder.hasVenueContext();
        }

        public final boolean hasVenueId() {
            return this._builder.hasVenueId();
        }

        public final void setAutocompleteQuery(String str) {
            x.f(str, "value");
            this._builder.setAutocompleteQuery(str);
        }

        public final void setAutocompleteResponse(String str) {
            x.f(str, "value");
            this._builder.setAutocompleteResponse(str);
        }

        public final void setVenueContext(String str) {
            x.f(str, "value");
            this._builder.setVenueContext(str);
        }

        public final void setVenueId(String str) {
            x.f(str, "value");
            this._builder.setVenueId(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(LoadAutoCompleteVenueRequest.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(LoadAutoCompleteVenueRequest.Builder builder, o oVar) {
            this(builder);
        }
    }
}
