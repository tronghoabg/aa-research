package defpackage;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zjf extends yqr {
    private final yfq a;

    public zjf(String str, yfq yfqVar) {
        super(str);
        this.a = yfqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ypp
    public final void a(ypo ypoVar) {
        int i = 0;
        while (true) {
            yfq yfqVar = this.a;
            if (i >= ((yls) yfqVar).c) {
                return;
            }
            ypp yppVar = (ypp) yfqVar.get(i);
            if (ypoVar.h() || yppVar.b(ypoVar.g())) {
                yppVar.a(ypoVar);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ypp
    public final boolean b(Level level) {
        int i = 0;
        while (true) {
            yfq yfqVar = this.a;
            if (i >= ((yls) yfqVar).c) {
                return false;
            }
            if (((ypp) yfqVar.get(i)).b(level)) {
                return true;
            }
            i++;
        }
    }
}
