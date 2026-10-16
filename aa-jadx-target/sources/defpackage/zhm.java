package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class zhm extends defpackage.zga {
    public static defpackage.zhm v(defpackage.zhs zhsVar) {
        return zhsVar instanceof defpackage.zhm ? (defpackage.zhm) zhsVar : new defpackage.zhe(zhsVar);
    }

    public final defpackage.zhm u(java.lang.Class cls, defpackage.xyd xydVar, java.util.concurrent.Executor executor) {
        int i = defpackage.zfz.d;
        defpackage.zfy zfyVar = new defpackage.zfy(this, cls, xydVar);
        c(zfyVar, defpackage.ysr.ch(executor, zfyVar));
        return zfyVar;
    }

    public final defpackage.zhm w(defpackage.xyd xydVar, java.util.concurrent.Executor executor) {
        int i = defpackage.zgh.c;
        defpackage.zgg zggVar = new defpackage.zgg(this, xydVar);
        c(zggVar, defpackage.ysr.ch(executor, zggVar));
        return zggVar;
    }

    public final defpackage.zhm x(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return (defpackage.zhm) defpackage.ysr.cv(this, j, timeUnit, scheduledExecutorService);
    }
}
