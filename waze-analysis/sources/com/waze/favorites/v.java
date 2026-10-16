package com.waze.favorites;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.sharedui.views.OvalButton;
import com.waze.z.a.d.ai;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends com.waze.sharedui.d.a.d {

    /* renamed from: a, reason: collision with root package name */
    private OvalButton f23830a;

    /* renamed from: b, reason: collision with root package name */
    private EditText f23831b;

    /* renamed from: c, reason: collision with root package name */
    private final AddressItem f23832c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f23833d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f23834e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23835f;

    /* renamed from: g, reason: collision with root package name */
    private View f23836g;

    /* renamed from: h, reason: collision with root package name */
    private View f23837h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f23838i;

    public v(Context context, AddressItem addressItem, boolean z, Runnable runnable, Runnable runnable2) {
        super(context, R.style.PopInDialog);
        this.f23838i = com.waze.shared_infra.o.b.a();
        this.f23832c = addressItem;
        this.f23835f = z;
        this.f23833d = runnable;
        this.f23834e = runnable2;
    }

    public static /* synthetic */ ab b(v vVar, Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            Runnable runnable = vVar.f23833d;
            if (runnable != null) {
                runnable.run();
            }
            vVar.dismiss();
        } else {
            com.waze.ab.o oVar = new com.waze.ab.o();
            com.waze.shared_infra.o.a aVar = vVar.f23838i;
            oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
            oVar.P(aVar.c(R.string.FAVORITE_EXISTS_ERROR, new Object[0]));
            oVar.M(aVar.c(R.string.OK, new Object[0]));
            ai.q(oVar);
        }
        return ab.f48028a;
    }

    public static /* synthetic */ boolean i(v vVar, int i2, KeyEvent keyEvent) {
        if (i2 != 6 && (keyEvent == null || keyEvent.getAction() != 1)) {
            return false;
        }
        vVar.l();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        Runnable runnable = this.f23834e;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        String strTrim = this.f23831b.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (this.f23835f) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).renameFavorite(this.f23832c.getId(), strTrim, new com.waze.app_nav.hub.c.h(this, 15));
            return;
        }
        AddressItem addressItem = this.f23832c;
        addressItem.setTitle(strTrim);
        addressItem.setCategory(1);
        NativeManager.runOnNativeManagerReady(new com.google.android.material.internal.o(this, 19));
        Runnable runnable = this.f23833d;
        if (runnable != null) {
            runnable.run();
        }
        dismiss();
    }

    @Override // com.waze.sharedui.d.a.d, android.support.v7.app.ap, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f23831b.getWindowToken(), 0);
        super.dismiss();
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.name_favorite_layout);
        getWindow().setLayout(-1, -2);
        TextView textView = (TextView) findViewById(R.id.lblNameFavorite);
        TextView textView2 = (TextView) findViewById(R.id.lblCancel);
        TextView textView3 = (TextView) findViewById(R.id.lblDone);
        com.waze.shared_infra.o.a aVar = this.f23838i;
        textView.setText(aVar.c(R.string.ADD_FAVORITES_POP_UP_TITLE, new Object[0]));
        textView2.setText(aVar.c(R.string.CANCEL, new Object[0]));
        textView3.setText(aVar.c(R.string.DONE, new Object[0]));
        OvalButton ovalButton = (OvalButton) findViewById(R.id.btnCancel);
        this.f23830a = (OvalButton) findViewById(R.id.btnDone);
        ovalButton.setOnClickListener(new com.waze.design_components.c.e(this, 6));
        this.f23830a.setOnClickListener(new com.waze.design_components.c.e(this, 7));
        this.f23837h = findViewById(R.id.btnAddWork);
        View viewFindViewById = findViewById(R.id.btnAddHome);
        this.f23836g = viewFindViewById;
        int i2 = 8;
        viewFindViewById.setVisibility(8);
        this.f23837h.setVisibility(8);
        EditText editText = (EditText) findViewById(R.id.nameEditText);
        this.f23831b = editText;
        editText.setHint(aVar.c(R.string.NAME_THIS_FAVORITE_LOCATION, new Object[0]));
        this.f23831b.setOnEditorActionListener(new s(this, 0));
        this.f23831b.addTextChangedListener(new t(this, 0));
        AddressItem addressItem = this.f23832c;
        if (TextUtils.isEmpty(addressItem.getTitle())) {
            boolean zIsEmpty = TextUtils.isEmpty(addressItem.getAddress());
            EditText editText2 = this.f23831b;
            if (zIsEmpty) {
                editText2.setText("");
            } else {
                editText2.setText(addressItem.getAddress());
            }
        } else {
            this.f23831b.setText(addressItem.getTitle());
        }
        ((ImageView) findViewById(R.id.btnClearText)).setOnClickListener(new com.waze.design_components.c.e(this, i2));
        setCanceledOnTouchOutside(true);
        this.f23831b.requestFocus();
        EditText editText3 = this.f23831b;
        editText3.setSelection(editText3.getText().length());
        com.waze.ui.x.u.l(getContext(), this.f23831b);
        setOnCancelListener(new com.waze.design_components.c.f(this, 1));
    }
}
