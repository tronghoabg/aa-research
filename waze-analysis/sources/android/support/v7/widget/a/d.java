package android.support.v7.widget.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eh;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f995a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f996b;

    d(j jVar, i iVar) {
        this.f996b = jVar;
        this.f995a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f996b;
        RecyclerView recyclerView = jVar.f1024k;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        i iVar = this.f995a;
        if (iVar.n || iVar.f1009h.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        eh ehVarK = jVar.f1024k.k();
        if (ehVarK == null || !ehVarK.m()) {
            List list = jVar.f1023j;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((i) list.get(i2)).o) {
                }
            }
            return;
        }
        jVar.f1024k.post(this);
    }
}
