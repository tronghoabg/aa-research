package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.navigate.TrafficZoneUpdate;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficZoneUpdateKt {
    public static final TrafficZoneUpdateKt INSTANCE = new TrafficZoneUpdateKt();

    private TrafficZoneUpdateKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TrafficZoneUpdate.Builder _builder;

        /* compiled from: WazeSource */
        public final class JamsProxy extends c {
            private JamsProxy() {
            }
        }

        private Dsl(TrafficZoneUpdate.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TrafficZoneUpdate _build() {
            TrafficZoneUpdate trafficZoneUpdateBuild = this._builder.build();
            x.e(trafficZoneUpdateBuild, "build(...)");
            return trafficZoneUpdateBuild;
        }

        public final /* synthetic */ void addAllJams(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllJams(iterable);
        }

        public final /* synthetic */ void addJams(a aVar, TrafficJamSection trafficJamSection) {
            x.f(aVar, "<this>");
            x.f(trafficJamSection, "value");
            this._builder.addJams(trafficJamSection);
        }

        public final /* synthetic */ void clearJams(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearJams();
        }

        public final void clearPercentInTraffic() {
            this._builder.clearPercentInTraffic();
        }

        public final void clearTotalTimeSec() {
            this._builder.clearTotalTimeSec();
        }

        public final /* synthetic */ a getJams() {
            List<TrafficJamSection> jamsList = this._builder.getJamsList();
            x.e(jamsList, "getJamsList(...)");
            return new a(jamsList);
        }

        public final int getPercentInTraffic() {
            return this._builder.getPercentInTraffic();
        }

        public final int getTotalTimeSec() {
            return this._builder.getTotalTimeSec();
        }

        public final boolean hasPercentInTraffic() {
            return this._builder.hasPercentInTraffic();
        }

        public final boolean hasTotalTimeSec() {
            return this._builder.hasTotalTimeSec();
        }

        public final /* synthetic */ void plusAssignAllJams(a<TrafficJamSection, JamsProxy> aVar, Iterable<TrafficJamSection> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllJams(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignJams(a<TrafficJamSection, JamsProxy> aVar, TrafficJamSection trafficJamSection) {
            x.f(aVar, "<this>");
            x.f(trafficJamSection, "value");
            addJams(aVar, trafficJamSection);
        }

        public final /* synthetic */ void setJams(a aVar, int i2, TrafficJamSection trafficJamSection) {
            x.f(aVar, "<this>");
            x.f(trafficJamSection, "value");
            this._builder.setJams(i2, trafficJamSection);
        }

        public final void setPercentInTraffic(int i2) {
            this._builder.setPercentInTraffic(i2);
        }

        public final void setTotalTimeSec(int i2) {
            this._builder.setTotalTimeSec(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TrafficZoneUpdate.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TrafficZoneUpdate.Builder builder, o oVar) {
            this(builder);
        }
    }
}
