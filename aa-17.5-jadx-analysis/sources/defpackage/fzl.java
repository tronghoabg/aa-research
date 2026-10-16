package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class fzl implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fzl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v35, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, ta] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r7v59, types: [java.lang.Object, sr] */
    /* JADX WARN: Type inference failed for: r7v6, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        Boolean boolValueOf = null;
        switch (this.b) {
            case 0:
                hsq hsqVar = (hsq) obj;
                hsqVar.getClass();
                hsq hsqVarA = hsqVar.a(new fzn(this.a));
                hsqVarA.getClass();
                return hsqVarA;
            case 1:
                cun cunVar = (cun) obj;
                cunVar.getClass();
                cunVar.x((cuo) this.a, 0, 0);
                return afak.a;
            case 2:
                fpy fpyVar = (fpy) obj;
                fpyVar.getClass();
                this.a.b(fpyVar.a);
                return afak.a;
            case 3:
                Drawable drawable = (Drawable) obj;
                drawable.getClass();
                if (drawable instanceof BitmapDrawable) {
                    this.a.b(null);
                }
                return afak.a;
            case 4:
                Object obj2 = this.a;
                int i = gao.a;
                return roc.aJ((cuo) obj2, (cun) obj);
            case 5:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                gvl gvlVar = gvl.a;
                int iOrdinal = gizVar.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 0) {
                    boolValueOf = Boolean.valueOf(((cil) obj3).a(5));
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        boolValueOf = Boolean.valueOf(((cil) obj3).a(3));
                    } else if (iOrdinal != 3) {
                        throw new aezs();
                    }
                }
                return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
            case 6:
                giz gizVar2 = (giz) obj;
                gizVar2.getClass();
                gvl gvlVar2 = gvl.a;
                int iOrdinal2 = gizVar2.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        boolValueOf = Boolean.valueOf(((cil) this.a).a(3));
                    } else if (iOrdinal2 != 3) {
                        throw new aezs();
                    }
                }
                return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : false);
            case 7:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                this.a.b(Boolean.valueOf(cisVar.b()));
                return afak.a;
            case 8:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cil cilVar = (cil) this.a;
                cieVar.e(cilVar);
                cieVar.h(cilVar);
                return afak.a;
            case 9:
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                this.a.invoke(new gik(motionEvent, SystemClock.elapsedRealtime()));
                return false;
            case 10:
                KeyEvent keyEvent = (KeyEvent) obj;
                keyEvent.getClass();
                if (keyEvent.getAction() == 1) {
                    this.a.invoke(new gil(keyEvent, SystemClock.elapsedRealtime()));
                }
                return false;
            case 11:
                cis cisVar2 = (cis) obj;
                cisVar2.getClass();
                if (!cisVar2.b()) {
                    return afak.a;
                }
                fxa.j(new gbz(this.a, 4));
                return afak.a;
            case 12:
                crs crsVar = (crs) obj;
                crsVar.getClass();
                this.a.invoke(new gii(crsVar, SystemClock.elapsedRealtime()));
                return false;
            case 13:
                ((cst) obj).getClass();
                this.a.b(true);
                return afak.a;
            case 14:
                this.a.invoke();
                return afak.a;
            case 15:
                KeyEvent keyEvent2 = (KeyEvent) obj;
                keyEvent2.getClass();
                Boolean bool = (Boolean) ((gjh) this.a).a.invoke(keyEvent2);
                bool.booleanValue();
                return bool;
            case 16:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                motionEvent2.getClass();
                int actionMasked = motionEvent2.getActionMasked();
                Object obj4 = this.a;
                if (actionMasked == 0) {
                    ((gjj) obj4).c = motionEvent2.getDownTime();
                } else if (actionMasked == 1 || actionMasked == 3) {
                    ((gjj) obj4).c = -1L;
                }
                gjj gjjVar = (gjj) obj4;
                return Boolean.valueOf(gjjVar.b ? ((Boolean) gjjVar.a.invoke(motionEvent2)).booleanValue() : false);
            case 17:
                ((Integer) obj).getClass();
                ((ynz) gjn.a.e().o(ypi.a, "CarApp.H").ai(57)).u("Cache miss, computing most common color for the given bitmap");
                return Integer.valueOf(gjn.c((Bitmap) this.a));
            case 18:
                gej gejVar = (gej) obj;
                gejVar.getClass();
                this.a.sendDismiss(gejVar);
                return afak.a;
            case 19:
                gej gejVar2 = (gej) obj;
                gejVar2.getClass();
                this.a.sendClick(gejVar2);
                return afak.a;
            default:
                gej gejVar3 = (gej) obj;
                gejVar3.getClass();
                this.a.sendMarkAsRead(gejVar3);
                return afak.a;
        }
    }
}
