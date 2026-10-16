package defpackage;

import android.content.Context;
import android.content.pm.PackageInstaller;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class sad implements sdj {
    public static final ypf a = ols.R("CAR.SETUP");
    public final Context b;
    public final PackageInstaller c;
    public final List d;
    public final erb e;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sad(android.content.Context r10, defpackage.sdi r11) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sad.<init>(android.content.Context, sdi):void");
    }

    public final PackageInstaller.SessionInfo a(String str) {
        for (PackageInstaller.SessionInfo sessionInfo : this.c.getAllSessions()) {
            if (str.equals(sessionInfo.getAppPackageName())) {
                return sessionInfo;
            }
        }
        return null;
    }

    @Override // defpackage.sdj
    public final List e() {
        List<ses> list = this.d;
        ArrayList arrayList = new ArrayList(list.size());
        for (ses sesVar : list) {
            if (!sesVar.d(this.b)) {
                arrayList.add(sesVar.a);
            }
        }
        return arrayList;
    }
}
