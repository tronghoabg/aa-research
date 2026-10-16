package defpackage;

import android.app.backup.BackupManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.car.app.model.Alert;
import java.util.Map;

/* loaded from: classes.dex */
public final class nrz implements lhg {
    static final ygr a = ygr.r(mkn.e, mkn.b, new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity"), mkn.v);
    public static final ComponentName b = new ComponentName("NewsAssistantAction", "");
    public BackupManager c;
    public final Object d = new Object();
    public yfy e;
    public final SharedPreferences f;
    Boolean g;
    yfy h;
    public final SharedPreferences i;
    private final SharedPreferences.OnSharedPreferenceChangeListener j;
    private final SharedPreferences k;

    public nrz(final Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LAUNCHER_APP_ENABLED_DISABLED", 0);
        this.f = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("CUSTOMIZATION_ENABLED_DISABLED", 0);
        this.k = sharedPreferences2;
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("LAUNCHER_APP_POSITIONS", 0);
        this.i = sharedPreferences3;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nry
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences4, String str) {
                if (!acwi.f() || Build.VERSION.SDK_INT < 30) {
                    return;
                }
                nrz nrzVar = this.a;
                BackupManager backupManager = nrzVar.c;
                if (backupManager == null) {
                    backupManager = new BackupManager(context);
                }
                nrzVar.c = backupManager;
                nrzVar.c.dataChanged();
            }
        };
        this.j = onSharedPreferenceChangeListener;
        if (Build.VERSION.SDK_INT < 30 || !acwi.f()) {
            return;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        sharedPreferences2.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        sharedPreferences3.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static nrz e() {
        return (nrz) mki.a.i(nrz.class);
    }

    public static final boolean k(ComponentName componentName) {
        return (a.contains(componentName) || lfm.c().d().equals(componentName.getPackageName())) ? false : true;
    }

    private final int l(ComponentName componentName) {
        SharedPreferences sharedPreferences = this.i;
        String strFlattenToString = componentName.flattenToString();
        int iIntValue = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if ((entry.getValue() instanceof Integer) && ((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
            }
        }
        int i = iIntValue + 1;
        sharedPreferences.edit().putInt(strFlattenToString, i).commit();
        synchronized (this.d) {
            if (this.h != null) {
                this.h = yfy.j(sharedPreferences.getAll());
            }
        }
        return i;
    }

    private final boolean m() {
        return !this.i.getAll().isEmpty();
    }

    private final boolean n(ComponentName componentName) {
        String strFlattenToString = componentName.flattenToString();
        yfy yfyVar = this.e;
        yfyVar.getClass();
        Object obj = yfyVar.get(strFlattenToString);
        return obj == null || ((Boolean) obj).booleanValue();
    }

    public final int a(ComponentName componentName) {
        synchronized (this.d) {
            if (this.h == null) {
                return b(componentName);
            }
            String strFlattenToString = componentName.flattenToString();
            yfy yfyVar = this.h;
            yfyVar.getClass();
            Object obj = yfyVar.get(strFlattenToString);
            return (obj == null && n(componentName) && m()) ? l(componentName) : obj != null ? ((Integer) obj).intValue() : Alert.DURATION_SHOW_INDEFINITELY;
        }
    }

    public final int b(ComponentName componentName) {
        SharedPreferences sharedPreferences = this.i;
        String strFlattenToString = componentName.flattenToString();
        return (!sharedPreferences.contains(strFlattenToString) && h(componentName) && m()) ? l(componentName) : sharedPreferences.getInt(strFlattenToString, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.lhg
    public final void c() {
        synchronized (this.d) {
            this.e = yfy.j(this.f.getAll());
            this.h = yfy.j(this.i.getAll());
            this.g = Boolean.valueOf(this.k.getBoolean("CUSTOMIZATION_STATUS_KEY", false));
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        synchronized (this.d) {
            this.e = null;
            this.g = null;
            this.h = null;
        }
    }

    public final void f(boolean z) {
        this.k.edit().putBoolean("CUSTOMIZATION_STATUS_KEY", z).commit();
    }

    public final boolean g(ComponentName componentName) {
        synchronized (this.d) {
            if (this.e == null) {
                return h(componentName);
            }
            return n(componentName);
        }
    }

    public final boolean h(ComponentName componentName) {
        return this.f.getBoolean(componentName.flattenToString(), true);
    }

    public final boolean i() {
        return this.k.getBoolean("CUSTOMIZATION_STATUS_KEY", false);
    }

    public final boolean j() {
        synchronized (this.d) {
            Boolean bool = this.g;
            if (bool == null) {
                return i();
            }
            return bool.booleanValue();
        }
    }
}
