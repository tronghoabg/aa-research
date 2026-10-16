package com.waze.calendar;

import com.waze.ai;
import com.waze.aj;
import com.waze.jni.protos.calendar.CalendarEvent;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CalendarNativeManager extends o implements aj {
    private final e calendarManager;
    private boolean offlineMode;
    private final af scope;
    public static final g Companion = new g();
    public static final int $stable = 8;

    public CalendarNativeManager(e eVar, h.c.j jVar) {
        x.f(eVar, "calendarManager");
        x.f(jVar, "coroutineContext");
        this.calendarManager = eVar;
        this.scope = kotlinx.coroutines.aj.e(jVar);
    }

    private final void fetchCalendarEventsAsync(int i2, int i3, String str, int i4) {
        kotlinx.coroutines.aj.z(this.scope, null, null, new i(this, i2, i3, str, i4, null), 3);
    }

    private final void fetchCalendarEventsOffline(int i2, int i3, String str, int i4) {
        kotlinx.coroutines.aj.t(h.c.k.f48060a, new k(this, i2, i3, str, null));
        onCompleteFetchCalendarEventsNTV(i4);
    }

    public final native void addCalendarEventNTV(String str, long j2, long j3, boolean z, boolean z2, String str2, String str3, String str4);

    @Override // com.waze.aj
    public ai fetchCalendarEvent(String str) {
        if (str != null) {
            return this.calendarManager.b(str);
        }
        return null;
    }

    @Override // com.waze.calendar.o
    public byte[] fetchCalendarEventJNI(String str) {
        ai aiVarFetchCalendarEvent = fetchCalendarEvent(str);
        if (aiVarFetchCalendarEvent == null) {
            return null;
        }
        CalendarEvent.Builder builderNewBuilder = CalendarEvent.newBuilder();
        builderNewBuilder.setAddress(aiVarFetchCalendarEvent.a());
        builderNewBuilder.setRecurring(aiVarFetchCalendarEvent.d());
        return builderNewBuilder.build().toByteArray();
    }

    @Override // com.waze.calendar.o
    public void fetchCalendarEvents(int i2, int i3, String str, int i4) {
        x.f(str, "excludeRegex");
        if (this.offlineMode) {
            fetchCalendarEventsOffline(i2, i3, str, i4);
        } else {
            fetchCalendarEventsAsync(i2, i3, str, i4);
        }
    }

    public final e getCalendarManager() {
        return this.calendarManager;
    }

    public final native void initNativeLayerNTV();

    public final native void onCompleteFetchCalendarEventsNTV(int i2);

    public final void setOfflineMode() {
        if (this.offlineMode) {
            return;
        }
        initNativeLayerNTV();
        this.offlineMode = true;
    }
}
