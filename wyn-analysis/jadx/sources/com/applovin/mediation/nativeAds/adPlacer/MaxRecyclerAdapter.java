package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.V;
import androidx.recyclerview.widget.m0;
import com.applovin.impl.f5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends I implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f24139a;

    /* renamed from: b, reason: collision with root package name */
    private final I f24140b;

    /* renamed from: c, reason: collision with root package name */
    private final b f24141c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f24142d;

    /* renamed from: e, reason: collision with root package name */
    private f5 f24143e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f24144f;

    /* renamed from: g, reason: collision with root package name */
    private int f24145g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f24146h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends m0 {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f24148a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f24148a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f24148a;
        }
    }

    public class a implements f5.a {
        public a() {
        }

        @Override // com.applovin.impl.f5.a
        public void a(int i5, int i10) {
            MaxRecyclerAdapter.this.f24139a.updateFillablePositions(i5, Math.min(MaxRecyclerAdapter.this.f24145g + i10, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, I i5, Activity activity) {
        b bVar = new b(this, null);
        this.f24141c = bVar;
        this.f24145g = 8;
        this.f24146h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f24139a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(i5.hasStableIds());
        this.f24140b = i5;
        i5.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f24140b.unregisterAdapterDataObserver(this.f24141c);
        } catch (Exception unused) {
        }
        this.f24139a.destroy();
        f5 f5Var = this.f24143e;
        if (f5Var != null) {
            f5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f24139a;
    }

    public int getAdjustedPosition(int i5) {
        return this.f24139a.getAdjustedPosition(i5);
    }

    @Override // androidx.recyclerview.widget.I
    public int getItemCount() {
        return this.f24139a.getAdjustedCount(this.f24140b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.I
    public long getItemId(int i5) {
        if (this.f24140b.hasStableIds()) {
            return this.f24139a.isFilledPosition(i5) ? this.f24139a.getAdItemId(i5) : this.f24140b.getItemId(this.f24139a.getOriginalPosition(i5));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.I
    public int getItemViewType(int i5) {
        if (this.f24139a.isAdPosition(i5)) {
            return -42;
        }
        return this.f24140b.getItemViewType(this.f24139a.getOriginalPosition(i5));
    }

    public int getOriginalPosition(int i5) {
        return this.f24139a.getOriginalPosition(i5);
    }

    public void loadAds() {
        this.f24139a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f24144f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i5) {
        notifyItemChanged(i5);
        MaxAdPlacer.Listener listener = this.f24144f;
        if (listener != null) {
            listener.onAdLoaded(i5);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i5) {
        MaxAdPlacer.Listener listener = this.f24144f;
        if (listener != null) {
            listener.onAdRemoved(i5);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f24144f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f24142d = recyclerView;
        f5 f5Var = new f5(recyclerView);
        this.f24143e = f5Var;
        f5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.I
    public void onBindViewHolder(m0 m0Var, int i5) {
        this.f24143e.a(m0Var.itemView, i5);
        if (!this.f24139a.isAdPosition(i5)) {
            this.f24140b.onBindViewHolder(m0Var, this.f24139a.getOriginalPosition(i5));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f24139a.getAdSize(i5);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) m0Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f24139a.renderAd(i5, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        if (i5 != -42) {
            return this.f24140b.onCreateViewHolder(viewGroup, i5);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        V layoutManager = this.f24142d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.I
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f24142d = null;
        f5 f5Var = this.f24143e;
        if (f5Var != null) {
            f5Var.a();
            this.f24143e = null;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public boolean onFailedToRecycleView(m0 m0Var) {
        return m0Var instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(m0Var) : this.f24140b.onFailedToRecycleView(m0Var);
    }

    @Override // androidx.recyclerview.widget.I
    public void onViewAttachedToWindow(m0 m0Var) {
        if (m0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(m0Var);
        } else {
            this.f24140b.onViewAttachedToWindow(m0Var);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public void onViewDetachedFromWindow(m0 m0Var) {
        if (m0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(m0Var);
        } else {
            this.f24140b.onViewDetachedFromWindow(m0Var);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public void onViewRecycled(m0 m0Var) {
        f5 f5Var = this.f24143e;
        if (f5Var != null) {
            f5Var.b(m0Var.itemView);
        }
        if (!(m0Var instanceof MaxAdRecyclerViewHolder)) {
            this.f24140b.onViewRecycled(m0Var);
            return;
        }
        if (this.f24139a.isFilledPosition(m0Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) m0Var).getContainerView().removeAllViews();
        }
        super.onViewRecycled(m0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f24146h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.I
    public void setHasStableIds(boolean z2) {
        super.setHasStableIds(z2);
        this.f24140b.unregisterAdapterDataObserver(this.f24141c);
        this.f24140b.setHasStableIds(z2);
        this.f24140b.registerAdapterDataObserver(this.f24141c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f24144f = listener;
    }

    public void setLookAhead(int i5) {
        this.f24145g = i5;
    }

    public class b extends K {
        private b() {
        }

        @Override // androidx.recyclerview.widget.K
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.K
        public void onItemRangeChanged(int i5, int i10) {
            int adjustedPosition = MaxRecyclerAdapter.this.f24139a.getAdjustedPosition(i5);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f24139a.getAdjustedPosition((i5 + i10) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.K
        public void onItemRangeInserted(int i5, int i10) {
            boolean z2 = i5 + i10 >= MaxRecyclerAdapter.this.f24140b.getItemCount();
            if (MaxRecyclerAdapter.this.f24146h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f24146h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z2)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f24139a.getAdjustedPosition(i5);
            for (int i11 = 0; i11 < i10; i11++) {
                MaxRecyclerAdapter.this.f24139a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i10);
        }

        @Override // androidx.recyclerview.widget.K
        public void onItemRangeMoved(int i5, int i10, int i11) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.K
        public void onItemRangeRemoved(int i5, int i10) {
            int itemCount = MaxRecyclerAdapter.this.f24140b.getItemCount();
            boolean z2 = i5 + i10 >= itemCount;
            if (MaxRecyclerAdapter.this.f24146h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f24146h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z2)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f24139a.getAdjustedPosition(i5);
            int adjustedCount = MaxRecyclerAdapter.this.f24139a.getAdjustedCount(itemCount + i10);
            for (int i11 = 0; i11 < i10; i11++) {
                MaxRecyclerAdapter.this.f24139a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f24139a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f24139a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i10), size);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }
}
