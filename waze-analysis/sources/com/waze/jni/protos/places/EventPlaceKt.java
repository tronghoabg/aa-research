package com.waze.jni.protos.places;

import com.waze.jni.protos.places.EventPlace;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventPlaceKt {
    public static final EventPlaceKt INSTANCE = new EventPlaceKt();

    private EventPlaceKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EventPlace.Builder _builder;

        private Dsl(EventPlace.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ EventPlace _build() {
            EventPlace eventPlaceBuild = this._builder.build();
            x.e(eventPlaceBuild, "build(...)");
            return eventPlaceBuild;
        }

        public final void clearAllDay() {
            this._builder.clearAllDay();
        }

        public final void clearCount() {
            this._builder.clearCount();
        }

        public final void clearEndTime() {
            this._builder.clearEndTime();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearId() {
            this._builder.clearId();
        }

        public final void clearImageUrl() {
            this._builder.clearImageUrl();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearOriginPlace() {
            this._builder.clearOriginPlace();
        }

        public final void clearRecurringCalendarEvent() {
            this._builder.clearRecurringCalendarEvent();
        }

        public final void clearRefEventId() {
            this._builder.clearRefEventId();
        }

        public final void clearStartTime() {
            this._builder.clearStartTime();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValidateOnly() {
            this._builder.clearValidateOnly();
        }

        public final void clearValidated() {
            this._builder.clearValidated();
        }

        public final boolean getAllDay() {
            return this._builder.getAllDay();
        }

        public final int getCount() {
            return this._builder.getCount();
        }

        public final long getEndTime() {
            return this._builder.getEndTime();
        }

        public final String getEventId() {
            String eventId = this._builder.getEventId();
            x.e(eventId, "getEventId(...)");
            return eventId;
        }

        public final int getId() {
            return this._builder.getId();
        }

        public final String getImageUrl() {
            String imageUrl = this._builder.getImageUrl();
            x.e(imageUrl, "getImageUrl(...)");
            return imageUrl;
        }

        public final String getName() {
            String name = this._builder.getName();
            x.e(name, "getName(...)");
            return name;
        }

        public final Place getOriginPlace() {
            Place originPlace = this._builder.getOriginPlace();
            x.e(originPlace, "getOriginPlace(...)");
            return originPlace;
        }

        public final Place getOriginPlaceOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return EventPlaceKtKt.getOriginPlaceOrNull(dsl._builder);
        }

        public final boolean getRecurringCalendarEvent() {
            return this._builder.getRecurringCalendarEvent();
        }

        public final String getRefEventId() {
            String refEventId = this._builder.getRefEventId();
            x.e(refEventId, "getRefEventId(...)");
            return refEventId;
        }

        public final long getStartTime() {
            return this._builder.getStartTime();
        }

        public final EventPlaceType getType() {
            EventPlaceType type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        public final boolean getValidateOnly() {
            return this._builder.getValidateOnly();
        }

        public final boolean getValidated() {
            return this._builder.getValidated();
        }

        public final boolean hasOriginPlace() {
            return this._builder.hasOriginPlace();
        }

        public final void setAllDay(boolean z) {
            this._builder.setAllDay(z);
        }

        public final void setCount(int i2) {
            this._builder.setCount(i2);
        }

        public final void setEndTime(long j2) {
            this._builder.setEndTime(j2);
        }

        public final void setEventId(String str) {
            x.f(str, "value");
            this._builder.setEventId(str);
        }

        public final void setId(int i2) {
            this._builder.setId(i2);
        }

        public final void setImageUrl(String str) {
            x.f(str, "value");
            this._builder.setImageUrl(str);
        }

        public final void setName(String str) {
            x.f(str, "value");
            this._builder.setName(str);
        }

        public final void setOriginPlace(Place place) {
            x.f(place, "value");
            this._builder.setOriginPlace(place);
        }

        public final void setRecurringCalendarEvent(boolean z) {
            this._builder.setRecurringCalendarEvent(z);
        }

        public final void setRefEventId(String str) {
            x.f(str, "value");
            this._builder.setRefEventId(str);
        }

        public final void setStartTime(long j2) {
            this._builder.setStartTime(j2);
        }

        public final void setType(EventPlaceType eventPlaceType) {
            x.f(eventPlaceType, "value");
            this._builder.setType(eventPlaceType);
        }

        public final void setTypeValue(int i2) {
            this._builder.setTypeValue(i2);
        }

        public final void setValidateOnly(boolean z) {
            this._builder.setValidateOnly(z);
        }

        public final void setValidated(boolean z) {
            this._builder.setValidated(z);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(EventPlace.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(EventPlace.Builder builder, o oVar) {
            this(builder);
        }
    }
}
