package l8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l8.T, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3417T implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3417T f40068a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3417T[] f40069b;

    static {
        EnumC3417T enumC3417T = new EnumC3417T("INSTANCE", 0);
        f40068a = enumC3417T;
        f40069b = new EnumC3417T[]{enumC3417T};
    }

    public static EnumC3417T valueOf(String str) {
        return (EnumC3417T) Enum.valueOf(EnumC3417T.class, str);
    }

    public static EnumC3417T[] values() {
        return (EnumC3417T[]) f40069b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Fe.e.w("no calls to next() since the last call to remove()", false);
    }
}
