package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core;
import com.google.android.apps.auto.components.settings.connectacar.CarDetailsActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class mkz extends mku implements mlj {
    public kqg c;
    public kqg d;
    Menu e;
    ogz f;

    @Override // defpackage.exv
    public final void e(Bundle bundle, String str) throws Resources.NotFoundException {
        CarInfoWrapper$Core carInfoWrapper$Core;
        kqb kqbVarA = kqb.a();
        h(R.xml.settings_car_details, str);
        k("key_car_info_enabled").o = new mky(this, 0);
        k("key_car_info_forget").o = new mky(this, 1);
        if (getArguments() == null || getArguments().getParcelable("key_car_info_core") == null) {
            throw new IllegalArgumentException("CarInfoWrapper.Core must be set as an argument using key KEY_CAR_INFO_CORE");
        }
        synchronized (this) {
            if (bundle == null) {
                Bundle arguments = getArguments();
                arguments.getClass();
                carInfoWrapper$Core = (CarInfoWrapper$Core) arguments.getParcelable("key_car_info_core");
            } else {
                carInfoWrapper$Core = (CarInfoWrapper$Core) bundle.getParcelable("key_car_info_core");
            }
            carInfoWrapper$Core.getClass();
            kqg kqgVarD = kqg.d(carInfoWrapper$Core);
            this.c = kqgVarD;
            q(kqgVarD);
        }
        kqbVarA.fE(this, new lsh(this, 15));
    }

    @Override // defpackage.mku
    public final yzz l() {
        return yzz.SETTINGS_CAR_DETAILS;
    }

    @Override // defpackage.mku, defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.f = new ogz(getContext());
        setHasOptionsMenu(true);
    }

    @Override // android.support.v4.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        this.e = menu;
        menuInflater.inflate(R.menu.menu_car_details, menu);
        s();
    }

    @Override // android.support.v4.app.Fragment
    @ResultIgnorabilityUnspecified
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        kqg kqgVar;
        kqg kqgVar2;
        synchronized (this) {
            int i = 1;
            if (menuItem.getItemId() == R.id.car_details_edit && (kqgVar2 = this.d) != null) {
                n(new mkv(this, kqgVar2, i));
                return true;
            }
            if (menuItem.getItemId() != R.id.car_details_disable || (kqgVar = this.d) == null) {
                return false;
            }
            this.f.f(kqgVar.a, new mkw(this, 1), new kpu(0));
            return true;
        }
    }

    @Override // defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        synchronized (this) {
            bundle.putParcelable("key_car_info_core", this.d.b());
        }
        super.m117x22bc4f96(bundle);
    }

    public final void p(final int i) {
        n(new mkt() { // from class: mkx
            @Override // defpackage.mkt
            public final void a(Activity activity) {
                Snackbar.k(((mks) ((CarDetailsActivity) activity)).n, i).f();
            }
        });
    }

    public final void q(kqg kqgVar) {
        synchronized (this) {
            this.d = kqgVar;
            Context context = getContext();
            kqg kqgVar2 = this.d;
            mlh mlhVar = new mlh();
            mjv.c(kqgVar2, mlhVar, context, false);
            n(new mkv(this, mlhVar, 0));
        }
    }

    @Override // defpackage.mlj
    public final void r(boolean z) {
        p(true != z ? R.string.settings_car_details_rename_failed : R.string.settings_car_details_rename_succeeded);
    }

    public final void s() {
        synchronized (this) {
            Menu menu = this.e;
            if (menu != null && this.d != null) {
                MenuItem menuItemFindItem = menu.findItem(R.id.car_details_edit);
                MenuItem menuItemFindItem2 = this.e.findItem(R.id.car_details_disable);
                menuItemFindItem.setEnabled(this.d.i());
                boolean z = false;
                if (this.d.j() && this.d.a.isPresent() && !this.d.m()) {
                    z = true;
                }
                menuItemFindItem2.setEnabled(z);
            }
        }
    }

    @Override // defpackage.mlj
    public final ogz t() {
        return this.f;
    }
}
