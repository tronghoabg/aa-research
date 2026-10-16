package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiqx {
    private final java.lang.Throwable throwable;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 1) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    private aiqx(java.lang.Throwable th) {
        if (th == null) {
            $$$reportNull$$$0(0);
        }
        this.throwable = th;
    }

    public java.lang.Throwable getThrowable() {
        java.lang.Throwable th = this.throwable;
        if (th == null) {
            $$$reportNull$$$0(1);
        }
        return th;
    }

    public java.lang.String toString() {
        return this.throwable.toString();
    }

    public /* synthetic */ aiqx(java.lang.Throwable th, defpackage.aiqw aiqwVar) {
        this(th);
    }
}
