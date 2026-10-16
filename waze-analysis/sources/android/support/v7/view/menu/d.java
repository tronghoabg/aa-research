package android.support.v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class d implements ad {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f780a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f781b;

    /* renamed from: c, reason: collision with root package name */
    protected q f782c;

    /* renamed from: d, reason: collision with root package name */
    protected final LayoutInflater f783d;

    /* renamed from: e, reason: collision with root package name */
    protected af f784e;

    /* renamed from: f, reason: collision with root package name */
    private ac f785f;

    public d(Context context) {
        this.f780a = context;
        this.f783d = LayoutInflater.from(context);
    }

    public final ac a() {
        return this.f785f;
    }

    public View b(t tVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    @Override // android.support.v7.view.menu.ad
    public void c(Context context, q qVar) {
        throw null;
    }

    @Override // android.support.v7.view.menu.ad
    public void d(q qVar, boolean z) {
        ac acVar = this.f785f;
        if (acVar != null) {
            acVar.a(qVar, z);
        }
    }

    @Override // android.support.v7.view.menu.ad
    public final void e(ac acVar) {
        this.f785f = acVar;
    }

    @Override // android.support.v7.view.menu.ad
    public boolean f() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.support.v7.view.menu.q] */
    @Override // android.support.v7.view.menu.ad
    public boolean g(al alVar) {
        ac acVar = this.f785f;
        al alVar2 = alVar;
        if (acVar == null) {
            return false;
        }
        if (alVar == null) {
            alVar2 = this.f782c;
        }
        return acVar.b(alVar2);
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
    public void j() {
        throw null;
    }
}
