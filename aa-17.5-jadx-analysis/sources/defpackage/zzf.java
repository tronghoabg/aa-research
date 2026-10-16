package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzf {
    public final Context a;
    public MotionEvent b;
    public MotionEvent c;
    public final List d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public final float o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public final zzd t;
    public final zzb u;
    private final List v;
    private final LinkedList w;
    private long x;

    public zzf(Context context, zzb zzbVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.d = new ArrayList();
        this.w = new LinkedList();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a = context;
        this.u = zzbVar;
        this.o = viewConfiguration.getScaledEdgeSlop();
        arrayList.add(new zzm(zzbVar));
        if (z) {
            arrayList.add(new zzh(zzbVar));
        } else {
            arrayList.add(new zzk(zzbVar));
        }
        arrayList.add(new zzj(zzbVar));
        arrayList.add(new zzo(zzbVar));
        zzd zzdVar = new zzd(context, zzbVar, new Handler(Looper.getMainLooper()));
        this.t = zzdVar;
        zzdVar.w = true;
        zzdVar.k = zzbVar;
    }

    public static float a(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    public static float b(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    public final void c() {
        for (zza zzaVar : this.d) {
            zkt.f(zzaVar.a);
            zzaVar.a(this);
        }
    }

    public final void d() {
        this.b = null;
        this.c = null;
        this.r = false;
        this.s = false;
        this.d.clear();
        LinkedList linkedList = this.w;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((sb) it.next()).m();
        }
        linkedList.clear();
        for (zza zzaVar : this.v) {
            if (zzaVar.a) {
                zzaVar.a(this);
            }
        }
    }

    public final void e(MotionEvent motionEvent) {
        this.c = MotionEvent.obtain(motionEvent);
        this.k = -1.0f;
        this.l = -1.0f;
        MotionEvent motionEvent2 = this.b;
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float x2 = motionEvent2.getX(motionEvent2.getPointerCount() - 1);
        float y2 = motionEvent2.getY(motionEvent2.getPointerCount() - 1);
        float x3 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        float f = x2 - x;
        float x4 = motionEvent.getX(motionEvent.getPointerCount() - 1) - x3;
        float y4 = motionEvent.getY(motionEvent.getPointerCount() - 1) - y3;
        this.g = f;
        this.h = y2 - y;
        this.i = x4;
        this.j = y4;
        this.e = x3 + (x4 * 0.5f);
        this.f = y3 + (y4 * 0.5f);
        motionEvent.getEventTime();
        motionEvent2.getEventTime();
        this.m = motionEvent.getPressure(0) + motionEvent.getPressure(motionEvent.getPointerCount() - 1);
        this.n = motionEvent2.getPressure(0) + motionEvent2.getPressure(motionEvent2.getPointerCount() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.f(android.view.MotionEvent):void");
    }
}
