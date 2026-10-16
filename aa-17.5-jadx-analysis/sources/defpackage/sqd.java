package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.libraries.surveys.internal.view.EmbeddedSurveyFragment;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.projection.gearhead.companion.AndroidAutoActivity;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class sqd implements View.OnClickListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public sqd(Context context, Intent intent, int i) {
        this.c = i;
        this.a = context;
        this.b = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        int i2 = 3;
        int i3 = 2;
        switch (this.c) {
            case 0:
                try {
                    ((Context) this.a).startActivity((Intent) this.b);
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
            case 1:
                Object obj = this.b;
                sfo sfoVar = (sfo) obj;
                if (sfoVar.g != null) {
                    ((sfm) this.a).b.c("DONT_SHOW_AGAIN_SETTING", true);
                    sfoVar.g.g.L(sfoVar.h(), yzy.bL);
                    sfoVar.g.h(9);
                    ((ao) obj).c();
                    break;
                }
                break;
            case 2:
                LicenseMenuActivity licenseMenuActivity = ((wek) this.b).e;
                if (licenseMenuActivity != null) {
                    ?? r0 = this.a;
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", (Parcelable) r0);
                    licenseMenuActivity.startActivity(intent);
                    break;
                }
                break;
            case 3:
                wic wicVar = new wic();
                wjb wjbVar = (wjb) this.a;
                wjbVar.j(wjbVar.d, wjbVar.j, wjbVar.h, wid.l(wjbVar.f));
                wjbVar.b.dismissAllowingStateLoss();
                vuf.C(wicVar, wjbVar.d, (String) this.b);
                break;
            case 4:
                ((wjb) this.a).g((abyt) this.b);
                break;
            case 5:
                wjb wjbVar2 = (wjb) this.a;
                String str = wjbVar2.k;
                abnp abnpVarN = abye.a.n();
                boolean zC = wjbVar2.g.c();
                Object obj2 = this.b;
                if (zC) {
                    String strAl = woy.al(str);
                    abnp abnpVarN2 = abya.a.n();
                    abnpVarN2.t();
                    ((abya) abnpVarN2.b).b = strAl;
                    abya abyaVar = (abya) abnpVarN2.q();
                    int i4 = ((abyt) obj2).e;
                    abnpVarN.t();
                    ((abye) abnpVarN.b).d = i4;
                    abnpVarN.t();
                    abye abyeVar = (abye) abnpVarN.b;
                    abyaVar.getClass();
                    abyeVar.c = abyaVar;
                    abyeVar.b = 5;
                }
                abye abyeVar2 = (abye) abnpVarN.q();
                if (abyeVar2 != null) {
                    wjbVar2.c.a = abyeVar2;
                }
                wjbVar2.b((abyt) obj2);
                wjbVar2.c();
                break;
            case 6:
                wic wicVar2 = new wic();
                wjb wjbVar3 = (wjb) this.a;
                wjbVar3.j(wjbVar3.d, wjbVar3.j, wjbVar3.h, wid.l(wjbVar3.f));
                wjbVar3.b.dismissAllowingStateLoss();
                vuf.C(wicVar2, wjbVar3.d, (String) this.b);
                break;
            case 7:
                wjb wjbVar4 = (wjb) this.a;
                whn whnVarA = wjbVar4.a();
                if (whnVarA != null) {
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        boolean[] zArr = (boolean[]) wjbVar4.o.a;
                        if (i5 < zArr.length) {
                            if (zArr[i5]) {
                                arrayList.add(Integer.valueOf(i5));
                            }
                            i5++;
                        } else {
                            ykd ykdVar = vuf.h;
                            yfq.o(arrayList);
                            ykd.r(ykdVar, whnVarA);
                        }
                    }
                }
                Object obj3 = this.b;
                aacq aacqVar = wjbVar4.o;
                abnp abnpVarN3 = abye.a.n();
                if (wjbVar4.g.c()) {
                    abnp abnpVarN4 = abxz.a.n();
                    abyt abytVar = (abyt) obj3;
                    abxm abxmVar = (abytVar.c == 5 ? (abyl) abytVar.d : abyl.a).c;
                    if (abxmVar == null) {
                        abxmVar = abxm.a;
                    }
                    aboh abohVar = abxmVar.b;
                    while (true) {
                        boolean[] zArr2 = (boolean[]) aacqVar.a;
                        if (i < zArr2.length) {
                            if (zArr2[i]) {
                                String str2 = ((abxl) abohVar.get(i)).e;
                                int iAz = a.az(((abxl) abohVar.get(i)).c);
                                if (iAz != 0 && iAz == 4) {
                                    ?? r13 = aacqVar.b;
                                    if (!TextUtils.isEmpty(r13)) {
                                        str2 = r13;
                                    }
                                }
                                abnp abnpVarN5 = abyc.a.n();
                                int i6 = ((abxl) abohVar.get(i)).d;
                                abnpVarN5.t();
                                ((abyc) abnpVarN5.b).c = i6;
                                abnpVarN5.t();
                                abyc abycVar = (abyc) abnpVarN5.b;
                                str2.getClass();
                                abycVar.d = str2;
                                int iAz2 = a.az(((abxl) abohVar.get(i)).c);
                                if (iAz2 == 0) {
                                    iAz2 = 1;
                                }
                                int i7 = iAz2 - 2;
                                int i8 = i7 != 1 ? i7 != 2 ? i7 != 3 ? 2 : 5 : 4 : 3;
                                abnpVarN5.t();
                                ((abyc) abnpVarN5.b).b = aclh.c(i8);
                                abnpVarN4.am((abyc) abnpVarN5.q());
                                wjbVar4.g.a();
                            }
                            int i9 = abytVar.e;
                            abnpVarN3.t();
                            ((abye) abnpVarN3.b).d = i9;
                            abxz abxzVar = (abxz) abnpVarN4.q();
                            abnpVarN3.t();
                            abye abyeVar3 = (abye) abnpVarN3.b;
                            abxzVar.getClass();
                            abyeVar3.c = abxzVar;
                            abyeVar3.b = 3;
                            i++;
                        }
                    }
                }
                abye abyeVar4 = (abye) abnpVarN3.q();
                if (abyeVar4 != null) {
                    wjbVar4.c.a = abyeVar4;
                }
                wjbVar4.b((abyt) obj3);
                wjbVar4.c();
                break;
            case 8:
                wjk.b((ViewGroup) this.a);
                new Handler().postDelayed(new wil(this.b, i3), 250L);
                break;
            case 9:
                wjk.b((ViewGroup) this.a);
                new Handler().postDelayed(new wil(this.b, i2), 250L);
                break;
            case 10:
                wic wicVar3 = new wic();
                wjx wjxVar = (wjx) this.a;
                wjxVar.o(6);
                wid.h(wjxVar.i);
                Activity activity = wjxVar.u;
                activity.finish();
                vuf.C(wicVar3, activity, (String) this.b);
                break;
            case 11:
                wic wicVar4 = new wic();
                wjx wjxVar2 = (wjx) this.a;
                wjxVar2.f();
                vuf.D(wicVar4, wjxVar2.u, (String) this.b);
                break;
            case 12:
                wic wicVar5 = new wic();
                whi whiVar = (whi) this.a;
                whiVar.m(6);
                wid.h(whiVar.i);
                for (EmbeddedSurveyFragment embeddedSurveyFragment : whiVar.c()) {
                }
                vuf.C(wicVar5, whiVar.a(), (String) this.b);
                break;
            case 13:
                wic wicVar6 = new wic();
                whi whiVar2 = (whi) this.a;
                whiVar2.g();
                vuf.D(wicVar6, whiVar2.a(), (String) this.b);
                break;
            case 14:
                woa woaVar = (woa) this.a;
                int iL = woaVar.b().L();
                wol wolVar = (wol) this.b;
                wolVar.e = 2;
                woaVar.c(wolVar.c(iL + 1));
                break;
            case 15:
                woa woaVar2 = (woa) this.a;
                int iM = woaVar2.b().M();
                wol wolVar2 = (wol) this.b;
                wolVar2.e = 1;
                woaVar2.c(wolVar2.c(iM - 1));
                break;
            case 16:
                this.a.onClick(view);
                ((BaseTransientBottomBar) this.b).d(1);
                break;
            case 17:
                ((AndroidAutoActivity) this.b).A((AlertDialog) this.a, true);
                ebf.j().l(yzk.RESPONSE_ENJOYING);
                break;
            case 18:
                ((AndroidAutoActivity) this.b).A((AlertDialog) this.a, false);
                ebf.j().l(yzk.RESPONSE_NOT_ENJOYING);
                break;
            case 19:
                ((AndroidAutoActivity) this.b).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.projection.gearhead")));
                ebf.j().l(yzk.OPEN_PLAY_STORE);
                ((AlertDialog) this.a).dismiss();
                break;
            default:
                kzd.k().b((Activity) this.b);
                ebf.j().l(yzk.OPEN_HELP_FEEDBACK);
                ((AlertDialog) this.a).dismiss();
                break;
        }
    }

    public sqd(AndroidAutoActivity androidAutoActivity, AlertDialog alertDialog, int i) {
        this.c = i;
        this.a = alertDialog;
        this.b = androidAutoActivity;
    }

    public /* synthetic */ sqd(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ sqd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public sqd(woa woaVar, wol wolVar, int i) {
        this.c = i;
        this.b = wolVar;
        this.a = woaVar;
    }
}
