package H6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f4935a = new ThreadPoolExecutor(2, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new b("ClientDefault", 0));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f4936b = Executors.newSingleThreadExecutor(new b("ClientSingle", 0));
}
