package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.waze.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class at implements Parcelable {
    public static final Parcelable.Creator<at> CREATOR = new i(4);

    /* renamed from: a, reason: collision with root package name */
    private Long f6433a;

    /* renamed from: b, reason: collision with root package name */
    private SimpleDateFormat f6434b;

    public final Long a() {
        return this.f6433a;
    }

    public final /* synthetic */ Object b() {
        return this.f6433a;
    }

    public final String c(Context context) {
        Resources resources = context.getResources();
        Long l2 = this.f6433a;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : aw.c(l2.longValue()));
    }

    public final String d(Context context) {
        Resources resources = context.getResources();
        Long l2 = this.f6433a;
        return l2 == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, aw.c(l2.longValue()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Collection e() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.f6433a;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public final void h(long j2) {
        this.f6433a = Long.valueOf(j2);
    }

    public final void i(Long l2) {
        this.f6433a = Long.valueOf(ax.a(l2.longValue()));
    }

    public final void j(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) ax.g(simpleDateFormat);
        }
        this.f6434b = simpleDateFormat;
    }

    public final boolean k() {
        return this.f6433a != null;
    }

    public final View l(LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar, ap apVar) throws Resources.NotFoundException {
        String strReplace;
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editTextF = textInputLayout.f();
        Integer numE = com.google.android.material.focus.d.e(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (numE != null) {
            editTextF.setHintTextColor(numE.intValue());
        }
        if (com.google.android.material.d.c.d()) {
            editTextF.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatH = this.f6434b;
        int i2 = 1;
        boolean z = simpleDateFormatH != null;
        if (!z) {
            simpleDateFormatH = ax.h();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatH;
        if (z) {
            strReplace = simpleDateFormat.toPattern();
        } else {
            Resources resources = viewInflate.getResources();
            int i3 = ax.f6436b;
            String pattern = simpleDateFormat.toPattern();
            String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
            String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
            String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
            if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
                pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
            }
            strReplace = pattern.replace("d", string3).replace("M", string2).replace("y", string);
        }
        String str = strReplace;
        int i4 = ax.f6436b;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.E(spannableString);
        Long l2 = this.f6433a;
        if (l2 != null) {
            editTextF.setText(simpleDateFormat.format(l2));
            Editable text = editTextF.getText();
            if (text != null) {
                editTextF.setSelection(text.length());
            }
        }
        editTextF.addTextChangedListener(new as(this, str, simpleDateFormat, textInputLayout, cVar, apVar, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewInflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return viewInflate;
        }
        EditText[] editTextArr = {editTextF};
        editTextF.setOnFocusChangeListener(new com.waze.sharedui.views.af(editTextArr, i2));
        EditText editText = editTextArr[0];
        editText.postDelayed(new android.support.v7.app.p(editText, 3), 100L);
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeValue(this.f6433a);
    }
}
