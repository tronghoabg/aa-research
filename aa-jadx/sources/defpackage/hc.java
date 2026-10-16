package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hc extends android.widget.BaseAdapter {
    final /* synthetic */ defpackage.hd a;
    private int b = -1;

    public hc(defpackage.hd hdVar) {
        this.a = hdVar;
        b();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.hj getItem(int i) {
        java.util.ArrayList arrayListE = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (defpackage.hj) arrayListE.get(i);
    }

    final void b() {
        defpackage.hh hhVar = this.a.c;
        defpackage.hj hjVar = hhVar.i;
        if (hjVar != null) {
            java.util.ArrayList arrayListE = hhVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((defpackage.hj) arrayListE.get(i)) == hjVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(com.google.android.projection.gearhead.R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((defpackage.hu) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
