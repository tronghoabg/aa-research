package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import k3.BinderC3177i;
import k3.RemoteCallbackListC3178j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f19044a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19045b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackListC3178j f19046c = new RemoteCallbackListC3178j(this);

    /* renamed from: d, reason: collision with root package name */
    public final BinderC3177i f19047d = new BinderC3177i(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC3340k.e(intent, "intent");
        return this.f19047d;
    }
}
