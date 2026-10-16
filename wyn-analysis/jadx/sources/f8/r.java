package f8;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import q.F0;
import q.J;
import q.M;

/* loaded from: classes4.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35214b;

    public /* synthetic */ r(Object obj, int i5) {
        this.f35213a = i5;
        this.f35214b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j8) {
        Object item;
        switch (this.f35213a) {
            case 0:
                t tVar = (t) this.f35214b;
                if (i5 < 0) {
                    F0 f02 = tVar.f35218e;
                    item = !f02.f43651z.isShowing() ? null : f02.f43629c.getSelectedItem();
                } else {
                    item = tVar.getAdapter().getItem(i5);
                }
                t.a(tVar, item);
                AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
                F0 f03 = tVar.f35218e;
                if (onItemClickListener != null) {
                    if (view == null || i5 < 0) {
                        view = f03.f43651z.isShowing() ? f03.f43629c.getSelectedView() : null;
                        i5 = !f03.f43651z.isShowing() ? -1 : f03.f43629c.getSelectedItemPosition();
                        j8 = !f03.f43651z.isShowing() ? Long.MIN_VALUE : f03.f43629c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(f03.f43629c, view, i5, j8);
                }
                f03.dismiss();
                break;
            case 1:
                J j10 = (J) this.f35214b;
                j10.f43664H.setSelection(i5);
                M m10 = j10.f43664H;
                if (m10.getOnItemClickListener() != null) {
                    m10.performItemClick(view, i5, j10.f43661E.getItemId(i5));
                }
                j10.dismiss();
                break;
            default:
                ((SearchView) this.f35214b).p(i5);
                break;
        }
    }
}
