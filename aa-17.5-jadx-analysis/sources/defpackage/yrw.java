package defpackage;

/* loaded from: classes.dex */
public abstract class yrw {
    public final int a;
    public final ypl b;

    protected yrw(ypl yplVar, int i) {
        if (yplVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "invalid index: "));
        }
        this.a = i;
        this.b = yplVar;
    }

    public abstract void a(ysa ysaVar, Object obj);
}
