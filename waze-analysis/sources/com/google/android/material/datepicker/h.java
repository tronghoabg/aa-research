package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.waze.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class h extends com.google.android.material.internal.m {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f6466a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6467b;

    /* renamed from: c, reason: collision with root package name */
    private final DateFormat f6468c;

    /* renamed from: d, reason: collision with root package name */
    private final c f6469d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6470e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f6471f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f6472g;

    /* renamed from: h, reason: collision with root package name */
    private int f6473h = 0;

    h(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, c cVar) {
        this.f6467b = str;
        this.f6468c = dateFormat;
        this.f6466a = textInputLayout;
        this.f6469d = cVar;
        this.f6470e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f6471f = new Runnable() { // from class: com.google.android.material.datepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                h.b(this.f6462a, str);
            }
        };
    }

    public static /* synthetic */ void a(h hVar, long j2) {
        hVar.f6466a.w(String.format(hVar.f6470e, e(aw.a(j2))));
        hVar.c();
    }

    public static /* synthetic */ void b(h hVar, String str) {
        TextInputLayout textInputLayout = hVar.f6466a;
        Context context = textInputLayout.getContext();
        textInputLayout.w(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), e(str)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), e(hVar.f6468c.format(new Date(ax.j().getTimeInMillis())))));
        hVar.c();
    }

    private static final String e(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f6467b;
        if (length >= str.length() || editable.length() < this.f6473h) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f6473h = charSequence.length();
    }

    void c() {
        throw null;
    }

    abstract void d(Long l2);

    @Override // com.google.android.material.internal.m, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) throws ParseException {
        TextInputLayout textInputLayout = this.f6466a;
        textInputLayout.removeCallbacks(this.f6471f);
        textInputLayout.removeCallbacks(this.f6472g);
        textInputLayout.w(null);
        d(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f6467b.length()) {
            return;
        }
        try {
            Date date = this.f6468c.parse(charSequence.toString());
            textInputLayout.w(null);
            final long time = date.getTime();
            c cVar = this.f6469d;
            if (cVar.f().a(time) && cVar.o(time)) {
                d(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.google.android.material.datepicker.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.a(this.f6464a, time);
                }
            };
            this.f6472g = runnable;
            textInputLayout.post(runnable);
        } catch (ParseException unused) {
            this.f6466a.post(this.f6471f);
        }
    }
}
