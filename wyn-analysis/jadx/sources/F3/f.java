package F3;

import D3.i;
import D3.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j1.InterfaceC3073a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f implements InterfaceC3073a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3832a;

    /* renamed from: c, reason: collision with root package name */
    public k f3834c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f3833b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f3835d = new LinkedHashSet();

    public f(Context context) {
        this.f3832a = context;
    }

    @Override // j1.InterfaceC3073a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        AbstractC3340k.e(value, "value");
        ReentrantLock reentrantLock = this.f3833b;
        reentrantLock.lock();
        try {
            this.f3834c = e.c(this.f3832a, value);
            Iterator it = this.f3835d.iterator();
            while (it.hasNext()) {
                ((InterfaceC3073a) it.next()).accept(this.f3834c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f3833b;
        reentrantLock.lock();
        try {
            k kVar = this.f3834c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f3835d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
