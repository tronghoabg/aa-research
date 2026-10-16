package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class fe {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    eb<? extends fe> mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    fe mShadowedHolder = null;
    fe mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    et mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public fe(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.itemView = view;
    }

    private void createPayloadsIfNeeded() {
        if (this.mPayloads == null) {
            ArrayList arrayList = new ArrayList();
            this.mPayloads = arrayList;
            this.mUnmodifiedPayloads = DesugarCollections.unmodifiableList(arrayList);
        }
    }

    void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
        } else if ((1024 & this.mFlags) == 0) {
            createPayloadsIfNeeded();
            this.mPayloads.add(obj);
        }
    }

    void addFlags(int i2) {
        this.mFlags = i2 | this.mFlags;
    }

    void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    boolean doesTransientStatePreventRecycling() {
        return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
    }

    void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
        addFlags(8);
        offsetPosition(i3, z);
        this.mPosition = i2;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.d(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final eb<? extends fe> getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        eb ebVar;
        int iD;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (ebVar = recyclerView.m) == null || (iD = recyclerView.d(this)) == -1) {
            return -1;
        }
        return ebVar.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iD);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i2 = this.mPreLayoutPosition;
        return i2 == -1 ? this.mPosition : i2;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i2 = this.mPreLayoutPosition;
        return i2 == -1 ? this.mPosition : i2;
    }

    List<Object> getUnmodifiedPayloads() {
        List<Object> list;
        return ((this.mFlags & 1024) != 0 || (list = this.mPayloads) == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    boolean hasAnyOfTheFlags(int i2) {
        return (this.mFlags & i2) != 0;
    }

    boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
    }

    boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    boolean isScrap() {
        return this.mScrapContainer != null;
    }

    boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    void offsetPosition(int i2, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        int i3 = this.mPreLayoutPosition;
        if (i3 == -1) {
            i3 = this.mPosition;
            this.mPreLayoutPosition = i3;
        }
        if (z) {
            this.mPreLayoutPosition = i3 + i2;
        }
        this.mPosition += i2;
        if (this.itemView.getLayoutParams() != null) {
            ((eo) this.itemView.getLayoutParams()).f1420e = true;
        }
    }

    void onEnteredHiddenState(RecyclerView recyclerView) {
        int i2 = this.mPendingAccessibilityState;
        if (i2 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i2;
        } else {
            this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
        }
        recyclerView.aB(this, 4);
    }

    void onLeftHiddenState(RecyclerView recyclerView) {
        recyclerView.aB(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    void resetInternal() {
        int i2 = RecyclerView.O;
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.E(this);
    }

    void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    void setFlags(int i2, int i3) {
        this.mFlags = (i2 & i3) | (this.mFlags & (~i3));
    }

    public final void setIsRecyclable(boolean z) {
        int i2;
        int i3 = this.mIsRecyclableCount;
        int i4 = z ? i3 - 1 : i3 + 1;
        this.mIsRecyclableCount = i4;
        if (i4 < 0) {
            this.mIsRecyclableCount = 0;
            int i5 = RecyclerView.O;
            toString();
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else {
            if (!z && i4 == 1) {
                i2 = this.mFlags | 16;
            } else if (z && i4 == 0) {
                i2 = this.mFlags & (-17);
            }
            this.mFlags = i2;
        }
        int i6 = RecyclerView.O;
    }

    void setScrapContainer(et etVar, boolean z) {
        this.mScrapContainer = etVar;
        this.mInChangeScrap = z;
    }

    boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
        if (isScrap()) {
            sb.append(" scrap ");
            sb.append(true != this.mInChangeScrap ? "[attachedScrap]" : "[changeScrap]");
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    void unScrap() {
        this.mScrapContainer.o(this);
    }

    boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
