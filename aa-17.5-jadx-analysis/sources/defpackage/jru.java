package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class jru implements dzg {
    private static final yph a = yph.c("GH.WORK.EXCEPT");
    private final Context b;

    public jru(Context context) {
        this.b = context;
    }

    @Override // defpackage.dzg
    public final /* bridge */ /* synthetic */ void a(Object obj) throws Throwable {
        Throwable th = (Throwable) obj;
        th.getClass();
        ype ypeVar = (ype) ((ype) a.g()).p(th);
        Context applicationContext = this.b.getApplicationContext();
        applicationContext.getClass();
        ypeVar.y("Failed to initialize WorkManager! Dumping FileSystemReport.\n%s", new jrt(applicationContext));
        throw th;
    }
}
