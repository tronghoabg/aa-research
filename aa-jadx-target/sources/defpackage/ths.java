package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ths {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.FlaggedAppFilter");
    private final android.content.Context c;
    private final defpackage.yhe d;

    public ths(android.content.Context context, java.util.Collection collection) {
        this.c = context;
        this.d = (defpackage.yhe) j$.util.Collection.-EL.stream(collection).map(new defpackage.mmf(17)).filter(new omr(20)).collect(defpackage.yds.b(new defpackage.rix(13), new defpackage.rix(14), new riy(2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(java.lang.String str) {
        j$.util.Optional optionalEmpty;
        defpackage.yhe yheVar = this.d;
        if (!yheVar.containsKey(str)) {
            return false;
        }
        defpackage.yhx yhxVar = (defpackage.yhx) yheVar.get(str);
        if (yhxVar.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) b.g()).ai((char) 9050)).y("Version not supported (failed to parse version range): %s", str);
            return false;
        }
        try {
            optionalEmpty = j$.util.Optional.of(java.lang.Long.valueOf(this.c.getPackageManager().getPackageInfo(str, 0).versionCode));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.g()).p(e)).ai(9051)).M("Could not fetch PackageInfo for app: %s\n%s", str, e);
            optionalEmpty = j$.util.Optional.empty();
        }
        if (optionalEmpty.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 9049)).y("Version not supported (couldn't find app version): %s", str);
            return false;
        }
        java.lang.Long l = (java.lang.Long) optionalEmpty.get();
        l.longValue();
        defpackage.yot it = yhxVar.iterator();
        while (it.hasNext()) {
            if (((android.util.Range) it.next()).contains(l)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(java.lang.String str) {
        return this.d.containsKey(str);
    }

    public ths(android.content.Context context, defpackage.absx absxVar) {
        this.c = context;
        this.d = defpackage.tht.b(new defpackage.mmf(17), absxVar);
    }
}
