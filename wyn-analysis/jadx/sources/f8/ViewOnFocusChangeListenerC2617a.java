package f8;

import android.view.View;

/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC2617a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f35120b;

    public /* synthetic */ ViewOnFocusChangeListenerC2617a(n nVar, int i5) {
        this.f35119a = i5;
        this.f35120b = nVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f35119a) {
            case 0:
                d dVar = (d) this.f35120b;
                dVar.t(dVar.u());
                break;
            default:
                j jVar = (j) this.f35120b;
                jVar.f35146l = z2;
                jVar.q();
                if (!z2) {
                    jVar.t(false);
                    jVar.f35147m = false;
                    break;
                }
                break;
        }
    }
}
