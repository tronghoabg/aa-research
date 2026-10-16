package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agp implements defpackage.bvu {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public agp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [eqt, java.lang.Object] */
    @Override // defpackage.bvu
    public final void a() {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.agn) this.a).f.remove(this.b);
                break;
            case 1:
                ((defpackage.afo) this.b).a.m(this.a);
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.agh aghVarA = ((defpackage.agi) this.a).a();
                if (aghVarA != null) {
                    ((defpackage.agn) this.b).m(aghVarA.a);
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.agn) this.b).m((defpackage.agl) this.a);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.awv) this.b).a((android.view.View) this.a);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.bag) this.a).a.h(this.b);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.bfk) this.a).c.remove(this.b);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.eqp) this.a).k(this.b);
                break;
            default:
                ((android.content.Context) this.a).unregisterReceiver((android.content.BroadcastReceiver) this.b);
                break;
        }
    }

    public agp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
