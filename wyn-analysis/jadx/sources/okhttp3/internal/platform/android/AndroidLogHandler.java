package okhttp3.internal.platform.android;

import Bf.k;
import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidLogHandler extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f42897a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        AbstractC3340k.e(record, "record");
        AndroidLog androidLog = AndroidLog.f42894a;
        String loggerName = record.getLoggerName();
        AbstractC3340k.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i5 = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        AbstractC3340k.d(message, "record.message");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        String strT0 = (String) AndroidLog.f42896c.get(loggerName);
        if (strT0 == null) {
            strT0 = k.T0(23, loggerName);
        }
        if (Log.isLoggable(strT0, i5)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int iV0 = k.v0(message, '\n', i10, 4);
                if (iV0 == -1) {
                    iV0 = length;
                }
                while (true) {
                    iMin = Math.min(iV0, i10 + 4000);
                    String strSubstring = message.substring(i10, iMin);
                    AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i5, strT0, strSubstring);
                    if (iMin >= iV0) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }
}
