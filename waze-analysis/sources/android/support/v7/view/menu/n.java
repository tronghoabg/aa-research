package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class n extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    final q f819a;

    /* renamed from: b, reason: collision with root package name */
    private int f820b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f821c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f822d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f823e;

    /* renamed from: f, reason: collision with root package name */
    private final int f824f;

    public n(q qVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f822d = z;
        this.f823e = layoutInflater;
        this.f819a = qVar;
        this.f824f = i2;
        c();
    }

    public final q a() {
        return this.f819a;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t getItem(int i2) {
        boolean z = this.f822d;
        q qVar = this.f819a;
        ArrayList arrayListH = z ? qVar.h() : qVar.i();
        int i3 = this.f820b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (t) arrayListH.get(i2);
    }

    final void c() {
        q qVar = this.f819a;
        t tVarD = qVar.d();
        if (tVarD != null) {
            ArrayList arrayListH = qVar.h();
            int size = arrayListH.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((t) arrayListH.get(i2)) == tVarD) {
                    this.f820b = i2;
                    return;
                }
            }
        }
        this.f820b = -1;
    }

    public final void d(boolean z) {
        this.f821c = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.f822d;
        q qVar = this.f819a;
        return this.f820b < 0 ? (z ? qVar.h() : qVar.i()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f823e.inflate(this.f824f, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        int groupId2 = i3 >= 0 ? getItem(i3).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f819a.C() && groupId != groupId2) {
            z = true;
        }
        listMenuItemView.b(z);
        ae aeVar = (ae) view;
        if (this.f821c) {
            listMenuItemView.c();
        }
        aeVar.h(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        c();
        super.notifyDataSetChanged();
    }
}
