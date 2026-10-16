package D3;

import android.content.Context;
import ef.C2532p;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f2306a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C2532p f2307b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f2308c;

    static {
        H.f39741a.getOrCreateKotlinClass(h.class).getSimpleName();
        f2307b = Fe.c.z(f.f2305i);
        f2308c = a.f2287a;
    }

    public static b a(Context context) {
        AbstractC3340k.e(context, "context");
        E3.a aVar = (E3.a) f2307b.getValue();
        if (aVar == null) {
            G3.l lVar = G3.l.f4220c;
            if (G3.l.f4220c == null) {
                ReentrantLock reentrantLock = G3.l.f4221d;
                reentrantLock.lock();
                try {
                    if (G3.l.f4220c == null) {
                        G3.j jVar = null;
                        try {
                            A3.h hVarB = G3.h.b();
                            if (hVarB != null) {
                                A3.h other = A3.h.f295f;
                                AbstractC3340k.e(other, "other");
                                Object value = hVarB.f300e.getValue();
                                AbstractC3340k.d(value, "<get-bigInteger>(...)");
                                Object value2 = other.f300e.getValue();
                                AbstractC3340k.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    G3.j jVar2 = new G3.j(context);
                                    if (jVar2.e()) {
                                        jVar = jVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        G3.l.f4220c = new G3.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = G3.l.f4220c;
            AbstractC3340k.b(aVar);
        }
        int i5 = o.f2321b;
        b bVar = new b(aVar);
        f2308c.getClass();
        return bVar;
    }
}
