package Rc;

import com.applovin.impl.o7;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.vungle.ads.internal.AnalyticsClient;
import io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash;
import org.apache.tika.parser.AbstractExternalProcessParser;
import org.apache.tika.utils.ProcessUtils;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10576a;

    public /* synthetic */ b(int i5) {
        this.f10576a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10576a) {
            case 0:
                throw new FirebaseCrashlyticsTestCrash();
            case 1:
                o7.c();
                return;
            case 2:
                AbstractExternalProcessParser.lambda$static$0();
                return;
            case 3:
                ProcessUtils.lambda$static$0();
                return;
            case 4:
                int i5 = AlarmManagerSchedulerBroadcastReceiver.f26261a;
                return;
            default:
                AnalyticsClient.a();
                return;
        }
    }
}
