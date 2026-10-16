package com.waze.f.a;

import android.os.SystemClock;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f23760a;

    c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f23760a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f23760a;
        long j2 = dVar.f23765e;
        long jUptimeMillis = SystemClock.uptimeMillis() - j2;
        try {
            double dDoubleValue = ((Double) dVar.f23763c.invoke(dVar.f23762b, Long.valueOf(jUptimeMillis), Double.valueOf(dVar.f23767g), Double.valueOf(dVar.f23768h), Integer.valueOf(dVar.f23766f))).doubleValue();
            d dVar2 = this.f23760a;
            long j3 = j2 + ((((int) (jUptimeMillis / 16)) + 1) * 16);
            if (jUptimeMillis >= dVar2.f23766f) {
                dVar2.f23770j.a();
                dVar2.f23764d = false;
                return;
            }
            b bVar = dVar2.f23770j;
            if (dVar2.f23769i) {
                dDoubleValue = dVar2.f23768h - dDoubleValue;
            }
            bVar.b(dDoubleValue);
            d.f23761a.postAtTime(this, dVar2.f23771k, j3);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
