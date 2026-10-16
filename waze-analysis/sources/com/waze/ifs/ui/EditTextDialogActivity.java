package com.waze.ifs.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class EditTextDialogActivity extends a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f24468f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f24469g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f24470h;

    /* renamed from: k, reason: collision with root package name */
    public static final String f24471k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f24472l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    private static final String t = "com.waze.ifs.ui.EditTextDialogActivity";
    private EditText A;
    private long v;
    private long z;
    private boolean u = false;
    private final com.waze.shared_infra.o.a B = com.waze.shared_infra.o.b.a();

    static {
        String name = EditTextDialogActivity.class.getName();
        f24468f = String.valueOf(name).concat(".arg.title_string_res_id");
        f24469g = String.valueOf(name).concat(".arg.subtitle_string_res_id");
        f24470h = String.valueOf(name).concat(".arg.type");
        f24471k = String.valueOf(name).concat(".arg.native");
        f24472l = String.valueOf(name).concat(".arg.callback");
        m = String.valueOf(name).concat(".arg.context");
        n = String.valueOf(name).concat(".arg.hint_string_res_id");
        o = String.valueOf(name).concat(".arg.initial");
        p = String.valueOf(name).concat(".arg.single_line");
        q = String.valueOf(name).concat(".arg.nin_lines");
        r = String.valueOf(name).concat(".arg.explain");
        s = String.valueOf(name).concat(".ret.val");
    }

    static /* bridge */ /* synthetic */ void l(EditTextDialogActivity editTextDialogActivity) {
        ((InputMethodManager) editTextDialogActivity.getSystemService("input_method")).hideSoftInputFromWindow(editTextDialogActivity.A.getWindowToken(), 0);
        if (editTextDialogActivity.u) {
            NativeManager.getInstance().editTextDialogCallback(editTextDialogActivity.A.getText().toString(), editTextDialogActivity.v, editTextDialogActivity.z);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(s, editTextDialogActivity.A.getText().toString());
        editTextDialogActivity.setResult(-1, intent);
    }

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aE();
        setContentView(R.layout.edit_text_dialog);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(f24468f, 0);
        boolean booleanExtra = intent.getBooleanExtra(f24471k, false);
        this.u = booleanExtra;
        if (booleanExtra) {
            this.v = intent.getLongExtra(f24472l, 0L);
            this.z = intent.getLongExtra(m, 0L);
        }
        String stringExtra = intent.getStringExtra(r);
        int intExtra2 = intent.getIntExtra(f24470h, 1);
        com.waze.shared_infra.o.a aVar = this.B;
        String strC = aVar.c(intExtra, new Object[0]);
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.d(strC, aVar.c(R.string.DONE, new Object[0]));
        titleBar.m(new com.waze.design_components.c.e(this, 9));
        titleBar.n(new d(this, 1));
        String str = f24469g;
        if (intent.hasExtra(str)) {
            int intExtra3 = intent.getIntExtra(str, 0);
            SettingsTitleText settingsTitleText = (SettingsTitleText) findViewById(R.id.subtitle);
            settingsTitleText.a(aVar.c(intExtra3, new Object[0]));
            settingsTitleText.setVisibility(0);
        }
        EditText editText = (EditText) findViewById(R.id.editText);
        this.A = editText;
        editText.setOnEditorActionListener(new e(this, 1));
        this.A.setInputType(intExtra2 | 131072);
        String str2 = n;
        if (intent.hasExtra(str2)) {
            this.A.setHint(aVar.c(intent.getIntExtra(str2, 0), new Object[0]));
        }
        String str3 = o;
        if (intent.hasExtra(str3)) {
            this.A.setText(intent.getStringExtra(str3));
            this.A.setSelectAllOnFocus(true);
        }
        String str4 = p;
        if (intent.hasExtra(str4)) {
            this.A.setSingleLine(intent.getBooleanExtra(str4, false));
        }
        String str5 = q;
        if (intent.hasExtra(str5)) {
            this.A.setMinLines(intent.getIntExtra(str5, 0));
        }
        findViewById(R.id.speechRecognition).setVisibility(8);
        if (intExtra == R.string.MAP_CHAT_EDIT_TITLE) {
            stringExtra = aVar.c(R.string.CHIT_CHATS_ARE_PUBLIC, new Object[0]);
        } else if (intExtra == R.string.MESSAGE) {
            stringExtra = aVar.c(R.string.MESSAGES_ARE_PRIVATE, new Object[0]);
        }
        if (stringExtra != null) {
            ((TextView) findViewById(R.id.editTextDialogText)).setText(stringExtra);
        }
        View viewFindViewById = findViewById(android.R.id.content);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new c(this, viewFindViewById));
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.A.requestFocus();
    }
}
