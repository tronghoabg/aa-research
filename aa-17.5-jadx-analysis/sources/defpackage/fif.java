package defpackage;

import android.content.res.Resources;
import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes2.dex */
public final class fif extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public fif(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws Resources.NotFoundException {
        this.a.e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws Resources.NotFoundException {
        this.a.e();
    }
}
