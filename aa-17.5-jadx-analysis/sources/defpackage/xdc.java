package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes3.dex */
public abstract class xdc extends Fragment {
    private static final yph d = yph.c("GH.InputMethodFragment");
    public InputConnection a;
    EditorInfo b;
    private SharedPreferences e;
    private roj g;
    public boolean c = true;
    private final qse f = new ljb(this, 6);

    public abstract CarWindowLayoutParams a(CarRegionId carRegionId);

    public final void b(boolean z) {
        if (this.e == null) {
            this.e = getContext().getSharedPreferences("com.google.android.projection.gearhead.common.IME", 0);
        }
        c(z);
        this.e.edit().putBoolean("external_keyboard_last_open_state", z).apply();
    }

    protected abstract void c(boolean z);

    public abstract void d();

    protected final boolean e() {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences == null) {
            sharedPreferences = getContext().getSharedPreferences("com.google.android.projection.gearhead.common.IME", 0);
            this.e = sharedPreferences;
        }
        if (!sharedPreferences.contains("external_keyboard_last_open_state")) {
            return true;
        }
        boolean z = this.e.getBoolean("external_keyboard_last_open_state", true);
        ebf.j().o(yzz.KEYBOARD_EXTERNAL, z ? yzy.eI : yzy.eJ);
        return z;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) throws AssertionError {
        super.onAttach(context);
        tec.c(this, xda.class);
        xda xdaVar = (xda) tec.a(this, xda.class);
        xdaVar.getClass();
        this.a = xdaVar.b();
        this.b = xdaVar.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        try {
            mki.a.f();
            roj rojVarF = oni.f(kio.b().e());
            this.g = rojVarF;
            qse qseVar = this.f;
            rojVarF.f(qseVar, 11, 0);
            qsf qsfVarA = this.g.a(11);
            if (qsfVarA != null) {
                qseVar.d(qsfVarA.a, qsfVarA.b, qsfVarA.c, qsfVarA.d);
            }
        } catch (qrz | qsa unused) {
            ((ype) ((ype) d.g()).ai((char) 10133)).u("Failed to get CarSensorManager or register listeners, should never occur.");
        }
        d();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        roj rojVar = this.g;
        if (rojVar != null) {
            rojVar.b(this.f);
            this.g = null;
        }
        super.onStop();
    }
}
