package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmr extends View {
    public static final /* synthetic */ int j = 0;
    private static final ViewOutlineProvider k = new cmq();
    public boolean a;
    public Outline b;
    public boolean c;
    public dlg d;
    public dlr e;
    public afec f;
    public cmi g;
    public float h;
    public float i;
    private final cmb l;
    private final kgx m;

    public cmr(View view, kgx kgxVar, cmb cmbVar) {
        super(view.getContext());
        this.m = kgxVar;
        this.l = cmbVar;
        setOutlineProvider(k);
        this.c = true;
        this.d = cmc.a;
        this.e = dlr.a;
        this.f = cmk.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [cju, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cju, java.lang.Object] */
    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        ?? r7;
        cmb cmbVar;
        dlg dlgVarC;
        dlr dlrVarD;
        cju cjuVarB;
        long jA;
        cmi cmiVar;
        if (this.h > BitmapDescriptorFactory.HUE_RED || this.i > BitmapDescriptorFactory.HUE_RED) {
            int iSave = canvas.save();
            canvas.translate(this.h, this.i);
            kgx kgxVar = this.m;
            r7 = kgxVar.a;
            cje cjeVar = (cje) r7;
            Canvas canvas2 = cjeVar.a;
            cjeVar.a = canvas;
            cmbVar = this.l;
            dlg dlgVar = this.d;
            dlr dlrVar = this.e;
            float width = getWidth();
            float height = getHeight();
            long jFloatToRawIntBits = Float.floatToRawIntBits(width) << 32;
            long jFloatToRawIntBits2 = 4294967295L & Float.floatToRawIntBits(height);
            cmi cmiVar2 = this.g;
            afec afecVar = this.f;
            cma cmaVar = cmbVar.b;
            dlgVarC = cmaVar.c();
            dlrVarD = cmaVar.d();
            cjuVarB = cmaVar.b();
            jA = cmaVar.a();
            cmiVar = cmaVar.a;
            cmaVar.f(dlgVar);
            cmaVar.g(dlrVar);
            cmaVar.e(r7);
            cmaVar.h(jFloatToRawIntBits | jFloatToRawIntBits2);
            cmaVar.a = cmiVar2;
            r7.g();
            try {
                afecVar.invoke(cmbVar);
                r7.e();
                cma cmaVar2 = cmbVar.b;
                cmaVar2.f(dlgVarC);
                cmaVar2.g(dlrVarD);
                cmaVar2.e(cjuVarB);
                cmaVar2.h(jA);
                cmaVar2.a = cmiVar;
                ((cje) kgxVar.a).a = canvas2;
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            kgx kgxVar2 = this.m;
            r7 = kgxVar2.a;
            cje cjeVar2 = (cje) r7;
            Canvas canvas3 = cjeVar2.a;
            cjeVar2.a = canvas;
            cmbVar = this.l;
            dlg dlgVar2 = this.d;
            dlr dlrVar2 = this.e;
            float width2 = getWidth();
            float height2 = getHeight();
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(width2) << 32;
            long jFloatToRawIntBits4 = 4294967295L & Float.floatToRawIntBits(height2);
            cmi cmiVar3 = this.g;
            afec afecVar2 = this.f;
            cma cmaVar3 = cmbVar.b;
            dlgVarC = cmaVar3.c();
            dlrVarD = cmaVar3.d();
            cjuVarB = cmaVar3.b();
            jA = cmaVar3.a();
            cmiVar = cmaVar3.a;
            cmaVar3.f(dlgVar2);
            cmaVar3.g(dlrVar2);
            cmaVar3.e(r7);
            cmaVar3.h(jFloatToRawIntBits3 | jFloatToRawIntBits4);
            cmaVar3.a = cmiVar3;
            r7.g();
            try {
                afecVar2.invoke(cmbVar);
                r7.e();
                cma cmaVar4 = cmbVar.b;
                cmaVar4.f(dlgVarC);
                cmaVar4.g(dlrVarD);
                cmaVar4.e(cjuVarB);
                cmaVar4.h(jA);
                cmaVar4.a = cmiVar;
                ((cje) kgxVar2.a).a = canvas3;
            } finally {
            }
        }
        this.a = false;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.a) {
            return;
        }
        this.a = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
