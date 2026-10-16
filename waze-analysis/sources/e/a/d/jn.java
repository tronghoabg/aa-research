package e.a.d;

import j$.util.Objects;
import java.util.IdentityHashMap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jo f47235a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jp f47236b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f47237c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jq f47238d;

    jn(jq jqVar, jo joVar, jp jpVar, Object obj) {
        this.f47235a = joVar;
        this.f47236b = jpVar;
        this.f47237c = obj;
        Objects.requireNonNull(jqVar);
        this.f47238d = jqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jq jqVar = this.f47238d;
        synchronized (jqVar) {
            if (this.f47235a.f47240b == 0) {
                IdentityHashMap identityHashMap = jqVar.f47243b;
                jp jpVar = this.f47236b;
                identityHashMap.remove(jpVar);
                if (jqVar.f47243b.isEmpty()) {
                    jqVar.f47244c.shutdown();
                    jqVar.f47244c = null;
                }
                jpVar.b(this.f47237c);
            }
        }
    }
}
