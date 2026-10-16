package kd;

import Va.X7;
import android.webkit.DownloadListener;
import com.moloco.sdk.internal.publisher.C1915d;
import k2.C3146c;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.InterfaceC4269f;

/* renamed from: kd.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3318n implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final C3319o f39681a;

    public C3318n(C3319o c3319o) {
        this.f39681a = c3319o;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j8) {
        C3319o c3319o = this.f39681a;
        c3319o.f39682a.x(new Runnable() { // from class: kd.m
            @Override // java.lang.Runnable
            public final void run() {
                C1915d c1915d = new C1915d(22);
                C3318n c3318n = this.f39675a;
                C3319o c3319o2 = c3318n.f39681a;
                String urlArg = str;
                AbstractC3340k.e(urlArg, "urlArg");
                String userAgentArg = str2;
                AbstractC3340k.e(userAgentArg, "userAgentArg");
                String contentDispositionArg = str3;
                AbstractC3340k.e(contentDispositionArg, "contentDispositionArg");
                String mimetypeArg = str4;
                AbstractC3340k.e(mimetypeArg, "mimetypeArg");
                C8.i iVar = c3319o2.f39682a;
                iVar.getClass();
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), (Object) null, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart").m(AbstractC3935e.D(c3318n, urlArg, userAgentArg, contentDispositionArg, mimetypeArg, Long.valueOf(j8)), new C3146c(c1915d, 13));
            }
        });
    }
}
