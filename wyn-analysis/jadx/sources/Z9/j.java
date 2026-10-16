package Z9;

import com.google.android.gms.common.api.internal.InterfaceC1689c;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class j implements InterfaceC1689c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f17063a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC1689c
    public final void a(boolean z2) {
        Random random = k.f17064j;
        synchronized (k.class) {
            Iterator it = k.k.values().iterator();
            while (it.hasNext()) {
                ((d) it.next()).d(z2);
            }
        }
    }
}
