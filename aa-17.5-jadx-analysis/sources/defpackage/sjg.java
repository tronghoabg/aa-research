package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class sjg {
    private static volatile sjg c;
    public int a;
    public final Object b;

    public sjg(byte[] bArr, byte[] bArr2) {
        this.a = 300;
        zh zhVar = zi.a;
        this.b = new zh(6);
    }

    public static sjg b() {
        if (c == null) {
            synchronized (sjg.class) {
                if (c == null) {
                    c = new sjg();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized BatchedLogErrorParcelable a() {
        ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(LogErrorParcelable logErrorParcelable) {
        dzi dziVar = new dzi(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.b));
        ?? r1 = this.b;
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) r1.get(dziVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.c = wub.aw(logErrorParcelable2.c + logErrorParcelable.c);
        } else if (((aat) r1).d < 100) {
            r1.put(dziVar, logErrorParcelable);
        } else {
            this.a = wub.aw(this.a + logErrorParcelable.c);
        }
    }

    public final void d(int i, Context context) {
        if (adcr.a.gu().a(context)) {
            c(new LogErrorParcelable("UNKNOWN", i, 1));
        }
    }

    public final Object e() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void f(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public final afj g(Object obj, int i) {
        afj afjVar = new afj(obj, aev.d);
        ((zh) this.b).g(i, afjVar);
        return afjVar;
    }

    public sjg(int i) {
        this.b = new LinkedList();
        this.a = i;
    }

    public sjg(byte[] bArr) {
        this.b = new Object[256];
    }

    private sjg() {
        this.a = 0;
        this.b = new yw();
    }
}
