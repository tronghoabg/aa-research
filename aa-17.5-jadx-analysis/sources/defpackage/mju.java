package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class mju implements tlw, nui {
    public static final yob a = yob.c("com/google/android/apps/auto/components/remoteapps/notification/GearheadNotificationSource");
    public final ajmd b;
    private final Context c;
    private final nuj d;
    private final mbs e;
    private final HashMap f = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    public mju(Context context, ajmd ajmdVar) {
        this.c = context;
        this.b = ajmdVar;
        nuj nujVarB = nuj.b();
        this.d = nujVarB;
        this.e = mbs.a();
        yfq yfqVarE = nujVarB.e();
        int size = yfqVarE.size();
        for (int i = 0; i < size; i++) {
            f((nuh) yfqVarE.get(i), true);
        }
        this.d.f(this);
    }

    private final Drawable d(GhIcon ghIcon) {
        if (ghIcon == null) {
            return null;
        }
        return ghIcon.f(this.c, -1);
    }

    private final tlx e(nul nulVar) {
        if (nulVar == null) {
            return null;
        }
        String str = nulVar.b;
        if (str == null) {
            str = "";
        }
        return new tlx(str, d(nulVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(defpackage.nuh r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mju.f(nuh, boolean):void");
    }

    private static final boolean g(nuh nuhVar) {
        return nuhVar.c.x != nuo.h;
    }

    @Override // defpackage.nui
    public final void a(nuh nuhVar) {
        if (g(nuhVar)) {
            return;
        }
        String str = nuhVar.d;
        if (((nas) this.f.get(str)) != null) {
            ((ype) mhv.a.l().ai((char) 4955)).u("Notification cancelled");
        } else {
            ((ynz) ((ynz) a.h()).ai((char) 5044)).y("No existing notification handle for notification cancellation, key: %s", str);
        }
    }

    @Override // defpackage.nui
    public final void b(nuh nuhVar) {
        f(nuhVar, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.k(this);
    }

    @Override // defpackage.nui
    public final void c(yfq yfqVar) {
    }
}
