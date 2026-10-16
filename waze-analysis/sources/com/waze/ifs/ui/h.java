package com.waze.ifs.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.waze.R;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.view.title.TitleBar;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends android.support.v4.app.ar {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24549a = "com.waze.ifs.ui.h";

    /* renamed from: b, reason: collision with root package name */
    private EditText f24550b;

    /* renamed from: g, reason: collision with root package name */
    private int f24555g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24556h;

    /* renamed from: i, reason: collision with root package name */
    private String f24557i;

    /* renamed from: j, reason: collision with root package name */
    private String f24558j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24559k;
    private View n;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f24551c = com.waze.shared_infra.o.b.a();

    /* renamed from: d, reason: collision with root package name */
    private int f24552d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f24553e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f24554f = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f24560l = 0;
    private int m = 0;

    static /* bridge */ /* synthetic */ void b(h hVar) {
        ((InputMethodManager) hVar.requireActivity().getSystemService("input_method")).hideSoftInputFromWindow(hVar.f24550b.getWindowToken(), 0);
        ((g) hVar.requireActivity()).a(hVar.f24550b.getText().toString());
    }

    public final void c(String str) {
        this.f24557i = str;
    }

    public final void d(int i2) {
        this.f24554f = i2;
    }

    public final void e(String str) {
        this.f24558j = str;
    }

    public final void f(int i2) {
        this.f24553e = i2;
    }

    public final void g(int i2) {
        this.f24552d = i2;
    }

    public final void h() {
        this.f24555g = 1;
    }

    public final void i() {
        this.f24560l = 300;
    }

    public final void j() {
        this.m = 6;
    }

    public final void k() {
        this.f24559k = false;
    }

    public final void l() {
        this.f24556h = false;
    }

    @Override // android.support.v4.app.ar
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Log.d("WAZE", "Navigate onActRes requestCode=" + i2 + " resultCode=" + i3 + " Intent=" + String.valueOf(intent));
        if (i2 == 4097 && i3 == -1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (stringArrayListExtra.size() > 0) {
                this.f24550b.setText(stringArrayListExtra.get(0));
            }
        }
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            String str = f24549a;
            if (bundle.containsKey(String.valueOf(str).concat(".mTitleDs"))) {
                this.f24552d = bundle.getInt(String.valueOf(str).concat(".mTitleDs"));
            }
            if (bundle.containsKey(String.valueOf(str).concat(".mSubtitleDs"))) {
                this.f24553e = bundle.getInt(String.valueOf(str).concat(".mSubtitleDs"));
            }
            if (bundle.containsKey(String.valueOf(str).concat(".mHintDs"))) {
                this.f24554f = bundle.getInt(String.valueOf(str).concat(".mHintDs"));
            }
            this.f24555g = bundle.getInt(String.valueOf(str).concat(".mInputType"));
            this.f24560l = bundle.getInt(String.valueOf(str).concat(".mMaxLength"));
            this.m = bundle.getInt(String.valueOf(str).concat(".mMinLines"));
            String strValueOf = String.valueOf(str);
            this.f24556h = bundle.getBoolean(strValueOf.concat(".mUseSpeech"), this.f24556h);
            String strValueOf2 = String.valueOf(str);
            this.f24559k = bundle.getBoolean(strValueOf2.concat(".mSingleLine"), this.f24559k);
            this.f24557i = bundle.getString(String.valueOf(str).concat(".mExplanation"));
            this.f24558j = bundle.getString(String.valueOf(str).concat(".mInitial"));
        }
        this.n = layoutInflater.inflate(R.layout.edit_text_dialog, viewGroup, false);
        com.waze.shared_infra.o.a aVar = this.f24551c;
        String strC = aVar.c(this.f24552d, new Object[0]);
        TitleBar titleBar = (TitleBar) this.n.findViewById(R.id.theTitleBar);
        titleBar.d(strC, aVar.c(R.string.DONE, new Object[0]));
        titleBar.n(new d(this, 0));
        titleBar.m(new com.waze.design_components.c.e(this, 10));
        if (this.f24553e != -1) {
            SettingsTitleText settingsTitleText = (SettingsTitleText) this.n.findViewById(R.id.subtitle);
            settingsTitleText.a(aVar.c(this.f24553e, new Object[0]));
            settingsTitleText.setVisibility(0);
        }
        EditText editText = (EditText) this.n.findViewById(R.id.editText);
        this.f24550b = editText;
        editText.setOnEditorActionListener(new e(this, 0));
        this.f24550b.setInputType(this.f24555g | 131072);
        int i2 = this.f24554f;
        if (i2 != -1) {
            this.f24550b.setHint(aVar.c(i2, new Object[0]));
        }
        String str2 = this.f24558j;
        if (str2 != null) {
            this.f24550b.setText(str2);
            this.f24550b.setSelectAllOnFocus(true);
        }
        this.f24550b.setSingleLine(this.f24559k);
        this.f24550b.setMinLines(this.m);
        if (this.f24560l > 0) {
            this.f24550b.addTextChangedListener(new f(this, 0));
        }
        boolean z = this.f24556h;
        View view = this.n;
        if (z) {
            view.findViewById(R.id.speechRecognition).setOnClickListener(new d(this, 2, (byte[]) null));
        } else {
            view.findViewById(R.id.speechRecognition).setVisibility(8);
        }
        int i3 = this.f24552d;
        if (i3 == R.string.MAP_CHAT_EDIT_TITLE) {
            this.f24557i = aVar.c(R.string.CHIT_CHATS_ARE_PUBLIC, new Object[0]);
        } else if (i3 == R.string.MESSAGE) {
            this.f24557i = aVar.c(R.string.MESSAGES_ARE_PRIVATE, new Object[0]);
        }
        if (this.f24557i != null) {
            ((TextView) this.n.findViewById(R.id.editTextDialogText)).setText(this.f24557i);
        }
        return this.n;
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        this.f24550b.requestFocus();
        ((InputMethodManager) getActivity().getSystemService("input_method")).showSoftInput(this.f24550b, 2);
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        int i2 = this.f24552d;
        if (i2 != -1) {
            bundle.putInt(String.valueOf(f24549a).concat(".mTitleDs"), i2);
        }
        int i3 = this.f24553e;
        if (i3 != -1) {
            bundle.putInt(String.valueOf(f24549a).concat(".mSubtitleDs"), i3);
        }
        int i4 = this.f24554f;
        if (i4 != -1) {
            bundle.putInt(String.valueOf(f24549a).concat(".mHintDs"), i4);
        }
        String str = f24549a;
        String strValueOf = String.valueOf(str);
        bundle.putInt(strValueOf.concat(".mInputType"), this.f24555g);
        String strValueOf2 = String.valueOf(str);
        bundle.putInt(strValueOf2.concat(".mMaxLength"), this.f24560l);
        String strValueOf3 = String.valueOf(str);
        bundle.putInt(strValueOf3.concat(".mMinLines"), this.m);
        String strValueOf4 = String.valueOf(str);
        bundle.putBoolean(strValueOf4.concat(".mUseSpeech"), this.f24556h);
        String strValueOf5 = String.valueOf(str);
        bundle.putBoolean(strValueOf5.concat(".mSingleLine"), this.f24559k);
        String strValueOf6 = String.valueOf(str);
        bundle.putString(strValueOf6.concat(".mExplanation"), this.f24557i);
        String strValueOf7 = String.valueOf(str);
        bundle.putString(strValueOf7.concat(".mInitial"), this.f24558j);
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        com.waze.shared_infra.g.e.c(view.findViewById(R.id.editTextDialogContainer));
    }
}
