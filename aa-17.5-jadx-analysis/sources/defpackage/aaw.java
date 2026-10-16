package defpackage;

/* loaded from: classes.dex */
public final class aaw extends afbk {
    final /* synthetic */ aau a;
    private int b;

    public aaw(aau aauVar) {
        this.a = aauVar;
    }

    @Override // defpackage.afbk
    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }
}
