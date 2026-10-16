package Me;

import Oe.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7635a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f7636b;

    static {
        b bVar = new b("INSTANCE", 0);
        f7635a = bVar;
        f7636b = new b[]{bVar, new b("NEVER", 1)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7636b.clone();
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

    @Override // Oe.h
    public final void clear() {
    }

    @Override // Je.b
    public final void dispose() {
    }
}
