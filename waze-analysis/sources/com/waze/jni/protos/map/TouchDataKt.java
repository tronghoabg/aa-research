package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.map.TouchData;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TouchDataKt {
    public static final TouchDataKt INSTANCE = new TouchDataKt();

    private TouchDataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TouchData.Builder _builder;

        /* compiled from: WazeSource */
        public final class PointsProxy extends c {
            private PointsProxy() {
            }
        }

        private Dsl(TouchData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TouchData _build() {
            TouchData touchDataBuild = this._builder.build();
            x.e(touchDataBuild, "build(...)");
            return touchDataBuild;
        }

        public final /* synthetic */ void addAllPoints(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllPoints(iterable);
        }

        public final /* synthetic */ void addPoints(a aVar, TouchPoint touchPoint) {
            x.f(aVar, "<this>");
            x.f(touchPoint, "value");
            this._builder.addPoints(touchPoint);
        }

        public final /* synthetic */ void clearPoints(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearPoints();
        }

        public final void clearTimestampMs() {
            this._builder.clearTimestampMs();
        }

        public final /* synthetic */ a getPoints() {
            List<TouchPoint> pointsList = this._builder.getPointsList();
            x.e(pointsList, "getPointsList(...)");
            return new a(pointsList);
        }

        public final long getTimestampMs() {
            return this._builder.getTimestampMs();
        }

        public final /* synthetic */ void plusAssignAllPoints(a<TouchPoint, PointsProxy> aVar, Iterable<TouchPoint> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllPoints(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignPoints(a<TouchPoint, PointsProxy> aVar, TouchPoint touchPoint) {
            x.f(aVar, "<this>");
            x.f(touchPoint, "value");
            addPoints(aVar, touchPoint);
        }

        public final /* synthetic */ void setPoints(a aVar, int i2, TouchPoint touchPoint) {
            x.f(aVar, "<this>");
            x.f(touchPoint, "value");
            this._builder.setPoints(i2, touchPoint);
        }

        public final void setTimestampMs(long j2) {
            this._builder.setTimestampMs(j2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TouchData.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TouchData.Builder builder, o oVar) {
            this(builder);
        }
    }
}
