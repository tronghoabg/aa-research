package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.google.android.apps.auto.components.settings.ui.CarSettingsService;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mmm extends qw implements epf {
    public boolean f;
    public final kwv g;
    public final /* synthetic */ CarSettingsService h;
    private final SharedPreferences.OnSharedPreferenceChangeListener i;
    private final SharedPreferences.OnSharedPreferenceChangeListener j;
    private SharedPreferences k;
    private SharedPreferences l;
    private final aezr m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmm(CarSettingsService carSettingsService, qn qnVar) {
        super(qnVar);
        this.h = carSettingsService;
        this.i = new kwq(this, 4);
        this.j = new kwq(this, 5);
        this.f = true;
        this.b.c(this);
        lws.d().a().fE(this, new med(new mcm(this, 13), 2));
        qnVar.e.w(new mml(this, qnVar));
        this.g = kfl.h();
        this.m = woy.dG(new llj(16));
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            affa.d("settingsSharedPreference");
            sharedPreferences = null;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.i);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        SharedPreferences sharedPreferences = null;
        if (acxa.aW()) {
            ?? r3 = mpl.f().a().c;
            r3.getClass();
            this.l = r3;
            SharedPreferences sharedPreferences2 = r3;
            if (r3 == 0) {
                affa.d("settingsInProcessPreference");
                sharedPreferences2 = null;
            }
            sharedPreferences2.registerOnSharedPreferenceChangeListener(this.j);
        }
        ?? r32 = mpl.f().a().b;
        this.k = r32;
        if (r32 == 0) {
            affa.d("settingsSharedPreference");
        } else {
            sharedPreferences = r32;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.i);
        if (kwo.b().g()) {
            mpl.f().a().a("key_work_profile_support", false);
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.WORK_PROFILE_CAR_SETTINGS_MENU_ENTER, yzy.BB).l());
        }
        ngf.g().h(mlm.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x059a  */
    @Override // defpackage.qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wb h() {
        /*
            Method dump skipped, instructions count: 1577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmm.h():wb");
    }

    public final void k(String str) {
        if (this.f) {
            CarSettingsService.c.l().y("Invalidation due to setting change: %s", str);
            j();
        } else {
            CarSettingsService.c.l().y("Skipped invalidation on setting change: %s", str);
        }
        this.f = true;
    }

    public final void l(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        if (!z || Environment.isExternalStorageManager()) {
            mpl.f().a().a("key_settings_use_phone_wallpaper", z);
            if (acpc.D()) {
                ksf.a.a().g();
            }
            j();
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, z ? yzy.eq : yzy.er).l());
            return;
        }
        qn qnVar = this.a;
        obs.a().f(qnVar, new ComponentName(qnVar, (Class<?>) CarSettingsService.class), R.string.settings_wallpaper_permission, 1);
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.addCategory("android.intent.category.DEFAULT");
        String str = String.format("package:%s", Arrays.copyOf(new Object[]{"com.google.android.projection.gearhead"}, 1));
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        intent.setData(uri);
        intent.setFlags(268435456);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.es).l());
        try {
            this.h.startActivity(intent, luk.c());
        } catch (ActivityNotFoundException e) {
            ((ype) ((ype) CarSettingsService.c.h()).p(e)).s();
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.et).l());
        }
        mpl.f().a().a("key_settings_use_phone_wallpaper", false);
        j();
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
