package com.waze.ifs.ui;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f24547a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24548b;

    f(EditBoxFadeBg editBoxFadeBg, int i2) {
        this.f24548b = i2;
        Objects.requireNonNull(editBoxFadeBg);
        this.f24547a = editBoxFadeBg;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f24548b == 0 && editable.length() > ((h) this.f24547a).f24560l) {
            editable.delete(300, editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = this.f24548b;
        if (i5 != 0) {
            Object obj = this.f24547a;
            if (i5 == 1) {
                ((EditBoxFadeBg) obj).setGravity(19);
                return;
            }
            w wVar = (w) obj;
            if (!(wVar.r instanceof p)) {
                if (wVar.r instanceof r) {
                    new q((r) wVar.r).filter(charSequence);
                    return;
                } else {
                    if (wVar.m) {
                        new o(wVar.s).filter(charSequence);
                        return;
                    }
                    return;
                }
            }
            String strTrim = charSequence.toString().trim();
            if (wVar.f24588d) {
                wVar.t.f37350c = String.format(wVar.f24589e, strTrim);
                wVar.t.f37349b = strTrim;
                boolean z = strTrim.length() >= 2;
                wVar.r.f(z);
                wVar.r.e(z);
            } else {
                wVar.r.f(true);
                wVar.r.e(false);
            }
            new o((p) wVar.r).filter(strTrim);
        }
    }

    f(h hVar, int i2) {
        this.f24548b = i2;
        Objects.requireNonNull(hVar);
        this.f24547a = hVar;
    }

    f(w wVar, int i2) {
        this.f24548b = i2;
        Objects.requireNonNull(wVar);
        this.f24547a = wVar;
    }
}
