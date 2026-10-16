package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdv implements defpackage.saa {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rdv(defpackage.ref refVar, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable, java.lang.Object obj, int i) {
        this.d = i;
        this.b = refVar;
        this.c = abstractSafeParcelable;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.saa
    public final void a() throws android.os.RemoteException {
        int i = this.d;
        if (i == 0) {
            ((defpackage.ref) this.a).C().aW((java.lang.String) this.b, (java.lang.String) this.c);
            return;
        }
        if (i == 1) {
            ((defpackage.ref) this.b).C().bl((com.google.android.gms.car.display.CarRegionId) this.c, (android.graphics.Rect) this.a);
        } else if (i == 2) {
            ((defpackage.ref) this.b).C().ap((com.google.android.gms.car.display.CarDisplayId) this.c, (com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) this.a);
        } else {
            if (i == 3) {
                ((defpackage.ref) this.a).C().aA((byte[]) this.c, ((defpackage.yyh) this.b).aw);
                return;
            }
            ?? r0 = this.c;
            java.lang.Object obj = this.a;
            defpackage.rjf rjfVar = (defpackage.rjf) this.b;
            rjfVar.c.E(new rjb(rjfVar, (ajnd) obj, (java.util.List) r0));
        }
    }

    public /* synthetic */ rdv(defpackage.ref refVar, java.lang.String str, java.lang.String str2, int i) {
        this.d = i;
        this.a = refVar;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ rdv(defpackage.ref refVar, byte[] bArr, defpackage.yyh yyhVar, int i) {
        this.d = i;
        this.a = refVar;
        this.c = bArr;
        this.b = yyhVar;
    }

    public /* synthetic */ rdv(defpackage.rjf rjfVar, ajnd ajndVar, java.util.List list, int i) {
        this.d = i;
        this.b = rjfVar;
        this.a = ajndVar;
        this.c = list;
    }
}
