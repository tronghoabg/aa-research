package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dcb implements defpackage.cgh {
    public aiuw b;
    private final android.content.Context c;
    private aiwg d;
    private final defpackage.byh e = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);

    public dcb(android.content.Context context) {
        this.c = context;
    }

    @Override // defpackage.cgh
    public final float a() {
        ajay ajayVar;
        if (this.d == null) {
            android.content.Context context = this.c;
            defpackage.aau aauVar = defpackage.dcw.a;
            synchronized (aauVar) {
                java.lang.Object objA = aauVar.a(context);
                if (objA == null) {
                    android.content.ContentResolver contentResolver = context.getContentResolver();
                    android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                    aiyk aiykVarQ = defpackage.afqt.q(-1, 0, 6);
                    objA = afsg.v(new aiza(new defpackage.dcu(contentResolver, uriFor, new defpackage.dcv(aiykVarQ, hh$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper())), aiykVarQ, context, null)), ahoi.c(), new ajax(0L), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    aauVar.m(context, objA);
                }
                ajayVar = (ajay) objA;
            }
            b(((java.lang.Number) ajayVar.b()).floatValue());
            aiuw aiuwVar = this.b;
            if (aiuwVar == null) {
                throw new java.lang.IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.d = ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bnx(ajayVar, this, (defpackage.afdk) null, 15), 3);
        }
        return this.e.e();
    }

    public final void b(float f) {
        this.e.h(f);
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return affgVar.invoke(r, this);
    }

    @Override // defpackage.afdm, defpackage.afdo
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) defpackage.afga.t(this, afdnVar);
    }

    @Override // defpackage.afdm
    public final /* synthetic */ defpackage.afdn getKey() {
        return defpackage.cgh.a;
    }

    @Override // defpackage.afdo
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return defpackage.afga.u(this, afdnVar);
    }

    @Override // defpackage.afdo
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return defpackage.afga.w(this, afdoVar);
    }
}
