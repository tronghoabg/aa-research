package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eyz extends android.os.RemoteCallbackList {
    final /* synthetic */ androidx.room.MultiInstanceInvalidationService a;

    public eyz(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(android.os.IInterface iInterface, java.lang.Object obj) {
        ((defpackage.eyu) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((java.lang.Integer) obj);
    }
}
