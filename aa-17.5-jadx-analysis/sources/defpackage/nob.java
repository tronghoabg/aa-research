package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
final class nob extends bg implements eru {
    final /* synthetic */ noc a;
    private final Context f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nob(noc nocVar, Context context, Handler handler) {
        super(context, handler);
        this.a = nocVar;
        this.f = context;
    }

    @Override // defpackage.bg, defpackage.be
    public final View a(int i) {
        return this.a.c.findViewById(i);
    }

    @Override // defpackage.bg
    public final LayoutInflater c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.c);
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom.cloneInContext(this.f);
    }

    @Override // defpackage.bg
    public final /* synthetic */ Object e() {
        return this.a;
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        return this.a.i;
    }

    @Override // defpackage.bg
    public final boolean o(String str) {
        throw new UnsupportedOperationException("Permissions not implemented in AbstractFragmentHost");
    }

    @Override // defpackage.bg
    public final void u(String[] strArr) {
        throw new UnsupportedOperationException("Permissions not implemented in AbstractFragmentHost");
    }
}
