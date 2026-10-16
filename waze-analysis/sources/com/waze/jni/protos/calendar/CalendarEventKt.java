package com.waze.jni.protos.calendar;

import com.waze.jni.protos.calendar.CalendarEvent;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CalendarEventKt {
    public static final CalendarEventKt INSTANCE = new CalendarEventKt();

    private CalendarEventKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CalendarEvent.Builder _builder;

        private Dsl(CalendarEvent.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ CalendarEvent _build() {
            CalendarEvent calendarEventBuild = this._builder.build();
            x.e(calendarEventBuild, "build(...)");
            return calendarEventBuild;
        }

        public final void clearAddress() {
            this._builder.clearAddress();
        }

        public final void clearRecurring() {
            this._builder.clearRecurring();
        }

        public final String getAddress() {
            String address = this._builder.getAddress();
            x.e(address, "getAddress(...)");
            return address;
        }

        public final boolean getRecurring() {
            return this._builder.getRecurring();
        }

        public final boolean hasAddress() {
            return this._builder.hasAddress();
        }

        public final boolean hasRecurring() {
            return this._builder.hasRecurring();
        }

        public final void setAddress(String str) {
            x.f(str, "value");
            this._builder.setAddress(str);
        }

        public final void setRecurring(boolean z) {
            this._builder.setRecurring(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(CalendarEvent.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(CalendarEvent.Builder builder, o oVar) {
            this(builder);
        }
    }
}
