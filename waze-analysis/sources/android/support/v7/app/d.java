package android.support.v7.app;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class d extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertController$RecycleListView f577a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, Context context, int i2, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i2, R.id.text1, charSequenceArr);
        this.f578b = gVar;
        this.f577a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        g gVar = this.f578b;
        View view2 = super.getView(i2, view, viewGroup);
        boolean[] zArr = gVar.s;
        if (zArr != null && zArr[i2]) {
            this.f577a.setItemChecked(i2, true);
        }
        return view2;
    }
}
