package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yms<T> implements java.util.Comparator<T> {
    protected yms() {
    }

    public defpackage.yms a() {
        return new defpackage.ymo(this);
    }

    public defpackage.yms b() {
        return new defpackage.ymp(this);
    }

    public defpackage.yms c() {
        return new defpackage.ynj(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}
