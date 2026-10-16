package defpackage;

import j$.time.Duration;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes2.dex */
public final class ptj extends RequestFinishedInfo.Listener {
    private final ackk a;

    public ptj(Executor executor, ackk ackkVar) {
        super(executor);
        this.a = ackkVar;
    }

    private static void a(Date date) {
        if (date != null) {
            TimeUnit.MILLISECONDS.toNanos(date.getTime());
        }
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Collection<Object> annotations = requestFinishedInfo.getAnnotations();
        if (annotations == null) {
            return;
        }
        for (Object obj : annotations) {
            if (obj instanceof pth) {
                pth pthVar = (pth) obj;
                if (requestFinishedInfo.getFinishedReason() == 0) {
                    RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                    pvo pvoVar = new pvo();
                    pvoVar.a = ((Long) xxh.g(metrics.getReceivedByteCount()).d(0L)).longValue();
                    pvoVar.b = ((Long) xxh.g(metrics.getSentByteCount()).d(0L)).longValue();
                    sm smVar = (sm) this.a.a();
                    a(metrics.getSendingEnd());
                    a(metrics.getResponseStart());
                    a(metrics.getRequestEnd());
                    Class cls = pthVar.a;
                    smVar.v(pvoVar);
                    pwz pwzVar = pthVar.b;
                    Date sendingStart = metrics.getSendingStart();
                    if (sendingStart != null) {
                        pwzVar.c(Duration.ofMillis(sendingStart.getTime()));
                    }
                    Date sendingEnd = metrics.getSendingEnd();
                    if (sendingEnd != null) {
                        pwzVar.e(Duration.ofMillis(sendingEnd.getTime()));
                    }
                    Date responseStart = metrics.getResponseStart();
                    if (responseStart != null) {
                        pwzVar.b(Duration.ofMillis(responseStart.getTime()));
                    }
                    Date requestEnd = metrics.getRequestEnd();
                    if (requestEnd != null) {
                        pwzVar.d(Duration.ofMillis(requestEnd.getTime()));
                    }
                }
                pthVar.b.a();
            }
        }
    }
}
