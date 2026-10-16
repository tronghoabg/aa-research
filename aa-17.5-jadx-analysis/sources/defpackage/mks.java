package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class mks extends ep {
    public mku m;
    public CoordinatorLayout n;

    protected abstract int A();

    protected abstract mku B();

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_Gearhead_Material3);
        kfl.k(getTheme());
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.material3_activity_base_settings);
        this.n = (CoordinatorLayout) findViewById(R.id.coordinator);
        q((Toolbar) findViewById(R.id.toolbar));
        ef efVarO = o();
        efVarO.getClass();
        efVarO.i(A());
        efVarO.g(true);
        ols.c(getWindow(), findViewById(R.id.scroll_view));
        this.m = B();
        w wVar = new w(a());
        wVar.q(R.id.fragment_container, this.m, null);
        wVar.i(false, true);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
