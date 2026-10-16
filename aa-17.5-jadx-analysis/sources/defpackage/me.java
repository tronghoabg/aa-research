package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class me {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public final /* synthetic */ RecyclerView f;
    duw g;

    public me(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.f;
            ml mlVar = recyclerView.N;
            if (i < mlVar.a()) {
                return !mlVar.g ? i : recyclerView.g.a(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.f;
        sb.append(recyclerView2.N.a());
        sb.append(recyclerView2.n());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    final void b(mo moVar, boolean z) {
        RecyclerView.w(moVar);
        RecyclerView recyclerView = this.f;
        View view = moVar.a;
        mq mqVar = recyclerView.R;
        if (mqVar != null) {
            dzp dzpVarJ = mqVar.j();
            ebm.o(view, dzpVarJ instanceof mp ? (dzp) ((mp) dzpVarJ).b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((mf) list.get(i)).a();
            }
            lt ltVar = recyclerView.m;
            if (ltVar != null) {
                ltVar.o(moVar);
            }
            if (recyclerView.N != null) {
                recyclerView.ab.E(moVar);
            }
        }
        moVar.r = null;
        moVar.q = null;
        duw duwVarP = p();
        int i2 = moVar.f;
        ArrayList arrayList = duwVarP.e(i2).a;
        if (((md) ((SparseArray) duwVarP.c).get(i2)).b <= arrayList.size()) {
            ebf.fJ(view);
        } else {
            moVar.l();
            arrayList.add(moVar);
        }
    }

    public final void c() {
        this.a.clear();
        g();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void d() {
        RecyclerView recyclerView;
        lt ltVar;
        duw duwVar = this.g;
        if (duwVar == null || (ltVar = (recyclerView = this.f).m) == null || !recyclerView.q) {
            return;
        }
        duwVar.b.add(ltVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void e(lt ltVar, boolean z) {
        duw duwVar = this.g;
        if (duwVar == null) {
            return;
        }
        ?? r0 = duwVar.b;
        r0.remove(ltVar);
        if (r0.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) duwVar.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((md) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ebf.fJ(((mo) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void f(View view) {
        mo moVarK = RecyclerView.k(view);
        moVarK.m = null;
        moVarK.n = false;
        moVarK.i();
        j(moVarK);
    }

    public final void g() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f.M.b();
                return;
            }
            h(size);
        }
    }

    public final void h(int i) {
        int i2 = RecyclerView.ac;
        ArrayList arrayList = this.c;
        b((mo) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        mo moVarK = RecyclerView.k(view);
        if (moVarK.x()) {
            this.f.removeDetachedView(view, false);
        }
        if (moVarK.w()) {
            moVarK.p();
        } else if (moVarK.B()) {
            moVarK.i();
        }
        j(moVarK);
        RecyclerView recyclerView = this.f;
        if (recyclerView.E == null || moVarK.u()) {
            return;
        }
        recyclerView.E.c(moVarK);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j(defpackage.mo r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me.j(mo):void");
    }

    final void k(View view) {
        lw lwVar;
        int i = RecyclerView.ac;
        mo moVar = view == null ? null : ((ma) view.getLayoutParams()).c;
        if (!moVar.q(12) && moVar.y() && (lwVar = this.f.E) != null && !lwVar.g(moVar, moVar.d())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            moVar.o(this, true);
            this.b.add(moVar);
            return;
        }
        if (moVar.t() && !moVar.v()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.m.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.n()));
            }
        }
        moVar.o(this, false);
        this.a.add(moVar);
    }

    public final void l(mo moVar) {
        if (moVar.n) {
            this.b.remove(moVar);
        } else {
            this.a.remove(moVar);
        }
        moVar.m = null;
        moVar.n = false;
        moVar.i();
    }

    public final void m() {
        lz lzVar = this.f.n;
        this.e = (lzVar != null ? lzVar.y : 0) + 2;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.e) {
                return;
            } else {
                h(size);
            }
        }
    }

    public final View n(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Type inference failed for: r6v0, types: [lt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.mo o(int r24, long r25) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me.o(int, long):mo");
    }

    public final duw p() {
        if (this.g == null) {
            this.g = new duw();
            d();
        }
        return this.g;
    }
}
