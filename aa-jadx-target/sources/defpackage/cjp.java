package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjp implements android.view.View.OnAttachStateChangeListener {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public cjp(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i = this.b;
        if (i == 0) {
            ((defpackage.cjq) this.a).c(view.getContext());
        } else {
            if (i != 1) {
                return;
            }
            android.view.View view2 = (android.view.View) this.a;
            view2.removeOnAttachStateChangeListener(this);
            int[] iArr = defpackage.ebt.a;
            view2.requestApplyInsets();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [aiwg, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        int i = this.b;
        if (i == 0) {
            android.content.Context context = view.getContext();
            defpackage.cjq cjqVar = (defpackage.cjq) this.a;
            if (cjqVar.a) {
                context.getApplicationContext().unregisterComponentCallbacks(cjqVar.b);
                cjqVar.a = false;
            }
            cjqVar.b();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                view.removeOnAttachStateChangeListener(this);
                this.a.s((java.util.concurrent.CancellationException) null);
                return;
            }
            java.lang.Object obj = this.a;
            java.util.Iterator itA = defpackage.ebn.b((android.view.View) obj).a();
            while (itA.hasNext()) {
                java.lang.Object obj2 = (android.view.ViewParent) itA.next();
                if (obj2 instanceof android.view.View) {
                    android.view.View view2 = (android.view.View) obj2;
                    view2.getClass();
                    java.lang.Object tag = view2.getTag(2131428439);
                    java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        return;
                    }
                }
            }
            ((defpackage.czl) obj).e();
        }
    }
}
