package r4;

import a2.C1325e;
import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import u4.AbstractC4249a;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3915a implements InterfaceC3922h {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLong f44328m = new AtomicLong(1);

    /* renamed from: a, reason: collision with root package name */
    public final long f44329a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f44330b;

    /* renamed from: c, reason: collision with root package name */
    public Date f44331c;

    /* renamed from: d, reason: collision with root package name */
    public Date f44332d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f44333e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f44334f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f44335g;

    /* renamed from: h, reason: collision with root package name */
    public Future f44336h;

    /* renamed from: i, reason: collision with root package name */
    public int f44337i;

    /* renamed from: j, reason: collision with root package name */
    public R1.i f44338j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public final int f44339l;

    public AbstractC3915a(String[] strArr) {
        long andIncrement = f44328m.getAndIncrement();
        this.f44329a = andIncrement;
        this.f44330b = new Date();
        this.f44331c = null;
        this.f44332d = null;
        this.f44333e = strArr;
        this.f44334f = new LinkedList();
        this.f44335g = new Object();
        this.f44337i = 1;
        this.f44338j = null;
        this.k = null;
        this.f44339l = 5;
        synchronized (FFmpegKitConfig.f24188f) {
            try {
                C1325e c1325e = FFmpegKitConfig.f24186d;
                if (!c1325e.containsKey(Long.valueOf(andIncrement))) {
                    c1325e.put(Long.valueOf(andIncrement), this);
                    FFmpegKitConfig.f24187e.add(this);
                    FFmpegKitConfig.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Exception exc) {
        this.k = AbstractC4249a.a(exc);
        this.f44337i = 3;
        this.f44332d = new Date();
    }

    public final LinkedList e(int i5) {
        i(i5);
        if (h()) {
            Log.i("ffmpeg-kit", String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.f44329a)));
        }
        return f();
    }

    public final LinkedList f() {
        LinkedList linkedList;
        synchronized (this.f44335g) {
            linkedList = new LinkedList(this.f44334f);
        }
        return linkedList;
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f44335g) {
            try {
                Iterator it = this.f44334f.iterator();
                while (it.hasNext()) {
                    sb2.append(((C3919e) it.next()).f44349c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb2.toString();
    }

    public final boolean h() {
        return FFmpegKitConfig.messagesInTransmit(this.f44329a) != 0;
    }

    public final void i(int i5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (h() && System.currentTimeMillis() < i5 + jCurrentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
