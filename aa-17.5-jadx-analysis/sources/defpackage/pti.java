package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class pti extends RequestFinishedInfo.Listener {
    private final ackk a;

    public pti(Executor executor, ackk ackkVar) {
        super(executor);
        this.a = ackkVar;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        ((Long) xxh.g(requestFinishedInfo.getMetrics().getSentByteCount()).d(0L)).longValue();
        ((Long) xxh.g(requestFinishedInfo.getMetrics().getReceivedByteCount()).d(0L)).longValue();
        String host = Uri.parse(requestFinishedInfo.getUrl()).getHost();
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null) {
            responseInfo.wasCached();
        }
        if (host != null) {
            pvm pvmVar = (pvm) this.a.a();
            Matcher matcher = pvm.a.matcher(host);
            if (matcher.find()) {
                matcher.group();
            }
            erb erbVar = pvmVar.b;
            qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
        }
    }
}
