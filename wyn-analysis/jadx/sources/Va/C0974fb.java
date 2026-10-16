package Va;

import android.app.Activity;
import android.app.Application;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: Va.fb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0974fb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static C0974fb f14176f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f14177g = {']', 130, 133, 'x', 'w', 'b', 127, '|', '{', 'y', 143, 137, 138, 132, 136, 'i', 140, '[', '6', 'W', 'h', 139, 131, 'z', 'f', 'Y', 'D', 'I', 134, 'k', 142, '_', 'Z'};

    /* renamed from: h, reason: collision with root package name */
    public static int f14178h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14179i = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f14180a;

    /* renamed from: b, reason: collision with root package name */
    public HashSet f14181b;

    /* renamed from: c, reason: collision with root package name */
    public WeakHashMap f14182c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f14183d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f14184e;

    public static synchronized C0974fb e() {
        try {
            if (f14176f == null) {
                C0974fb c0974fb = new C0974fb();
                c0974fb.f14180a = false;
                c0974fb.f14181b = new HashSet();
                c0974fb.f14182c = new WeakHashMap();
                f14176f = c0974fb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14176f;
    }

    public static String j(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14177g;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 22);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final void a(Activity activity) {
        this.f14183d = new WeakReference(activity);
        C1169v c1169v = new C1169v(21);
        c1169v.f14690d = activity;
        Cb.e(c1169v);
        f14178h = (f14179i + 83) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        if (r3.f14182c.size() > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        Va.C0974fb.f14178h = (Va.C0974fb.f14179i + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f14182c.size() > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean c() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = Va.C0974fb.f14179i     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 + 63
            int r1 = r0 % 128
            Va.C0974fb.f14178h = r1     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1e
            java.util.WeakHashMap r0 = r3.f14182c     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
            r2 = 62
            int r2 = r2 / r1
            if (r0 <= 0) goto L31
            goto L26
        L1a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            goto L33
        L1e:
            java.util.WeakHashMap r0 = r3.f14182c     // Catch: java.lang.Throwable -> L1c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
            if (r0 <= 0) goto L31
        L26:
            int r0 = Va.C0974fb.f14179i     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 + 35
            int r0 = r0 % 128
            Va.C0974fb.f14178h = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)
            r0 = 1
            return r0
        L31:
            monitor-exit(r3)
            return r1
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0974fb.c():boolean");
    }

    public final synchronized void f(InterfaceC0948db interfaceC0948db) {
        this.f14181b.add(interfaceC0948db);
    }

    public final void g(Activity activity) {
        f14179i = (f14178h + 95) % 128;
        Iterator it = h().iterator();
        f14179i = (f14178h + 91) % 128;
        while (it.hasNext()) {
            ((InterfaceC0948db) it.next()).b(activity);
        }
        f14179i = (f14178h + 123) % 128;
    }

    public final synchronized ArrayList h() {
        return new ArrayList(this.f14181b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return (android.app.Activity) r3.f14183d.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        Va.C0974fb.f14179i = (r1 + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f14183d != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f14183d != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Activity i() {
        /*
            r3 = this;
            int r0 = Va.C0974fb.f14179i
            int r0 = r0 + 75
            int r1 = r0 % 128
            Va.C0974fb.f14178h = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L15
            java.lang.ref.WeakReference r0 = r3.f14183d
            r2 = 37
            int r2 = r2 / 0
            if (r0 == 0) goto L22
            goto L19
        L15:
            java.lang.ref.WeakReference r0 = r3.f14183d
            if (r0 == 0) goto L22
        L19:
            java.lang.ref.WeakReference r0 = r3.f14183d
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L22:
            int r1 = r1 + 83
            int r1 = r1 % 128
            Va.C0974fb.f14179i = r1
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0974fb.i():android.app.Activity");
    }

    public final synchronized void k(InterfaceC0948db interfaceC0948db) {
        this.f14181b.remove(interfaceC0948db);
    }

    public final synchronized void l(Application application, Activity activity) {
        try {
            if (this.f14184e == null) {
                this.f14184e = new WeakReference(application);
                if (activity != null) {
                    a(activity);
                    synchronized (this) {
                        this.f14182c.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            synchronized (C0974fb.class) {
                try {
                    if (this.f14183d == null) {
                        a(activity);
                        C0974fb.class.notifyAll();
                    }
                } finally {
                }
            }
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((InterfaceC0948db) it.next()).onActivityCreated(activity, bundle);
            }
        } catch (Exception e7) {
            Ab.a0(j(127 - View.MeasureSpec.getSize(0), "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, "\u0098\u0089\u008d\u0085\u0089\u008f\u009a\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i5 = f14179i + 113;
        f14178h = i5 % 128;
        try {
            if (i5 % 2 != 0) {
                h().iterator();
                throw null;
            }
            Iterator it = h().iterator();
            while (it.hasNext()) {
                f14178h = (f14179i + 103) % 128;
                ((InterfaceC0948db) it.next()).onActivityDestroyed(activity);
            }
        } catch (Exception e7) {
            Ab.a0(j((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0098\u0089\u008b\u0083\u008f\u008d\u008c\u0089¡\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it;
        int i5 = f14178h + 11;
        f14179i = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                it = h().iterator();
                int i10 = 4 / 0;
            } else {
                it = h().iterator();
            }
            f14178h = (f14179i + 1) % 128;
            while (it.hasNext()) {
                int i11 = f14178h + 7;
                f14179i = i11 % 128;
                if (i11 % 2 == 0) {
                    ((InterfaceC0948db) it.next()).onActivityPaused(activity);
                    int i12 = 32 / 0;
                } else {
                    ((InterfaceC0948db) it.next()).onActivityPaused(activity);
                }
            }
            f14178h = (f14179i + 51) % 128;
        } catch (Exception e7) {
            Ab.a0(j(127 - Color.alpha(0), "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j(Color.green(0) + 127, "\u0098\u0089\u008c\u0096\u0085\u0099\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            a(activity);
            Iterator it = h().iterator();
            while (it.hasNext()) {
                int i5 = f14179i + 3;
                f14178h = i5 % 128;
                if (i5 % 2 != 0) {
                    ((InterfaceC0948db) it.next()).onActivityResumed(activity);
                    throw null;
                }
                ((InterfaceC0948db) it.next()).onActivityResumed(activity);
                f14179i = (f14178h + 59) % 128;
            }
        } catch (Exception e7) {
            Ab.a0(j(127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0098\u0089\u0097\u0096\u008c\u0089\u0095\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f14178h = (f14179i + 41) % 128;
        try {
            Iterator it = h().iterator();
            while (it.hasNext()) {
                int i5 = f14179i + 19;
                f14178h = i5 % 128;
                if (i5 % 2 != 0) {
                    ((InterfaceC0948db) it.next()).onActivitySaveInstanceState(activity, bundle);
                    int i10 = 63 / 0;
                } else {
                    ((InterfaceC0948db) it.next()).onActivitySaveInstanceState(activity, bundle);
                }
            }
        } catch (Exception e7) {
            Ab.a0(j(126 - Process.getGidForName(""), "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j(127 - KeyEvent.normalizeMetaState(0), "\u0089\u008d\u0085\u008d\u0090\u0089\u008a\u008e\u0085\u008d\u008c\u008e \u0089\u0091\u0085\u0090\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            if (this.f14183d == null) {
                a(activity);
            }
            synchronized (this) {
                this.f14182c.put(activity, Boolean.TRUE);
            }
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((InterfaceC0948db) it.next()).onActivityStarted(activity);
            }
            if (activity.getLocalClassName().equals(j(127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008b\u009f\u0083\u008f\u0099\u008f\u0089\u008b\u0085\u0082\u0099\u008b\u008d\u0087\u008e\u009e\u009b\u008f\u0089\u008b\u0085\u0082\u009d\u009b\u0098\u009c\u008b\u008d\u0087\u008e\u0096\u009b\u0097\u0083\u008a").intern())) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f14182c.size() == 1 && !this.f14180a) {
                        g(activity);
                    }
                } finally {
                }
            }
        } catch (Exception e7) {
            Ab.a0(j((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j(126 - Process.getGidForName(""), "\u0098\u0089\u008d\u008f\u0085\u008d\u0090\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int size;
        try {
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((InterfaceC0948db) it.next()).onActivityStopped(activity);
            }
            this.f14180a = activity.isChangingConfigurations();
            synchronized (this) {
                try {
                    if (!this.f14182c.containsKey(activity) || activity.getLocalClassName().equals(j(127 - (Process.myPid() >> 22), "\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008b\u009f\u0083\u008f\u0099\u008f\u0089\u008b\u0085\u0082\u0099\u008b\u008d\u0087\u008e\u009e\u009b\u008f\u0089\u008b\u0085\u0082\u009d\u009b\u0098\u009c\u008b\u008d\u0087\u008e\u0096\u009b\u0097\u0083\u008a").intern())) {
                        size = -1;
                    } else {
                        this.f14182c.remove(activity);
                        size = this.f14182c.size();
                    }
                } finally {
                }
            }
            if (size < 0 || size != 0 || this.f14180a) {
                return;
            }
            Iterator it2 = h().iterator();
            f14178h = (f14179i + 61) % 128;
            while (!(!it2.hasNext())) {
                f14179i = (f14178h + 107) % 128;
                ((InterfaceC0948db) it2.next()).d(activity);
            }
        } catch (Exception e7) {
            Ab.a0(j(Process.getGidForName("") + 128, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), j((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0098\u0089\u009d\u009d\u0083\u008d\u0090\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e7, false);
        }
    }
}
