package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsy extends java.lang.ThreadLocal {
    final /* synthetic */ int a;

    public zsy(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        return new float[this.a];
    }
}
