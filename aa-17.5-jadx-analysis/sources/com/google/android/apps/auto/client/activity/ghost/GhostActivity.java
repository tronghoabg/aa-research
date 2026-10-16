package com.google.android.apps.auto.client.activity.ghost;

import android.content.ComponentName;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.aezr;
import defpackage.afyh;
import defpackage.bc;
import defpackage.epu;
import defpackage.gzm;
import defpackage.woy;
import defpackage.ype;
import defpackage.yph;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0016"}, d2 = {"Lcom/google/android/apps/auto/client/activity/ghost/GhostActivity;", "Landroid/support/v4/app/FragmentActivity;", "<init>", "()V", "carActivityServiceComponentName", "Landroid/content/ComponentName;", "getCarActivityServiceComponentName", "()Landroid/content/ComponentName;", "carActivityServiceComponentName$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getRelativeProcessName", "", "logState", "stateName", "wasLaunchedFromRecentsOrDefaultDisplay", "", "isDefaultDisplay", "Companion", "java.com.google.android.apps.auto.client.activity.ghost_ghost"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public class GhostActivity extends bc {
    public static final yph m = yph.c("GH.GhostActivity");
    private final aezr n = woy.dG(new gzm(this, 17));

    public final ComponentName o() {
        return (ComponentName) this.n.a();
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Display display;
        View viewFindViewById;
        woy.ae(Build.VERSION.SDK_INT >= 33, "Ghost Activity cannot be started on devices below T.", new Object[0]);
        super.onCreate(bundle);
        if ((getIntent().getFlags() & 1048576) == 1048576 || ((display = getDisplay()) != null && display.getDisplayId() == 0)) {
            ((ype) m.f()).u("Finishing GhostActivity cold started from recents or default display.");
            finishAndRemoveTask();
            return;
        }
        if (!getIntent().getBooleanExtra("DisplayDebugContent", false)) {
            setContentView(R.layout.ghost_blank_layout);
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent, null)));
            return;
        }
        setContentView(R.layout.ghost_activity_layout);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent, null)));
        TextView textView = (TextView) findViewById(R.id.ghost_activity_component);
        if (textView != null) {
            textView.setText(o().flattenToShortString());
        }
        TextView textView2 = (TextView) findViewById(R.id.ghost_activity_process);
        if (textView2 != null) {
            String strMyProcessName = Process.myProcessName();
            strMyProcessName.getClass();
            String packageName = getApplicationContext().getPackageName();
            packageName.getClass();
            textView2.setText(afyh.m(strMyProcessName, packageName));
        }
        CharSequence text = textView2 != null ? textView2.getText() : null;
        if ((text == null || text.length() == 0) && (viewFindViewById = findViewById(R.id.ghost_activity_process_holder)) != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f.c(new epu((TextView) findViewById(R.id.ghost_activity_state), this, 4, null));
    }
}
