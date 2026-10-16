package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class he extends android.widget.BaseAdapter {
    public final defpackage.hh a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final android.view.LayoutInflater e;
    private final int f;

    public he(defpackage.hh hhVar, android.view.LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = hhVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.hj getItem(int i) {
        boolean z = this.d;
        defpackage.hh hhVar = this.a;
        java.util.ArrayList arrayListE = z ? hhVar.e() : hhVar.f();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (defpackage.hj) arrayListE.get(i);
    }

    final void b() {
        defpackage.hh hhVar = this.a;
        defpackage.hj hjVar = hhVar.i;
        if (hjVar != null) {
            java.util.ArrayList arrayListE = hhVar.e();
            int size = arrayListE.size();
            for (int i = 0; i < size; i++) {
                if (((defpackage.hj) arrayListE.get(i)) == hjVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.d;
        defpackage.hh hhVar = this.a;
        java.util.ArrayList arrayListE = z ? hhVar.e() : hhVar.f();
        return this.c < 0 ? arrayListE.size() : arrayListE.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        android.support.v7.view.menu.ListMenuItemView listMenuItemView = (android.support.v7.view.menu.ListMenuItemView) view;
        boolean z = this.a.w() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        android.widget.ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.d || !z) ? 8 : 0);
        }
        defpackage.hu huVar = (defpackage.hu) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        huVar.f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
