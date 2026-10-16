package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import java.util.Date;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final /* synthetic */ class joa implements xyc {
    private final /* synthetic */ int a;

    public /* synthetic */ joa(int i) {
        this.a = i;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.a) {
            case 0:
                yph yphVar = jnv.a;
                return wub.Y(true);
            case 1:
                yph yphVar2 = jnv.a;
                return new zhc(new jnz());
            case 2:
                return Boolean.valueOf(acnv.i());
            case 3:
                return new kqq("watchdog");
            case 4:
                kwe kweVar = kwe.a;
                Context context = mki.a.c;
                Context context2 = mki.a.c;
                ComponentName componentNameA = lgv.a().a(mpz.b);
                componentNameA.getClass();
                return context.getString(R.string.dashboard_unavailable_education_format, new mon(context2, componentNameA).c());
            case 5:
                kwe kweVar2 = kwe.a;
                return mki.a.c.getString(R.string.rail_widget_education);
            case 6:
                return new Bundle();
            case 7:
                return null;
            case 8:
                return Boolean.valueOf(acxj.h());
            case 9:
                return Boolean.valueOf(acxj.i());
            case 10:
                return true;
            case 11:
                return new lbk(ylx.a, new Date());
            case 12:
                return Long.valueOf(aczg.e());
            case 13:
                yph yphVar3 = oyr.a;
                return Build.VERSION.SDK_INT >= 35 ? ygr.n(aczv.T().b) : yly.a;
            case 14:
                return Executors.newCachedThreadPool();
            case 15:
                return 0;
            case 16:
                return new plp();
            case 17:
                return new ppp();
            case 18:
                return xvy.a;
            case 19:
                return Double.valueOf(adaf.a.gu().a());
            default:
                ypf ypfVar = qtf.a;
                return new Location("Car-GPS");
        }
    }
}
