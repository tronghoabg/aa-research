package android.support.v7.widget;

import android.os.Trace;
import android.support.v7.widget.fe;
import android.view.ViewGroup;
import androidx.core.os.TraceCompat;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class eb<VH extends fe> {
    private final ec mObservable = new ec();
    private boolean mHasStableIds = false;
    private ea mStateRestorationPolicy = ea.f1385a;

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindViewHolder(VH vh, int i2) {
        boolean z = vh.mBindingAdapter == null;
        if (z) {
            vh.mPosition = i2;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i2);
            }
            vh.setFlags(1, DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
            if (TraceCompat.isEnabled()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh.mItemViewType)));
            }
        }
        vh.mBindingAdapter = this;
        int i3 = RecyclerView.O;
        onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
        if (z) {
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof eo) {
                ((eo) layoutParams).f1420e = true;
            }
            Trace.endSection();
        }
    }

    boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
    }

    public final VH createViewHolder(ViewGroup viewGroup, int i2) {
        try {
            if (TraceCompat.isEnabled()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i2)));
            }
            VH vh = (VH) onCreateViewHolder(viewGroup, i2);
            if (vh.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            vh.mItemViewType = i2;
            return vh;
        } finally {
            Trace.endSection();
        }
    }

    public int findRelativeAdapterPositionIn(eb<? extends fe> ebVar, fe feVar, int i2) {
        if (ebVar == this) {
            return i2;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i2) {
        return -1L;
    }

    public int getItemViewType(int i2) {
        return 0;
    }

    public final ea getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.h();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.a();
    }

    public final void notifyItemChanged(int i2) {
        this.mObservable.c(i2, 1);
    }

    public final void notifyItemInserted(int i2) {
        this.mObservable.e(i2, 1);
    }

    public final void notifyItemMoved(int i2, int i3) {
        this.mObservable.b(i2, i3);
    }

    public final void notifyItemRangeChanged(int i2, int i3) {
        this.mObservable.c(i2, i3);
    }

    public final void notifyItemRangeInserted(int i2, int i3) {
        this.mObservable.e(i2, i3);
    }

    public final void notifyItemRangeRemoved(int i2, int i3) {
        this.mObservable.f(i2, i3);
    }

    public final void notifyItemRemoved(int i2) {
        this.mObservable.f(i2, 1);
    }

    public abstract void onBindViewHolder(VH vh, int i2);

    public void onBindViewHolder(VH vh, int i2, List<Object> list) {
        onBindViewHolder(vh, i2);
    }

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i2);

    public boolean onFailedToRecycleView(VH vh) {
        return false;
    }

    public void registerAdapterDataObserver(ed edVar) {
        this.mObservable.registerObserver(edVar);
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z;
    }

    public void setStateRestorationPolicy(ea eaVar) {
        this.mStateRestorationPolicy = eaVar;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(ed edVar) {
        this.mObservable.unregisterObserver(edVar);
    }

    public final void notifyItemRangeChanged(int i2, int i3, Object obj) {
        this.mObservable.d(i2, i3, obj);
    }

    public final void notifyItemChanged(int i2, Object obj) {
        this.mObservable.d(i2, 1, obj);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(VH vh) {
    }

    public void onViewDetachedFromWindow(VH vh) {
    }

    public void onViewRecycled(VH vh) {
    }
}
