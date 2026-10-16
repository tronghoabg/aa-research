package com.waze.share;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.waze.R;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f37722a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f37723b;

    p(q qVar, List list) {
        this.f37722a = list;
        Objects.requireNonNull(qVar);
        this.f37723b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v vVar = this.f37723b.f37725b;
        RecyclerView recyclerView = (RecyclerView) vVar.findViewById(R.id.shareDialogAppRecycler);
        recyclerView.al(new LinearLayoutManager(0));
        recyclerView.ak(new u(vVar, this.f37722a));
    }
}
