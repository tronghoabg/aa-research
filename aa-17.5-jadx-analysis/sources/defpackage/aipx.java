package defpackage;

/* loaded from: classes3.dex */
final class aipx {
    private final Throwable throwable;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "throwable";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        } else {
            objArr[1] = "getThrowable";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    private aipx(Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(0);
        }
        this.throwable = th;
    }

    public Throwable getThrowable() {
        Throwable th = this.throwable;
        if (th == null) {
            $$$reportNull$$$0(1);
        }
        return th;
    }

    public String toString() {
        return this.throwable.toString();
    }

    public /* synthetic */ aipx(Throwable th, aipw aipwVar) {
        this(th);
    }
}
