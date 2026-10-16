package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: classes.dex */
public final class dbt implements cga {
    public aitx b;
    private final Context c;
    private aivh d;
    private final byb e = new ParcelableSnapshotMutableFloatState(1.0f);

    public dbt(Context context) {
        this.c = context;
    }

    @Override // defpackage.cga
    public final float a() {
        aizz aizzVar;
        if (this.d == null) {
            Context context = this.c;
            aan aanVar = dco.a;
            synchronized (aanVar) {
                Object objA = aanVar.a(context);
                if (objA == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    aixl aixlVarR = afpt.r(-1, 0, 6);
                    objA = afrg.w(new aiyb(new dcm(contentResolver, uriFor, new dcn(aixlVarR, Handler.createAsync(Looper.getMainLooper())), aixlVarR, context, null)), ahni.c(), new aizy(0L), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    aanVar.m(context, objA);
                }
                aizzVar = (aizz) objA;
            }
            b(((Number) aizzVar.b()).floatValue());
            aitx aitxVar = this.b;
            if (aitxVar == null) {
                throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.d = ahnc.d(aitxVar, null, 0, new bns(aizzVar, this, (afck) null, 15), 3);
        }
        return this.e.e();
    }

    public final void b(float f) {
        this.e.h(f);
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final /* synthetic */ afcn getKey() {
        return cga.a;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
