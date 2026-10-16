package com.waze.navigate;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ifs.ui.EditMapLocationActivity;
import com.waze.il;
import com.waze.strings.DisplayStrings;
import com.waze.view.text.InstantAutoComplete;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AutocompleteSearchActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    InstantAutoComplete f30919f;

    /* renamed from: g, reason: collision with root package name */
    Integer f30920g;

    /* renamed from: h, reason: collision with root package name */
    int f30921h;
    private DriveToNativeManager m;
    private NativeManager n;
    private String o;
    private boolean p;
    private com.waze.j.i q;
    private boolean s;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f30923l = com.waze.shared_infra.o.b.a();
    private AddressItem[] r = null;
    private boolean t = true;
    private boolean u = false;

    /* renamed from: k, reason: collision with root package name */
    final com.waze.jni.a f30922k = new il(this, 17);

    public static /* synthetic */ void l(AutocompleteSearchActivity autocompleteSearchActivity, AddressItem[] addressItemArr) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < addressItemArr.length; i2++) {
            if (addressItemArr[i2].getType() != 6) {
                arrayList.add(addressItemArr[i2]);
            }
        }
        Collections.sort(arrayList, new al(autocompleteSearchActivity));
        AddressItem[] addressItemArr2 = new AddressItem[arrayList.size()];
        autocompleteSearchActivity.r = addressItemArr2;
        arrayList.toArray(addressItemArr2);
        autocompleteSearchActivity.q = new com.waze.j.i(autocompleteSearchActivity, autocompleteSearchActivity.r, autocompleteSearchActivity.f30919f, autocompleteSearchActivity, autocompleteSearchActivity.f30920g.intValue());
        if (autocompleteSearchActivity.f30920g.intValue() == 3 || autocompleteSearchActivity.f30920g.intValue() == 4) {
            autocompleteSearchActivity.q.j();
        }
        autocompleteSearchActivity.q.g((autocompleteSearchActivity.q.b() & (-17)) | 4104);
        autocompleteSearchActivity.f30919f.setAdapter(autocompleteSearchActivity.q);
        NativeManager.getInstance().shouldShowTypingWhileDrivingWarning(new aj(autocompleteSearchActivity, 1));
    }

    public static /* synthetic */ void q(AutocompleteSearchActivity autocompleteSearchActivity, int i2, KeyEvent keyEvent) {
        Log.d("WAZE", "a:" + i2 + " ke:" + String.valueOf(keyEvent));
        if (i2 == 3) {
            autocompleteSearchActivity.v();
        }
        if (keyEvent == null || keyEvent.getAction() != 1) {
            return;
        }
        autocompleteSearchActivity.v();
    }

    public static /* synthetic */ void r(AutocompleteSearchActivity autocompleteSearchActivity, int i2) {
        com.waze.j.d dVarC = autocompleteSearchActivity.q.c(i2);
        if (dVarC.e() == 3) {
            autocompleteSearchActivity.w(dVarC.t());
        } else {
            autocompleteSearchActivity.n(dVarC);
        }
    }

    private final void v() {
        new com.waze.search.t().g(this.f30919f.getText().toString()).b((AddressItem) getIntent().getExtras().getParcelable("AddressItem")).e(this.f30920g.intValue()).h(this, 1);
    }

    private final void w(AddressItem addressItem) {
        boolean z = this.f30920g.intValue() == 3;
        if (!z && this.f30920g.intValue() != 4) {
            s(addressItem);
            return;
        }
        if (addressItem.getType() == 16) {
            o(addressItem, z);
            return;
        }
        addressItem.setCategory(1);
        com.waze.shared_infra.o.a aVar = this.f30923l;
        if (z) {
            addressItem.setTitle(aVar.c(R.string.HOME, new Object[0]));
        } else {
            addressItem.setTitle(aVar.c(R.string.WORK, new Object[0]));
        }
        s(addressItem);
    }

    private final void x() {
        setContentView(R.layout.autocomplete_search);
        com.waze.shared_infra.o.a aVar = this.f30923l;
        int i2 = 0;
        String strC = aVar.c(R.string.SEARCH, new Object[0]);
        int i3 = this.f30921h;
        int i4 = 3;
        if (i3 != -1) {
            strC = aVar.c(i3, new Object[0]);
        } else if (this.f30920g.intValue() == 3) {
            strC = aVar.c(R.string.SET_HOME_AUTOCOMPLETE_TITLE, new Object[0]);
        } else if (this.f30920g.intValue() == 4) {
            strC = aVar.c(R.string.SET_WORK_AUTOCOMPLETE_TITLE, new Object[0]);
        }
        ((ImageView) findViewById(R.id.imgSearchIcon)).setImageResource(com.waze.design_components.b.d.aj.c(com.waze.design_components.b.e.f23312a));
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.c(strC);
        titleBar.m(new com.waze.main_screen.bottom_bars.a.a(this, 11));
        titleBar.n(new com.waze.main_screen.bottom_bars.a.a(this, 12));
        InstantAutoComplete instantAutoComplete = (InstantAutoComplete) findViewById(R.id.searchBox);
        this.f30919f = instantAutoComplete;
        instantAutoComplete.setThreshold(0);
        this.f30919f.setDropDownBackgroundDrawable(new ColorDrawable(0));
        this.f30919f.setOnItemClickListener(new ah(this, i2));
        this.f30919f.setDropDownAnchor(R.id.searchBar);
        this.f30919f.setHint(aVar.c(R.string.NAVLIST_SEARCH_ACTIVITY_HINT, new Object[0]));
        this.f30919f.setOnEditorActionListener(new com.waze.favorites.s(this, i4));
        this.f30919f.addTextChangedListener(new ak(this));
        z(a.a.y(this.f30919f.getText().toString()));
        this.m.getAutoCompleteData(this.f30922k);
        com.waze.shared_infra.g.e.c(findViewById(R.id.navigateScreen));
    }

    private final void y(AddressItem addressItem, Intent intent, int i2) {
        if (this.t) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).storeAddressItem(addressItem, true, null);
        }
        if (!intent.hasExtra("source")) {
            intent.putExtra("source", "AUTOCOMPLETE");
        }
        intent.putExtra("SearchMode", this.f30920g);
        setResult(i2, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z) {
        ImageView imageView = (ImageView) findViewById(R.id.speechRecognition);
        ImageView imageView2 = (ImageView) findViewById(R.id.clearText);
        int i2 = 0;
        if (!z) {
            imageView.setVisibility(8);
            imageView2.setOnClickListener(new ai(this, i2));
            imageView2.setVisibility(0);
        } else {
            imageView.setImageResource(com.waze.design_components.b.d.ad.c(com.waze.design_components.b.e.f23314c));
            imageView.setOnClickListener(new com.waze.main_screen.bottom_bars.a.a(this, 13));
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
        }
    }

    @Override // com.waze.sharedui.a.e
    protected final boolean D(Message message) {
        int i2 = message.what;
        int i3 = DriveToNativeManager.UH_SEARCH_ADD_RESULT;
        if (i2 != i3) {
            return false;
        }
        this.m.unsetUpdateHandler(i3, this.y);
        this.n.CloseProgressPopup();
        AddressItem addressItem = (AddressItem) message.getData().getParcelable("address_item");
        if (addressItem == null || addressItem.getId() == null) {
            v();
            return true;
        }
        w(addressItem);
        return true;
    }

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    public final void n(com.waze.j.d dVar) {
        this.m.setUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.y);
        this.n.autoCompleteVenueGet(null, dVar.n(), dVar.m(), dVar.d(), false, 0, dVar.k(), this.f30919f.getText().toString(), false);
    }

    public final void o(AddressItem addressItem, boolean z) {
        this.f30919f.setText((CharSequence) null);
        Intent intent = new Intent(this, (Class<?>) EditMapLocationActivity.class);
        intent.putExtra(EditMapLocationActivity.m, addressItem.getLongitudeInt());
        intent.putExtra(EditMapLocationActivity.n, addressItem.getLatitudeInt());
        intent.putExtra(EditMapLocationActivity.f24464g, this.f30923l.c(R.string.DONE, new Object[0]));
        intent.putExtra(EditMapLocationActivity.f24465h, true != z ? 4 : 3);
        startActivityForResult(intent, DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.AutocompleteSearchActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        getWindow().setSoftInputMode(5);
        this.t = getIntent().getExtras().getBoolean("StoreFavorites", true);
        this.f30920g = Integer.valueOf(getIntent().getExtras().getInt("SearchMode"));
        this.u = getIntent().getExtras().getBoolean("IsEditMode", false);
        this.f30921h = getIntent().getExtras().getInt("TitleDs", -1);
        this.m = (DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class);
        this.n = NativeManager.getInstance();
        this.p = getIntent().getBooleanExtra("keyboard", false);
        this.o = getIntent().getStringExtra("Speech");
        x();
        String str = this.o;
        if (str != null) {
            this.f30919f.setText(str);
        }
        this.m.setSearchMode();
        if (this.p || this.o != null) {
            ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 0);
        }
        if (this.f30920g.intValue() == 3) {
            this.f30919f.setHint(this.f30923l.c(R.string.SET_HOME_AUTOCOMPLETE_PLACEHOLDER, new Object[0]));
        } else if (this.f30920g.intValue() == 4) {
            this.f30919f.setHint(this.f30923l.c(R.string.SET_WORK_AUTOCOMPLETE_PLACEHOLDER, new Object[0]));
        }
        if (this.f30920g.intValue() == 3 || this.f30920g.intValue() == 4) {
            ((com.waze.mywaze.ah) com.waze.web.r.h(com.waze.mywaze.ah.class)).e(this.u ? com.waze.mywaze.ad.f30558a : com.waze.mywaze.ad.f30559b, this.f30920g.intValue() == 3 ? com.waze.mywaze.ae.f30561a : com.waze.mywaze.ae.f30562b);
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        this.m.unsetUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.y);
        if (this.f30919f.getHandler() != null) {
            this.f30919f.getHandler().removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.m.unsetUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.y);
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f30919f.getWindowToken(), 0);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            this.f30919f.requestFocus();
            com.waze.ui.x.u.l(this, this.f30919f);
            NativeManager.getInstance().shouldShowTypingWhileDrivingWarning(new aj(this, 0));
            if (this.s) {
                this.s = false;
            }
        } catch (RuntimeException e2) {
            com.waze.shared_infra.i.h.e("Exception occurred", e2);
        }
    }

    public final void p() {
        this.f30919f.dismissDropDown();
        this.f30919f.b();
    }

    public final void s(AddressItem addressItem) {
        Intent intent = new Intent();
        intent.putExtra("ai", addressItem);
        y(addressItem, intent, -1);
    }
}
