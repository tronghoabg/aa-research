package com.waze.reports;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.waze.R;
import com.waze.view.text.WazeEditText;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bk implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final WazeEditText f33697a;

    /* renamed from: b, reason: collision with root package name */
    String f33698b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ GasPriceReportActivity f33699c;

    bk(GasPriceReportActivity gasPriceReportActivity, WazeEditText wazeEditText) {
        Objects.requireNonNull(gasPriceReportActivity);
        this.f33699c = gasPriceReportActivity;
        this.f33697a = wazeEditText;
    }

    private final void a() {
        GasPriceReportActivity gasPriceReportActivity = this.f33699c;
        if (gasPriceReportActivity.z) {
            return;
        }
        ((View) gasPriceReportActivity.m.get(gasPriceReportActivity.p)).findViewById(R.id.gasPriceItemIndicator).setVisibility(0);
    }

    private final void b() {
        GasPriceReportActivity gasPriceReportActivity = this.f33699c;
        if (gasPriceReportActivity.p == gasPriceReportActivity.v.length - 1) {
            gasPriceReportActivity.P();
        } else {
            gasPriceReportActivity.Q(gasPriceReportActivity.p + 1);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        WazeEditText wazeEditText = this.f33697a;
        wazeEditText.removeTextChangedListener(this);
        int selectionStart = (wazeEditText.getSelectionStart() + this.f33698b.length()) - wazeEditText.getText().length();
        wazeEditText.setText(this.f33698b);
        wazeEditText.setSelection(selectionStart);
        wazeEditText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f33698b = charSequence.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d9  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.bk.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
