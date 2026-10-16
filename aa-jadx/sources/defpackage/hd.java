package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hd implements android.widget.AdapterView.OnItemClickListener, defpackage.ht {
    android.content.Context a;
    public android.view.LayoutInflater b;
    defpackage.hh c;
    public android.support.v7.view.menu.ExpandedMenuView d;
    public defpackage.hs e;
    public defpackage.hc f;

    public hd(android.content.Context context) {
        this.a = context;
        this.b = android.view.LayoutInflater.from(context);
    }

    public final android.widget.ListAdapter a() {
        defpackage.hc hcVar = this.f;
        if (hcVar != null) {
            return hcVar;
        }
        defpackage.hc hcVar2 = new defpackage.hc(this);
        this.f = hcVar2;
        return hcVar2;
    }

    @Override // defpackage.ht
    public final void b(android.content.Context context, defpackage.hh hhVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = android.view.LayoutInflater.from(context);
            }
        }
        this.c = hhVar;
        defpackage.hc hcVar = this.f;
        if (hcVar != null) {
            hcVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ht
    public final void c(defpackage.hh hhVar, boolean z) {
        defpackage.hs hsVar = this.e;
        if (hsVar != null) {
            hsVar.a(hhVar, z);
        }
    }

    @Override // defpackage.ht
    public final void d(defpackage.hs hsVar) {
        throw null;
    }

    @Override // defpackage.ht
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ht
    public final boolean f(defpackage.ib ibVar) {
        if (!ibVar.hasVisibleItems()) {
            return false;
        }
        defpackage.hi hiVar = new defpackage.hi(ibVar);
        defpackage.hh hhVar = hiVar.a;
        defpackage.em emVar = new defpackage.em(hhVar.a);
        hiVar.c = new defpackage.hd(emVar.a());
        defpackage.hd hdVar = hiVar.c;
        hdVar.e = hiVar;
        hhVar.g(hdVar);
        emVar.c(hiVar.c.a(), hiVar);
        android.view.View view = hhVar.g;
        if (view != null) {
            emVar.e(view);
        } else {
            emVar.f(hhVar.f);
            emVar.o(hhVar.e);
        }
        emVar.a.n = hiVar;
        hiVar.b = emVar.b();
        hiVar.b.setOnDismissListener(hiVar);
        android.view.WindowManager.LayoutParams attributes = hiVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hiVar.b.show();
        defpackage.hs hsVar = this.e;
        if (hsVar == null) {
            return true;
        }
        hsVar.b(ibVar);
        return true;
    }

    @Override // defpackage.ht
    public final boolean g(defpackage.hj hjVar) {
        return false;
    }

    @Override // defpackage.ht
    public final boolean h(defpackage.hj hjVar) {
        return false;
    }

    @Override // defpackage.ht
    public final void i() {
        defpackage.hc hcVar = this.f;
        if (hcVar != null) {
            hcVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.c.z(this.f.getItem(i), this, 0);
    }
}
