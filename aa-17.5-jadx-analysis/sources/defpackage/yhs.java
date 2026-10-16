package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class yhs implements Iterator {
    public static final yhs a;
    private static final /* synthetic */ yhs[] b;

    static {
        yhs yhsVar = new yhs();
        a = yhsVar;
        b = new yhs[]{yhsVar};
    }

    private yhs() {
    }

    public static yhs valueOf(String str) {
        return (yhs) Enum.valueOf(yhs.class, str);
    }

    public static yhs[] values() {
        return (yhs[]) b.clone();
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
        woy.aa(false, "no calls to next() since the last call to remove()");
    }
}
