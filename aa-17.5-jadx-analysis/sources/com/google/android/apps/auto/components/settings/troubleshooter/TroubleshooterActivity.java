package com.google.android.apps.auto.components.settings.troubleshooter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.ebf;
import defpackage.ef;
import defpackage.ep;
import defpackage.jty;
import defpackage.kfl;
import defpackage.kfn;
import defpackage.lsh;
import defpackage.mki;
import defpackage.mmh;
import defpackage.mmi;
import defpackage.okv;
import defpackage.ols;
import defpackage.rrc;
import defpackage.uk;
import defpackage.wnd;
import defpackage.wne;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class TroubleshooterActivity extends ep {
    public mmh m;

    public static final void A(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.TROUBLESHOOTER, yzyVar).l());
    }

    public static final void B(final UUID uuid) {
        if (uuid != null) {
            final okv okvVar = (okv) mki.a.i(okv.class);
            mki.a.d.execute(new Runnable() { // from class: oku
                /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, xyc] */
                @Override // java.lang.Runnable
                public final void run() throws PackageManager.NameNotFoundException, IOException {
                    okv okvVar2 = okvVar;
                    Object obj = okvVar2.c;
                    oky okyVarG = rxf.g((Context) obj, uuid);
                    if (okyVarG == null) {
                        ((ype) ((ype) ((yns) okvVar2.a).h()).ai((char) 5989)).u("Issue with ID not found, unable to send feedback.");
                        return;
                    }
                    lbk lbkVar = (lbk) okvVar2.d.gu();
                    try {
                        okvVar2.e = lbkVar.d((Context) obj);
                        try {
                            ((ype) ((ypf) okvVar2.a).l().ai(5979)).u("Adding Gearhead header");
                            Object obj2 = okvVar2.e;
                            obj2.getClass();
                            ((FileOutputStream) obj2).write(String.format(Locale.US, "---------- %s ----------\n\n", "Gearhead").getBytes(StandardCharsets.UTF_8));
                        } catch (IOException e) {
                            ((ype) ((ype) ((ype) ((yns) okvVar2.a).h()).p(e)).ai((char) 5980)).u("Failed to add gearhead header");
                        }
                        lbkVar.f = "Troubleshooter error report";
                        Object obj3 = okvVar2.a;
                        yph yphVar = (yph) obj3;
                        ((ype) yphVar.l().ai((char) 5990)).u("Added troubleshooter description");
                        Object obj4 = okvVar2.b;
                        StringBuilder sb = new StringBuilder();
                        ((rxo) obj4).c(sb);
                        lbkVar.m = sb.toString();
                        lbkVar.i(acqa.c());
                        ((ype) yphVar.l().ai((char) 5984)).u("Added meta data");
                        String str = okyVarG.c;
                        try {
                            ((ype) ((ypf) obj3).l().ai(5982)).u("Adding issue logs");
                            okvVar2.a(((rxo) obj4).a(str), "Time of issue logs");
                        } catch (IOException unused) {
                            ((ype) ((ype) ((yns) okvVar2.a).h()).ai((char) 5983)).u("Failed to add issue logs");
                            lbkVar.a("IO error copying issue logs");
                        }
                        String str2 = okyVarG.e;
                        try {
                            ((ype) ((ypf) okvVar2.a).l().ai(5987)).u("Adding session start logs");
                            okvVar2.a(((rxo) okvVar2.b).a(String.format("session_%s_start", str2)), "Session start logs");
                        } catch (IOException e2) {
                            ((ype) ((ype) ((ype) ((yns) okvVar2.a).h()).p(e2)).ai((char) 5988)).u("Failed to add session start logs");
                            lbkVar.a("IO error copying session start logs");
                        }
                        String str3 = okyVarG.e;
                        try {
                            ((ype) ((ypf) okvVar2.a).l().ai(5985)).u("Adding session end logs");
                            okvVar2.a(((rxo) okvVar2.b).a(String.format("session_%s_end", str3)), "Session end logs");
                        } catch (IOException unused2) {
                            ((ype) ((ype) ((yns) okvVar2.a).h()).ai((char) 5986)).u("Failed to add session end logs");
                            lbkVar.a("IO error copying session end logs");
                        }
                        Context context = (Context) okvVar2.c;
                        ldw.g(context, lbkVar);
                        rxf.n(context, okyVarG, 6);
                        ((rxo) okvVar2.b).d(okyVarG.c);
                    } catch (IOException e3) {
                        throw new IllegalStateException("Unable to pull outputStream from feedbackBundle", e3);
                    }
                }
            });
        }
    }

    private static final void C(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.getBoolean("SEND_BUG_REPORT_KEY", false)) {
            return;
        }
        String string = extras.getString("ISSUE_ID_KEY");
        string.getClass();
        B(UUID.fromString(string));
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C(getIntent());
        setTheme(R.style.Theme_Gearhead_Material3);
        kfl.k(getTheme());
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.material3_activity_troubleshooter);
        q((Toolbar) findViewById(R.id.toolbar));
        ef efVarO = o();
        efVarO.getClass();
        efVarO.i(R.string.settings_troubleshooter_title);
        efVarO.g(true);
        ols.c(getWindow(), findViewById(R.id.scroll_view));
        this.m = new mmh(new ajmd(this));
        ((RecyclerView) findViewById(R.id.troubleshooter_recycler_view)).Z(this.m);
        jty.b();
        ((mmi) kfn.h(this, null, 6).a(mmi.class)).a.fE(this, new lsh(this, 18));
    }

    @Override // defpackage.ob, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
