package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxa extends android.database.DataSetObserver {
    final /* synthetic */ com.google.android.material.tabs.TabLayout a;

    public wxa(com.google.android.material.tabs.TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.h();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.h();
    }
}
