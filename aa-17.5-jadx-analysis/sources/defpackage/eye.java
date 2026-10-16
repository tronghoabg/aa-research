package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* loaded from: classes2.dex */
final class eye extends dzp {
    final /* synthetic */ eyf a;

    public eye(eyf eyfVar) {
        this.a = eyfVar;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        eyf eyfVar = this.a;
        eyfVar.d.c(view, edgVar);
        RecyclerView recyclerView = eyfVar.c;
        int iC = recyclerView.c(view);
        lt ltVar = recyclerView.m;
        if (ltVar instanceof exy) {
            ((exy) ltVar).b(iC);
        }
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.d.i(view, i, bundle);
    }
}
