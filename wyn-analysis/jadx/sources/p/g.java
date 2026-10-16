package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j.C3065b;
import j.C3068e;
import j.DialogInterfaceC3069f;

/* loaded from: classes.dex */
public final class g implements x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f43026a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f43027b;

    /* renamed from: c, reason: collision with root package name */
    public k f43028c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f43029d;

    /* renamed from: e, reason: collision with root package name */
    public w f43030e;

    /* renamed from: f, reason: collision with root package name */
    public C3755f f43031f;

    public g(Context context) {
        this.f43026a = context;
        this.f43027b = LayoutInflater.from(context);
    }

    @Override // p.x
    public final void b(Context context, k kVar) {
        if (this.f43026a != null) {
            this.f43026a = context;
            if (this.f43027b == null) {
                this.f43027b = LayoutInflater.from(context);
            }
        }
        this.f43028c = kVar;
        C3755f c3755f = this.f43031f;
        if (c3755f != null) {
            c3755f.notifyDataSetChanged();
        }
    }

    @Override // p.x
    public final void c(w wVar) {
        throw null;
    }

    @Override // p.x
    public final void d() {
        C3755f c3755f = this.f43031f;
        if (c3755f != null) {
            c3755f.notifyDataSetChanged();
        }
    }

    @Override // p.x
    public final boolean e(m mVar) {
        return false;
    }

    @Override // p.x
    public final boolean f(m mVar) {
        return false;
    }

    @Override // p.x
    public final boolean g() {
        return false;
    }

    @Override // p.x
    public final boolean h(SubMenuC3749D subMenuC3749D) {
        if (!subMenuC3749D.hasVisibleItems()) {
            return false;
        }
        l lVar = new l();
        lVar.f43062a = subMenuC3749D;
        Context context = subMenuC3749D.f43039a;
        C3068e c3068e = new C3068e(context);
        g gVar = new g(c3068e.getContext());
        lVar.f43064c = gVar;
        gVar.f43030e = lVar;
        subMenuC3749D.b(gVar, context);
        g gVar2 = lVar.f43064c;
        if (gVar2.f43031f == null) {
            gVar2.f43031f = new C3755f(gVar2);
        }
        C3755f c3755f = gVar2.f43031f;
        C3065b c3065b = c3068e.f38456a;
        c3065b.k = c3755f;
        c3065b.f38422l = lVar;
        View view = subMenuC3749D.f43052o;
        if (view != null) {
            c3065b.f38416e = view;
        } else {
            c3065b.f38414c = subMenuC3749D.f43051n;
            c3068e.setTitle(subMenuC3749D.f43050m);
        }
        c3065b.f38421j = lVar;
        DialogInterfaceC3069f dialogInterfaceC3069fCreate = c3068e.create();
        lVar.f43063b = dialogInterfaceC3069fCreate;
        dialogInterfaceC3069fCreate.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.f43063b.getWindow().getAttributes();
        attributes.type = BackupConstant.SCENE_CLOSED_WITHOUT_SHOW;
        attributes.flags |= 131072;
        lVar.f43063b.show();
        w wVar = this.f43030e;
        if (wVar == null) {
            return true;
        }
        wVar.F(subMenuC3749D);
        return true;
    }

    @Override // p.x
    public final void l(k kVar, boolean z2) {
        w wVar = this.f43030e;
        if (wVar != null) {
            wVar.l(kVar, z2);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j8) {
        this.f43028c.q(this.f43031f.getItem(i5), this, 0);
    }
}
