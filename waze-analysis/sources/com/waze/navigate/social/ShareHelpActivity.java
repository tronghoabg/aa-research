package com.waze.navigate.social;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ShareHelpActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    private WazeTextView f31809f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f31810g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f31811h = com.waze.shared_infra.o.b.a();

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 != 0) {
            setResult(-1);
            finish();
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aE();
        setContentView(R.layout.share_help);
        this.f31809f = (WazeTextView) findViewById(R.id.gotItText);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.gotItButton);
        this.f31810g = linearLayout;
        linearLayout.setOnClickListener(new b(this));
        TitleBar titleBar = (TitleBar) findViewById(R.id.shareTitle);
        com.waze.shared_infra.o.a aVar = this.f31811h;
        titleBar.c(aVar.c(R.string.SHARE_RIDE, new Object[0]));
        titleBar.m(new com.waze.main_screen.bottom_bars.a.a(this, 16));
        titleBar.n(new com.waze.main_screen.bottom_bars.a.a(this, 17));
        ((TextView) findViewById(R.id.whyResgisterBodyText)).setText(aVar.c(R.string.SHARE_YOUR_DRIVE_WITH_FRIENDS_AND, new Object[0]));
        ((TextView) findViewById(R.id.whyResgisterBodyText2)).setText(aVar.c(R.string.FROM_THE_ETA_SCREEN_SIMPLY_ADD_FRIENDS_TO, new Object[0]));
        this.f31809f.setText(aVar.c(R.string.START_DRIVING, new Object[0]));
        View viewFindViewById = findViewById(R.id.shareRoot);
        View viewFindViewById2 = findViewById(R.id.shareScroll);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById2, new a(this, viewFindViewById2, viewFindViewById));
    }
}
