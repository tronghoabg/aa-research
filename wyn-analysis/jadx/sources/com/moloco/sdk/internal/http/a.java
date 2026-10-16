package com.moloco.sdk.internal.http;

import Ad.g;
import Af.r;
import Cd.AbstractC0343k;
import Cd.C0340h;
import Cd.C0342j;
import Cd.b0;
import Cd.q0;
import Cd.z0;
import Fd.e;
import Jd.n;
import android.os.Build;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.publisher.Moloco;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;
import vg.b;
import wd.C4403d;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f28528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f28529c;

    public /* synthetic */ a(w wVar, F f10, int i5) {
        this.f28527a = i5;
        this.f28528b = wVar;
        this.f28529c = f10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        int i5 = 1;
        C2515C c2515c = C2515C.f34653a;
        F f10 = this.f28529c;
        w wVar = this.f28528b;
        switch (this.f28527a) {
            case 0:
                C4403d HttpClient = (C4403d) obj;
                AbstractC3340k.e(HttpClient, "$this$HttpClient");
                HttpClient.a(z0.f2196b, new g(29));
                HttpClient.a(q0.f2163b, new C1915d(28));
                HttpClient.a(b0.f2080c, new C1915d(28));
                a aVar = new a(wVar, f10, i5);
                b bVar = AbstractC0343k.f2122a;
                HttpClient.a(C0342j.f2117b, new r(aVar, i5));
                break;
            case 1:
                C0340h defaultRequest = (C0340h) obj;
                AbstractC3340k.e(defaultRequest, "$this$defaultRequest");
                e.a(defaultRequest, new a(wVar, f10, 2));
                break;
            default:
                n headers = (n) obj;
                AbstractC3340k.e(headers, "$this$headers");
                headers.z("X-Moloco-App-Info", "AppBundle/" + wVar.f29734a + "; AppVersion/" + wVar.f29735b + "; AppKey/" + Moloco.INSTANCE.getAppKey$moloco_sdk_release() + ';');
                headers.z("X-Moloco-Device-Info", "make/" + f10.f29382a + "; model/" + f10.f29383b + "; hwv/" + f10.f29384c + "; osv/" + Build.VERSION.RELEASE + "; OS/Android;");
                headers.z("X-Moloco-SDK-Info", "SdkVersion/4.8.1");
                break;
        }
        return c2515c;
    }
}
