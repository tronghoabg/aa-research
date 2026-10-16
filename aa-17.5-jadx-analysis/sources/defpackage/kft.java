package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.LruCache;
import androidx.car.app.model.Alert;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.SoftReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class kft {
    public static volatile kft b;
    public final LruCache e;
    public static final Executor a = Executors.newFixedThreadPool(5);
    public static final Object c = new Object();
    public static final int[] d = {128, sk.AUDIO_CONTENT_BUFFER_SIZE, Alert.DURATION_SHOW_INDEFINITELY};

    public kft(Context context) {
        int memoryClass = ((ActivityManager) context.getSystemService("activity")).getMemoryClass() / 4;
        this.e = new kfq((memoryClass > 32 ? 32 : memoryClass) * 1048576);
    }

    public static String b(String str, int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = d;
            int length = iArr.length;
            if (i2 >= 3) {
                throw new RuntimeException();
            }
            if (i <= iArr[i2]) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append(str);
                sb.append("::");
                sb.append(iArr[i2]);
                return sb.toString();
            }
            i2++;
        }
    }

    @ResultIgnorabilityUnspecified
    public final void a(Object obj) {
        kfs kfsVar;
        SoftReference softReference;
        kfx kfxVar = null;
        if ((obj instanceof kfs) && (softReference = (kfsVar = (kfs) obj).a) != null) {
            kfx kfxVar2 = (kfx) softReference.get();
            kfsVar.a = null;
            kfxVar = kfxVar2;
        }
        if (kfxVar != null) {
            kfxVar.cancel(true);
        }
    }
}
