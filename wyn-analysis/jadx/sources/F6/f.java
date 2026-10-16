package F6;

import E5.K0;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import f6.Z;
import j$.util.Objects;
import j.C3067d;
import java.util.ArrayList;
import java.util.HashMap;
import l8.AbstractC3409K;
import o.AbstractC3620a;
import q.j1;
import s6.H;

/* loaded from: classes3.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3964b;

    public /* synthetic */ f(Object obj, int i5) {
        this.f3963a = i5;
        this.f3964b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f3963a) {
            case 0:
                l lVar = (l) this.f3964b;
                lVar.f3992w = 2;
                lVar.f3971a.finish();
                return;
            case 1:
                com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f3964b;
                int i5 = kVar.f26919e;
                if (i5 == 2) {
                    kVar.H(1);
                    return;
                } else {
                    if (i5 == 1) {
                        kVar.H(2);
                        return;
                    }
                    return;
                }
            case 2:
                com.google.android.material.datepicker.l lVar2 = (com.google.android.material.datepicker.l) this.f3964b;
                Button button = lVar2.f26931F;
                lVar2.H();
                throw null;
            case 3:
                C3067d c3067d = (C3067d) this.f3964b;
                Message messageObtain = (view != c3067d.f38438h || (message3 = c3067d.f38440j) == null) ? (view != c3067d.k || (message2 = c3067d.f38442m) == null) ? (view != c3067d.f38443n || (message = c3067d.f38445p) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c3067d.f38429D.obtainMessage(1, c3067d.f38432b).sendToTarget();
                return;
            case 4:
                ((AbstractC3620a) this.f3964b).a();
                return;
            case 5:
                j1 j1Var = ((Toolbar) this.f3964b).L;
                p.m mVar = j1Var == null ? null : j1Var.f43813b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f3964b;
                HashMap map = trackSelectionView.f26282g;
                boolean z2 = true;
                if (view == trackSelectionView.f26278c) {
                    trackSelectionView.f26286l = true;
                    map.clear();
                } else if (view == trackSelectionView.f26279d) {
                    trackSelectionView.f26286l = false;
                    map.clear();
                } else {
                    trackSelectionView.f26286l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    H h10 = (H) tag;
                    K0 k02 = h10.f45112a;
                    Z z10 = k02.f3130b;
                    r6.p pVar = (r6.p) map.get(z10);
                    int i10 = h10.f45113b;
                    if (pVar == null) {
                        if (!trackSelectionView.f26284i && map.size() > 0) {
                            map.clear();
                        }
                        map.put(z10, new r6.p(z10, AbstractC3409K.n(Integer.valueOf(i10))));
                    } else {
                        ArrayList arrayList = new ArrayList(pVar.f44467b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z11 = trackSelectionView.f26283h && k02.f3131c;
                        if (!z11 && (!trackSelectionView.f26284i || trackSelectionView.f26281f.size() <= 1)) {
                            z2 = false;
                        }
                        if (zIsChecked && z2) {
                            arrayList.remove(Integer.valueOf(i10));
                            if (arrayList.isEmpty()) {
                                map.remove(z10);
                            } else {
                                map.put(z10, new r6.p(z10, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z11) {
                                arrayList.add(Integer.valueOf(i10));
                                map.put(z10, new r6.p(z10, arrayList));
                            } else {
                                map.put(z10, new r6.p(z10, AbstractC3409K.n(Integer.valueOf(i10))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
        }
    }

    public f(l lVar) {
        this.f3963a = 0;
        Objects.requireNonNull(lVar);
        this.f3964b = lVar;
    }
}
