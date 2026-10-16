package H4;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f4886a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4887b;

    /* renamed from: c, reason: collision with root package name */
    public int f4888c;

    public b(String str, boolean z2) {
        this.f4886a = str;
        this.f4887b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        a aVar;
        aVar = new a(this, runnable, "glide-" + this.f4886a + "-thread-" + this.f4888c);
        this.f4888c = this.f4888c + 1;
        return aVar;
    }
}
