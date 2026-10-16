package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes2.dex */
public final class eyt extends RemoteCallbackList {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public eyt(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        ((eyo) iInterface).getClass();
        obj.getClass();
        this.a.b.remove((Integer) obj);
    }
}
