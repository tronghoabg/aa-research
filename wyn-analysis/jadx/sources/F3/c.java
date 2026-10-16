package F3;

import D3.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.applovin.impl.T0;
import ef.C2515C;
import ff.v;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.H;

/* loaded from: classes.dex */
public final class c implements E3.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f3822a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9.c f3823b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f3824c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3825d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f3826e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f3827f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, Y9.c cVar) {
        this.f3822a = windowLayoutComponent;
        this.f3823b = cVar;
    }

    @Override // E3.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f3824c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f3826e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f3825d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            ReentrantLock reentrantLock2 = fVar.f3833b;
            reentrantLock2.lock();
            LinkedHashSet linkedHashSet = fVar.f3835d;
            try {
                linkedHashSet.remove(iVar);
                reentrantLock2.unlock();
                linkedHashMap.remove(iVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    A3.d dVar = (A3.d) this.f3827f.remove(fVar);
                    if (dVar != null) {
                        dVar.f285a.invoke(dVar.f286b, dVar.f287c);
                    }
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // E3.a
    public final void b(Context context, T0 t02, i iVar) {
        C2515C c2515c;
        ReentrantLock reentrantLock = this.f3824c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f3825d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f3826e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                c2515c = C2515C.f34653a;
            } else {
                c2515c = null;
            }
            if (c2515c == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(v.f35432a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f3827f.put(fVar2, this.f3823b.f(this.f3822a, H.f39741a.getOrCreateKotlinClass(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
