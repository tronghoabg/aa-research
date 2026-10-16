package k3;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: k3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC3178j extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f39206a;

    public RemoteCallbackListC3178j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f39206a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        C3174f callback = (C3174f) iInterface;
        AbstractC3340k.e(callback, "callback");
        AbstractC3340k.e(cookie, "cookie");
        this.f39206a.f19045b.remove((Integer) cookie);
    }
}
