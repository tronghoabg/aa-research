package com.waze.jni.protos.map;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.map.EventsOnRoute;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import i.b.l.rf;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventsOnRouteKt {
    public static final EventsOnRouteKt INSTANCE = new EventsOnRouteKt();

    private EventsOnRouteKt() {
    }

    /* renamed from: -initializeeventOnRouteAnimationParams, reason: not valid java name */
    public final EventsOnRoute.EventOnRouteAnimationParams m26437initializeeventOnRouteAnimationParams(l<? super EventOnRouteAnimationParamsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EventOnRouteAnimationParamsKt.Dsl.Companion companion = EventOnRouteAnimationParamsKt.Dsl.Companion;
        EventsOnRoute.EventOnRouteAnimationParams.Builder builderNewBuilder = EventsOnRoute.EventOnRouteAnimationParams.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EventOnRouteAnimationParamsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WazeSource */
    public final class EventOnRouteAnimationParamsKt {
        public static final EventOnRouteAnimationParamsKt INSTANCE = new EventOnRouteAnimationParamsKt();

        private EventOnRouteAnimationParamsKt() {
        }

        /* compiled from: WazeSource */
        public final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final EventsOnRoute.EventOnRouteAnimationParams.Builder _builder;

            private Dsl(EventsOnRoute.EventOnRouteAnimationParams.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ EventsOnRoute.EventOnRouteAnimationParams _build() {
                EventsOnRoute.EventOnRouteAnimationParams eventOnRouteAnimationParamsBuild = this._builder.build();
                x.e(eventOnRouteAnimationParamsBuild, "build(...)");
                return eventOnRouteAnimationParamsBuild;
            }

            public final void clearAnimationStartTimeMs() {
                this._builder.clearAnimationStartTimeMs();
            }

            public final long getAnimationStartTimeMs() {
                return this._builder.getAnimationStartTimeMs();
            }

            public final void setAnimationStartTimeMs(long j2) {
                this._builder.setAnimationStartTimeMs(j2);
            }

            /* compiled from: WazeSource */
            public final class Companion {
                private Companion() {
                }

                public final /* synthetic */ Dsl _create(EventsOnRoute.EventOnRouteAnimationParams.Builder builder) {
                    x.f(builder, "builder");
                    return new Dsl(builder, null);
                }

                public /* synthetic */ Companion(o oVar) {
                    this();
                }
            }

            public /* synthetic */ Dsl(EventsOnRoute.EventOnRouteAnimationParams.Builder builder, o oVar) {
                this(builder);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EventsOnRoute.Builder _builder;

        /* compiled from: WazeSource */
        public final class EventProxy extends c {
            private EventProxy() {
            }
        }

        private Dsl(EventsOnRoute.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EventsOnRoute _build() {
            EventsOnRoute eventsOnRouteBuild = this._builder.build();
            x.e(eventsOnRouteBuild, "build(...)");
            return eventsOnRouteBuild;
        }

        public final /* synthetic */ void addAllEvent(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllEvent(iterable);
        }

        public final /* synthetic */ void addEvent(a aVar, rf rfVar) {
            x.f(aVar, "<this>");
            x.f(rfVar, "value");
            this._builder.addEvent(rfVar);
        }

        public final /* synthetic */ void clearEvent(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearEvent();
        }

        public final void clearEventOnRouteAnimationParams() {
            this._builder.clearEventOnRouteAnimationParams();
        }

        public final void clearIsSelected() {
            this._builder.clearIsSelected();
        }

        public final /* synthetic */ a getEvent() {
            List<rf> eventList = this._builder.getEventList();
            x.e(eventList, "getEventList(...)");
            return new a(eventList);
        }

        public final EventsOnRoute.EventOnRouteAnimationParams getEventOnRouteAnimationParams() {
            EventsOnRoute.EventOnRouteAnimationParams eventOnRouteAnimationParams = this._builder.getEventOnRouteAnimationParams();
            x.e(eventOnRouteAnimationParams, "getEventOnRouteAnimationParams(...)");
            return eventOnRouteAnimationParams;
        }

        public final EventsOnRoute.EventOnRouteAnimationParams getEventOnRouteAnimationParamsOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EventsOnRouteKtKt.getEventOnRouteAnimationParamsOrNull(dsl._builder);
        }

        public final boolean getIsSelected() {
            return this._builder.getIsSelected();
        }

        public final boolean hasEventOnRouteAnimationParams() {
            return this._builder.hasEventOnRouteAnimationParams();
        }

        public final /* synthetic */ void plusAssignAllEvent(a<rf, EventProxy> aVar, Iterable<rf> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllEvent(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignEvent(a<rf, EventProxy> aVar, rf rfVar) {
            x.f(aVar, "<this>");
            x.f(rfVar, "value");
            addEvent(aVar, rfVar);
        }

        public final /* synthetic */ void setEvent(a aVar, int i2, rf rfVar) {
            x.f(aVar, "<this>");
            x.f(rfVar, "value");
            this._builder.setEvent(i2, rfVar);
        }

        public final void setEventOnRouteAnimationParams(EventsOnRoute.EventOnRouteAnimationParams eventOnRouteAnimationParams) {
            x.f(eventOnRouteAnimationParams, "value");
            this._builder.setEventOnRouteAnimationParams(eventOnRouteAnimationParams);
        }

        public final void setIsSelected(boolean z) {
            this._builder.setIsSelected(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EventsOnRoute.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EventsOnRoute.Builder builder, o oVar) {
            this(builder);
        }
    }
}
