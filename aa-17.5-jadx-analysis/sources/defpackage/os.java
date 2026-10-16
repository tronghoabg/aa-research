package defpackage;

/* loaded from: classes.dex */
public final class os {
    public final int a;
    public final int b;
    public final Object c;

    public os(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        if (i < 0) {
            asl.c("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        asl.c("size should be > 0");
    }

    public final int a(boolean z) {
        return z ? this.b : this.a;
    }

    public os(int i, int i2, afec afecVar) {
        this.a = i;
        this.b = i2;
        this.c = afecVar;
    }
}
