package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public abstract class I {
    private final J mObservable = new J();
    private boolean mHasStableIds = false;
    private H mStateRestorationPolicy = H.f18775a;

    public final void bindViewHolder(m0 m0Var, int i5) {
        boolean z2 = m0Var.mBindingAdapter == null;
        if (z2) {
            m0Var.mPosition = i5;
            if (hasStableIds()) {
                m0Var.mItemId = getItemId(i5);
            }
            m0Var.setFlags(1, 519);
            int i10 = g1.h.f35502a;
            Trace.beginSection("RV OnBindView");
        }
        m0Var.mBindingAdapter = this;
        onBindViewHolder(m0Var, i5, m0Var.getUnmodifiedPayloads());
        if (z2) {
            m0Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = m0Var.itemView.getLayoutParams();
            if (layoutParams instanceof W) {
                ((W) layoutParams).f18814c = true;
            }
            int i11 = g1.h.f35502a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
    }

    public final m0 createViewHolder(ViewGroup viewGroup, int i5) {
        try {
            int i10 = g1.h.f35502a;
            Trace.beginSection("RV CreateView");
            m0 m0VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i5);
            if (m0VarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            m0VarOnCreateViewHolder.mItemViewType = i5;
            Trace.endSection();
            return m0VarOnCreateViewHolder;
        } catch (Throwable th) {
            int i11 = g1.h.f35502a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(I i5, m0 m0Var, int i10) {
        if (i5 == this) {
            return i10;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i5) {
        return -1L;
    }

    public int getItemViewType(int i5) {
        return 0;
    }

    public final H getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i5) {
        this.mObservable.d(i5, 1, null);
    }

    public final void notifyItemInserted(int i5) {
        this.mObservable.e(i5, 1);
    }

    public final void notifyItemMoved(int i5, int i10) {
        this.mObservable.c(i5, i10);
    }

    public final void notifyItemRangeChanged(int i5, int i10) {
        this.mObservable.d(i5, i10, null);
    }

    public final void notifyItemRangeInserted(int i5, int i10) {
        this.mObservable.e(i5, i10);
    }

    public final void notifyItemRangeRemoved(int i5, int i10) {
        this.mObservable.f(i5, i10);
    }

    public final void notifyItemRemoved(int i5) {
        this.mObservable.f(i5, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(m0 m0Var, int i5);

    public void onBindViewHolder(m0 m0Var, int i5, List<Object> list) {
        onBindViewHolder(m0Var, i5);
    }

    public abstract m0 onCreateViewHolder(ViewGroup viewGroup, int i5);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(m0 m0Var) {
        return false;
    }

    public void onViewAttachedToWindow(m0 m0Var) {
    }

    public void onViewDetachedFromWindow(m0 m0Var) {
    }

    public void onViewRecycled(m0 m0Var) {
    }

    public void registerAdapterDataObserver(K k) {
        this.mObservable.registerObserver(k);
    }

    public void setHasStableIds(boolean z2) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z2;
    }

    public void setStateRestorationPolicy(H h10) {
        this.mStateRestorationPolicy = h10;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(K k) {
        this.mObservable.unregisterObserver(k);
    }

    public final void notifyItemChanged(int i5, Object obj) {
        this.mObservable.d(i5, 1, obj);
    }

    public final void notifyItemRangeChanged(int i5, int i10, Object obj) {
        this.mObservable.d(i5, i10, obj);
    }
}
