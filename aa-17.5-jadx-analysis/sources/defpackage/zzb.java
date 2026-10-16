package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class zzb implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    protected zze a;
    public boolean b;
    private zzf c;

    public final void a(Context context, zze zzeVar, boolean z) {
        this.a = zzeVar;
        this.c = new zzf(context, this, z);
    }

    public final void b(zzf zzfVar, boolean z) {
        this.a.a();
        zze zzeVar = this.a;
        if (z) {
            zzeVar.d(new zzi(3, zzfVar));
        } else {
            zzeVar.d(new zzi(2, zzfVar));
        }
    }

    public final boolean c(zzf zzfVar, boolean z) {
        if (z) {
            return true;
        }
        return this.a.d(new zzi(0, zzfVar));
    }

    public final boolean d(zzf zzfVar, boolean z) {
        if (z) {
            return true;
        }
        boolean zD = this.a.d(new zzi(1, zzfVar));
        if (zD) {
            this.a.b();
        }
        return zD;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[PHI: r2
  0x00bc: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v5 int) binds: [B:46:0x00b5, B:47:0x00b7, B:49:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzb.e(android.view.MotionEvent):void");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return this.a.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.a.onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.onDown(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.a.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return !this.b && this.a.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        this.a.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.a.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.a.onSingleTapUp(motionEvent);
    }
}
