package Me;

import Cd.s0;
import S3.f;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a implements Je.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7633a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f7634b;

    static {
        a aVar = new a("DISPOSED", 0);
        f7633a = aVar;
        f7634b = new a[]{aVar};
    }

    public static void a(AtomicReference atomicReference) {
        Je.b bVar;
        Je.b bVar2 = (Je.b) atomicReference.get();
        a aVar = f7633a;
        if (bVar2 == aVar || (bVar = (Je.b) atomicReference.getAndSet(aVar)) == aVar || bVar == null) {
            return;
        }
        bVar.dispose();
    }

    public static boolean b(Je.b bVar) {
        return bVar == f7633a;
    }

    public static boolean c(AtomicReference atomicReference, Je.b bVar) {
        while (true) {
            Je.b bVar2 = (Je.b) atomicReference.get();
            if (bVar2 == f7633a) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(bVar2, bVar)) {
                if (atomicReference.get() != bVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void d() {
        f.A(new s0("Disposable already set!", 6));
    }

    public static boolean e(AtomicReference atomicReference, Je.b bVar) {
        Ne.b.a(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() == f7633a) {
                    return false;
                }
                d();
                return false;
            }
        }
        return true;
    }

    public static boolean f(Je.b bVar, Je.b bVar2) {
        if (bVar2 == null) {
            f.A(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        d();
        return false;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7634b.clone();
    }

    @Override // Je.b
    public final void dispose() {
    }
}
