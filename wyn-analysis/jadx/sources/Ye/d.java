package Ye;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d implements Oe.e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16793a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f16794b;

    static {
        d dVar = new d("INSTANCE", 0);
        f16793a = dVar;
        f16794b = new d[]{dVar};
    }

    public static void a(He.f fVar) {
        fVar.e(f16793a);
        fVar.onComplete();
    }

    public static void b(Throwable th, He.f fVar) {
        fVar.e(f16793a);
        fVar.onError(th);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f16794b.clone();
    }

    @Override // Oe.d
    public final int c(int i5) {
        return 2;
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Oe.h
    public final Object poll() {
        return null;
    }

    @Override // ug.b
    public final void request(long j8) {
        f.c(j8);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // ug.b
    public final void cancel() {
    }

    @Override // Oe.h
    public final void clear() {
    }
}
