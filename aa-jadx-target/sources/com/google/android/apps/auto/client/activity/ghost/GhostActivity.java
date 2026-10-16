package com.google.android.apps.auto.client.activity.ghost;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000 \u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010B¨\u0006\u0017"}, d2 = {"Lcom/google/android/apps/auto/client/activity/ghost/GhostActivity;", "Landroid/support/v4/app/FragmentActivity;", "<init>", "()V", "carActivityServiceComponentName", "Landroid/content/ComponentName;", "getCarActivityServiceComponentName", "()Landroid/content/ComponentName;", "carActivityServiceComponentName$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getRelativeProcessName", "", "logState", "stateName", "wasLaunchedFromRecentsOrDefaultDisplay", "", "isDefaultDisplay", "Landroidx/annotation/VisibleForTesting;", "Companion", "java.com.google.android.apps.auto.client.activity.ghost_ghost", "Landroidx/annotation/RequiresApi;", "value"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, defpackage.eie.LONG_FIELD_NUMBER, defpackage.abnt.b}, xi = 48)
public class GhostActivity extends defpackage.bc {
    public static final defpackage.yqm m = defpackage.yqm.c("GH.GhostActivity");
    private final defpackage.afar n = defpackage.afga.cA(new defpackage.gzv(this, 20));

    public final android.content.ComponentName o() {
        return (android.content.ComponentName) this.n.a();
    }

    @Override // defpackage.bc, defpackage.od, defpackage.cs, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        android.view.Display display;
        android.view.View viewFindViewById;
        defpackage.ysr.bo(android.os.Build.VERSION.SDK_INT >= 33, "Ghost Activity cannot be started on devices below T.", new java.lang.Object[0]);
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 1048576) == 1048576 || ((display = getDisplay()) != null && display.getDisplayId() == 0)) {
            ((defpackage.yqj) m.f()).u("Finishing GhostActivity cold started from recents or default display.");
            finishAndRemoveTask();
            return;
        }
        if (!getIntent().getBooleanExtra("DisplayDebugContent", false)) {
            setContentView(2131624219);
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent, null)));
            return;
        }
        setContentView(2131624218);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getResources().getColor(android.R.color.transparent, null)));
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428289);
        if (textView != null) {
            textView.setText(o().flattenToShortString());
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131428291);
        if (textView2 != null) {
            java.lang.String strM = ag$.ExternalSyntheticApiModelOutline0.m();
            strM.getClass();
            java.lang.String packageName = getApplicationContext().getPackageName();
            packageName.getClass();
            textView2.setText(afzh.m(strM, packageName));
        }
        java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
        if ((text == null || text.length() == 0) && (viewFindViewById = findViewById(2131428292)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f.c(new defpackage.epz((android.widget.TextView) findViewById(2131428293), this, 4));
    }
}
