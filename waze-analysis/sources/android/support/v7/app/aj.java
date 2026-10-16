package android.support.v7.app;

import android.content.IntentFilter;
import android.content.pm.PackageManager;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aj extends ai {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f513a;

    /* renamed from: c, reason: collision with root package name */
    private final au f514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(an anVar, au auVar) {
        super(anVar);
        this.f513a = anVar;
        this.f514c = auVar;
    }

    @Override // android.support.v7.app.ai
    public final int a() {
        return this.f514c.b() ? 2 : 1;
    }

    @Override // android.support.v7.app.ai
    final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // android.support.v7.app.ai
    public final void c() throws PackageManager.NameNotFoundException {
        this.f513a.x();
    }
}
