package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.transcription.TranscriptionFragment;
import com.google.android.apps.auto.components.turncard.TurnCardFragment;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class jue implements eqn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jue(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, ocq] */
    @Override // defpackage.eqn
    public final void eS(Object obj) throws PackageManager.NameNotFoundException {
        qqi qqiVar;
        yfq yfqVarE;
        int i = 0;
        switch (this.c) {
            case 0:
                krz krzVar = (krz) obj;
                onc oncVar = ((juf) this.a).b;
                Context context = (Context) this.b;
                int iB = krr.w.b(context, krzVar);
                int iB2 = krr.n.b(context, krzVar);
                oncVar.e = iB;
                oncVar.c();
                FrameLayout frameLayout = oncVar.f;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(iB2);
                    break;
                }
                break;
            case 1:
                if (((krz) obj) != this.a && (qqiVar = ((qqh) this.b).e) != null) {
                    ((rnw) qqiVar).r();
                    break;
                }
                break;
            case 2:
                Object obj2 = this.b;
                int iB3 = krr.w.b(((Fragment) obj2).requireContext(), (krz) obj);
                juk jukVar = ((juf) obj2).k;
                jukVar.d = iB3;
                jukVar.c((ofe) this.a);
                break;
            case 3:
                boolean z = true;
                while (true) {
                    Object obj3 = this.a;
                    lpp lppVar = (lpp) obj3;
                    if (i >= lppVar.h.size()) {
                        if (z) {
                            ((eqj) obj3).m(lppVar.a.a(new ArrayList(lppVar.j)));
                            break;
                        }
                    } else {
                        if (lppVar.h.get(i) == this.b) {
                            lppVar.i[i] = true;
                            lppVar.j.set(i, obj);
                        }
                        z &= lppVar.i[i];
                        i++;
                    }
                }
                break;
            case 4:
                ComponentName componentName = (ComponentName) obj;
                Object obj4 = this.b;
                if (!Objects.equals(componentName, obj4)) {
                    Object obj5 = this.a;
                    ((ype) ((ype) lqu.a.f()).ai(4202)).M("Quitting autoplay triggering. Default app=%s, Autoplay target=%s", componentName, obj4);
                    ((lqu) obj5).b();
                    break;
                }
                break;
            case 5:
                ((eqj) this.a).m(new lra((ComponentName) this.b, (lmd) obj));
                break;
            case 6:
                List list = (List) obj;
                boolean zIsEmpty = list.isEmpty();
                Object obj6 = this.b;
                Object obj7 = this.a;
                if (!zIsEmpty) {
                    ((lvi) obj6).s(lwr.b(list, actj.b(), (int) actj.d()));
                    ((ype) lvo.a.l().ai((char) 4295)).y("Added Smart Actions: %s", obj6);
                    ((lvo) obj7).k((lvg) obj6);
                }
                ((lvo) obj7).e((lvg) obj6);
                break;
            case 7:
                String str = (String) obj;
                mqq.b().edit().putBoolean("IsOpaEnabled", str != null).commit();
                if (str == null) {
                    ((ype) mqq.a.l().ai((char) 5190)).u("No assistant languages. Assistant actions will not be shown in launcher.");
                    int i2 = yfq.d;
                    yfqVarE = yls.a;
                } else {
                    yfqVarE = mqq.e((qrn) this.a, true);
                }
                ((eqj) this.b).m(yfqVarE);
                break;
            case 8:
                obj.getClass();
                Object obj8 = this.a;
                niy niyVar = (niy) obj8;
                Integer num = (Integer) niyVar.a().e().e();
                int iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue == 2) {
                    niyVar.i = true;
                } else if (acxa.ay() && iIntValue == 1) {
                    iIntValue = 1;
                    niyVar.i = true;
                }
                if (niyVar.i) {
                    boolean zC = niyVar.a().q() ? lef.a.a().c() : lef.a.a().b();
                    if (zC && niyVar.N == null) {
                        Fragment fragment = (Fragment) obj8;
                        Fragment fragmentE = fragment.getChildFragmentManager().e(R.id.voice_plate);
                        if (fragmentE instanceof jvo) {
                            niyVar.N = (jvo) fragmentE;
                        } else {
                            niyVar.N = new jvo(false);
                            bt childFragmentManager = fragment.getChildFragmentManager();
                            childFragmentManager.getClass();
                            w wVar = new w(childFragmentManager);
                            jvo jvoVar = niyVar.N;
                            jvoVar.getClass();
                            wVar.q(R.id.voice_plate, jvoVar, null);
                            wVar.c();
                        }
                    }
                    View viewFindViewById = ((View) this.b).findViewById(R.id.voice_plate);
                    if (!zC || iIntValue != 2) {
                        viewFindViewById.setVisibility(8);
                        jvo jvoVar2 = niyVar.N;
                        if (jvoVar2 != null) {
                            jvoVar2.l(false);
                            break;
                        }
                    } else {
                        viewFindViewById.setVisibility(0);
                        jvo jvoVar3 = niyVar.N;
                        if (jvoVar3 != null) {
                            jvoVar3.l(true);
                            break;
                        }
                    }
                }
                break;
            case 9:
                krz krzVar2 = (krz) obj;
                TextView textView = (TextView) this.a;
                Drawable background = textView.getBackground();
                View view = (View) this.b;
                background.setTint(krr.e.b(view.getContext(), krzVar2));
                textView.setTextColor(krr.f.b(view.getContext(), krzVar2));
                break;
            case 10:
                int i3 = obw.b;
                ((wue) this.a).O(ColorStateList.valueOf(krr.a.b((Context) this.b, (krz) obj)));
                break;
            case 11:
                int i4 = occ.c;
                ((TextView) this.a).setTextColor(krr.b.b((Context) this.b, (krz) obj));
                break;
            case 12:
                if (((Integer) obj).intValue() == 2) {
                    ?? r10 = this.a;
                    if (((oci) r10).a) {
                        Object obj9 = this.b;
                        ((ype) ocq.h.l().ai((char) 5556)).u("Dismissing tooltip due to demand space opening");
                        ((oco) obj9).a(yzy.lP);
                        r10.a();
                        break;
                    }
                }
                break;
            case 13:
                krz krzVar3 = (krz) obj;
                View view2 = (View) this.b;
                View viewFindViewById2 = view2.findViewById(R.id.transcription_bubble);
                Drawable drawableMutate = viewFindViewById2.getBackground().mutate();
                drawableMutate.setColorFilter(krr.r.b(view2.getContext(), krzVar3), PorterDuff.Mode.SRC_IN);
                viewFindViewById2.setBackground(drawableMutate);
                int iB4 = krr.s.b(view2.getContext(), krzVar3);
                TranscriptionFragment transcriptionFragment = (TranscriptionFragment) this.a;
                transcriptionFragment.b.setColorFilter(iB4);
                transcriptionFragment.a.setTextColor(iB4);
                break;
            default:
                ((TurnCardFragment) this.a).b.setBackground(((GhIcon) obj).f(((View) this.b).getContext(), -1));
                break;
        }
    }

    public /* synthetic */ jue(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
