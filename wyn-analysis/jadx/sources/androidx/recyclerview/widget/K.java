package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public abstract class K {
    public abstract void onChanged();

    public void onItemRangeChanged(int i5, int i10) {
    }

    public abstract void onItemRangeInserted(int i5, int i10);

    public abstract void onItemRangeMoved(int i5, int i10, int i11);

    public abstract void onItemRangeRemoved(int i5, int i10);

    public void onStateRestorationPolicyChanged() {
    }

    public void onItemRangeChanged(int i5, int i10, Object obj) {
        onItemRangeChanged(i5, i10);
    }
}
