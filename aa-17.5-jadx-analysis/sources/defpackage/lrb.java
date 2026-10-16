package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.CancellationSignal;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.MaterialActionButtonView;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.ui.actionpanel.MaterialInCallViewExpandingActionPanel;
import com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView;

/* loaded from: classes2.dex */
public final /* synthetic */ class lrb implements eqn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lrb(Object obj, ComponentName componentName, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.b = componentName;
        this.c = obj2;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) throws Resources.NotFoundException {
        int i = this.d;
        if (i == 0) {
            dzi dziVar = (dzi) obj;
            ((eqj) this.a).m(new lre((ComponentName) this.b, ((lod) this.c).b, (AaPlaybackState) dziVar.a, ((Boolean) dziVar.b).booleanValue()));
            return;
        }
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                lod lodVar = (lod) obj;
                yph yphVar = lsc.a;
                if (((CancellationSignal) this.a).isCanceled()) {
                    ((ype) ((ype) lsc.a.h()).ai(4255)).y("pause on %s cancelled due to newer search", this.b);
                    return;
                }
                if (lodVar != null) {
                    lodVar.i.d(yzz.MEDIA_ASSISTANT_SEARCH).b();
                }
                ((eqj) this.c).m(true);
                return;
            }
            lol lolVar = (lol) obj;
            lrc lrcVar = (lrc) this.c;
            eqj eqjVar = lrcVar.a;
            Object obj2 = this.a;
            if (eqjVar != null) {
                ((eql) obj2).s(eqjVar);
                lrcVar.a = null;
            }
            Object obj3 = this.b;
            if (!(lolVar instanceof lod)) {
                ((eqj) obj2).m(new lre((ComponentName) obj3, lolVar.e(), null, false));
                return;
            } else {
                lod lodVar2 = (lod) lolVar;
                lrcVar.a = tby.z(lodVar2.e, lodVar2.h);
                ((eql) obj2).r(lrcVar.a, new lrb(obj2, (ComponentName) obj3, lodVar2, i2));
                return;
            }
        }
        Object obj4 = this.b;
        krz krzVar = (krz) obj;
        krr krrVar = krr.w;
        Context context = (Context) obj4;
        int iB = krrVar.b(context, krzVar);
        int iB2 = krr.D.b(context, krzVar);
        Object obj5 = this.c;
        MaterialUnCallView materialUnCallView = (MaterialUnCallView) obj5;
        materialUnCallView.c.f(iB, iB2);
        krr krrVar2 = krr.q;
        materialUnCallView.setBackgroundColor(krrVar2.b(context, krzVar));
        ((juf) this.a).i.setBackgroundColor(krrVar2.b(context, krzVar));
        int iB3 = krrVar2.b(context, krzVar);
        int iB4 = krr.v.b(context, krzVar);
        int iB5 = krrVar.b(context, krzVar);
        materialUnCallView.e = iB5;
        materialUnCallView.f = iB4;
        materialUnCallView.e();
        materialUnCallView.b(materialUnCallView.a);
        MaterialInCallViewExpandingActionPanel materialInCallViewExpandingActionPanel = materialUnCallView.b;
        materialInCallViewExpandingActionPanel.l.setImageTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[0]}, new int[]{iB4, iB5}));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setColors(new int[]{dvd.e(iB3, 77), dvd.e(iB3, 217), iB3});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientCenter(0.5f, 0.35f);
        materialInCallViewExpandingActionPanel.j.setBackground(gradientDrawable);
        int iB6 = krr.E.b(context, krzVar);
        int iB7 = krr.F.b(context, krzVar);
        int iB8 = krr.s.b(context, krzVar);
        MaterialInCallViewExpandingActionPanel materialInCallViewExpandingActionPanel2 = materialUnCallView.b;
        mel melVar = new mel(obj5, 16);
        MaterialActionButtonView materialActionButtonView = materialInCallViewExpandingActionPanel2.f;
        geu geuVar = materialInCallViewExpandingActionPanel2.k;
        sw swVar = new sw();
        swVar.c(new CarIcon(new tj(IconCompat.m(materialInCallViewExpandingActionPanel2.c, com.google.android.projection.gearhead.R.drawable.gs_call_end_vd_theme_24))));
        swVar.d(melVar);
        Action actionA = swVar.a();
        fxm fxmVar = fwh.d;
        fwf fwfVar = fwf.d;
        hls hlsVar = new hls(false, false, false);
        Integer numValueOf = Integer.valueOf(iB6);
        Integer numValueOf2 = Integer.valueOf(iB7);
        materialActionButtonView.o(geuVar, actionA, fxmVar, fwfVar, hlsVar, fwe.a(numValueOf, numValueOf2, numValueOf2, numValueOf, numValueOf2, numValueOf2, Integer.valueOf(dvd.e(iB8, 31)), Integer.valueOf(dvd.e(iB8, 97))), true);
    }

    public /* synthetic */ lrb(juf jufVar, MaterialUnCallView materialUnCallView, Context context, int i) {
        this.d = i;
        this.a = jufVar;
        this.c = materialUnCallView;
        this.b = context;
    }

    public /* synthetic */ lrb(lrc lrcVar, eql eqlVar, ComponentName componentName, int i) {
        this.d = i;
        this.c = lrcVar;
        this.a = eqlVar;
        this.b = componentName;
    }
}
