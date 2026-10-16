package com.google.android.projection.gearhead.companion;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class AndroidAutoActivity extends defpackage.ep {
    public static final defpackage.yqm m = defpackage.yqm.c("GH.ANDROID_AUTO_APP");
    public defpackage.qtv n;
    public defpackage.xaa o;
    private android.support.v7.widget.RecyclerView p;
    private final java.util.List q = new java.util.ArrayList();

    private final defpackage.wzs B(defpackage.wzt wztVar) {
        defpackage.wzs wzsVar = new defpackage.wzs();
        this.q.add(wzsVar);
        wzsVar.d = wztVar;
        return wzsVar;
    }

    private final void C(defpackage.wzt wztVar) {
        java.util.Iterator it = this.q.iterator();
        while (it.hasNext()) {
            if (((defpackage.wzt) ((defpackage.wzs) it.next()).d).equals(wztVar)) {
                it.remove();
            }
        }
    }

    public final void A(android.app.AlertDialog alertDialog, boolean z) {
        android.widget.ImageView imageView = (android.widget.ImageView) alertDialog.findViewById(2131428398);
        android.widget.TextView textView = (android.widget.TextView) alertDialog.findViewById(2131427600);
        android.widget.Button button = (android.widget.Button) alertDialog.findViewById(2131429914);
        android.widget.Button button2 = (android.widget.Button) alertDialog.findViewById(2131429043);
        if (z) {
            imageView.setImageResource(2131233714);
            textView.setText(2132084942);
            button.setOnClickListener(new srb(this, alertDialog, 19));
        } else {
            imageView.setImageResource(2131233713);
            textView.setText(2132084940);
            button.setOnClickListener(new srb(this, alertDialog, 20));
        }
        button2.setOnClickListener(new wug(alertDialog, 13, (byte[]) null));
        button.setText(2132084938);
        button2.setText(2132084937);
    }

    @Override // defpackage.bc, defpackage.od, android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 47) {
            ((defpackage.yqj) m.l().ai(9967)).D("onActivityResult resultCode: %d, data: %s", i2, intent != null ? intent.toUri(0) : null);
            return;
        }
        if (i == 48) {
            if (defpackage.mdp.d().f()) {
                C(defpackage.wzt.PERMISSIONS_NEEDED);
            }
        } else if (i == 49 && defpackage.mdp.d().m()) {
            C(defpackage.wzt.NOTIFICATION_ACCESS_NEEDED);
        }
    }

    @Override // defpackage.bc, defpackage.od, defpackage.cs, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623976);
        android.view.View viewFindViewById = findViewById(2131429787);
        q((android.support.v7.widget.Toolbar) findViewById(2131429787));
        defpackage.ef efVarO = o();
        if (efVarO != null) {
            efVarO.t();
            defpackage.wzo wzoVar = new defpackage.wzo();
            int[] iArr = defpackage.ebt.a;
            defpackage.ebl.e(viewFindViewById, wzoVar);
        }
        defpackage.yqm yqmVar = defpackage.lfr.a;
        if (!((defpackage.lfr) defpackage.mkp.a.i(defpackage.lfr.class)).i()) {
            B(defpackage.wzt.SOFTWARE_UPDATE).b = new wug(this, 9);
        }
        if (!((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).f()) {
            B(defpackage.wzt.PERMISSIONS_NEEDED).b = new wug(this, 10);
        }
        if (!((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).m()) {
            B(defpackage.wzt.NOTIFICATION_ACCESS_NEEDED).b = new wug(this, 11);
        }
        defpackage.yqm yqmVar2 = defpackage.lgv.a;
        defpackage.lgv lgvVar = (defpackage.lgv) defpackage.mkp.a.i(defpackage.lgv.class);
        if (lgvVar.h()) {
            B(defpackage.wzt.HANDWRITING_INPUT).b = new wug(lgvVar, 12, (byte[]) null);
        }
        B(defpackage.wzt.ANDROID_APPS).b = new defpackage.mgi(this, 2);
        B(defpackage.wzt.COMPATIBLE_CARS).b = new defpackage.mgi(this, 3);
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) findViewById(2131427741);
        this.p = recyclerView;
        recyclerView.ab(new android.support.v7.widget.LinearLayoutManager(1));
        defpackage.xaa xaaVar = new defpackage.xaa(this);
        this.o = xaaVar;
        xaaVar.e = this.q;
        xaaVar.g();
        this.p.Z(this.o);
        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).i(defpackage.yyh.COMPANION_START);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(2131755010, menu);
        return true;
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        this.q.clear();
        super.onDestroy();
    }

    @Override // defpackage.od, android.app.Activity
    protected final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return false;
        }
        if (itemId != 2131427441) {
            return false;
        }
        startActivity(new android.content.Intent(this, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity.class));
        return true;
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onResume() {
        super.onResume();
        android.content.Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("com.google.android.projection.gearhead.companion.UP_NAVIGATION_DISABLED", false) : false;
        defpackage.ef efVarO = o();
        if (efVarO != null) {
            efVarO.g(!booleanExtra);
        }
        defpackage.qtv qtvVarB = defpackage.omv.b(this, new defpackage.wzp(this, 0), null, null, 0);
        this.n = qtvVarB;
        qtvVarB.e();
        android.content.Intent intent2 = getIntent();
        defpackage.yqm yqmVar = com.google.android.apps.auto.components.feedback.impl.FeedbackNotificationHelper.a;
        if (intent2.getBooleanExtra("gh_feedback_show_rating_prompt", false)) {
            android.view.View viewInflate = android.view.LayoutInflater.from(this).inflate(2131624510, (android.view.ViewGroup) null);
            android.app.AlertDialog alertDialogCreate = new android.app.AlertDialog.Builder(this).setView(viewInflate).create();
            viewInflate.findViewById(2131429914).setOnClickListener(new srb(this, alertDialogCreate, 17));
            viewInflate.findViewById(2131429043).setOnClickListener(new srb(this, alertDialogCreate, 18));
            alertDialogCreate.setOnDismissListener(new wzr());
            alertDialogCreate.show();
            android.view.WindowManager.LayoutParams attributes = alertDialogCreate.getWindow().getAttributes();
            attributes.width = getResources().getDimensionPixelSize(2131165672);
            alertDialogCreate.getWindow().setAttributes(attributes);
            ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).l(zap.c);
            getIntent().removeExtra("gh_feedback_show_rating_prompt");
        }
    }
}
