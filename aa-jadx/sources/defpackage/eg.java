package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eg extends android.widget.ArrayAdapter {
    final /* synthetic */ android.support.v7.app.AlertController.RecycleListView a;
    final /* synthetic */ defpackage.ej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(defpackage.ej ejVar, android.content.Context context, int i, java.lang.CharSequence[] charSequenceArr, android.support.v7.app.AlertController.RecycleListView recycleListView) {
        super(context, i, android.R.id.text1, charSequenceArr);
        this.b = ejVar;
        this.a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        defpackage.ej ejVar = this.b;
        android.view.View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = ejVar.s;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
