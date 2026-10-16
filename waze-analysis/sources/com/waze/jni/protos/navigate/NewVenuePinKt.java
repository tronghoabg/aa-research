package com.waze.jni.protos.navigate;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.navigate.NewVenuePin;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NewVenuePinKt {
    public static final NewVenuePinKt INSTANCE = new NewVenuePinKt();

    private NewVenuePinKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NewVenuePin.Builder _builder;

        private Dsl(NewVenuePin.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NewVenuePin _build() {
            NewVenuePin newVenuePinBuild = this._builder.build();
            x.e(newVenuePinBuild, "build(...)");
            return newVenuePinBuild;
        }

        public final void clearShowInitialPopup() {
            this._builder.clearShowInitialPopup();
        }

        public final void clearVenue() {
            this._builder.clearVenue();
        }

        public final boolean getShowInitialPopup() {
            return this._builder.getShowInitialPopup();
        }

        public final VenueData getVenue() {
            VenueData venue = this._builder.getVenue();
            x.e(venue, "getVenue(...)");
            return venue;
        }

        public final VenueData getVenueOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NewVenuePinKtKt.getVenueOrNull(dsl._builder);
        }

        public final boolean hasVenue() {
            return this._builder.hasVenue();
        }

        public final void setShowInitialPopup(boolean z) {
            this._builder.setShowInitialPopup(z);
        }

        public final void setVenue(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setVenue(venueData);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NewVenuePin.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NewVenuePin.Builder builder, o oVar) {
            this(builder);
        }
    }
}
