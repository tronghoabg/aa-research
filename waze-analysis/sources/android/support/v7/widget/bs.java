package android.support.v7.widget;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bs extends eb {

    /* renamed from: a, reason: collision with root package name */
    private final bu f1179a;

    @SafeVarargs
    public bs(eb... ebVarArr) {
        List listAsList = Arrays.asList(ebVarArr);
        this.f1179a = new bu(this);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            this.f1179a.p((eb) it.next());
        }
        super.setHasStableIds(false);
    }

    final void a(ea eaVar) {
        super.setStateRestorationPolicy(eaVar);
    }

    @Override // android.support.v7.widget.eb
    public final int findRelativeAdapterPositionIn(eb<? extends fe> ebVar, fe feVar, int i2) {
        return this.f1179a.b(ebVar, feVar, i2);
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f1179a.c();
    }

    @Override // android.support.v7.widget.eb
    public final long getItemId(int i2) {
        this.f1179a.s(i2);
        return -1L;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemViewType(int i2) {
        return this.f1179a.a(i2);
    }

    @Override // android.support.v7.widget.eb
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f1179a.e(recyclerView);
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(fe feVar, int i2) {
        this.f1179a.f(feVar, i2);
    }

    @Override // android.support.v7.widget.eb
    public final fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return this.f1179a.d(viewGroup, i2);
    }

    @Override // android.support.v7.widget.eb
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f1179a.g(recyclerView);
    }

    @Override // android.support.v7.widget.eb
    public final boolean onFailedToRecycleView(fe feVar) {
        return this.f1179a.o(feVar);
    }

    @Override // android.support.v7.widget.eb
    public final void onViewAttachedToWindow(fe feVar) {
        this.f1179a.l(feVar);
    }

    @Override // android.support.v7.widget.eb
    public final void onViewDetachedFromWindow(fe feVar) {
        this.f1179a.m(feVar);
    }

    @Override // android.support.v7.widget.eb
    public final void onViewRecycled(fe feVar) {
        this.f1179a.n(feVar);
    }

    @Override // android.support.v7.widget.eb
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // android.support.v7.widget.eb
    public final void setStateRestorationPolicy(ea eaVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
