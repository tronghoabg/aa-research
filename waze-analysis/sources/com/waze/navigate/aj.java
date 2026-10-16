package com.waze.navigate;

import com.waze.view.text.InstantAutoComplete;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class aj implements com.waze.view.text.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutocompleteSearchActivity f30992a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30993b;

    public /* synthetic */ aj(AutocompleteSearchActivity autocompleteSearchActivity, int i2) {
        this.f30993b = i2;
        this.f30992a = autocompleteSearchActivity;
    }

    @Override // com.waze.view.text.b
    public final void a(boolean z) {
        int i2 = this.f30993b;
        AutocompleteSearchActivity autocompleteSearchActivity = this.f30992a;
        if (i2 == 0) {
            if (z) {
                autocompleteSearchActivity.f30919f.b();
                return;
            } else {
                autocompleteSearchActivity.f30919f.a();
                return;
            }
        }
        InstantAutoComplete instantAutoComplete = autocompleteSearchActivity.f30919f;
        if (z) {
            instantAutoComplete.b();
        } else {
            instantAutoComplete.a();
        }
    }
}
