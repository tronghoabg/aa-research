package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.search.SearchView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class wil implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wil(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        wue wueVarA;
        Context context;
        Rect rect;
        int iU = 0;
        switch (this.b) {
            case 0:
                EditText editText = (EditText) this.a;
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                return;
            case 1:
                wic wicVar = new wic();
                Object obj = this.a;
                AtomicBoolean atomicBoolean = whl.b;
                whk whkVar = (whk) obj;
                Object obj2 = whkVar.b;
                Object obj3 = whkVar.a;
                Object obj4 = whkVar.c;
                synchronized (atomicBoolean) {
                    ?? r13 = ((whg) obj3).c;
                    if (TextUtils.isEmpty(r13)) {
                        Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                        ((ldk) ((whg) obj3).e).a((String) r13, whf.d);
                        return;
                    }
                    ((whl) obj4).g = Instant.now().toEpochMilli();
                    ((whl) obj4).c.c.put(r13, Long.valueOf(Instant.now().toEpochMilli()));
                    abnp abnpVarN = abzg.a.n();
                    abnpVarN.t();
                    ((abzg) abnpVarN.b).b = (String) r13;
                    wox woxVar = wia.c;
                    wia.c(adii.a.gu().c(wia.b));
                    String language = Locale.getDefault().getLanguage();
                    wox woxVar2 = wia.c;
                    if (wia.b(adhz.c(wia.b))) {
                        language = Locale.getDefault().toLanguageTag();
                    }
                    yfq yfqVarQ = yfq.q(language);
                    abnpVarN.t();
                    abzg abzgVar = (abzg) abnpVarN.b;
                    aboh abohVar = abzgVar.c;
                    if (!abohVar.c()) {
                        abzgVar.c = abnv.I(abohVar);
                    }
                    abmc.i(yfqVarQ, abzgVar.c);
                    boolean z = ((whg) obj3).a;
                    abnpVarN.t();
                    ((abzg) abnpVarN.b).d = z;
                    abzg abzgVar2 = (abzg) abnpVarN.q();
                    Object obj5 = ((whg) obj3).b;
                    abxs abxsVarD = wid.d((Context) obj5);
                    abnp abnpVarN2 = abxj.a.n();
                    abnpVarN2.t();
                    abxj abxjVar = (abxj) abnpVarN2.b;
                    abzgVar2.getClass();
                    abxjVar.c = abzgVar2;
                    abxjVar.b |= 1;
                    abnpVarN2.t();
                    abxj abxjVar2 = (abxj) abnpVarN2.b;
                    abxsVarD.getClass();
                    abxjVar2.d = abxsVarD;
                    abxjVar2.b = 2 | abxjVar2.b;
                    abxj abxjVar3 = (abxj) abnpVarN2.q();
                    wic wicVar2 = new wic();
                    if (abxjVar3 == null) {
                        Log.e("NetworkCallerGrpc", "Survey trigger request was null");
                    } else {
                        whq.a().execute(new uze(obj2, (Object) abxjVar3, (Object) wicVar2, 4, (byte[]) null));
                    }
                    abnp abnpVarN3 = abvm.a.n();
                    abnpVarN3.t();
                    ((abvm) abnpVarN3.b).b = (String) r13;
                    abnpVarN3.t();
                    ((abvm) abnpVarN3.b).c = z;
                    abnpVarN3.t();
                    ((abvm) abnpVarN3.b).d = false;
                    abvm abvmVar = (abvm) abnpVarN3.q();
                    wox woxVar3 = wia.c;
                    if (wia.c(adgs.c(wia.b))) {
                        wib wibVarA = wib.a();
                        abnp abnpVarN4 = abvn.a.n();
                        abnpVarN4.t();
                        abvn abvnVar = (abvn) abnpVarN4.b;
                        abvmVar.getClass();
                        abvnVar.c = abvmVar;
                        abvnVar.b = 3;
                        wibVarA.c((abvn) abnpVarN4.q(), wicVar.b(), wicVar.a(), (Context) obj5, null);
                    }
                    return;
                }
            case 2:
                wjk wjkVar = (wjk) this.a;
                wjj wjjVar = wjkVar.a;
                if (wjjVar != null) {
                    wjjVar.a(1);
                    wjkVar.a = null;
                    return;
                }
                return;
            case 3:
                wjk wjkVar2 = (wjk) this.a;
                wjj wjjVar2 = wjkVar2.a;
                if (wjjVar2 != null) {
                    wjjVar2.a(2);
                    wjkVar2.a = null;
                    return;
                }
                return;
            case 4:
                wjx wjxVar = (wjx) this.a;
                wjxVar.j = true;
                wjxVar.u.finish();
                return;
            case 5:
                MaterialButton materialButton = (MaterialButton) this.a;
                if (materialButton.j && materialButton.l && (wueVarA = materialButton.e.a(false)) != null) {
                    iU = (int) (wueVarA.u() * 0.11f);
                }
                materialButton.k = iU;
                materialButton.o();
                materialButton.invalidate();
                return;
            case 6:
                ((wro) this.a).e();
                return;
            case 7:
                wro wroVar = (wro) this.a;
                ((wsh) wroVar.getCurrentDrawable()).l(false, false, true);
                if (wroVar.getProgressDrawable() == null || !wroVar.getProgressDrawable().isVisible()) {
                    if (wroVar.getIndeterminateDrawable() == null || !wroVar.getIndeterminateDrawable().isVisible()) {
                        wroVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((wtu) this.a).h();
                return;
            case 9:
                EditText editText2 = ((SearchView) this.a).k;
                if (editText2.requestFocus()) {
                    editText2.sendAccessibilityEvent(8);
                }
                woy.G(editText2).showSoftInput(editText2, 1);
                return;
            case 10:
                ((SearchView) this.a).i();
                return;
            case 11:
                EditText editText3 = ((SearchView) this.a).k;
                if (editText3.requestFocus()) {
                    editText3.sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 12:
                ((View) this.a).requestFocus();
                return;
            case 13:
                wkm wkmVar = new wkm();
                wtu wtuVar = (wtu) this.a;
                wkmVar.a(wtuVar.f(true));
                Iterator it = wtuVar.i(true).iterator();
                while (it.hasNext()) {
                    wkmVar.b((emp) it.next());
                }
                wkmVar.c(new wtl(wtuVar, wkmVar, 1));
                wkmVar.e();
                wtuVar.m = wkmVar;
                return;
            case 14:
                ((SearchView) this.a).d();
                return;
            case 15:
                wtu wtuVar2 = (wtu) this.a;
                wtuVar2.c.setTranslationY(r0.getHeight());
                AnimatorSet animatorSetG = wtuVar2.g(true);
                animatorSetG.addListener(new wtm(wtuVar2, animatorSetG));
                animatorSetG.start();
                wtuVar2.n = animatorSetG;
                return;
            case 16:
                wvh wvhVar = (wvh) this.a;
                wvhVar.b = false;
                SideSheetBehavior sideSheetBehavior = wvhVar.c;
                een eenVar = sideSheetBehavior.d;
                if (eenVar != null && eenVar.l()) {
                    wvhVar.a(wvhVar.a);
                    return;
                } else {
                    if (sideSheetBehavior.c == 2) {
                        sideSheetBehavior.M(wvhVar.a);
                        return;
                    }
                    return;
                }
            case 17:
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.a;
                wvs wvsVar = baseTransientBottomBar.j;
                if (wvsVar == null || (context = baseTransientBottomBar.i) == null) {
                    return;
                }
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                wvsVar.getLocationInWindow(iArr);
                int height = iHeight - (iArr[1] + wvsVar.getHeight());
                int translationY = (int) wvsVar.getTranslationY();
                int i = baseTransientBottomBar.o;
                int i2 = height + translationY;
                if (i2 >= i) {
                    baseTransientBottomBar.p = i;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = wvsVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                baseTransientBottomBar.p = baseTransientBottomBar.o;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += baseTransientBottomBar.o - i2;
                wvsVar.requestLayout();
                return;
            case 18:
                ((BaseTransientBottomBar) this.a).j();
                return;
            case 19:
                Object obj6 = this.a;
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) obj6;
                wvs wvsVar2 = baseTransientBottomBar2.j;
                if (wvsVar2 == null) {
                    return;
                }
                if (wvsVar2.getParent() != null) {
                    wvsVar2.setVisibility(0);
                }
                if (wvsVar2.c == 1) {
                    ValueAnimator valueAnimatorC = baseTransientBottomBar2.c(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                    valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.g);
                    valueAnimatorOfFloat.addUpdateListener(new wvk(obj6, 2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(valueAnimatorC, valueAnimatorOfFloat);
                    animatorSet.setDuration(baseTransientBottomBar2.c);
                    animatorSet.addListener(new wvq(baseTransientBottomBar2));
                    animatorSet.start();
                    return;
                }
                int iB = baseTransientBottomBar2.b();
                wvsVar2.setTranslationY(iB);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(iB, 0);
                valueAnimator.setInterpolator(baseTransientBottomBar2.f);
                valueAnimator.setDuration(baseTransientBottomBar2.e);
                valueAnimator.addListener(new wvl(baseTransientBottomBar2));
                valueAnimator.addUpdateListener(new wvk(obj6, 3));
                valueAnimator.start();
                return;
            default:
                ((wwn) this.a).f(true);
                return;
        }
    }

    public wil(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
