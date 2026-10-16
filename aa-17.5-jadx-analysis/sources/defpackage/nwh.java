package defpackage;

import android.os.SystemClock;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class nwh implements Comparable {
    public nuh a;
    public long b = 0;
    public boolean c;

    public nwh(nuh nuhVar) {
        this.a = nuhVar;
    }

    final long a() {
        if (this.b == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.b;
    }

    final nur b() {
        return this.a.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return nwi.a.compare(this.a, ((nwh) obj).a);
    }

    public final String toString() {
        Locale locale = Locale.US;
        nuh nuhVar = this.a;
        nur nurVar = nuhVar.c;
        return String.format(locale, "HunEntry(nId=%s nCat=%s nPkgName=%s delayedTimeMs=%d isVisible=%b)", nuhVar, nurVar.x, nurVar.f, Long.valueOf(this.b), Boolean.valueOf(this.c));
    }
}
