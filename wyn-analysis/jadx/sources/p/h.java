package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final k f43032a;

    /* renamed from: b, reason: collision with root package name */
    public int f43033b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43034c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43035d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f43036e;

    /* renamed from: f, reason: collision with root package name */
    public final int f43037f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z2, int i5) {
        this.f43035d = z2;
        this.f43036e = layoutInflater;
        this.f43032a = kVar;
        this.f43037f = i5;
        a();
    }

    public final void a() {
        k kVar = this.f43032a;
        m mVar = kVar.f43059v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f43048j;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (((m) arrayList.get(i5)) == mVar) {
                    this.f43033b = i5;
                    return;
                }
            }
        }
        this.f43033b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i5) {
        ArrayList arrayListL;
        k kVar = this.f43032a;
        if (this.f43035d) {
            kVar.i();
            arrayListL = kVar.f43048j;
        } else {
            arrayListL = kVar.l();
        }
        int i10 = this.f43033b;
        if (i10 >= 0 && i5 >= i10) {
            i5++;
        }
        return (m) arrayListL.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        k kVar = this.f43032a;
        if (this.f43035d) {
            kVar.i();
            arrayListL = kVar.f43048j;
        } else {
            arrayListL = kVar.l();
        }
        return this.f43033b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f43036e.inflate(this.f43037f, viewGroup, false);
        }
        int i10 = getItem(i5).f43069b;
        int i11 = i5 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f43069b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f43032a.m() && i10 != i12) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        y yVar = (y) view;
        if (this.f43034c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.c(getItem(i5));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
