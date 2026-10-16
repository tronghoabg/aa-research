package com.waze.push;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.waze.ActionIntent;
import h.g.b.aq;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Object f33436a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f33437b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f33438c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f33439d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f33440e;

    j(Context context, g gVar, com.waze.x.h hVar, c cVar) {
        this.f33436a = context;
        this.f33438c = gVar;
        this.f33439d = hVar == null ? gVar.c() : hVar;
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        this.f33437b = notificationManagerCompatFrom;
        this.f33440e = cVar;
        notificationManagerCompatFrom.createNotificationChannel(new NotificationChannel("WAZE_CHANNEL_ID", "Waze Notification", 4));
    }

    private final PendingIntent i(String str) {
        Context context = (Context) this.f33436a;
        Intent intent = new Intent(context, (Class<?>) ActionIntent.class);
        intent.putExtra("QuestionID", ((g) this.f33438c).w());
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(context, 1, intent, Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
    }

    private final int j() {
        return ((kotlinx.a.b) this.f33440e).d() - ((kotlinx.a.b) this.f33439d).d();
    }

    private final kotlinx.coroutines.f.i k(kotlinx.coroutines.f.i iVar) {
        if (j() == 127) {
            return iVar;
        }
        if (iVar.f51965g) {
            ((kotlinx.a.b) this.f33437b).e();
        }
        kotlinx.a.b bVar = (kotlinx.a.b) this.f33440e;
        int iD = 127 & bVar.d();
        while (true) {
            AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f33436a;
            if (atomicReferenceArray.get(iD) == null) {
                atomicReferenceArray.lazySet(iD, iVar);
                bVar.e();
                return null;
            }
            Thread.yield();
        }
    }

    private final kotlinx.coroutines.f.i l() {
        kotlinx.coroutines.f.i iVar;
        while (true) {
            Object obj = this.f33439d;
            Object obj2 = this.f33440e;
            kotlinx.a.b bVar = (kotlinx.a.b) obj;
            int iD = bVar.d();
            if (iD - ((kotlinx.a.b) obj2).d() == 0) {
                return null;
            }
            int i2 = iD & 127;
            if (bVar.g(iD, iD + 1) && (iVar = (kotlinx.coroutines.f.i) ((AtomicReferenceArray) this.f33436a).getAndSet(i2, null)) != null) {
                if (iVar.f51965g) {
                    ((kotlinx.a.b) this.f33437b).a();
                    int i3 = ai.f51347a;
                }
                return iVar;
            }
        }
    }

    private final kotlinx.coroutines.f.i m(int i2, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f33436a;
        int i3 = i2 & 127;
        kotlinx.coroutines.f.i iVar = (kotlinx.coroutines.f.i) atomicReferenceArray.get(i3);
        if (iVar != null && iVar.f51965g == z) {
            while (!atomicReferenceArray.compareAndSet(i3, iVar, null)) {
                if (atomicReferenceArray.get(i3) != iVar) {
                }
            }
            if (z) {
                ((kotlinx.a.b) this.f33437b).a();
            }
            return iVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.waze.push.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.push.j.b():void");
    }

    public final int c() {
        Object objB = ((kotlinx.a.d) this.f33438c).b();
        int iJ = j();
        return objB != null ? iJ + 1 : iJ;
    }

    public final long d(int i2, aq aqVar) {
        kotlinx.coroutines.f.i iVarL;
        kotlinx.a.d dVar;
        kotlinx.coroutines.f.i iVar;
        if (i2 == 3) {
            iVarL = l();
        } else {
            boolean z = i2 == 1;
            Object obj = this.f33439d;
            Object obj2 = this.f33440e;
            int iD = ((kotlinx.a.b) obj).d();
            int iD2 = ((kotlinx.a.b) obj2).d();
            while (iD != iD2 && (!z || ((kotlinx.a.b) this.f33437b).d() != 0)) {
                int i3 = iD + 1;
                kotlinx.coroutines.f.i iVarM = m(iD, z);
                if (iVarM != null) {
                    iVarL = iVarM;
                    break;
                }
                iD = i3;
            }
            iVarL = null;
        }
        if (iVarL != null) {
            aqVar.f48105a = iVarL;
            return -1L;
        }
        do {
            dVar = (kotlinx.a.d) this.f33438c;
            iVar = (kotlinx.coroutines.f.i) dVar.b();
            if (iVar == null) {
                return -2L;
            }
            if (((true != iVar.f51965g ? 2 : 1) & i2) == 0) {
                return -2L;
            }
            long jA = kotlinx.coroutines.f.k.f51972f.a() - iVar.f51964f;
            long j2 = kotlinx.coroutines.f.k.f51968b;
            if (jA < j2) {
                return j2 - jA;
            }
        } while (!dVar.e(iVar, null));
        aqVar.f48105a = iVar;
        return -1L;
    }

    public final kotlinx.coroutines.f.i e(kotlinx.coroutines.f.i iVar, boolean z) {
        if (z) {
            return k(iVar);
        }
        kotlinx.coroutines.f.i iVar2 = (kotlinx.coroutines.f.i) ((kotlinx.a.d) this.f33438c).a(iVar);
        if (iVar2 == null) {
            return null;
        }
        return k(iVar2);
    }

    public final kotlinx.coroutines.f.i f() {
        kotlinx.coroutines.f.i iVar = (kotlinx.coroutines.f.i) ((kotlinx.a.d) this.f33438c).a(null);
        return iVar == null ? l() : iVar;
    }

    public final kotlinx.coroutines.f.i g() {
        kotlinx.a.d dVar;
        kotlinx.coroutines.f.i iVar;
        do {
            dVar = (kotlinx.a.d) this.f33438c;
            iVar = (kotlinx.coroutines.f.i) dVar.b();
            if (iVar == null || !iVar.f51965g) {
                Object obj = this.f33439d;
                Object obj2 = this.f33440e;
                int iD = ((kotlinx.a.b) obj).d();
                int iD2 = ((kotlinx.a.b) obj2).d();
                while (iD != iD2 && ((kotlinx.a.b) this.f33437b).d() != 0) {
                    iD2--;
                    kotlinx.coroutines.f.i iVarM = m(iD2, true);
                    if (iVarM != null) {
                        return iVarM;
                    }
                }
                return null;
            }
        } while (!dVar.e(iVar, null));
        return iVar;
    }

    public final void h(com.waze.bl.b.c.a aVar) {
        kotlinx.coroutines.f.i iVar = (kotlinx.coroutines.f.i) ((kotlinx.a.d) this.f33438c).a(null);
        if (iVar != null) {
            aVar.h(iVar);
        }
        while (true) {
            kotlinx.coroutines.f.i iVarL = l();
            if (iVarL == null) {
                return;
            } else {
                aVar.h(iVarL);
            }
        }
    }

    public j() {
        this.f33436a = new AtomicReferenceArray(128);
        this.f33438c = h.e.b.h(null);
        this.f33440e = h.e.b.f(0);
        this.f33439d = h.e.b.f(0);
        this.f33437b = h.e.b.f(0);
    }
}
