package W9;

import Ef.H;
import K8.C0690b;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import ea.Q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import x.C4412e;
import x.C4415h;
import x.C4429v;

/* loaded from: classes4.dex */
public final class u implements Continuation {

    /* renamed from: e, reason: collision with root package name */
    public static u f15388e;

    /* renamed from: a, reason: collision with root package name */
    public Object f15389a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15390b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15391c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15392d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15389a = obj;
        this.f15390b = obj2;
        this.f15391c = obj3;
        this.f15392d = obj4;
    }

    public static final Message a(u uVar, ArrayList arrayList, int i5) {
        Object obj;
        uVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Message) obj2).what == i5) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static c9.k c(List list, Map map, Comparator comparator) {
        u uVar = new u();
        uVar.f15389a = list;
        uVar.f15390b = map;
        Collections.sort(list, comparator);
        c9.j jVar = new c9.j(list.size());
        int i5 = jVar.f19813b - 1;
        int size = list.size();
        while (i5 >= 0) {
            boolean z2 = (jVar.f19812a & ((long) (1 << i5))) == 0;
            int iPow = (int) Math.pow(2.0d, i5);
            i5--;
            size -= iPow;
            if (z2) {
                uVar.d(2, iPow, size);
            } else {
                uVar.d(2, iPow, size);
                size -= iPow;
                uVar.d(1, iPow, size);
            }
        }
        c9.g gVar = (c9.i) uVar.f15391c;
        if (gVar == null) {
            gVar = c9.f.f19807a;
        }
        return new c9.k(gVar, comparator);
    }

    public static synchronized u f() {
        try {
            if (f15388e == null) {
                f15388e = new u(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15388e;
    }

    public c9.g b(int i5, int i10) {
        if (i10 == 0) {
            return c9.f.f19807a;
        }
        Map map = (Map) this.f15390b;
        List list = (List) this.f15389a;
        if (i10 == 1) {
            Object obj = list.get(i5);
            return new c9.e(obj, map.get(obj), null, null);
        }
        int i11 = i10 / 2;
        int i12 = i5 + i11;
        c9.g gVarB = b(i5, i11);
        c9.g gVarB2 = b(i12 + 1, i11);
        Object obj2 = list.get(i12);
        return new c9.e(obj2, map.get(obj2), gVarB, gVarB2);
    }

    public void d(int i5, int i10, int i11) {
        c9.g gVarB = b(i11 + 1, i10 - 1);
        Object obj = ((List) this.f15389a).get(i11);
        Map map = (Map) this.f15390b;
        c9.i hVar = i5 == 1 ? new c9.h(obj, map.get(obj), null, gVarB) : new c9.e(obj, map.get(obj), null, gVarB);
        if (((c9.i) this.f15391c) == null) {
            this.f15391c = hVar;
            this.f15392d = hVar;
        } else {
            ((c9.i) this.f15392d).q(hVar);
            this.f15392d = hVar;
        }
    }

    public void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C4429v) this.f15390b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                e(arrayList2.get(i5), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public boolean g(Context context) {
        if (((Boolean) this.f15391c) == null) {
            this.f15391c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f15390b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f15391c).booleanValue();
    }

    public boolean h(Context context) {
        if (((Boolean) this.f15390b) == null) {
            this.f15390b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f15390b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f15390b).booleanValue();
    }

    public void i(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f15391c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void j(int i5) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f15391c).drainTo(arrayList);
        Message messageObtain = Message.obtain(null, i5, 0, 0);
        AbstractC3340k.d(messageObtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(messageObtain);
        H.D(H.c((InterfaceC3108h) this.f15389a), null, new Q(this, arrayList, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v16, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v24, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:18:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(lf.AbstractC3464c r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W9.u.k(lf.c):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        AbstractC1732v.i(exception);
        if (!zzadg.zzc(exception)) {
            return task;
        }
        boolean zIsLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = (String) this.f15389a;
        if (zIsLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return ((C6.l) this.f15390b).H(str, Boolean.TRUE, (RecaptchaAction) this.f15391c).continueWithTask((C0690b) this.f15392d);
    }

    public u(int i5) {
        switch (i5) {
            case 3:
                this.f15389a = new O0.d(10);
                this.f15390b = new C4429v(0);
                this.f15391c = new ArrayList();
                this.f15392d = new HashSet();
                break;
            case 7:
                this.f15389a = new C4412e(0);
                this.f15390b = new SparseArray();
                this.f15391c = new C4415h();
                this.f15392d = new C4412e(0);
                break;
            default:
                this.f15389a = null;
                this.f15390b = null;
                this.f15391c = null;
                this.f15392d = new ArrayDeque();
                break;
        }
    }
}
