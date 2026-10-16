package H4;

import Af.q;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import c2.C1547b;
import h6.AbstractC2786e;
import java.lang.reflect.InvocationTargetException;
import yc.C4577G;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4885b;

    public /* synthetic */ a(int i5, Object obj, boolean z2) {
        this.f4884a = i5;
        this.f4885b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C4577G c4577g;
        switch (this.f4884a) {
            case 0:
                Process.setThreadPriority(9);
                if (((b) this.f4885b).f4887b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 1:
                AbstractC2786e abstractC2786e = (AbstractC2786e) this.f4885b;
                abstractC2786e.getClass();
                do {
                    try {
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                } while (abstractC2786e.g());
                return;
            case 2:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((C1547b) this.f4885b).h());
                return;
            case 3:
                ((q) this.f4885b).invoke();
                return;
            default:
                ((C4577G) this.f4885b).a();
                while (!Thread.interrupted()) {
                    try {
                        synchronized (((C4577G) this.f4885b).f48095r) {
                            while (!((C4577G) this.f4885b).f48096s.booleanValue()) {
                                try {
                                    ((C4577G) this.f4885b).f48095r.wait(500L);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            c4577g = (C4577G) this.f4885b;
                            c4577g.f48096s = Boolean.FALSE;
                        }
                        c4577g.f48092o.updateTexImage();
                        float[] fArr = new float[16];
                        ((C4577G) this.f4885b).f48092o.getTransformMatrix(fArr);
                        C4577G c4577g2 = (C4577G) this.f4885b;
                        c4577g2.b(fArr, c4577g2.f48097t, c4577g2.f48098u);
                    } catch (InterruptedException unused) {
                        Log.d("VideoRenderer", "thread interrupted while waiting for frames");
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i5) {
        super("ExoPlayer:SimpleDecoder");
        this.f4884a = i5;
        this.f4885b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Runnable runnable, String str) {
        super(runnable, str);
        this.f4884a = 0;
        this.f4885b = bVar;
    }
}
