package R8;

import D6.C0388o;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlutterError f10504c;

    public /* synthetic */ p(s sVar, FlutterError flutterError, int i5) {
        this.f10502a = i5;
        this.f10503b = sVar;
        this.f10504c = flutterError;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f10502a) {
            case 0:
                m mVar = this.f10503b.f10517h;
                Thread threadCurrentThread = Thread.currentThread();
                mVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                u uVar = mVar.f10489n;
                if (uVar == null || !uVar.f10536e.get()) {
                    long j8 = jCurrentTimeMillis / 1000;
                    String strE = mVar.e();
                    if (strE != null) {
                        C0388o c0388o = mVar.f10488m;
                        c0388o.getClass();
                        String strConcat = "Persisting non-fatal event for session ".concat(strE);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strConcat, null);
                        }
                        c0388o.h(j8, threadCurrentThread, this.f10504c, strE, "error", false);
                        break;
                    } else {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        break;
                    }
                }
                break;
            default:
                s sVar = this.f10503b;
                m mVar2 = sVar.f10517h;
                S3.s sVar2 = sVar.f10512c;
                mVar2.i("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(((AtomicInteger) sVar2.f11009b).get()));
                sVar.f10517h.i("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(((AtomicInteger) sVar2.f11010c).get()));
                m mVar3 = sVar.f10517h;
                Thread threadCurrentThread2 = Thread.currentThread();
                K3.r rVar = mVar3.f10490o;
                if (rVar != null) {
                    mVar3.g(rVar, threadCurrentThread2, this.f10504c, true);
                    break;
                } else {
                    Log.w("FirebaseCrashlytics", "settingsProvider not set", null);
                    break;
                }
        }
    }
}
