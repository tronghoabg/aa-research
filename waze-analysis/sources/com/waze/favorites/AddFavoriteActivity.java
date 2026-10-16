package com.waze.favorites;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.datepicker.ac;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class AddFavoriteActivity extends com.waze.ifs.ui.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f23776g = 0;

    /* renamed from: f, reason: collision with root package name */
    EditText f23777f;

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    @Override // com.waze.ifs.ui.a
    protected final boolean f() {
        return false;
    }

    public final void l() {
        com.waze.shared_infra.i.h.a("Search pressed");
        new com.waze.search.t().e(1).g(this.f23777f.getText().toString()).h(this, 1);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.waze.shared_infra.i.h.a("AddFavorite onActRes requestCode=" + i2 + " resultCode=" + i3 + " Intent=" + String.valueOf(intent));
        if (i2 != 4097) {
            if (i3 != 0) {
                setResult(i3);
                finish();
                return;
            }
            return;
        }
        if (i3 == -1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra.size() > 0) {
                this.f23777f.setText(stringArrayListExtra.get(0));
            }
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aE();
        setContentView(R.layout.add_fav);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.c(aVarA.c(R.string.ADD_FAVORITE, new Object[0]));
        titleBar.n(new ac(this, 16));
        titleBar.m(new ac(this, 17));
        EditText editText = (EditText) findViewById(R.id.searchBox);
        this.f23777f = editText;
        editText.setHint(aVarA.c(R.string.NAVLIST_SEARCH_FAVORITES_HINT, new Object[0]));
        int color = ResourcesCompat.getColor(getResources(), R.color.content_p2, null);
        for (Drawable drawable : this.f23777f.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setTint(color);
            }
        }
        ((ImageView) findViewById(R.id.addFavPlaceLogo)).setImageResource(com.waze.design_components.b.d.M.c(com.waze.design_components.b.e.f23312a));
        ((WazeTextView) findViewById(R.id.addFavPlaceName)).setText(aVarA.c(R.string.ADD_FAVORITE, new Object[0]));
        this.f23777f.setOnEditorActionListener(new s(this, 1));
        this.f23777f.addTextChangedListener(new t(this, 1));
        findViewById(R.id.speechRecognition).setOnClickListener(new ac(this, 18));
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onPause() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f23777f.getWindowToken(), 0);
        super.onPause();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onResume() {
        super.onResume();
        com.waze.ui.x.u.l(this, this.f23777f);
    }
}
