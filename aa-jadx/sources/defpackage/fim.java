package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fim extends android.database.DataSetObserver {
    final /* synthetic */ androidx.viewpager.widget.ViewPager a;

    public fim(androidx.viewpager.widget.ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.e();
    }
}
