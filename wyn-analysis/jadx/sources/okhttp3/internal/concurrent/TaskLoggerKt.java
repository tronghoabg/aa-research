package okhttp3.internal.concurrent;

import Va.M6;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaskLoggerKt {
    public static final void a(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.f42533h.getClass();
        TaskRunner.f42535j.fine(taskQueue.f42526b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f42521a);
    }

    public static final String b(long j8) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j8 <= -999500000 ? M6.s(new StringBuilder(), (j8 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ") : j8 <= -999500 ? M6.s(new StringBuilder(), (j8 - 500000) / 1000000, " ms") : j8 <= 0 ? M6.s(new StringBuilder(), (j8 - 500) / 1000, " µs") : j8 < 999500 ? M6.s(new StringBuilder(), (j8 + 500) / 1000, " µs") : j8 < 999500000 ? M6.s(new StringBuilder(), (j8 + 500000) / 1000000, " ms") : M6.s(new StringBuilder(), (j8 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ")}, 1));
    }
}
