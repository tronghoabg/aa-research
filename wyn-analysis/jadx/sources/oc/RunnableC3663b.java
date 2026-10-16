package oc;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: oc.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC3663b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3665d f41467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f41468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f41469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Yc.b f41470e;

    public /* synthetic */ RunnableC3663b(C3665d c3665d, Context context, Handler handler, Yc.b bVar, int i5) {
        this.f41466a = i5;
        this.f41467b = c3665d;
        this.f41468c = context;
        this.f41469d = handler;
        this.f41470e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41466a) {
            case 0:
                C3665d c3665d = this.f41467b;
                try {
                    Looper mainLooper = Looper.getMainLooper();
                    (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper)).post(new RunnableC3663b(c3665d, this.f41468c, this.f41469d, this.f41470e, 1));
                    return;
                } catch (Exception e7) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e7);
                    throw new RuntimeException(e7);
                }
            default:
                this.f41467b.a(this.f41468c.getApplicationContext(), null);
                this.f41469d.post(this.f41470e);
                return;
        }
    }
}
