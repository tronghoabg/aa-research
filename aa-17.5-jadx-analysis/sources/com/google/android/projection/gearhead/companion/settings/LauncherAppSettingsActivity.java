package com.google.android.projection.gearhead.companion.settings;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import com.google.android.projection.gearhead.R;
import defpackage.abnp;
import defpackage.abnv;
import defpackage.abon;
import defpackage.acsi;
import defpackage.ebf;
import defpackage.ef;
import defpackage.ep;
import defpackage.jty;
import defpackage.kfl;
import defpackage.lz;
import defpackage.mre;
import defpackage.mrg;
import defpackage.mrj;
import defpackage.mrl;
import defpackage.ns;
import defpackage.nu;
import defpackage.nv;
import defpackage.ols;
import defpackage.pdn;
import defpackage.qsz;
import defpackage.rbt;
import defpackage.rrc;
import defpackage.uk;
import defpackage.uzr;
import defpackage.wer;
import defpackage.wnd;
import defpackage.wne;
import defpackage.xab;
import defpackage.xac;
import defpackage.xai;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

/* loaded from: classes3.dex */
public class LauncherAppSettingsActivity extends ep {
    public static final yph m = yph.c("GH.LauncherSetngsActvy");
    static final Function n = new uzr(16);
    public RecyclerView o;
    lz p;
    public xai q;
    xac r;
    public rbt s;
    public qsz t;
    public final Handler u = new Handler();

    public final int A(mrg mrgVar) {
        List list = this.q.e;
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if ((obj instanceof mrl) && mrgVar.equals(((mrl) obj).h)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        byte[] byteArrayExtra;
        super.onActivityResult(i, i2, intent);
        yph yphVar = m;
        ((ype) yphVar.l().ai(9994)).R("onActivityResult requestCode=%d resultCode=%d intent=%s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        if (i2 != -1) {
            return;
        }
        mrg mrgVarA = null;
        if (i == 1001) {
            if (intent != null) {
                Uri data = intent.getData();
                ((ype) yphVar.l().ai((char) 9996)).y("onActivityResult contactUri=%s", data);
                if (data == null) {
                    ((ype) yphVar.l().ai((char) 9997)).u("unable to add call shortcut: null contact uri");
                    return;
                }
                mrj mrjVarB = mrj.b();
                if (acsi.e()) {
                    wer.c();
                    ((ype) mrj.a.l().ai((char) 5217)).y("addCallShortcut uri=%s", data);
                    abnp abnpVarN = mrg.a.n();
                    String string = UUID.randomUUID().toString();
                    abnpVarN.t();
                    mrg mrgVar = (mrg) abnpVarN.b;
                    string.getClass();
                    mrgVar.b |= 4;
                    mrgVar.f = string;
                    abnp abnpVarN2 = mre.a.n();
                    String string2 = data.toString();
                    abnpVarN2.t();
                    mre mreVar = (mre) abnpVarN2.b;
                    string2.getClass();
                    mreVar.b |= 1;
                    mreVar.c = string2;
                    mre mreVar2 = (mre) abnpVarN2.q();
                    abnpVarN.t();
                    mrg mrgVar2 = (mrg) abnpVarN.b;
                    mreVar2.getClass();
                    mrgVar2.d = mreVar2;
                    mrgVar2.c = 3;
                    mrgVarA = mrjVarB.a((mrg) abnpVarN.q());
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uQ).l());
                }
            }
        } else if (i == 1002 && intent != null && (byteArrayExtra = intent.getByteArrayExtra("RETURN_RECORD")) != null) {
            try {
                mrgVarA = (mrg) abnv.x(mrg.a, byteArrayExtra);
            } catch (abon e) {
                ((ype) ((ype) ((ype) m.g()).p(e)).ai((char) 9995)).u("Error parsing LauncherShortcutRecord");
            }
        }
        xai.t(this.o);
        if (mrgVarA != null) {
            this.u.post(new xab(this, mrgVarA, 2));
        }
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_APP_CUSTOMIZATION, yzy.pJ).l());
        setTheme(R.style.Theme_Gearhead_Material3);
        kfl.k(getTheme());
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.material3_activity_launcher_settings_apps);
        q((Toolbar) findViewById(R.id.toolbar));
        ef efVarO = o();
        efVarO.g(true);
        efVarO.i(R.string.settings_customize_app_launcher_title);
        ols.c(getWindow(), findViewById(R.id.scroll_view));
        o().g(true);
        this.o = (RecyclerView) findViewById(R.id.settingsRecyclerView);
        this.r = new xac(this);
        nv nvVar = new nv(this.r);
        RecyclerView recyclerView = this.o;
        RecyclerView recyclerView2 = nvVar.o;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.av(nvVar);
                nvVar.o.V(nvVar.u);
                List list = nvVar.o.x;
                if (list != null) {
                    list.remove(nvVar);
                }
                List list2 = nvVar.n;
                int size = list2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    nu nuVar = (nu) list2.get(0);
                    nuVar.a();
                    nvVar.l.c(nvVar.o, nuVar.h);
                }
                list2.clear();
                nvVar.r = null;
                nvVar.g();
                ns nsVar = nvVar.t;
                if (nsVar != null) {
                    nsVar.a = false;
                    nvVar.t = null;
                }
                if (nvVar.s != null) {
                    nvVar.s = null;
                }
            }
            nvVar.o = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                nvVar.e = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                nvVar.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                ViewConfiguration.get(nvVar.o.getContext()).getScaledTouchSlop();
                nvVar.o.aw(nvVar);
                nvVar.o.u(nvVar.u);
                RecyclerView recyclerView3 = nvVar.o;
                if (recyclerView3.x == null) {
                    recyclerView3.x = new ArrayList();
                }
                recyclerView3.x.add(nvVar);
                nvVar.t = new ns(nvVar);
                nvVar.s = new GestureDetector(nvVar.o.getContext(), nvVar.t);
            }
        }
        xai xaiVar = new xai(this, nvVar);
        this.q = xaiVar;
        this.o.Z(xaiVar);
        getApplicationContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.p = linearLayoutManager;
        this.o.ab(linearLayoutManager);
        jty.b();
        this.s = new pdn(this, 3);
        qsz qszVar = (qsz) n.apply(this);
        this.t = qszVar;
        qszVar.e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
