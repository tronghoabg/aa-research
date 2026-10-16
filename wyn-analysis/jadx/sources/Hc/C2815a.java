package hc;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CompoundButton;

/* renamed from: hc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2815a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2816b f36381b;

    public /* synthetic */ C2815a(C2816b c2816b, int i5) {
        this.f36380a = i5;
        this.f36381b = c2816b;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        switch (this.f36380a) {
            case 0:
                C2816b c2816b = this.f36381b;
                Context context = c2816b.f36382a;
                int i5 = c2816b.f36383b;
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("KillerManager", 0).edit();
                editorEdit.putBoolean("DONT_SHOW_AGAIN".concat(com.google.android.gms.internal.consent_sdk.a.j(i5)), z2);
                editorEdit.apply();
                break;
            default:
                C2816b c2816b2 = this.f36381b;
                Context context2 = c2816b2.f36382a;
                int i10 = c2816b2.f36383b;
                SharedPreferences.Editor editorEdit2 = context2.getSharedPreferences("KillerManager", 0).edit();
                editorEdit2.putBoolean("DONT_SHOW_AGAIN".concat(com.google.android.gms.internal.consent_sdk.a.j(i10)), z2);
                editorEdit2.apply();
                break;
        }
    }
}
