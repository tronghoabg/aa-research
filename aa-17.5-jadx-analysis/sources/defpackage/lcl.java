package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final /* synthetic */ class lcl implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lcl(ao aoVar, int i) {
        this.b = i;
        this.a = aoVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.b;
        if (i2 == 0) {
            lco.h((lco) this.a, i);
            return;
        }
        if (i2 == 1) {
            Object obj = this.a;
            jr jrVar = (jr) obj;
            AppCompatSpinner appCompatSpinner = jrVar.d;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(view, i, jrVar.b.getItemId(i));
            }
            ((lk) obj).k();
            return;
        }
        if (i2 == 2) {
            lct.h((lct) this.a, i);
            return;
        }
        if (i2 != 3) {
            ((zvs) ((aacq) this.a).a).c(i);
            return;
        }
        Object obj2 = this.a;
        if (i < 0) {
            lk lkVar = ((wxf) obj2).a;
            item = !lkVar.u() ? null : lkVar.e.getSelectedItem();
        } else {
            item = ((wxf) obj2).getAdapter().getItem(i);
        }
        wxf wxfVar = (wxf) this.a;
        wxfVar.setText(wxfVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = wxfVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                lk lkVar2 = wxfVar.a;
                view = !lkVar2.u() ? null : lkVar2.e.getSelectedView();
                i = lkVar2.o();
                j = !lkVar2.u() ? Long.MIN_VALUE : lkVar2.e.getSelectedItemId();
            }
            onItemClickListener.onItemClick(wxfVar.a.e, view, i, j);
        }
        wxfVar.a.k();
    }

    public lcl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
