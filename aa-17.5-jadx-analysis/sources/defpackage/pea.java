package defpackage;

import android.os.PowerManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class pea implements tld {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pea(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.tld
    public final void a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((pdy) obj).c().release();
        } else {
            ((PowerManager.WakeLock) ((pew) obj).e.get()).release();
        }
    }
}
