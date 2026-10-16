package com.waze.main.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class EventOnRoute {
    public int alertId;
    public int alertRouteId;
    public int alertType;
    public int durationSeconds;
    public int end;
    public int percentage;
    public int severity;
    public int start;

    public EventOnRoute(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.alertId = i2;
        this.alertRouteId = i3;
        this.alertType = i4;
        this.severity = i5;
        this.start = i6;
        this.end = i7;
        this.percentage = i8;
        this.durationSeconds = i9;
    }

    public EventOnRoute() {
    }
}
