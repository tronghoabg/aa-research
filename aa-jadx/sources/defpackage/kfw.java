package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kfw {
    public static volatile defpackage.kfw b;
    public final android.util.LruCache e;
    public static final java.util.concurrent.Executor a = java.util.concurrent.Executors.newFixedThreadPool(5);
    public static final java.lang.Object c = new java.lang.Object();
    public static final int[] d = {128, defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY};

    public kfw(android.content.Context context) {
        int memoryClass = ((android.app.ActivityManager) context.getSystemService("activity")).getMemoryClass() / 4;
        this.e = new defpackage.kft((memoryClass > 32 ? 32 : memoryClass) * 1048576);
    }

    public static java.lang.String b(java.lang.String str, int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = d;
            int length = iArr.length;
            if (i2 >= 3) {
                throw new java.lang.RuntimeException();
            }
            if (i <= iArr[i2]) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 16);
                sb.append(str);
                sb.append("::");
                sb.append(iArr[i2]);
                return sb.toString();
            }
            i2++;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void a(java.lang.Object obj) {
        defpackage.kfv kfvVar;
        java.lang.ref.SoftReference softReference;
        defpackage.kga kgaVar = null;
        if ((obj instanceof defpackage.kfv) && (softReference = (kfvVar = (defpackage.kfv) obj).a) != null) {
            defpackage.kga kgaVar2 = (defpackage.kga) softReference.get();
            kfvVar.a = null;
            kgaVar = kgaVar2;
        }
        if (kgaVar != null) {
            kgaVar.cancel(true);
        }
    }
}
