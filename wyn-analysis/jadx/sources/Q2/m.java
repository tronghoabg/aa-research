package q2;

import Q1.x;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C3861e f44069a;

    /* renamed from: b, reason: collision with root package name */
    public final o f44070b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44071c;

    /* renamed from: f, reason: collision with root package name */
    public long f44074f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44077i;

    /* renamed from: d, reason: collision with root package name */
    public int f44072d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f44073e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f44075g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f44076h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f44078j = 1.0f;
    public Q1.q k = Q1.q.f9708a;

    public m(Context context, C3861e c3861e) {
        this.f44069a = c3861e;
        this.f44070b = new o(context, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, C8.j r36) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.m.a(long, long, long, long, boolean, C8.j):int");
    }

    public final boolean b(boolean z2) {
        if (z2 && this.f44072d == 3) {
            this.f44076h = -9223372036854775807L;
            return true;
        }
        if (this.f44076h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.f44076h) {
            return true;
        }
        this.f44076h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z2) {
        this.f44077i = z2;
        this.k.getClass();
        this.f44076h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void d(int i5) {
        this.f44072d = Math.min(this.f44072d, i5);
    }

    public final void e() {
        this.f44071c = true;
        this.k.getClass();
        this.f44074f = x.K(SystemClock.elapsedRealtime());
        o oVar = this.f44070b;
        oVar.f44085b = true;
        oVar.k = 0L;
        oVar.f44096n = -1L;
        oVar.f44094l = -1L;
        io.flutter.view.s sVar = (io.flutter.view.s) oVar.f44099q;
        if (sVar != null) {
            n nVar = (n) oVar.f44100r;
            nVar.getClass();
            nVar.f44081b.sendEmptyMessage(2);
            Handler handlerM = x.m(null);
            DisplayManager displayManager = sVar.f37312b;
            displayManager.registerDisplayListener(sVar, handlerM);
            o.a((o) sVar.f37313c, displayManager.getDisplay(0));
        }
        oVar.d(false);
    }

    public final void f() {
        this.f44071c = false;
        this.f44076h = -9223372036854775807L;
        o oVar = this.f44070b;
        oVar.f44085b = false;
        io.flutter.view.s sVar = (io.flutter.view.s) oVar.f44099q;
        if (sVar != null) {
            sVar.f37312b.unregisterDisplayListener(sVar);
            n nVar = (n) oVar.f44100r;
            nVar.getClass();
            nVar.f44081b.sendEmptyMessage(3);
        }
        oVar.b();
    }

    public final void g(float f10) {
        o oVar = this.f44070b;
        oVar.f44087d = f10;
        C3858b c3858b = (C3858b) oVar.f44098p;
        ((C3857a) c3858b.f43985d).c();
        ((C3857a) c3858b.f43986e).c();
        c3858b.f43982a = false;
        c3858b.f43983b = -9223372036854775807L;
        c3858b.f43984c = 0;
        oVar.c();
    }

    public final void h(float f10) {
        Q1.k.c(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f10 == this.f44078j) {
            return;
        }
        this.f44078j = f10;
        o oVar = this.f44070b;
        oVar.f44090g = f10;
        oVar.k = 0L;
        oVar.f44096n = -1L;
        oVar.f44094l = -1L;
        oVar.d(false);
    }
}
