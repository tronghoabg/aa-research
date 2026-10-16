package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class fer implements ffz {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public fer(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.ffz
    public final void b(fgc fgcVar) {
        throw null;
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void c(fgc fgcVar) {
        fgcVar.P(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.ffz
    public final void f() {
        throw null;
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void g(fgc fgcVar) {
        fgcVar.P(this);
        fgcVar.H(this);
    }

    @Override // defpackage.ffz
    public final void d() {
    }

    @Override // defpackage.ffz
    public final void e() {
    }

    @Override // defpackage.ffz
    public final void a(fgc fgcVar) {
    }
}
