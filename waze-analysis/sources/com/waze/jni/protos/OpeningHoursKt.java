package com.waze.jni.protos;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.OpeningHours;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class OpeningHoursKt {
    public static final OpeningHoursKt INSTANCE = new OpeningHoursKt();

    private OpeningHoursKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OpeningHours.Builder _builder;

        /* compiled from: WazeSource */
        public final class DaysProxy extends c {
            private DaysProxy() {
            }
        }

        private Dsl(OpeningHours.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ OpeningHours _build() {
            OpeningHours openingHoursBuild = this._builder.build();
            x.e(openingHoursBuild, "build(...)");
            return openingHoursBuild;
        }

        public final /* synthetic */ void addAllDays(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllDays(iterable);
        }

        public final /* synthetic */ void addDays(a aVar, int i2) {
            x.f(aVar, "<this>");
            this._builder.addDays(i2);
        }

        public final /* synthetic */ void clearDays(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearDays();
        }

        public final void clearFrom() {
            this._builder.clearFrom();
        }

        public final void clearTo() {
            this._builder.clearTo();
        }

        public final /* synthetic */ a getDays() {
            List<Integer> daysList = this._builder.getDaysList();
            x.e(daysList, "getDaysList(...)");
            return new a(daysList);
        }

        public final String getFrom() {
            String from = this._builder.getFrom();
            x.e(from, "getFrom(...)");
            return from;
        }

        public final String getTo() {
            String to = this._builder.getTo();
            x.e(to, "getTo(...)");
            return to;
        }

        public final boolean hasFrom() {
            return this._builder.hasFrom();
        }

        public final boolean hasTo() {
            return this._builder.hasTo();
        }

        public final /* synthetic */ void plusAssignAllDays(a<Integer, DaysProxy> aVar, Iterable<Integer> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllDays(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignDays(a<Integer, DaysProxy> aVar, int i2) {
            x.f(aVar, "<this>");
            addDays(aVar, i2);
        }

        public final /* synthetic */ void setDays(a aVar, int i2, int i3) {
            x.f(aVar, "<this>");
            this._builder.setDays(i2, i3);
        }

        public final void setFrom(String str) {
            x.f(str, "value");
            this._builder.setFrom(str);
        }

        public final void setTo(String str) {
            x.f(str, "value");
            this._builder.setTo(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(OpeningHours.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(OpeningHours.Builder builder, o oVar) {
            this(builder);
        }
    }
}
