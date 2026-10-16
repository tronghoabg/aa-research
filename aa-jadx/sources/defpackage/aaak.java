package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaak {
    public final android.content.Context a;
    public android.view.MotionEvent b;
    public android.view.MotionEvent c;
    public final java.util.List d;
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
    public final defpackage.aaai t;
    public final defpackage.aaag u;
    private final java.util.List v;
    private final java.util.LinkedList w;
    private long x;

    public aaak(android.content.Context context, defpackage.aaag aaagVar, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.v = arrayList;
        this.d = new java.util.ArrayList();
        this.w = new java.util.LinkedList();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.a = context;
        this.u = aaagVar;
        this.o = viewConfiguration.getScaledEdgeSlop();
        arrayList.add(new defpackage.aaar(aaagVar));
        if (z) {
            arrayList.add(new defpackage.aaam(aaagVar));
        } else {
            arrayList.add(new defpackage.aaap(aaagVar));
        }
        arrayList.add(new defpackage.aaao(aaagVar));
        arrayList.add(new defpackage.aaat(aaagVar));
        defpackage.aaai aaaiVar = new defpackage.aaai(context, aaagVar, new android.os.Handler(android.os.Looper.getMainLooper()));
        this.t = aaaiVar;
        aaaiVar.w = true;
        aaaiVar.k = aaagVar;
    }

    public static float a(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    public static float b(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    public final void c() {
        for (defpackage.aaaf aaafVar : this.d) {
            defpackage.zlv.f(aaafVar.a);
            aaafVar.a(this);
        }
    }

    public final void d() {
        this.b = null;
        this.c = null;
        this.r = false;
        this.s = false;
        this.d.clear();
        java.util.LinkedList linkedList = this.w;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((defpackage.sg) it.next()).m();
        }
        linkedList.clear();
        for (defpackage.aaaf aaafVar : this.v) {
            if (aaafVar.a) {
                aaafVar.a(this);
            }
        }
    }

    public final void e(android.view.MotionEvent motionEvent) {
        this.c = android.view.MotionEvent.obtain(motionEvent);
        this.k = -1.0f;
        this.l = -1.0f;
        android.view.MotionEvent motionEvent2 = this.b;
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

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    public final void f(android.view.MotionEvent motionEvent) {
        boolean z;
        int iH;
        int action = motionEvent.getAction();
        java.util.LinkedList linkedList = this.w;
        if (linkedList.isEmpty()) {
            this.x = motionEvent.getEventTime();
        }
        linkedList.addLast(new defpackage.sg(motionEvent));
        if (linkedList.size() > 20) {
            ((defpackage.sg) linkedList.removeFirst()).m();
        }
        while (((defpackage.sg) linkedList.getLast()).l() - ((defpackage.sg) linkedList.getFirst()).l() >= 250 && linkedList.size() > 3) {
            ((defpackage.sg) linkedList.removeFirst()).m();
        }
        if (action == 1) {
            z = true;
        } else {
            if (action == 3) {
                this.s = false;
            } else if (action == 6 || action == 262) {
                z = true;
            }
            z = false;
        }
        if (this.s) {
            for (defpackage.aaaf aaafVar : this.v) {
                if (!aaafVar.a) {
                    long j = this.x;
                    java.util.List list = this.d;
                    if (aaafVar.d() && !list.isEmpty()) {
                        iH = 1;
                        break;
                    }
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (z == aaafVar.f()) {
                                iH = aaafVar.h(j, linkedList, list);
                                break;
                            }
                            break;
                        } else if (((defpackage.aaaf) it.next()).d()) {
                            defpackage.zlv.f(list.size() == 1);
                        }
                        iH = 1;
                        break;
                    }
                    int i = iH - 1;
                    if (i == 1) {
                        break;
                    }
                    if (i != 2) {
                        continue;
                    } else {
                        if (aaafVar.a) {
                            throw new java.lang.IllegalStateException("Gesture already active: ".concat(java.lang.String.valueOf(aaafVar.getClass().getName())));
                        }
                        boolean zC = aaafVar.c(this);
                        aaafVar.a = zC;
                        if (zC) {
                            list.add(aaafVar);
                        }
                    }
                }
            }
        }
        if (z) {
            c();
            this.s = false;
        }
    }
}
