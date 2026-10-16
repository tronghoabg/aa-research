package com.waze.utils;

import android.app.DownloadManager;
import android.database.ContentObserver;
import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f44829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f44830b;

    /* renamed from: c, reason: collision with root package name */
    private final long f44831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, long j2, CompletableDeferred completableDeferred) {
        super(null);
        this.f44830b = completableDeferred;
        this.f44829a = ajVar;
        this.f44831c = j2;
    }

    public final void a(ae aeVar) {
        h.g.b.x.f(aeVar, "error");
        this.f44830b.a(h.m.d(e.b.c.a(aeVar)));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Object objA;
        Cursor cursorQuery;
        Cursor cursor;
        ad adVar;
        try {
            ag agVar = this;
            cursorQuery = aj.b(this.f44829a).query(new DownloadManager.Query().setFilterById(this.f44831c));
            try {
                cursor = cursorQuery;
            } finally {
            }
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (!cursor.moveToFirst()) {
            a(new t(null));
            h.a.i.aW(cursorQuery, null);
            return;
        }
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(NotificationCompat.CATEGORY_STATUS));
        if (i2 == 8) {
            this.f44830b.a(h.m.d(h.ab.f48028a));
        } else if (i2 == 16) {
            switch (cursor.getInt(cursor.getColumnIndexOrThrow("reason"))) {
                case 1000:
                    adVar = new ad();
                    break;
                case 1001:
                    adVar = w.f44906a;
                    break;
                case 1002:
                    adVar = ac.f44828a;
                    break;
                case 1003:
                default:
                    adVar = new ad();
                    break;
                case 1004:
                    adVar = x.f44907a;
                    break;
                case 1005:
                    adVar = ab.f44827a;
                    break;
                case 1006:
                    adVar = y.f44908a;
                    break;
                case 1007:
                    adVar = u.f44904a;
                    break;
                case 1008:
                    adVar = r.f44903a;
                    break;
                case 1009:
                    adVar = v.f44905a;
                    break;
            }
            a(adVar);
        }
        h.a.i.aW(cursorQuery, null);
        objA = h.ab.f48028a;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            a(new t(thC));
        }
    }
}
