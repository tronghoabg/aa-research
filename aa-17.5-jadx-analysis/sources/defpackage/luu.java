package defpackage;

import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
final class luu extends lxr {
    final /* synthetic */ luv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luu(luv luvVar) {
        super(null);
        this.a = luvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lxr
    public final void a() {
        yfq yfqVarB = mbs.a().b();
        int size = yfqVarB.size();
        for (int i = 0; i < size; i++) {
            this.a.e((StatusBarNotification) yfqVarB.get(i));
        }
    }

    @Override // defpackage.lxr
    public final void b(StatusBarNotification statusBarNotification) {
        this.a.e(statusBarNotification);
    }
}
