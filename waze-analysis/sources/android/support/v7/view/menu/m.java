package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class m implements AdapterView.OnItemClickListener, ad {

    /* renamed from: a, reason: collision with root package name */
    Context f813a;

    /* renamed from: b, reason: collision with root package name */
    LayoutInflater f814b;

    /* renamed from: c, reason: collision with root package name */
    q f815c;

    /* renamed from: d, reason: collision with root package name */
    ExpandedMenuView f816d;

    /* renamed from: e, reason: collision with root package name */
    l f817e;

    /* renamed from: f, reason: collision with root package name */
    private ac f818f;

    public m(Context context) {
        this.f813a = context;
        this.f814b = LayoutInflater.from(context);
    }

    public final af a(ViewGroup viewGroup) {
        if (this.f816d == null) {
            this.f816d = (ExpandedMenuView) this.f814b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            l lVar = this.f817e;
            if (lVar == null) {
                lVar = new l(this);
                this.f817e = lVar;
            }
            this.f816d.setAdapter((ListAdapter) lVar);
            this.f816d.setOnItemClickListener(this);
        }
        return this.f816d;
    }

    public final ListAdapter b() {
        l lVar = this.f817e;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f817e = lVar2;
        return lVar2;
    }

    @Override // android.support.v7.view.menu.ad
    public final void c(Context context, q qVar) {
        if (this.f813a != null) {
            this.f813a = context;
            if (this.f814b == null) {
                this.f814b = LayoutInflater.from(context);
            }
        }
        this.f815c = qVar;
        l lVar = this.f817e;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.ad
    public final void d(q qVar, boolean z) {
        ac acVar = this.f818f;
        if (acVar != null) {
            acVar.a(qVar, z);
        }
    }

    @Override // android.support.v7.view.menu.ad
    public final void e(ac acVar) {
        this.f818f = acVar;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean f() {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean g(al alVar) {
        if (!alVar.hasVisibleItems()) {
            return false;
        }
        new r(alVar).c();
        ac acVar = this.f818f;
        if (acVar == null) {
            return true;
        }
        acVar.b(alVar);
        return true;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean h(t tVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final boolean i(t tVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.ad
    public final void j() {
        l lVar = this.f817e;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f815c.G(this.f817e.getItem(i2), this, 0);
    }
}
