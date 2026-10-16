package com.waze.uid.c;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f44364a;

    h(i iVar) {
        this.f44364a = iVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (charSequence != null) {
            i iVar = this.f44364a;
            if (charSequence.length() == iVar.f44366b) {
                iVar.j(new com.waze.uid.state_impl.email.b(charSequence.toString()));
            }
        }
    }
}
