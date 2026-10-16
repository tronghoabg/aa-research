package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eeg extends android.view.View {
    final /* synthetic */ android.view.ViewGroup a;
    final /* synthetic */ defpackage.eej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeg(defpackage.eej eejVar, android.content.Context context, android.view.ViewGroup viewGroup) {
        super(context);
        this.b = eejVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.graphics.drawable.Drawable background = this.a.getBackground();
        int color = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0;
        defpackage.eej eejVar = this.b;
        if (eejVar.e == color) {
            return;
        }
        eejVar.e = color;
        java.util.ArrayList arrayList = eejVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.eee) arrayList.get(size)).c();
            }
        }
    }
}
