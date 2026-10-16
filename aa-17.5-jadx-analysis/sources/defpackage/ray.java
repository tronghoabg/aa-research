package defpackage;

import android.os.IBinder;
import com.google.android.apps.auto.components.lifetime.service.GhLifetimeService;

/* loaded from: classes.dex */
public final /* synthetic */ class ray implements IBinder.DeathRecipient {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ray(GhLifetimeService ghLifetimeService, rpm rpmVar, int i) {
        this.c = i;
        this.b = ghLifetimeService;
        this.a = rpmVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.c;
        char[] cArr = null;
        if (i == 0) {
            rbe.h(new qqy(this.a, this.b, 6, cArr));
            return;
        }
        Object obj = this.b;
        if (i != 1) {
            rbe.h(new qqy(this.a, obj, 18, cArr));
        } else {
            ((GhLifetimeService) obj).b.remove(this.a);
        }
    }

    public /* synthetic */ ray(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
