package com.waze.jni.protos.places;

import com.waze.jni.protos.places.PlaceFormatTitleSubtitle;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceFormatTitleSubtitleKt {
    public static final PlaceFormatTitleSubtitleKt INSTANCE = new PlaceFormatTitleSubtitleKt();

    private PlaceFormatTitleSubtitleKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PlaceFormatTitleSubtitle.Builder _builder;

        private Dsl(PlaceFormatTitleSubtitle.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PlaceFormatTitleSubtitle _build() {
            PlaceFormatTitleSubtitle placeFormatTitleSubtitleBuild = this._builder.build();
            x.e(placeFormatTitleSubtitleBuild, "build(...)");
            return placeFormatTitleSubtitleBuild;
        }

        public final void clearSubtitle() {
            this._builder.clearSubtitle();
        }

        public final void clearTitle() {
            this._builder.clearTitle();
        }

        public final String getSubtitle() {
            String subtitle = this._builder.getSubtitle();
            x.e(subtitle, "getSubtitle(...)");
            return subtitle;
        }

        public final String getTitle() {
            String title = this._builder.getTitle();
            x.e(title, "getTitle(...)");
            return title;
        }

        public final void setSubtitle(String str) {
            x.f(str, "value");
            this._builder.setSubtitle(str);
        }

        public final void setTitle(String str) {
            x.f(str, "value");
            this._builder.setTitle(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PlaceFormatTitleSubtitle.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PlaceFormatTitleSubtitle.Builder builder, o oVar) {
            this(builder);
        }
    }
}
