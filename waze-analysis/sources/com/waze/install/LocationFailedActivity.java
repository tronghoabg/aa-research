package com.waze.install;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LocationFailedActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f24714f = com.waze.shared_infra.o.b.a();

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1) {
            setResult(-1);
            finish();
            i3 = -1;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aE();
        setContentView(R.layout.location_failed);
        TextView textView = (TextView) findViewById(R.id.locationFailedText);
        com.waze.shared_infra.o.a aVar = this.f24714f;
        textView.setText(aVar.c(R.string.LOCATION_FAILED, new Object[0]));
        ((WazeTextView) findViewById(R.id.locationFailedSelectCountryText)).setText(aVar.c(R.string.SELECT_COUNTRY, new Object[0]));
        findViewById(R.id.locationFailedSelectCountry).setOnClickListener(new com.waze.design_components.c.e(this, 18));
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.locationFailedLayout), new ar(this));
        getOnBackPressedDispatcher().addCallback(new as(this));
    }
}
