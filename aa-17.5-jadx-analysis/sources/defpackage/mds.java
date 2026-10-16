package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class mds implements mdi {
    private static final yph a = yph.c("GH.OsUpMan");
    private static final ygr b = new ymp("android.permission.READ_CALENDAR");
    private final Context c;
    private final SharedPreferences d;

    public mds(Context context) {
        this.c = context;
        this.d = ((lbi) mki.a.i(lbi.class)).a(context, "os_upgrade_manager");
    }

    private final Set e() throws PackageManager.NameNotFoundException {
        HashSet hashSet = new HashSet();
        try {
            PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 4096);
            for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    hashSet.add(packageInfo.requestedPermissions[i]);
                }
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException e) {
            throw new AssertionError("Gearhead not present on device?", e);
        }
    }

    private final Set f(String str) {
        Set<String> stringSet = this.d.getStringSet(str, yly.a);
        return stringSet == null ? new HashSet() : new HashSet(stringSet);
    }

    @Override // defpackage.mdi
    public final void a() throws PackageManager.NameNotFoundException {
        SharedPreferences sharedPreferences = this.d;
        int i = sharedPreferences.getInt("os_version", -1);
        if (Build.VERSION.SDK_INT <= i || i == -1) {
            return;
        }
        Set<String> setF = f("needs_ack");
        yno it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Set<String> stringSet = sharedPreferences.getStringSet("permission_set", yly.a);
            Set setE = e();
            if (stringSet != null) {
                setE.removeAll(stringSet);
            }
            if (setE.contains(str)) {
                ((ype) ((ype) a.f()).ai((char) 4782)).y("%s needs acknowledgement.", str);
                setF.add(str);
            }
        }
        if (setF.isEmpty()) {
            return;
        }
        sharedPreferences.edit().putStringSet("needs_ack", setF).apply();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.OS_UPGRADE_MANAGER, yzy.tk);
        Iterator<String> it2 = setF.iterator();
        while (it2.hasNext()) {
            rrbVarH.e(it2.next());
        }
        ebf.j().F(rrbVarH.l());
    }

    @Override // defpackage.mdi
    public final void b() {
        SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.putStringSet("permission_set", e());
        editorEdit.putInt("os_version", Build.VERSION.SDK_INT);
        editorEdit.apply();
    }

    @Override // defpackage.mdi
    public final boolean c() {
        return f("needs_ack").contains("android.permission.READ_CALENDAR") && !f("ack_granted").contains("android.permission.READ_CALENDAR");
    }

    @Override // defpackage.mdi
    public final void d() {
        ((ype) ((ype) a.f()).ai((char) 4783)).y("Acknowledgement recorded for %s.", "android.permission.READ_CALENDAR");
        Set<String> setF = f("ack_granted");
        setF.add("android.permission.READ_CALENDAR");
        this.d.edit().putStringSet("ack_granted", setF).apply();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.OS_UPGRADE_MANAGER, yzy.tl);
        rrbVarH.e("android.permission.READ_CALENDAR");
        ((ohs) mki.a.i(ohs.class)).F(rrbVarH.l());
    }
}
