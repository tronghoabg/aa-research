package io.flutter.plugin.editing;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;
import kc.r;

/* loaded from: classes5.dex */
public final class c extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f37038a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, e eVar) {
        super(rVar, true);
        this.f37038a = eVar;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f37038a;
    }
}
