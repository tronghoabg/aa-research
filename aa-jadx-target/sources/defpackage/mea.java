package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mea implements defpackage.mdq {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.OsUpMan");
    private static final defpackage.yhx b = new defpackage.ynu("android.permission.READ_CALENDAR");
    private final android.content.Context c;
    private final android.content.SharedPreferences d;

    public mea(android.content.Context context) {
        this.c = context;
        this.d = defpackage.laz.a().a(context, "os_upgrade_manager");
    }

    private final java.util.Set e() {
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            android.content.pm.PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 4096);
            for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    hashSet.add(packageInfo.requestedPermissions[i]);
                }
            }
            return hashSet;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.AssertionError("Gearhead not present on device?", e);
        }
    }

    private final java.util.Set f(java.lang.String str) {
        java.util.Set<java.lang.String> stringSet = this.d.getStringSet(str, defpackage.ynd.a);
        return stringSet == null ? new java.util.HashSet() : new java.util.HashSet(stringSet);
    }

    @Override // defpackage.mdq
    public final void a() {
        android.content.SharedPreferences sharedPreferences = this.d;
        int i = sharedPreferences.getInt("os_version", -1);
        if (android.os.Build.VERSION.SDK_INT <= i || i == -1) {
            return;
        }
        java.util.Set<java.lang.String> setF = f("needs_ack");
        defpackage.yot it = b.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("permission_set", defpackage.ynd.a);
            java.util.Set setE = e();
            if (stringSet != null) {
                setE.removeAll(stringSet);
            }
            if (setE.contains(str)) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4785)).y("%s needs acknowledgement.", str);
                setF.add(str);
            }
        }
        if (setF.isEmpty()) {
            return;
        }
        sharedPreferences.edit().putStringSet("needs_ack", setF).apply();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.OS_UPGRADE_MANAGER, defpackage.zbd.to);
        java.util.Iterator<java.lang.String> it2 = setF.iterator();
        while (it2.hasNext()) {
            rrvVarH.e(it2.next());
        }
        defpackage.omf.u().F(rrvVarH.l());
    }

    @Override // defpackage.mdq
    public final void b() {
        android.content.SharedPreferences.Editor editorEdit = this.d.edit();
        editorEdit.putStringSet("permission_set", e());
        editorEdit.putInt("os_version", android.os.Build.VERSION.SDK_INT);
        editorEdit.apply();
    }

    @Override // defpackage.mdq
    public final boolean c() {
        return f("needs_ack").contains("android.permission.READ_CALENDAR") && !f("ack_granted").contains("android.permission.READ_CALENDAR");
    }

    @Override // defpackage.mdq
    public final void d() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4786)).y("Acknowledgement recorded for %s.", "android.permission.READ_CALENDAR");
        java.util.Set<java.lang.String> setF = f("ack_granted");
        setF.add("android.permission.READ_CALENDAR");
        this.d.edit().putStringSet("ack_granted", setF).apply();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.OS_UPGRADE_MANAGER, defpackage.zbd.tp);
        rrvVarH.e("android.permission.READ_CALENDAR");
        defpackage.omf.u().F(rrvVarH.l());
    }
}
