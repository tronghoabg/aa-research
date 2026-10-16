package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public final class obs implements obu {
    public static final /* synthetic */ int b = 0;
    private static final yph c = yph.c("GH.ToastController");
    private Runnable e;
    private noh d = null;
    private final Handler f = new Handler(Looper.getMainLooper());
    public final Map a = new LinkedHashMap();
    private final Runnable g = new nwg(this, 2);

    public obs() {
        ((lhm) mki.a.i(lhm.class)).gK(new obr(this));
    }

    public static obs a() {
        return (obs) mki.a.b(obs.class, new lfu(13));
    }

    public final void b() {
        noh nohVar = this.d;
        if (nohVar == null) {
            tss.q("GH.ToastController", "Finishing toast fragment that is already destroyed.", new Object[0]);
        } else {
            nohVar.d();
            this.d = null;
        }
    }

    public final void c(Context context, ComponentName componentName, int i, int i2) {
        e(context, componentName, context.getText(i), i2, null);
    }

    @Override // defpackage.obu
    public final void d() {
        if (this.d != null) {
            Handler handler = this.f;
            handler.removeCallbacks(this.g);
            Runnable runnable = this.e;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            b();
        }
    }

    public final void e(Context context, ComponentName componentName, CharSequence charSequence, int i, nsn nsnVar) {
        int i2;
        int dimension;
        if (!jri.a()) {
            Toast.makeText(context, charSequence, i).show();
            return;
        }
        if (!lbh.d().gN()) {
            ((ype) ((ype) c.h()).ai((char) 5550)).u("Can't show the toast as lifetime not yet started.");
            return;
        }
        if (kmo.b(acsx.n(), componentName)) {
            if (!componentName.getPackageName().equals("com.google.android.projection.gearhead")) {
                Map map = this.a;
                if (!map.containsKey(componentName)) {
                    map.put(componentName, new ArrayDeque());
                }
                oit.a();
                Instant instantNow = Instant.now();
                if (((Queue) map.get(componentName)).size() < ((int) acsx.g())) {
                    ((Queue) map.get(componentName)).add(instantNow);
                } else {
                    Instant instant = (Instant) ((Queue) map.get(componentName)).peek();
                    instant.getClass();
                    if (Duration.between(instant, instantNow).toMillis() > acsx.h()) {
                        ((Queue) map.get(componentName)).remove();
                        ((Queue) map.get(componentName)).add(instantNow);
                    }
                }
            }
            try {
                obv obvVarA = obv.a(charSequence);
                try {
                    ohs ohsVarJ = ebf.j();
                    yxy yxyVar = yxy.GEARHEAD;
                    yzz yzzVar = yzz.TOAST_CONTEXT;
                    rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.nQ);
                    rrbVarH.p(componentName);
                    ohsVarJ.F(rrbVarH.l());
                    if (this.d != null) {
                        ohs ohsVarJ2 = ebf.j();
                        rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.nR);
                        rrbVarH2.p(componentName);
                        ohsVarJ2.F(rrbVarH2.l());
                    }
                    d();
                    qrn qrnVarE = kio.b().e();
                    Context context2 = mki.a.c;
                    Configuration configuration = new Configuration(context2.getResources().getConfiguration());
                    configuration.densityDpi = ((Integer) kgq.c(new kiz(qrnVarE, 7), "GH.ToastFragment", yzzVar, yzy.nV, true, "Car no longer connected.", new Object[0])).intValue();
                    pi piVarJ = kfl.j(context2.createConfigurationContext(configuration));
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(piVarJ);
                    leh.a();
                    TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.toast_fragment, (ViewGroup) null).findViewById(R.id.toast);
                    textView.setText(obvVarA.requireArguments().getCharSequence("toast_text_key"));
                    mki.a.g();
                    sab sabVarV = ols.v(qrnVarE, CarDisplayId.a);
                    sabVarV.getClass();
                    CarDisplay carDisplay = (CarDisplay) kgq.c(new kiz(sabVarV, 6), "GH.ToastFragment", yzzVar, yzy.nU, true, "Car no longer connected.", new Object[0]);
                    Point point = carDisplay.d;
                    point.getClass();
                    Size size = new Size(point.x, point.y);
                    Rect rectA = carDisplay.a();
                    List listB = carDisplay.b();
                    if (listB != null && !listB.isEmpty()) {
                        Rect rect = (Rect) listB.get(0);
                        rectA = rect.left == 0 ? new Rect(rect.right, rectA.top, rectA.right, rectA.bottom) : new Rect(rectA.left, rectA.top, rect.right - rect.left, rectA.bottom);
                    }
                    Rect rectH = nsnVar == null ? null : nsr.c().b().h(nsnVar);
                    int width = rectH == null ? (size.getWidth() - rectA.left) - rectA.right : rectH.width();
                    int dimension2 = (int) piVarJ.a().getDimension(R.dimen.gearhead_toast_side_margin);
                    int i3 = width - (dimension2 + dimension2);
                    int dimension3 = (int) piVarJ.a().getDimension(R.dimen.gearhead_toast_width);
                    if (i3 > dimension3) {
                        i3 = dimension3;
                    }
                    textView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int) piVarJ.a().getDimension(R.dimen.gearhead_toast_height), Integer.MIN_VALUE));
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.getClass();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int measuredWidth = textView.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    int measuredHeight = textView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    if (rectH == null) {
                        i2 = ((width - measuredWidth) / 2) + rectA.left;
                        dimension = rectA.bottom + ((int) piVarJ.a().getDimension(R.dimen.gearhead_toast_bottom_margin));
                    } else {
                        i2 = ((rectH.left + rectH.right) - measuredWidth) / 2;
                        dimension = ((int) piVarJ.a().getDimension(R.dimen.gearhead_toast_min_bottom_margin)) + (size.getHeight() - rectH.bottom);
                    }
                    int width2 = (size.getWidth() - measuredWidth) - i2;
                    int height = (size.getHeight() - measuredHeight) - dimension;
                    qsw qswVar = new qsw(measuredWidth, measuredHeight, nsr.c().a(sabVarV.c).v());
                    qswVar.a = i2;
                    qswVar.c = width2;
                    qswVar.d = dimension;
                    qswVar.b = height;
                    qswVar.g = 491;
                    qswVar.l = true;
                    qswVar.b(android.R.anim.fade_in);
                    qswVar.c(android.R.anim.fade_out);
                    qswVar.m = 64;
                    nog nogVarB = nsh.b(qswVar.a(), "com.google.android.projection.gearhead/GhToast", obvVarA, lbh.d());
                    nogVarB.e = this;
                    this.d = nogVarB.a();
                    this.f.postDelayed(this.g, i == 0 ? 2000 : 3500);
                    return;
                } catch (qrz | qsa e) {
                    ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 5551)).u("Unable to show toast.");
                    return;
                }
            } catch (IllegalStateException e2) {
                ((ype) ((ype) ((ype) c.h()).p(e2)).ai((char) 5548)).u("Unable to show toast.");
                return;
            }
        }
        ((ype) ((ype) c.f()).ai((char) 5552)).y("App blocked from posting toast: %s", componentName);
        ((ype) c.l().ai((char) 5549)).u("Toast suppressed because it exceeds rate of limit posting.");
        ohs ohsVarJ3 = ebf.j();
        rrb rrbVarH3 = rrc.h(yxy.GEARHEAD, yzz.TOAST_CONTEXT, yzy.nT);
        rrbVarH3.p(componentName);
        ohsVarJ3.F(rrbVarH3.l());
    }

    public final void f(Context context, ComponentName componentName, int i, int i2) {
        g(context, componentName, context.getResources().getText(i), i2);
    }

    public final void g(Context context, ComponentName componentName, CharSequence charSequence, int i) {
        e(context, componentName, charSequence, i, nsn.a);
    }

    public final void h(Context context, ComponentName componentName, int i) {
        isp ispVar = new isp(this, context, componentName, i, 6);
        this.e = ispVar;
        this.f.postDelayed(ispVar, 1000L);
    }
}
