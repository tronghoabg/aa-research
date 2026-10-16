package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class yln<T> implements Comparator<T> {
    protected yln() {
    }

    public yln a() {
        return new ylj(this);
    }

    public yln b() {
        return new ylk(this);
    }

    public yln c() {
        return new yme(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}
