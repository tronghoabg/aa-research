package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahlf {
    public static void a(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "BYTES" : "STRING" : "FLOAT" : "INT" : "BOOL";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends ahon<M>, T> T getExtensionOrNull(ahon<M> ahonVar, ahop<M, T> ahopVar) {
        ahonVar.getClass();
        ahopVar.getClass();
        if (ahonVar.hasExtension(ahopVar)) {
            return (T) ahonVar.getExtension(ahopVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends ahon<M>, T> T getExtensionOrNull(ahon<M> ahonVar, ahop<M, List<T>> ahopVar, int i) {
        ahonVar.getClass();
        ahopVar.getClass();
        if (i < ahonVar.getExtensionCount(ahopVar)) {
            return (T) ahonVar.getExtension(ahopVar, i);
        }
        return null;
    }
}
