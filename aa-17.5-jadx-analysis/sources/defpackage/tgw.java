package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Range;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Collection;

/* loaded from: classes.dex */
public final class tgw {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.FlaggedAppFilter");
    private final Context c;
    private final yfy d;

    public tgw(Context context, Collection collection) {
        this.c = context;
        this.d = (yfy) Collection.EL.stream(collection).map(new kqm(16)).filter(new oly(19)).collect(ycm.b(new ric(14), new ric(15), new rib(2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(String str) {
        Optional optionalEmpty;
        yfy yfyVar = this.d;
        if (!yfyVar.containsKey(str)) {
            return false;
        }
        ygr ygrVar = (ygr) yfyVar.get(str);
        if (ygrVar.isEmpty()) {
            ((ype) ((ype) b.g()).ai((char) 9025)).y("Version not supported (failed to parse version range): %s", str);
            return false;
        }
        try {
            optionalEmpty = Optional.of(Long.valueOf(this.c.getPackageManager().getPackageInfo(str, 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai(9026)).M("Could not fetch PackageInfo for app: %s\n%s", str, e);
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isEmpty()) {
            ((ype) ((ype) b.h()).ai((char) 9024)).y("Version not supported (couldn't find app version): %s", str);
            return false;
        }
        Long l = (Long) optionalEmpty.get();
        l.longValue();
        yno it = ygrVar.iterator();
        while (it.hasNext()) {
            if (((Range) it.next()).contains((Range) l)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        return this.d.containsKey(str);
    }

    public tgw(Context context, abru abruVar) {
        this.c = context;
        this.d = tgx.b(new kqm(16), abruVar);
    }
}
