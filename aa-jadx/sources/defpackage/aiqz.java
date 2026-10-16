package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqz {
    private static final java.lang.Object NULL_VALUE = new defpackage.aiqw();
    public static volatile boolean throwWrappedProcessCanceledException = false;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static <V> java.lang.Object escapeNull(V v) {
        if (v == null && (v = (V) NULL_VALUE) == null) {
            $$$reportNull$$$0(1);
        }
        return v;
    }

    public static java.lang.Object escapeThrowable(java.lang.Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(3);
        }
        return new defpackage.aiqx(th, null);
    }

    public static <V> V unescapeExceptionOrNull(java.lang.Object obj) {
        if (obj == null) {
            $$$reportNull$$$0(4);
        }
        unescapeThrowable(obj);
        return (V) unescapeNull(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeNull(java.lang.Object obj) {
        if (obj == 0) {
            $$$reportNull$$$0(0);
        }
        if (obj == NULL_VALUE) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeThrowable(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aiqx)) {
            return obj;
        }
        java.lang.Throwable throwable = ((defpackage.aiqx) obj).getThrowable();
        if (throwWrappedProcessCanceledException && defpackage.aiqe.isProcessCanceledException(throwable)) {
            throw new defpackage.aiqy(throwable);
        }
        throw defpackage.aiqe.rethrow(throwable);
    }
}
