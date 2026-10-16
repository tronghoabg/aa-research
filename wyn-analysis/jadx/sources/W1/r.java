package W1;

import android.os.SystemClock;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.b0;
import com.moloco.sdk.publisher.AdFormatType;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public class r implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public long f15031a;

    /* renamed from: b, reason: collision with root package name */
    public long f15032b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f15033c;

    public r(AdFormatType adFormatType, long j8) {
        AbstractC3340k.e(adFormatType, "adFormatType");
        this.f15033c = adFormatType;
        this.f15031a = j8;
        Cf.h hVar = Cf.a.f2200b;
        this.f15032b = 0L;
    }

    public long a() {
        long jK = Cf.a.k(this.f15032b);
        long j8 = this.f15031a;
        long jG = Cf.a.g(j8, jK);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdCreateLoadTimeoutManager", ((AdFormatType) this.f15033c) + " timeout: " + ((Object) Cf.a.j(j8)) + ", create ad duration: " + ((Object) Cf.a.j(this.f15032b)) + ". Return value: " + ((Object) Cf.a.j(jG)), false, 4, null);
        return jG;
    }

    public synchronized Object b(Object obj) {
        return ((LinkedHashMap) this.f15033c).get(obj);
    }

    public int c(Object obj) {
        return 1;
    }

    public synchronized Object e(Object obj, Object obj2) {
        long jC = c(obj2);
        if (jC >= this.f15031a) {
            d(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f15032b += jC;
        }
        Object objPut = ((LinkedHashMap) this.f15033c).put(obj, obj2);
        if (objPut != null) {
            this.f15032b -= c(objPut);
            if (!objPut.equals(obj2)) {
                d(obj, objPut);
            }
        }
        g(this.f15031a);
        return objPut;
    }

    public void f(Exception exc) {
        boolean z2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f15033c) == null) {
            this.f15033c = exc;
        }
        if (this.f15031a == -9223372036854775807L) {
            synchronized (t.f15036j0) {
                z2 = t.f15038l0 > 0;
            }
            if (!z2) {
                this.f15031a = 200 + jElapsedRealtime;
            }
        }
        long j8 = this.f15031a;
        if (j8 == -9223372036854775807L || jElapsedRealtime < j8) {
            this.f15032b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f15033c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f15033c;
        this.f15033c = null;
        this.f15031a = -9223372036854775807L;
        this.f15032b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void g(long j8) {
        while (this.f15032b > j8) {
            Iterator it = ((LinkedHashMap) this.f15033c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f15032b -= c(value);
            Object key = entry.getKey();
            it.remove();
            d(key, value);
        }
    }

    public r(long j8) {
        this.f15033c = new LinkedHashMap(100, 0.75f, true);
        this.f15031a = j8;
    }

    @Override // com.moloco.sdk.internal.publisher.b0
    public void a(long j8, long j10) {
        this.f15032b = Fe.b.T(j10 - j8, Cf.c.f2207c);
    }

    public r() {
        this.f15031a = -9223372036854775807L;
        this.f15032b = -9223372036854775807L;
    }

    public void d(Object obj, Object obj2) {
    }
}
