package defpackage;

import j$.lang.Iterable$EL;
import java.util.List;

/* loaded from: classes.dex */
public final class jaz extends jdi {
    public static final ypf a = ols.R("CAR.GAL.MIC");
    public volatile boolean b;
    public volatile int c;
    private final jay e;

    public jaz(jay jayVar, jbn jbnVar) {
        super(jayVar, jbnVar);
        this.c = 0;
        this.e = jayVar;
        this.b = false;
    }

    @Override // defpackage.jdi
    public final void h(xkt xktVar) {
        if ((xktVar.b & 2) != 0) {
            this.d = xktVar.d;
        }
        jay jayVar = this.e;
        if (xktVar.c != 0) {
            ((ype) ((ype) ixa.a.g()).ai((char) 1518)).u("onMicrophoneStateChange not ok");
            ixa ixaVar = (ixa) jayVar;
            List<iww> list = ixaVar.e;
            synchronized (list) {
                for (iww iwwVar : list) {
                    ((ype) ((ype) iww.a.h()).ai((char) 1507)).u("onOpenMicError()");
                    iwwVar.d.getAndSet(2);
                    Iterable$EL.forEach(iwwVar.e, new iwu(0));
                    iwwVar.j();
                }
            }
            ixaVar.j.b("MicInputService", ouc.MICROPHONE_OPEN_FAILED);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.jdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.nio.ByteBuffer r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jaz.i(java.nio.ByteBuffer):void");
    }
}
