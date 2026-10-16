package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abd extends defpackage.afck {
    final /* synthetic */ defpackage.abb a;
    private int b;

    public abd(defpackage.abb abbVar) {
        this.a = abbVar;
    }

    @Override // defpackage.afck
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
