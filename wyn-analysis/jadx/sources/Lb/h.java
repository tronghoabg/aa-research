package Lb;

import E5.I;
import E5.w0;
import android.content.res.Resources;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2047h;
import com.vungle.ads.internal.ui.view.n;
import com.wynauto.wyn.R;
import f8.j;
import f8.u;
import ic.InterfaceC2864a;
import r6.C3930e;
import s6.C4022i;
import s6.o;
import s6.t;
import s6.y;
import u6.v;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7070b;

    public /* synthetic */ h(Object obj, int i5) {
        this.f7069a = i5;
        this.f7070b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        Object obj = this.f7070b;
        switch (this.f7069a) {
            case 0:
                n.a((n) obj, view);
                break;
            case 1:
                ((MaxNativeAd) obj).performClick();
                break;
            case 2:
                ((TTWebsiteActivity) obj).uef(view);
                break;
            case 3:
                S8.d dVar = (S8.d) obj;
                if (dVar != null) {
                    dVar.invoke();
                    break;
                }
                break;
            case 4:
                ((C2047h) obj).f30872a.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                break;
            case 5:
                f8.d dVar2 = (f8.d) obj;
                EditText editText = dVar2.f35129i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar2.q();
                    break;
                }
                break;
            case 6:
                ((j) obj).u();
                break;
            case 7:
                u uVar = (u) obj;
                EditText editText2 = uVar.f35225f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = uVar.f35225f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        uVar.f35225f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        uVar.f35225f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        uVar.f35225f.setSelection(selectionEnd);
                    }
                    uVar.q();
                    break;
                }
                break;
            case 8:
                InterfaceC2864a interfaceC2864a = (InterfaceC2864a) obj;
                if (interfaceC2864a != null) {
                    interfaceC2864a.a();
                    break;
                }
                break;
            case 9:
                ((ic.b) obj).b();
                break;
            case 10:
                t.a((t) obj);
                break;
            case 11:
                t tVar = ((C4022i) obj).f45184l;
                w0 w0Var = tVar.f45241h0;
                if (w0Var != null) {
                    r6.f fVarV0 = ((I) w0Var).v0();
                    w0 w0Var2 = tVar.f45241h0;
                    int i5 = v.f46721a;
                    fVarV0.getClass();
                    C3930e c3930e = new C3930e(fVarV0);
                    c3930e.a(1);
                    c3930e.e(1);
                    ((I) w0Var2).K0(new r6.f(c3930e));
                    tVar.f45236f.f45196j[1] = tVar.getResources().getString(R.string.exo_track_selection_auto);
                    tVar.k.dismiss();
                    break;
                }
                break;
            case 12:
                o oVar = (o) obj;
                int adapterPosition = oVar.getAdapterPosition();
                t tVar2 = oVar.f45194f;
                View view2 = tVar2.f45272z;
                if (adapterPosition != 0) {
                    if (adapterPosition != 1) {
                        tVar2.k.dismiss();
                        break;
                    } else {
                        view2.getClass();
                        tVar2.d(tVar2.f45242i, view2);
                        break;
                    }
                } else {
                    view2.getClass();
                    tVar2.d(tVar2.f45238g, view2);
                    break;
                }
            case 13:
                t tVar3 = ((C4022i) obj).f45184l;
                w0 w0Var3 = tVar3.f45241h0;
                if (w0Var3 != null) {
                    r6.f fVarV02 = ((I) w0Var3).v0();
                    w0 w0Var4 = tVar3.f45241h0;
                    fVarV02.getClass();
                    C3930e c3930e2 = new C3930e(fVarV02);
                    c3930e2.a(3);
                    c3930e2.f44487u = -3;
                    ((I) w0Var4).K0(new r6.f(c3930e2));
                    tVar3.k.dismiss();
                    break;
                }
                break;
            default:
                y yVar = (y) obj;
                yVar.g();
                if (view.getId() != R.id.exo_overflow_show) {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        yVar.f45301r.start();
                        break;
                    }
                } else {
                    yVar.f45300q.start();
                    break;
                }
                break;
        }
    }
}
