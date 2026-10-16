package s8;

import com.google.android.gms.common.api.internal.InterfaceC1689c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: s8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4029e implements InterfaceC1689c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f45324a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC1689c
    public final void a(boolean z2) {
        synchronized (g.k) {
            try {
                Iterator it = new ArrayList(g.f45327l.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f45332e.get()) {
                        gVar.l(z2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
