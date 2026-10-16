package defpackage;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class jlj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jlj(Object obj, int i, int i2, Object obj2, int i3) {
        this.e = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jkk] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, jhf] */
    @Override // java.lang.Runnable
    public final void run() throws Surface.OutOfResourcesException, IllegalArgumentException {
        int i = this.e;
        if (i == 0) {
            jln jlnVar = ((jll) this.c).a;
            Object obj = this.d;
            int i2 = this.b;
            jle jleVar = jlnVar.h;
            ((pbu) jleVar).g.post(new jlj(jleVar, this.a, i2, obj, 2));
            return;
        }
        int i3 = 0;
        if (i == 1) {
            ?? r0 = this.d;
            jhc jhcVar = ((ina) r0).w;
            ?? r6 = this.c;
            if (jhcVar == null) {
                ((ype) ((ype) jke.a.h()).ai((char) 2246)).u("Unable to renderDisplayInfo due to null layout params");
            } else {
                ((ype) jke.a.l().ai((char) 2245)).y("renderDisplayInfo to window %s", r6);
                Surface surfaceAJ = r6.aJ();
                if (surfaceAJ != null) {
                    int i4 = this.b;
                    int i5 = this.a;
                    Paint paint = new Paint();
                    paint.setTextSize(36.0f);
                    paint.setColor(-65536);
                    paint.setTextAlign(Paint.Align.CENTER);
                    paint.setAntiAlias(true);
                    Canvas canvasLockCanvas = surfaceAJ.lockCanvas(null);
                    canvasLockCanvas.drawColor(Color.argb(0, 0, 0, 0), PorterDuff.Mode.SRC);
                    float fDescent = paint.descent() - paint.ascent();
                    iuw iuwVar = jhcVar.a;
                    int i6 = jhcVar.f;
                    Rect rect = iuwVar.n;
                    int i7 = (i6 - rect.left) - rect.right;
                    int i8 = (jhcVar.g - rect.top) - rect.bottom;
                    float f = i5 / 2;
                    float f2 = i4 / 2;
                    float f3 = fDescent + fDescent;
                    canvasLockCanvas.drawText("Scaled size (px): ".concat(iuwVar.m.toString()), f, f2 - f3, paint);
                    canvasLockCanvas.drawText("Margins (px): Left= " + iuwVar.g + " Top= " + iuwVar.h, f, f2 - fDescent, paint);
                    int i9 = iuwVar.i;
                    canvasLockCanvas.drawText("Stable Content Area (dp): " + jke.a((float) i7, i9) + "x" + jke.a((float) i8, i9), f, f2, paint);
                    canvasLockCanvas.drawText("Stable Insets (px): ".concat(rect.toString()), f, fDescent + f2, paint);
                    canvasLockCanvas.drawText("DPI: " + i9 + " FPS: " + iuwVar.d, f, f2 + f3, paint);
                    surfaceAJ.unlockCanvasAndPost(canvasLockCanvas);
                }
            }
            r0.q(r6);
            return;
        }
        if (i == 2) {
            int i10 = this.a;
            int i11 = this.b;
            yze yzeVarB = yze.b(i10);
            yzf yzfVarB = yzf.b(i11);
            yph yphVar = pbx.a;
            ype ypeVar = (ype) ((ype) yphVar.h()).ai(6284);
            Integer numValueOf = Integer.valueOf(yzeVarB == null ? 0 : yzeVarB.D);
            int i12 = yzfVarB == null ? 0 : yzfVarB.az;
            Object obj2 = this.d;
            Object obj3 = this.c;
            ypeVar.R("ProjectionErrorCode = %d, ProjectionErrorDetail = %d, %s", numValueOf, Integer.valueOf(i12), obj2);
            pbu pbuVar = (pbu) obj3;
            boolean z = pbuVar.q;
            if (z) {
                ((ype) ((ype) yphVar.h()).ai((char) 6280)).u("Critical error encountered, attempting to handle result.");
            }
            ozx ozwVar = !pbu.a.contains(yzeVarB) ? ozv.a : new ozw(yzeVarB);
            if (z && pbuVar.e.a(ozwVar)) {
                i3 = 1;
            }
            if ((ozwVar instanceof ozw) || i3 == 0) {
                int i13 = true != pbuVar.b ? 1 : 2;
                yzeVarB.getClass();
                if (yzeVarB != yze.PROTOCOL_IO_ERROR && yzeVarB != yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER && yzeVarB != yze.PROTOCOL_BYEBYE_REQUESTED_BY_CAR && yzeVarB != yze.PREFLIGHT_FAILED && yzeVarB != yze.SESSION_OBSOLETE_DUE_TO_NEW_CONNECTION && yzfVarB != yzf.BYEBYE_TIMEOUT) {
                    Intent intent = new Intent();
                    intent.setComponent(itx.e);
                    intent.addFlags(268435456);
                    intent.putExtra("connection_type", i13);
                    intent.putExtra("error_code", yzeVarB.D);
                    if (!TextUtils.isEmpty(null)) {
                        intent.putExtra("error_details", (String) null);
                    }
                    pbuVar.c.startActivity(intent);
                }
            }
            if (!pbuVar.l) {
                pbuVar.i.e();
            }
            pbuVar.g.removeCallbacksAndMessages(null);
            return;
        }
        if (i == 3) {
            xob xobVar = (xob) this.d;
            aboh<xnz> abohVar = xobVar.c;
            ruv[] ruvVarArr = new ruv[abohVar.size()];
            rta rtaVar = (rta) this.c;
            ruw ruwVar = (ruw) rtaVar.y.a;
            ruwVar.g = ruvVarArr;
            for (xnz xnzVar : abohVar) {
                ruv[] ruvVarArr2 = ruwVar.g;
                ruv ruvVar = new ruv();
                ruvVarArr2[i3] = ruvVar;
                ruvVar.b = xnzVar;
                ruvVar.a = xnzVar.c;
                i3++;
            }
            rtaVar.r.b(this.a, this.b, xobVar);
            return;
        }
        if (i == 4) {
            int i14 = this.a;
            int i15 = this.b;
            Object obj4 = this.c;
            yze yzeVarB2 = yze.b(i14);
            yzf yzfVarB2 = yzf.b(i15);
            CarSetupServiceImpl carSetupServiceImpl = ((sat) obj4).d;
            carSetupServiceImpl.e(yzeVarB2, yzfVarB2, (String) this.d);
            carSetupServiceImpl.k();
            return;
        }
        if (i == 5) {
            shi shiVar = ((shg) this.c).a;
            Object obj5 = this.d;
            int i16 = this.b;
            sat satVar = shiVar.j;
            satVar.c.post(new jlj(satVar, this.a, i16, obj5, 4));
            return;
        }
        int i17 = whu.a;
        Rect rect2 = new Rect();
        View view = (View) this.c;
        view.getHitRect(rect2);
        rect2.top -= 2131168405;
        rect2.left = rect2.left;
        rect2.right += this.a;
        rect2.bottom += this.b;
        ((View) this.d).setTouchDelegate(new TouchDelegate(rect2, view));
    }

    public /* synthetic */ jlj(jkk jkkVar, jhf jhfVar, int i, int i2, int i3) {
        this.e = i3;
        this.d = jkkVar;
        this.c = jhfVar;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ jlj(rta rtaVar, xob xobVar, int i, int i2, int i3) {
        this.e = i3;
        this.c = rtaVar;
        this.d = xobVar;
        this.a = i;
        this.b = i2;
    }
}
