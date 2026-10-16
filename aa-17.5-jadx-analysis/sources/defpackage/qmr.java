package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class qmr implements Callable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qmr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        switch (this.b) {
            case 0:
                return ((qms) this.a).d();
            case 1:
                Object obj = this.a;
                synchronized (obj) {
                    if (((hsw) obj).g != null) {
                        ((hsw) obj).e();
                        if (((hsw) obj).f()) {
                            ((hsw) obj).c();
                            ((hsw) obj).i = 0;
                        }
                    }
                }
                return null;
            case 2:
                return ((qms) this.a).c();
            case 3:
                WeakReference weakReference = ((qrr) this.a).b;
                Context context = (Context) weakReference.get();
                if (context == null) {
                    qrr.a.h().ai(7802).u("Context is getting destroyed. Assuming client has unbound, not calling listeners");
                    return null;
                }
                File fileCreateTempFile = File.createTempFile("dump", null, context.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    riw.b((Context) weakReference.get(), fileOutputStream);
                    fileOutputStream.close();
                    return fileCreateTempFile;
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            case 4:
                Context context2 = (Context) ((qrr) this.a).b.get();
                if (context2 == null) {
                    qrr.a.h().ai(7803).u("Context is getting destroyed. Assuming client has unbound, not calling listeners");
                    return null;
                }
                File fileCreateTempFile2 = File.createTempFile("dump", null, context2.getCacheDir());
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile2);
                try {
                    long jA = riw.a(fileOutputStream2, 0);
                    fileOutputStream2.close();
                    if (jA > 20000000) {
                        int i = 100000;
                        while (jA > 20000000) {
                            fileCreateTempFile2.delete();
                            fileCreateTempFile2 = File.createTempFile("dump", null, context2.getCacheDir());
                            fileOutputStream2 = new FileOutputStream(fileCreateTempFile2);
                            try {
                                jA = riw.a(fileOutputStream2, i);
                                fileOutputStream2.close();
                                i /= 2;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return fileCreateTempFile2;
                } finally {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            case 5:
                return Boolean.valueOf(((rmk) this.a).a.beginBatchEdit());
            case 6:
                return Boolean.valueOf(((rmk) this.a).a.endBatchEdit());
            case 7:
                return Boolean.valueOf(((rmk) this.a).a.finishComposingText());
            default:
                return xvp.a(((xvs) this.a).c(), xvs.d);
        }
    }
}
