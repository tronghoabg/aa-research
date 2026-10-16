package androidx.work;

import J3.b;
import J3.r;
import K3.q;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import r3.InterfaceC3914b;
import x9.C4504d;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC3914b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19055a = r.f("WrkMgrInitializer");

    @Override // r3.InterfaceC3914b
    public final Object create(Context context) {
        r.d().a(f19055a, "Initializing WorkManager with default configuration.");
        q.d(context, new b(new C4504d(19)));
        return q.c(context);
    }

    @Override // r3.InterfaceC3914b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
