package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.map.DisplayRects;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DisplayRectsKt {
    public static final DisplayRectsKt INSTANCE = new DisplayRectsKt();

    private DisplayRectsKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DisplayRects.Builder _builder;

        /* compiled from: WazeSource */
        public final class DisplayRectsProxy extends c {
            private DisplayRectsProxy() {
            }
        }

        private Dsl(DisplayRects.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DisplayRects _build() {
            DisplayRects displayRectsBuild = this._builder.build();
            x.e(displayRectsBuild, "build(...)");
            return displayRectsBuild;
        }

        public final /* synthetic */ void addAllDisplayRects(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllDisplayRects(iterable);
        }

        public final /* synthetic */ void addDisplayRects(a aVar, DisplayRect displayRect) {
            x.f(aVar, "<this>");
            x.f(displayRect, "value");
            this._builder.addDisplayRects(displayRect);
        }

        public final /* synthetic */ void clearDisplayRects(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearDisplayRects();
        }

        public final /* synthetic */ a getDisplayRects() {
            List<DisplayRect> displayRectsList = this._builder.getDisplayRectsList();
            x.e(displayRectsList, "getDisplayRectsList(...)");
            return new a(displayRectsList);
        }

        public final /* synthetic */ void plusAssignAllDisplayRects(a<DisplayRect, DisplayRectsProxy> aVar, Iterable<DisplayRect> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllDisplayRects(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignDisplayRects(a<DisplayRect, DisplayRectsProxy> aVar, DisplayRect displayRect) {
            x.f(aVar, "<this>");
            x.f(displayRect, "value");
            addDisplayRects(aVar, displayRect);
        }

        public final /* synthetic */ void setDisplayRects(a aVar, int i2, DisplayRect displayRect) {
            x.f(aVar, "<this>");
            x.f(displayRect, "value");
            this._builder.setDisplayRects(i2, displayRect);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(DisplayRects.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(DisplayRects.Builder builder, o oVar) {
            this(builder);
        }
    }
}
