package com.waze.favorites;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f23824a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23825b;

    t(AddFavoriteActivity addFavoriteActivity, int i2) {
        this.f23825b = i2;
        Objects.requireNonNull(addFavoriteActivity);
        this.f23824a = addFavoriteActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.f23825b == 0) {
            ((v) this.f23824a).f23830a.setEnabled(!TextUtils.isEmpty(charSequence.toString().trim()));
            return;
        }
        int length = charSequence.length();
        Object obj = this.f23824a;
        if (length == 0) {
            ((AddFavoriteActivity) obj).f23777f.setTextSize(1, 14.0f);
        } else {
            ((AddFavoriteActivity) obj).f23777f.setTextSize(1, 16.0f);
        }
    }

    t(v vVar, int i2) {
        this.f23825b = i2;
        Objects.requireNonNull(vVar);
        this.f23824a = vVar;
    }
}
