package defpackage;

import android.content.Context;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* loaded from: classes2.dex */
public final class hc implements AdapterView.OnItemClickListener, hs {
    Context a;
    public LayoutInflater b;
    hg c;
    public ExpandedMenuView d;
    public hr e;
    public hb f;

    public hc(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        hb hbVar = this.f;
        if (hbVar != null) {
            return hbVar;
        }
        hb hbVar2 = new hb(this);
        this.f = hbVar2;
        return hbVar2;
    }

    @Override // defpackage.hs
    public final void b(Context context, hg hgVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = hgVar;
        hb hbVar = this.f;
        if (hbVar != null) {
            hbVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.hs
    public final void c(hg hgVar, boolean z) {
        hr hrVar = this.e;
        if (hrVar != null) {
            hrVar.a(hgVar, z);
        }
    }

    @Override // defpackage.hs
    public final void d(hr hrVar) {
        throw null;
    }

    @Override // defpackage.hs
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hs
    public final boolean f(ia iaVar) {
        if (!iaVar.hasVisibleItems()) {
            return false;
        }
        hh hhVar = new hh(iaVar);
        hg hgVar = hhVar.a;
        em emVar = new em(hgVar.a);
        hhVar.c = new hc(emVar.a());
        hc hcVar = hhVar.c;
        hcVar.e = hhVar;
        hgVar.g(hcVar);
        emVar.c(hhVar.c.a(), hhVar);
        View view = hgVar.g;
        if (view != null) {
            emVar.e(view);
        } else {
            emVar.f(hgVar.f);
            emVar.o(hgVar.e);
        }
        emVar.a.n = hhVar;
        hhVar.b = emVar.b();
        hhVar.b.setOnDismissListener(hhVar);
        WindowManager.LayoutParams attributes = hhVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hhVar.b.show();
        hr hrVar = this.e;
        if (hrVar == null) {
            return true;
        }
        hrVar.b(iaVar);
        return true;
    }

    @Override // defpackage.hs
    public final boolean g(hi hiVar) {
        return false;
    }

    @Override // defpackage.hs
    public final boolean h(hi hiVar) {
        return false;
    }

    @Override // defpackage.hs
    public final void i() {
        hb hbVar = this.f;
        if (hbVar != null) {
            hbVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.z(this.f.getItem(i), this, 0);
    }
}
