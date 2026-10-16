package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.CarContext$1;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class khe implements us {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ khe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v22, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v31, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v33, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v36, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v38, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39, types: [afdr, java.lang.Object] */
    @Override // defpackage.us
    public final void onClick() {
        switch (this.b) {
            case 0:
                ((khf) this.a).a(false, mdg.b);
                break;
            case 1:
                ((khf) this.a).a(true, mdg.b);
                break;
            case 2:
                Object obj = this.a;
                qn qnVar = ((qw) obj).a;
                adzp.b(qnVar, qnVar.getString(R.string.permission_prompt_launch_success_toast)).a();
                yfq yfqVarQ = yfq.q("android.permission.READ_CALENDAR");
                final khf khfVar = (khf) obj;
                qv qvVar = new qv() { // from class: khd
                    @Override // defpackage.qv
                    public final void a(List list, List list2) {
                        list.getClass();
                        list2.getClass();
                        khfVar.a(!list.isEmpty(), mdg.c);
                    }
                };
                Executor mainExecutor = qnVar.getMainExecutor();
                mainExecutor.getClass();
                ComponentName componentName = new ComponentName(qnVar, (Class<?>) CarAppPermissionActivity.class);
                Bundle bundle = new Bundle(2);
                bundle.putBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY", new CarContext$1(qnVar, qnVar.b, mainExecutor, qvVar));
                bundle.putStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY", (String[]) yfqVarQ.toArray(new String[0]));
                qnVar.startActivity(new Intent("androidx.car.app.action.REQUEST_PERMISSIONS").setComponent(componentName).putExtras(bundle).addFlags(268435456), ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle());
                break;
            case 3:
                ((lkl) this.a).f.invoke();
                break;
            case 4:
                ((lks) this.a).b.invoke();
                break;
            case 5:
                int i = lld.a;
                this.a.invoke();
                break;
            case 6:
                int i2 = lld.a;
                this.a.invoke();
                break;
            case 7:
                int i3 = lld.a;
                this.a.invoke();
                break;
            case 8:
                int i4 = lld.a;
                this.a.invoke();
                break;
            case 9:
                int i5 = lld.a;
                this.a.invoke();
                break;
            case 10:
                int i6 = lld.a;
                this.a.invoke();
                break;
            case 11:
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gM);
                llg llgVar = (llg) this.a;
                rrbVarH.p(llgVar.c.a);
                ohsVarJ.F(rrbVarH.l());
                llgVar.f.invoke();
                break;
            case 12:
                this.a.invoke();
                break;
            case 13:
                this.a.invoke();
                break;
            case 14:
                this.a.invoke();
                break;
            case 15:
                this.a.invoke();
                break;
            case 16:
                this.a.invoke();
                break;
            case 17:
                this.a.invoke();
                break;
            case 18:
                this.a.invoke();
                break;
            case 19:
                this.a.invoke();
                break;
            default:
                this.a.invoke();
                break;
        }
    }
}
