package defpackage;

import android.app.WallpaperColors;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class ltd implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ltd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.app.WallpaperColors] */
    /* JADX WARN: Type inference failed for: r8v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v47, types: [android.app.WallpaperColors] */
    /* JADX WARN: Type inference failed for: r8v52, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v59, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v63, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v66, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v69, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        eqj eqjVarR;
        switch (this.b) {
            case 0:
                return tby.v((eqj) this.a.invoke(obj), new lpx(obj, 11));
            case 1:
                ((okv) this.a).e = (lod) obj;
                return obj;
            case 2:
                eqj eqjVar = (eqj) obj;
                Duration duration = lto.a;
                eqjVar.getClass();
                ldy ldyVar = ldz.a;
                return new okv(eqjVar, (yzz) this.a, lem.c(true != ldyVar.a().b() ? R.drawable.gs_skip_previous_vd_24 : R.drawable.gs_skip_previous_wght500fill1rond100_vd_theme_24), lem.c(true != ldyVar.a().b() ? R.drawable.gs_skip_next_vd_24 : R.drawable.gs_skip_next_wght500fill1rond100_vd_theme_24), lem.c(true != ldyVar.a().b() ? R.drawable.gs_replay_10_vd_24 : R.drawable.gs_replay_10_wght500fill1rond100_vd_theme_24), lem.c(true != ldyVar.a().b() ? R.drawable.gs_forward_10_vd_24 : R.drawable.gs_forward_10_wght500fill1rond100_vd_theme_24), kiu.a());
            case 3:
                ComponentName componentName = (ComponentName) obj;
                componentName.getClass();
                boolean zF = affa.f(componentName, mkn.G);
                Object obj2 = this.a;
                return zF ? new lts((eqj) obj2) : new ltf((eqj) obj2);
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                Object obj3 = this.a;
                if (iIntValue != 6) {
                    eqjVarR = tby.d;
                } else if (((affq) obj3).a) {
                    eqjVarR = tby.c;
                } else {
                    gjv gjvVar = new gjv((xyi) oit.a().b);
                    afco afcoVar = tby.a;
                    eqjVarR = tby.r(new eqm(gjvVar), lto.b);
                }
                ((affq) obj3).a = false;
                return eqjVarR;
            case 5:
                krz krzVar = (krz) obj;
                CarButton carButton = (CarButton) this.a;
                Context context = carButton.getContext();
                krr krrVar = krr.a;
                context.getClass();
                krzVar.getClass();
                int iB = krrVar.b(context, krzVar);
                int iB2 = krr.v.b(context, krzVar);
                carButton.f.b(new cjv(iB << 32));
                carButton.e.b(new cjv(iB2 << 32));
                return afak.a;
            case 6:
                return new mtt((mtv) this.a);
            case 7:
                return new mue((mug) this.a);
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue) {
                    xya xyaVar = ((nev) obj4).c;
                    if (!xyaVar.a) {
                        xyaVar.e();
                    }
                } else {
                    xya xyaVar2 = ((nev) obj4).c;
                    if (xyaVar2.a) {
                        xyaVar2.f();
                    }
                }
                return afak.a;
            case 9:
                return (mqc) ((Map) obj).get(this.a);
            case 10:
                if (!((Boolean) obj).booleanValue() || Build.VERSION.SDK_INT < 30 || kjf.e(kiq.a().b(), acxa.H())) {
                    afco afcoVar2 = tby.a;
                    return new eqm(null);
                }
                Object obj5 = this.a;
                aiyd aiydVar = new aiyd(new dmx((nfn) obj5, (afck) null, 16));
                mkk mkkVar = mkm.a;
                return tby.u(dtx.l(aimv.a(new hcg(aimv.a(aiydVar, mkkVar.e()), obj5, 9), mkkVar.b()), afcp.a, 5000L), null);
            case 11:
                Bitmap bitmap = (Bitmap) obj;
                Object obj6 = this.a;
                if (bitmap != null) {
                    return dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxb((nfn) obj6, bitmap, (afck) null, 6));
                }
                SharedPreferences sharedPreferences = ((nfn) obj6).d;
                if (sharedPreferences.contains("primary")) {
                    Color colorValueOf = Color.valueOf(sharedPreferences.getInt("primary", 0));
                    colorValueOf.getClass();
                    int i = sharedPreferences.getInt("secondary", 0);
                    Color colorValueOf2 = i == 0 ? null : Color.valueOf(i);
                    int i2 = sharedPreferences.getInt("tertiary", 0);
                    colorValueOf = i2 != 0 ? Color.valueOf(i2) : null;
                    colorValueOf = Build.VERSION.SDK_INT >= 31 ? new WallpaperColors(colorValueOf, colorValueOf2, colorValueOf, sharedPreferences.getInt("colorHints", 0)) : new WallpaperColors(colorValueOf, colorValueOf2, colorValueOf);
                }
                afco afcoVar3 = tby.a;
                return new eqm(colorValueOf);
            case 12:
                nlz nlzVar = (nlz) obj;
                nlzVar.getClass();
                nok nokVarC = ((nhr) this.a).c(nlzVar);
                if (nokVarC != null) {
                    return nokVarC;
                }
                throw new IllegalStateException("Required value was null.");
            case 13:
                yph yphVar = nhm.a;
                ((ery) obj).getClass();
                if (((Boolean) this.a.a()).booleanValue()) {
                    nfy.a().c(ngb.k);
                }
                return new nhl();
            case 14:
                cis cisVar = (cis) obj;
                yph yphVar2 = nhm.a;
                cisVar.getClass();
                if (cisVar.b()) {
                    ?? r8 = this.a;
                    nhm.a.l().u("HomeButton focused");
                    r8.b(nii.b);
                }
                return afak.a;
            case 15:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ?? r82 = this.a;
                yph yphVar3 = nhm.a;
                r82.b(Boolean.valueOf(zBooleanValue2));
                return afak.a;
            case 16:
                cis cisVar2 = (cis) obj;
                yph yphVar4 = nhm.a;
                cisVar2.getClass();
                if (cisVar2.b()) {
                    ?? r83 = this.a;
                    nhm.a.l().u("NotificationCenter focused");
                    r83.b(nii.i);
                }
                return afak.a;
            case 17:
                cis cisVar3 = (cis) obj;
                yph yphVar5 = nhm.a;
                cisVar3.getClass();
                if (cisVar3.b() || cisVar3.a()) {
                    ?? r84 = this.a;
                    nhm.a.l().u("RailWidget area focused");
                    r84.b(nii.d);
                }
                return afak.a;
            case 18:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                yph yphVar6 = nhm.a;
                this.a.invoke(bool);
                return afak.a;
            case 19:
                cis cisVar4 = (cis) obj;
                yph yphVar7 = nhm.a;
                cisVar4.getClass();
                if (cisVar4.b()) {
                    ?? r85 = this.a;
                    nhm.a.l().u("AssistantButton focused");
                    r85.b(nii.c);
                }
                return afak.a;
            default:
                niq niqVar = (niq) this.a;
                niqVar.b.l().R("currentButtonOption:(%s) isDashboardShowing:(%s) isDashboardSupported:(%s)", (nip) obj, niqVar.a.e(), niqVar.c.e());
                return obj;
        }
    }

    public ltd(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
