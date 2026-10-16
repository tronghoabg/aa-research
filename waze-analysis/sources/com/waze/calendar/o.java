package com.waze.calendar;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class o {
    public static final int $stable = 0;

    public static /* synthetic */ void addCalendarEvent$default(o oVar, String str, long j2, long j3, boolean z, boolean z2, String str2, String str3, String str4, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCalendarEvent");
        }
        oVar.addCalendarEvent(str, j2, j3, z, z2, str2, str3, str4, (i2 & 256) != 0 ? null : lVar);
    }

    static final ab addCalendarEvent$lambda$0(o oVar, String str, long j2, long j3, boolean z, boolean z2, String str2, String str3, String str4) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.calendar.CalendarNativeManager");
        ((CalendarNativeManager) oVar).addCalendarEventNTV(str, j2, j3, z, z2, str2, str3, str4);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onCompleteFetchCalendarEvents$default(o oVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCompleteFetchCalendarEvents");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        oVar.onCompleteFetchCalendarEvents(i2, lVar);
    }

    static final ab onCompleteFetchCalendarEvents$lambda$0(o oVar, int i2) {
        x.d(oVar, "null cannot be cast to non-null type com.waze.calendar.CalendarNativeManager");
        ((CalendarNativeManager) oVar).onCompleteFetchCalendarEventsNTV(i2);
        return null;
    }

    public void addCalendarEvent(final String str, final long j2, final long j3, final boolean z, final boolean z2, final String str2, final String str3, final String str4, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.calendar.l
            @Override // com.waze.hw
            public final Object a() {
                o.addCalendarEvent$lambda$0(this.f18785a, str, j2, j3, z, z2, str2, str3, str4);
                return null;
            }
        }, lVar != null ? new n(lVar, 1) : null);
    }

    public abstract byte[] fetchCalendarEventJNI(String str);

    protected final byte[] fetchCalendarEventJNIJNI(String str) {
        return ((CalendarNativeManager) this).fetchCalendarEventJNI(str);
    }

    public abstract void fetchCalendarEvents(int i2, int i3, String str, int i4);

    protected final void fetchCalendarEventsJNI(int i2, int i3, String str, int i4) {
        x.f(str, "excludeRegex");
        ((CalendarNativeManager) this).fetchCalendarEvents(i2, i3, str, i4);
    }

    public void onCompleteFetchCalendarEvents(final int i2, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.calendar.m
            @Override // com.waze.hw
            public final Object a() {
                o.onCompleteFetchCalendarEvents$lambda$0(this.f18794a, i2);
                return null;
            }
        }, lVar != null ? new n(lVar, 0) : null);
    }

    public final void onCompleteFetchCalendarEvents(int i2) {
        onCompleteFetchCalendarEvents$default(this, i2, null, 2, null);
    }

    public final void addCalendarEvent(String str, long j2, long j3, boolean z, boolean z2, String str2, String str3, String str4) {
        addCalendarEvent$default(this, str, j2, j3, z, z2, str2, str3, str4, null, 256, null);
    }
}
