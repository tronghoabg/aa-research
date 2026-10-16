package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class wwd extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public wwd(TabLayout tabLayout) {
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
