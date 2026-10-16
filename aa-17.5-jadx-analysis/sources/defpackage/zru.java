package defpackage;

/* loaded from: classes3.dex */
public final class zru extends ThreadLocal {
    final /* synthetic */ int a;

    public zru(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return new float[this.a];
    }
}
