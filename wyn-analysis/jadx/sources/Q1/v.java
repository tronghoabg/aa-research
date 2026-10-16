package Q1;

import com.applovin.impl.communicator.MessagingServiceImpl;
import java.util.concurrent.ThreadFactory;
import org.apache.tika.concurrent.SimpleThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9721a;

    public /* synthetic */ v(int i5) {
        this.f9721a = i5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f9721a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return MessagingServiceImpl.a(runnable);
            default:
                return SimpleThreadPoolExecutor.lambda$new$0(runnable);
        }
    }
}
