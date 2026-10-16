package defpackage;

import android.R;
import android.content.Context;
import android.support.v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* loaded from: classes2.dex */
final class eg extends ArrayAdapter {
    final /* synthetic */ AlertController.RecycleListView a;
    final /* synthetic */ ej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(ej ejVar, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.b = ejVar;
        this.a = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ej ejVar = this.b;
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = ejVar.s;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
