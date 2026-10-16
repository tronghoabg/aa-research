package com.waze.jni.protos;

import com.waze.jni.protos.VenueImage;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueImageKt {
    public static final VenueImageKt INSTANCE = new VenueImageKt();

    private VenueImageKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final VenueImage.Builder _builder;

        private Dsl(VenueImage.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ VenueImage _build() {
            VenueImage venueImageBuild = this._builder.build();
            x.e(venueImageBuild, "build(...)");
            return venueImageBuild;
        }

        public final void clearByMe() {
            this._builder.clearByMe();
        }

        public final void clearLiked() {
            this._builder.clearLiked();
        }

        public final void clearReporter() {
            this._builder.clearReporter();
        }

        public final void clearThumbnailUrl() {
            this._builder.clearThumbnailUrl();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final boolean getByMe() {
            return this._builder.getByMe();
        }

        public final boolean getLiked() {
            return this._builder.getLiked();
        }

        public final Reporter getReporter() {
            Reporter reporter = this._builder.getReporter();
            x.e(reporter, "getReporter(...)");
            return reporter;
        }

        public final Reporter getReporterOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return VenueImageKtKt.getReporterOrNull(dsl._builder);
        }

        public final String getThumbnailUrl() {
            String thumbnailUrl = this._builder.getThumbnailUrl();
            x.e(thumbnailUrl, "getThumbnailUrl(...)");
            return thumbnailUrl;
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            x.e(url, "getUrl(...)");
            return url;
        }

        public final boolean hasByMe() {
            return this._builder.hasByMe();
        }

        public final boolean hasLiked() {
            return this._builder.hasLiked();
        }

        public final boolean hasReporter() {
            return this._builder.hasReporter();
        }

        public final boolean hasThumbnailUrl() {
            return this._builder.hasThumbnailUrl();
        }

        public final boolean hasUrl() {
            return this._builder.hasUrl();
        }

        public final void setByMe(boolean z) {
            this._builder.setByMe(z);
        }

        public final void setLiked(boolean z) {
            this._builder.setLiked(z);
        }

        public final void setReporter(Reporter reporter) {
            x.f(reporter, "value");
            this._builder.setReporter(reporter);
        }

        public final void setThumbnailUrl(String str) {
            x.f(str, "value");
            this._builder.setThumbnailUrl(str);
        }

        public final void setUrl(String str) {
            x.f(str, "value");
            this._builder.setUrl(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(VenueImage.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(VenueImage.Builder builder, o oVar) {
            this(builder);
        }
    }
}
