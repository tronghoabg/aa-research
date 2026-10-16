package J9;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: J9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0646e implements Le.b, Le.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0647f f5925b;

    public /* synthetic */ C0646e(C0647f c0647f, int i5) {
        this.f5924a = i5;
        this.f5925b = c0647f;
    }

    @Override // Le.b, Q1.c
    public void accept(Object obj) {
        switch (this.f5924a) {
            case 0:
                this.f5925b.f5929d = (ta.o) obj;
                break;
            default:
                this.f5925b.f5929d = null;
                break;
        }
    }

    @Override // Le.d
    public boolean test(Object obj) {
        C0647f c0647f = this.f5925b;
        c0647f.getClass();
        long jD = ((ta.o) obj).d();
        c0647f.f5928c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(c0647f.f5927b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        if (jD != 0) {
            return jCurrentTimeMillis < jD;
        }
        if (file.exists()) {
            return jCurrentTimeMillis < TimeUnit.DAYS.toMillis(1L) + file.lastModified();
        }
        return true;
    }
}
