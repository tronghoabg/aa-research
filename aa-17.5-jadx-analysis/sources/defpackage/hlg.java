package defpackage;

import android.animation.TimeAnimator;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.TextView;
import com.android.car.libraries.apphost.view.MicrophoneRecordingView;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import com.google.android.apps.auto.components.carhome.ProjectedHomeActivity;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class hlg implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hlg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) throws Resources.NotFoundException {
        int i = 6;
        switch (this.b) {
            case 0:
                MicrophoneRecordingView microphoneRecordingViewJ = ((hli) this.a).j();
                int iOrdinal = ((gdt) obj).ordinal();
                if (iOrdinal == 0) {
                    final MicrophoneRecordingView.RecordingBarContainer recordingBarContainer = microphoneRecordingViewJ.a;
                    recordingBarContainer.requestFocus();
                    TimeAnimator.TimeListener timeListener = new TimeAnimator.TimeListener() { // from class: hlj
                        @Override // android.animation.TimeAnimator.TimeListener
                        public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                            MicrophoneRecordingView.RecordingBarContainer recordingBarContainer2 = recordingBarContainer;
                            recordingBarContainer2.a();
                            recordingBarContainer2.invalidate();
                        }
                    };
                    TimeAnimator timeAnimator = recordingBarContainer.b;
                    timeAnimator.setTimeListener(timeListener);
                    timeAnimator.start();
                    microphoneRecordingViewJ.setVisibility(0);
                    return;
                }
                if (iOrdinal != 1) {
                    return;
                }
                microphoneRecordingViewJ.setVisibility(8);
                TimeAnimator timeAnimator2 = microphoneRecordingViewJ.a.b;
                if (timeAnimator2 != null) {
                    timeAnimator2.cancel();
                    timeAnimator2.setTimeListener(null);
                    timeAnimator2.removeAllListeners();
                    return;
                }
                return;
            case 1:
                ((aixm) this.a).j(obj);
                return;
            case 2:
                Map map = (Map) obj;
                if (map != null && Collection.EL.stream(map.entrySet()).anyMatch(new hmd(i))) {
                    jqt jqtVar = (jqt) this.a;
                    if (jqtVar.e()) {
                        Intent intent = new Intent("com.google.android.projection.gearhead.ACTION_DSA_AAPM_HUN");
                        Context context = jqtVar.a;
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent.setPackage(context.getPackageName()), 201326592);
                        aaew aaewVar = new aaew(null);
                        aaewVar.d = context.getString(R.string.aapm_hun_action_dsa);
                        aaewVar.a = 1;
                        aaewVar.b = broadcast;
                        nul nulVar = new nul(aaewVar);
                        num numVar = new num();
                        numVar.d = GhIcon.q(context.getResources(), R.drawable.ic_aapm_warning);
                        numVar.f = context.getPackageName();
                        numVar.x = nuo.a;
                        numVar.a = nup.HIGH;
                        numVar.m = context.getString(R.string.aapm_hun_title);
                        numVar.n = context.getString(R.string.aapm_hun_content);
                        numVar.p = nulVar;
                        nuj.b().j("AAPM_HUN", 0L, numVar.b());
                        jqt.a(yzz.AAPM, yzy.MZ);
                    }
                    jqtVar.b();
                    return;
                }
                return;
            case 3:
                ((jsf) this.a).m((krz) obj);
                return;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                jsp jspVar = (jsp) this.a;
                TextView textView = jspVar.l;
                if (textView == null) {
                    return;
                }
                textView.setText(charSequence);
                jspVar.l.setVisibility(true == ((gdy) jspVar.o).l ? 0 : 8);
                return;
            case 5:
                ((eqj) this.a).m((Boolean) obj);
                return;
            case 6:
                krz krzVar = (krz) obj;
                jsp jspVar2 = (jsp) this.a;
                if (krzVar != jspVar2.f) {
                    jspVar2.f = krzVar;
                    jspVar2.c.c(new iwu(7));
                    return;
                }
                return;
            case 7:
                gev.c(new jgv(this.a, ((Boolean) obj).booleanValue(), i));
                return;
            case 8:
                ((jyk) this.a).a = ((Boolean) obj).booleanValue();
                return;
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                TemplateView templateView = (TemplateView) this.a;
                ggu gguVar = templateView.n;
                if (gguVar != null) {
                    gguVar.b(zBooleanValue);
                }
                templateView.q();
                return;
            case 10:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                kcj kcjVar = (kcj) this.a;
                kcjVar.h = zBooleanValue2;
                kcjVar.w();
                return;
            case 11:
                ((kcp) this.a).s((String) obj);
                return;
            case 12:
                ((kcp) this.a).t((String) obj);
                return;
            case 13:
                ((kcp) this.a).u((old) obj);
                return;
            case 14:
                ((kcp) this.a).w(((Integer) obj).intValue());
                return;
            case 15:
                ((ket) this.a).b = ((Boolean) obj).booleanValue();
                return;
            case 16:
                ((qw) this.a).j();
                return;
            case 17:
                ((khn) this.a).a();
                return;
            case 18:
                thg thgVar = (thg) obj;
                yph yphVar = khx.a;
                Object obj2 = this.a;
                try {
                    Function functionIdentity = Function$CC.identity();
                    if (!(thgVar instanceof tgo)) {
                        throw ((Throwable) functionIdentity.apply(((tgn) thgVar).a));
                    }
                    ((eqj) obj2).m(((tgo) thgVar).a);
                    return;
                } catch (Throwable th) {
                    ((ype) ((ype) ((ype) khx.a.g()).p(th)).ai((char) 3107)).u("Ignoring unsuccessful result.");
                    return;
                }
            case 19:
                mow mowVar = (mow) obj;
                ((ype) ProjectedHomeActivity.m.l().ai((char) 3198)).y("update state: %s", mowVar);
                if (mowVar == null) {
                    tss.q("GH.HomeActivity", "got a null ui state update", new Object[0]);
                    return;
                }
                Object obj3 = this.a;
                int iOrdinal2 = mowVar.ordinal();
                if (iOrdinal2 == 0) {
                    ProjectedHomeActivity projectedHomeActivity = (ProjectedHomeActivity) obj3;
                    projectedHomeActivity.q = projectedHomeActivity.n;
                    projectedHomeActivity.p = false;
                } else if (iOrdinal2 == 1) {
                    ProjectedHomeActivity projectedHomeActivity2 = (ProjectedHomeActivity) obj3;
                    projectedHomeActivity2.q = projectedHomeActivity2.o;
                    projectedHomeActivity2.p = true;
                } else if (iOrdinal2 == 2) {
                    ((ProjectedHomeActivity) obj3).finish();
                    return;
                }
                ((ProjectedHomeActivity) obj3).A();
                return;
            default:
                mki.a.d.execute(new kot(this.a, (Optional) obj, 3));
                return;
        }
    }
}
