package bg;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;

/* renamed from: bg.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class ThreadFactoryC1532a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19481c;

    public /* synthetic */ ThreadFactoryC1532a(int i5, String str, boolean z2) {
        this.f19479a = i5;
        this.f19480b = str;
        this.f19481c = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        boolean z2 = this.f19481c;
        String name = this.f19480b;
        switch (this.f19479a) {
            case 0:
                byte[] bArr = Util.f42438a;
                AbstractC3340k.e(name, "$name");
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z2);
                return thread;
            default:
                return com.applovin.shadow.okhttp3.internal.Util.threadFactory$lambda$1(name, z2, runnable);
        }
    }
}
