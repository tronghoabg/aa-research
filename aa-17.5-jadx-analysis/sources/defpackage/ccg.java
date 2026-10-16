package defpackage;

/* loaded from: classes.dex */
public final class ccg extends ccf {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new cbs(objArr[i], objArr[i + 1]);
    }
}
