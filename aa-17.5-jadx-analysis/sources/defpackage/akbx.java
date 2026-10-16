package defpackage;

/* loaded from: classes2.dex */
public final class akbx {
    private final Object a;

    public akbx(float f) {
        this.a = Float.valueOf(f);
    }

    private final void c(int i) {
        int i2;
        Object obj = this.a;
        if (obj instanceof Boolean) {
            i2 = 1;
        } else if (obj instanceof Long) {
            i2 = 2;
        } else if (obj instanceof Float) {
            i2 = 3;
        } else if (obj instanceof String) {
            i2 = 4;
        } else {
            if (!(obj instanceof abms)) {
                throw new IllegalStateException("Unexpected flag value type: ".concat(String.valueOf(obj.getClass().getName())));
            }
            i2 = 5;
        }
        if (i == i2) {
            return;
        }
        throw new IllegalStateException("Attempted to access flag value as " + ahlf.c(i) + ", but actual type is " + ahlf.c(i2));
    }

    public final String a() {
        c(4);
        return (String) this.a;
    }

    public final boolean b() {
        c(1);
        return ((Boolean) this.a).booleanValue();
    }

    public final String toString() {
        return this.a.toString();
    }

    public akbx(Object obj) {
        this.a = obj;
    }

    public akbx(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public akbx(long j) {
        this.a = Long.valueOf(j);
    }
}
