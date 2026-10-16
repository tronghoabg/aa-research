package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    public final String f42521a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42522b;

    /* renamed from: c, reason: collision with root package name */
    public TaskQueue f42523c;

    /* renamed from: d, reason: collision with root package name */
    public long f42524d;

    public Task(String name, boolean z2) {
        AbstractC3340k.e(name, "name");
        this.f42521a = name;
        this.f42522b = z2;
        this.f42524d = -1L;
    }

    public abstract long a();

    /* renamed from: toString, reason: from getter */
    public final String getF42521a() {
        return this.f42521a;
    }
}
