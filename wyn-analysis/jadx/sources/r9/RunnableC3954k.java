package r9;

import J9.C0654m;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import ff.AbstractC2641B;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.tika.metadata.TikaCoreProperties;
import p9.C3776A;
import uc.InterfaceC4280q;
import y1.C4527h;
import y1.C4529j;
import y1.C4530k;
import yc.C4592o;
import yc.InterfaceC4573C;
import zg.C4672k;
import zg.C4673l;
import zg.InterfaceC4667f;

/* renamed from: r9.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3954k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44629d;

    public /* synthetic */ RunnableC3954k(Object obj, Object obj2, Object obj3, int i5) {
        this.f44626a = i5;
        this.f44627b = obj;
        this.f44628c = obj2;
        this.f44629d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44626a) {
            case 0:
                C3955l c3955l = (C3955l) this.f44627b;
                R1.i iVar = c3955l.f44642m;
                int i5 = iVar.f10117b;
                iVar.f10117b = i5 + 2;
                C3959p c3959p = (C3959p) this.f44628c;
                c3959p.f44650a = i5;
                S s10 = new S((C3776A) this.f44629d, i5, c3955l.f44631a.D().d(), y.f44679a);
                c3959p.f44651b = s10;
                c3955l.f44639i.f(s10);
                return;
            case 1:
                String str = (String) this.f44628c;
                InterfaceC4280q interfaceC4280q = (InterfaceC4280q) this.f44627b;
                String str2 = (String) this.f44629d;
                if (interfaceC4280q != null) {
                    interfaceC4280q.b(str, str2, null);
                    return;
                } else {
                    Log.w("ffmpeg-kit-flutter", R8.v.g("ResultHandler can not send failure response ", str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2, " on a null method call result."));
                    return;
                }
            case 2:
                K3.e eVar = (K3.e) this.f44627b;
                Executor executor = (Executor) this.f44628c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f44629d;
                try {
                    ((Task) eVar.call()).continueWith(executor, new C0654m(taskCompletionSource));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                } catch (Throwable th) {
                    taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
                    return;
                }
            case 3:
                G4.c cVar = (G4.c) this.f44627b;
                tg.b bVar = (tg.b) this.f44628c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f44629d;
                cVar.getClass();
                try {
                    C4530k c4530kN = AbstractC2641B.n(cVar.f4226a);
                    if (c4530kN == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C4529j c4529j = (C4529j) c4530kN.f47946a;
                    synchronized (c4529j.f47940d) {
                        c4529j.f47942f = threadPoolExecutor;
                    }
                    c4530kN.f47946a.a(new C4527h(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    bVar.J(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                ((InterfaceC4573C) this.f44627b).c(new C4592o((String) this.f44628c, (String) this.f44629d, null));
                return;
            case 5:
                AnalyticsClient.b((Sdk.SDKError.Reason) this.f44627b, (String) this.f44628c, (com.vungle.ads.internal.util.s) this.f44629d);
                return;
            case 6:
                C4673l c4673l = (C4673l) ((C4672k) this.f44627b).f48626b;
                boolean zIsCanceled = c4673l.f48628b.isCanceled();
                InterfaceC4667f interfaceC4667f = (InterfaceC4667f) this.f44628c;
                if (zIsCanceled) {
                    interfaceC4667f.onFailure(c4673l, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC4667f.onResponse(c4673l, (zg.Q) this.f44629d);
                    return;
                }
            default:
                ((InterfaceC4667f) this.f44628c).onFailure((C4673l) ((C4672k) this.f44627b).f48626b, (Throwable) this.f44629d);
                return;
        }
    }
}
