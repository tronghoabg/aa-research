package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yms<T> implements java.util.Comparator<T> {
    protected yms() {
    }

    public defpackage.yms a() {
        return new ymo(this);
    }

    public defpackage.yms b() {
        return new ymp(this);
    }

    public defpackage.yms c() {
        return new ynj(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}
