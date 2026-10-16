package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zkh extends defpackage.yrw {
    private final defpackage.ygw a;

    public zkh(java.lang.String str, defpackage.ygw ygwVar) {
        super(str);
        this.a = ygwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yqu
    public final void a(defpackage.yqt yqtVar) {
        int i = 0;
        while (true) {
            defpackage.ygw ygwVar = this.a;
            if (i >= ((defpackage.ymx) ygwVar).c) {
                return;
            }
            defpackage.yqu yquVar = (defpackage.yqu) ygwVar.get(i);
            if (yqtVar.h() || yquVar.b(yqtVar.g())) {
                yquVar.a(yqtVar);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yqu
    public final boolean b(java.util.logging.Level level) {
        int i = 0;
        while (true) {
            defpackage.ygw ygwVar = this.a;
            if (i >= ((defpackage.ymx) ygwVar).c) {
                return false;
            }
            if (((defpackage.yqu) ygwVar.get(i)).b(level)) {
                return true;
            }
            i++;
        }
    }
}
