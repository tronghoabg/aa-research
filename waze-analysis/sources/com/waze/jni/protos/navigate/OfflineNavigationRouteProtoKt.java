package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.RouteSegment;
import com.waze.jni.protos.navigate.OfflineNavigationRouteProto;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class OfflineNavigationRouteProtoKt {
    public static final OfflineNavigationRouteProtoKt INSTANCE = new OfflineNavigationRouteProtoKt();

    private OfflineNavigationRouteProtoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OfflineNavigationRouteProto.Builder _builder;

        /* compiled from: WazeSource */
        public final class SegmentsProxy extends c {
            private SegmentsProxy() {
            }
        }

        private Dsl(OfflineNavigationRouteProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ OfflineNavigationRouteProto _build() {
            OfflineNavigationRouteProto offlineNavigationRouteProtoBuild = this._builder.build();
            x.e(offlineNavigationRouteProtoBuild, "build(...)");
            return offlineNavigationRouteProtoBuild;
        }

        public final /* synthetic */ void addAllSegments(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllSegments(iterable);
        }

        public final /* synthetic */ void addSegments(a aVar, RouteSegment routeSegment) {
            x.f(aVar, "<this>");
            x.f(routeSegment, "value");
            this._builder.addSegments(routeSegment);
        }

        public final void clearIsReroute() {
            this._builder.clearIsReroute();
        }

        public final void clearRouteUUID() {
            this._builder.clearRouteUUID();
        }

        public final /* synthetic */ void clearSegments(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearSegments();
        }

        public final boolean getIsReroute() {
            return this._builder.getIsReroute();
        }

        public final String getRouteUUID() {
            String routeUUID = this._builder.getRouteUUID();
            x.e(routeUUID, "getRouteUUID(...)");
            return routeUUID;
        }

        public final /* synthetic */ a getSegments() {
            List<RouteSegment> segmentsList = this._builder.getSegmentsList();
            x.e(segmentsList, "getSegmentsList(...)");
            return new a(segmentsList);
        }

        public final /* synthetic */ void plusAssignAllSegments(a<RouteSegment, SegmentsProxy> aVar, Iterable<RouteSegment> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllSegments(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignSegments(a<RouteSegment, SegmentsProxy> aVar, RouteSegment routeSegment) {
            x.f(aVar, "<this>");
            x.f(routeSegment, "value");
            addSegments(aVar, routeSegment);
        }

        public final void setIsReroute(boolean z) {
            this._builder.setIsReroute(z);
        }

        public final void setRouteUUID(String str) {
            x.f(str, "value");
            this._builder.setRouteUUID(str);
        }

        public final /* synthetic */ void setSegments(a aVar, int i2, RouteSegment routeSegment) {
            x.f(aVar, "<this>");
            x.f(routeSegment, "value");
            this._builder.setSegments(i2, routeSegment);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(OfflineNavigationRouteProto.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(OfflineNavigationRouteProto.Builder builder, o oVar) {
            this(builder);
        }
    }
}
