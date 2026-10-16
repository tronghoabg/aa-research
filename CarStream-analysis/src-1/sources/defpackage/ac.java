package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ac {
    public final Context a;
    public File c;
    public volatile byte[] d;
    public volatile String e;
    public final tb b = new tb(64, 0.75f, true, 1);
    public long f = 21600000;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public int h = -1;
    public int i = -1;

    public ac(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yb a(double r40, double r42, java.lang.Double r44) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac.a(double, double, java.lang.Double):yb");
    }

    public final File b(int i) {
        return new File(this.c, ad.c(Integer.toString(i), ".b2"));
    }
}
