package defpackage;

import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class ivn extends Thread {
    public static final yph a = yph.c("CAR.VIDEO");
    public final Object b;
    public final LinkedBlockingDeque c;
    private final ivm d;
    private boolean e;

    public ivn(ivm ivmVar) {
        super("VideoFocusHandler");
        this.b = new Object();
        this.c = new LinkedBlockingDeque();
        this.e = false;
        this.d = ivmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivn.run():void");
    }
}
