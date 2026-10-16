package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fgz extends android.util.Property {
    public fgz(java.lang.Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return ((android.view.View) obj).getClipBounds();
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((android.view.View) obj).setClipBounds((android.graphics.Rect) obj2);
    }
}
