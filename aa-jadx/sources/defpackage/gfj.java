package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gfj implements java.util.function.Consumer {
    final /* synthetic */ defpackage.aiuf a;

    public gfj(defpackage.aiuf aiufVar) {
        this.a = aiufVar;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        this.a.w((android.graphics.drawable.Drawable) obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }
}
