package com.waze.jni.protos.calendar;

import com.waze.jni.protos.calendar.CalendarEvent;
import com.waze.jni.protos.calendar.CalendarEventKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CalendarEventKtKt {
    /* renamed from: -initializecalendarEvent, reason: not valid java name */
    public static final CalendarEvent m26054initializecalendarEvent(l<? super CalendarEventKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CalendarEventKt.Dsl.Companion companion = CalendarEventKt.Dsl.Companion;
        CalendarEvent.Builder builderNewBuilder = CalendarEvent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CalendarEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CalendarEvent copy(CalendarEvent calendarEvent, l<? super CalendarEventKt.Dsl, ab> lVar) {
        x.f(calendarEvent, "<this>");
        x.f(lVar, "block");
        CalendarEventKt.Dsl.Companion companion = CalendarEventKt.Dsl.Companion;
        CalendarEvent.Builder builder = calendarEvent.toBuilder();
        x.e(builder, "toBuilder(...)");
        CalendarEventKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
