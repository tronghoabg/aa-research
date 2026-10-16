package com.google.android.projection.gearhead.companion;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ef;
import defpackage.ep;
import defpackage.lfm;
import defpackage.lgp;
import defpackage.lgv;
import defpackage.mdk;
import defpackage.mga;
import defpackage.mki;
import defpackage.ohs;
import defpackage.omc;
import defpackage.qsz;
import defpackage.sqd;
import defpackage.wwt;
import defpackage.wys;
import defpackage.wyt;
import defpackage.wyv;
import defpackage.wyw;
import defpackage.wyx;
import defpackage.wze;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxc;
import defpackage.yzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AndroidAutoActivity extends ep {
    public static final yph m = yph.c("GH.ANDROID_AUTO_APP");
    public qsz n;
    public wze o;
    private RecyclerView p;
    private final List q = new ArrayList();

    private final wyw B(wyx wyxVar) {
        wyw wywVar = new wyw();
        this.q.add(wywVar);
        wywVar.d = wyxVar;
        return wywVar;
    }

    private final void C(wyx wyxVar) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            if (((wyx) ((wyw) it.next()).d).equals(wyxVar)) {
                it.remove();
            }
        }
    }

    public final void A(AlertDialog alertDialog, boolean z) {
        ImageView imageView = (ImageView) alertDialog.findViewById(R.id.illustration);
        TextView textView = (TextView) alertDialog.findViewById(R.id.body_text);
        Button button = (Button) alertDialog.findViewById(R.id.yes_button);
        Button button2 = (Button) alertDialog.findViewById(R.id.no_button);
        if (z) {
            imageView.setImageResource(R.drawable.rating_prompt_rate);
            textView.setText(R.string.rating_prompt_dialog_text_playstore);
            button.setOnClickListener(new sqd(this, alertDialog, 19));
        } else {
            imageView.setImageResource(R.drawable.rating_prompt_feedback);
            textView.setText(R.string.rating_prompt_dialog_text_feedback);
            button.setOnClickListener(new sqd(this, alertDialog, 20));
        }
        button2.setOnClickListener(new wwt(alertDialog, 9, null));
        button.setText(R.string.rating_prompt_dialog_action_sure);
        button2.setText(R.string.rating_prompt_dialog_action_no_thanks);
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 47) {
            ((ype) m.l().ai(9939)).D("onActivityResult resultCode: %d, data: %s", i2, intent != null ? intent.toUri(0) : null);
            return;
        }
        if (i == 48) {
            if (lgv.c().f()) {
                C(wyx.PERMISSIONS_NEEDED);
            }
        } else if (i == 49 && lgv.c().m()) {
            C(wyx.NOTIFICATION_ACCESS_NEEDED);
        }
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_android_auto);
        View viewFindViewById = findViewById(R.id.toolbar);
        q((Toolbar) findViewById(R.id.toolbar));
        ef efVarO = o();
        if (efVarO != null) {
            efVarO.t();
            wys wysVar = new wys();
            int[] iArr = ebm.a;
            ebe.e(viewFindViewById, wysVar);
        }
        yph yphVar = lfm.a;
        if (!((lfm) mki.a.i(lfm.class)).i()) {
            B(wyx.SOFTWARE_UPDATE).b = new wwt(this, 5);
        }
        int i = 6;
        if (!((mdk) mki.a.i(mdk.class)).f()) {
            B(wyx.PERMISSIONS_NEEDED).b = new wwt(this, i);
        }
        int i2 = 7;
        if (!((mdk) mki.a.i(mdk.class)).m()) {
            B(wyx.NOTIFICATION_ACCESS_NEEDED).b = new wwt(this, i2);
        }
        yph yphVar2 = lgp.a;
        lgp lgpVar = (lgp) mki.a.i(lgp.class);
        if (lgpVar.h()) {
            B(wyx.HANDWRITING_INPUT).b = new wwt(lgpVar, 8, null);
        }
        B(wyx.ANDROID_APPS).b = new mga(this, i);
        B(wyx.COMPATIBLE_CARS).b = new mga(this, i2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_list);
        this.p = recyclerView;
        recyclerView.ab(new LinearLayoutManager(1));
        wze wzeVar = new wze(this);
        this.o = wzeVar;
        wzeVar.e = this.q;
        wzeVar.g();
        this.p.Z(this.o);
        ((ohs) mki.a.i(ohs.class)).i(yxc.COMPANION_START);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.android_auto, menu);
        return true;
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        this.q.clear();
        super.onDestroy();
    }

    @Override // defpackage.ob, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return false;
        }
        if (itemId != R.id.action_settings) {
            return false;
        }
        startActivity(new Intent(this, (Class<?>) Material3SettingsActivity.class));
        return true;
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onResume() {
        super.onResume();
        Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("com.google.android.projection.gearhead.companion.UP_NAVIGATION_DISABLED", false) : false;
        ef efVarO = o();
        if (efVarO != null) {
            efVarO.g(!booleanExtra);
        }
        qsz qszVarB = omc.b(this, new wyt(this, 0), null, null, 0);
        this.n = qszVarB;
        qszVarB.e();
        Intent intent2 = getIntent();
        yph yphVar = FeedbackNotificationHelper.a;
        if (intent2.getBooleanExtra("gh_feedback_show_rating_prompt", false)) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.rating_prompt_dialog, (ViewGroup) null);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setView(viewInflate).create();
            viewInflate.findViewById(R.id.yes_button).setOnClickListener(new sqd(this, alertDialogCreate, 17));
            viewInflate.findViewById(R.id.no_button).setOnClickListener(new sqd(this, alertDialogCreate, 18));
            alertDialogCreate.setOnDismissListener(new wyv());
            alertDialogCreate.show();
            WindowManager.LayoutParams attributes = alertDialogCreate.getWindow().getAttributes();
            attributes.width = getResources().getDimensionPixelSize(R.dimen.companion_rating_prompt_dialog_width);
            alertDialogCreate.getWindow().setAttributes(attributes);
            ((ohs) mki.a.i(ohs.class)).l(yzk.PROMPT_SHOWN);
            getIntent().removeExtra("gh_feedback_show_rating_prompt");
        }
    }
}
