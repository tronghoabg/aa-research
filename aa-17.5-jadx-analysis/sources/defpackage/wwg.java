package defpackage;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class wwg {
    public Object a;
    public CharSequence b;
    public View d;
    public TabLayout f;
    public wwi g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.k(this, true);
    }

    public final void b() {
        wwi wwiVar = this.g;
        if (wwiVar != null) {
            wwiVar.b();
        }
    }
}
