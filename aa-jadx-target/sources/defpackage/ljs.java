package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ljs implements defpackage.qsy, defpackage.liz {
    public static final /* synthetic */ int e = 0;
    private static final defpackage.yqm f = defpackage.yqm.c("GH.UnlimitedPrvdr");
    public final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean b;
    public boolean c;
    public final defpackage.rpe d;
    private boolean g;
    private defpackage.liy h;

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public ljs(defpackage.rpe rpeVar) throws rlo {
        this.d = rpeVar;
        if (rpeVar != null) {
            try {
                rpeVar.f(this, 11, 0);
                defpackage.qsz qszVarA = rpeVar.a(11);
                d(qszVarA.a, qszVarA.b, qszVarA.c, qszVarA.d);
            } catch (defpackage.qst unused) {
                ((defpackage.yqj) ((defpackage.yqj) f.h()).ai((char) 3981)).u("Unable to register sensor listener");
            }
        }
    }

    private final void c() {
        defpackage.liy liyVar = this.h;
        boolean z = true;
        if (liyVar != defpackage.liy.b && liyVar != defpackage.liy.c) {
            z = false;
        }
        if (this.d != null) {
            z &= this.g;
        }
        if (this.b != z) {
            this.b = z;
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.lja) it.next()).a(this.b);
            }
        }
    }

    @Override // defpackage.liz
    public final void a(defpackage.liy liyVar) {
        this.h = liyVar;
        c();
    }

    @Override // defpackage.liz
    public final void b(java.lang.Float f2) {
        if (f2 == null || f2.floatValue() <= 0.0f) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.qsy
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        int length = fArr.length;
        int length2 = bArr.length;
        com.google.android.gms.car.CarSensorEvent carSensorEvent = new com.google.android.gms.car.CarSensorEvent(i, j, length, length2);
        java.lang.System.arraycopy(fArr, 0, carSensorEvent.d, 0, length);
        java.lang.System.arraycopy(bArr, 0, carSensorEvent.e, 0, length2);
        this.g = (carSensorEvent.g().a & 2) == 0;
        c();
    }
}
