package Ye;

import A7.AbstractC0279p0;
import Cd.s0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f implements ug.b {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16797a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f16798b;

    static {
        f fVar = new f("CANCELLED", 0);
        f16797a = fVar;
        f16798b = new f[]{fVar};
    }

    public static void a(AtomicReference atomicReference) {
        ug.b bVar;
        ug.b bVar2 = (ug.b) atomicReference.get();
        f fVar = f16797a;
        if (bVar2 == fVar || (bVar = (ug.b) atomicReference.getAndSet(fVar)) == fVar || bVar == null) {
            return;
        }
        bVar.cancel();
    }

    public static boolean b(AtomicReference atomicReference, ug.b bVar) {
        Ne.b.a(bVar, "s is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.cancel();
                if (atomicReference.get() == f16797a) {
                    return false;
                }
                S3.f.A(new s0("Subscription already set!", 6));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j8) {
        if (j8 > 0) {
            return true;
        }
        S3.f.A(new IllegalArgumentException(AbstractC0279p0.k(j8, "n > 0 required but it was ")));
        return false;
    }

    public static boolean d(ug.b bVar, ug.b bVar2) {
        if (bVar2 == null) {
            S3.f.A(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.cancel();
        S3.f.A(new s0("Subscription already set!", 6));
        return false;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f16798b.clone();
    }

    @Override // ug.b
    public final void cancel() {
    }

    @Override // ug.b
    public final void request(long j8) {
    }
}
