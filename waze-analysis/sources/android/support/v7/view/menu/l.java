package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.waze.R;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f811a;

    /* renamed from: b, reason: collision with root package name */
    private int f812b = -1;

    public l(m mVar) {
        this.f811a = mVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t getItem(int i2) {
        ArrayList arrayListH = this.f811a.f815c.h();
        int i3 = this.f812b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (t) arrayListH.get(i2);
    }

    final void b() {
        m mVar = this.f811a;
        t tVarD = mVar.f815c.d();
        if (tVarD != null) {
            ArrayList arrayListH = mVar.f815c.h();
            int size = arrayListH.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((t) arrayListH.get(i2)) == tVarD) {
                    this.f812b = i2;
                    return;
                }
            }
        }
        this.f812b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.f811a.f815c.h().size();
        return this.f812b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f811a.f814b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((ae) view).h(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
