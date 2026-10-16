package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.wynauto.wyn.R;
import java.util.ArrayList;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3755f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f43024a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f43025b;

    public C3755f(g gVar) {
        this.f43025b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f43025b.f43028c;
        m mVar = kVar.f43059v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f43048j;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((m) arrayList.get(i5)) == mVar) {
                    this.f43024a = i5;
                    return;
                }
            }
        }
        this.f43024a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i5) {
        g gVar = this.f43025b;
        k kVar = gVar.f43028c;
        kVar.i();
        ArrayList arrayList = kVar.f43048j;
        gVar.getClass();
        int i10 = this.f43024a;
        if (i10 >= 0 && i5 >= i10) {
            i5++;
        }
        return (m) arrayList.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        g gVar = this.f43025b;
        k kVar = gVar.f43028c;
        kVar.i();
        int size = kVar.f43048j.size();
        gVar.getClass();
        return this.f43024a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f43025b.f43027b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).c(getItem(i5));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
