package com.waze.copilot.presentation;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class LogRequest {
    public static final int $stable = 0;
    private final String level;
    private final String msg;

    public LogRequest(String str, String str2) {
        x.f(str, "level");
        x.f(str2, NotificationCompat.CATEGORY_MESSAGE);
        this.level = str;
        this.msg = str2;
    }

    public static /* synthetic */ LogRequest copy$default(LogRequest logRequest, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = logRequest.level;
        }
        if ((i2 & 2) != 0) {
            str2 = logRequest.msg;
        }
        return logRequest.copy(str, str2);
    }

    public final String component1() {
        return this.level;
    }

    public final String component2() {
        return this.msg;
    }

    public final LogRequest copy(String str, String str2) {
        x.f(str, "level");
        x.f(str2, NotificationCompat.CATEGORY_MESSAGE);
        return new LogRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        return x.n(this.level, logRequest.level) && x.n(this.msg, logRequest.msg);
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (this.level.hashCode() * 31) + this.msg.hashCode();
    }

    public String toString() {
        return "LogRequest(level=" + this.level + ", msg=" + this.msg + ")";
    }
}
