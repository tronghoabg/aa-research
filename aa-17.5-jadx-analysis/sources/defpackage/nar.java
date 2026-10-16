package defpackage;

import android.content.res.ColorStateList;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class nar implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nar(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException {
        int i = this.b;
        int i2 = 7;
        int i3 = R.drawable.boardwalk_ic_mic_off;
        int i4 = 2;
        int i5 = 8;
        int i6 = 4;
        int i7 = 5;
        Object obj2 = null;
        switch (i) {
            case 0:
                yph yphVar = nbb.a;
                Object obj3 = this.a;
                obj3.getClass();
                ((View) obj3).setVisibility(true == ((Boolean) obj).booleanValue() ? 8 : 0);
                return afak.a;
            case 1:
                nok nokVar = (nok) obj;
                nokVar.getClass();
                nag nagVar = new nag(i7);
                naq naqVar = (naq) this.a;
                nokVar.a(tby.v(naqVar.e, nagVar), nap.b);
                nokVar.a(tby.x(naqVar.f), nap.a);
                return new eqm(nap.c);
            case 2:
                Integer num = (Integer) obj;
                yph yphVar2 = nbb.a;
                num.getClass();
                ((CoolwalkCardView) this.a).f.b(ColorStateList.valueOf(num.intValue()));
                return afak.a;
            case 3:
                naw nawVar = (naw) obj;
                Object obj4 = this.a;
                nbb nbbVar = (nbb) obj4;
                aivh aivhVar = nbbVar.d;
                if (aivhVar != null) {
                    aivhVar.s(null);
                }
                Fragment fragment = (Fragment) obj4;
                Fragment fragmentE = fragment.getChildFragmentManager().e(R.id.media_player);
                if (nawVar == naw.d) {
                    nbbVar.d = ahnc.d(dty.f(fragment.getViewLifecycleOwner()), null, 0, new bqi(nbbVar, nawVar, fragmentE, null, 13, null), 3);
                } else {
                    nawVar.getClass();
                    nbbVar.f(nawVar, fragmentE);
                }
                return afak.a;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    Object obj5 = this.a;
                    nbb nbbVar2 = (nbb) obj5;
                    aivh aivhVar2 = nbbVar2.d;
                    if (aivhVar2 != null) {
                        aivhVar2.s(null);
                    }
                    nbbVar2.d = ahnc.d(dty.f(((Fragment) obj5).getViewLifecycleOwner()), null, 0, new nba(nbbVar2, (afck) null, 1, (byte[]) null), 3);
                }
                return afak.a;
            case 5:
                yfq yfqVar = (yfq) obj;
                yfqVar.getClass();
                Iterator<E> it = yfqVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj6 = this.a;
                        Object next = it.next();
                        if (affa.f(((nuh) next).d, ((ndp) obj6).a)) {
                            obj2 = next;
                        }
                    }
                }
                return (nuh) obj2;
            case 6:
                PhoneCall phoneCall = (PhoneCall) obj;
                phoneCall.getClass();
                nea neaVar = (nea) this.a;
                if (true == neaVar.e) {
                    i3 = R.drawable.gs_mic_off_wght500fill1rond100_vd_theme_24;
                }
                return new ndy(GhIcon.p(neaVar.c, i3), new ndx(muo.n), true, new nav(phoneCall, i2));
            case 7:
                PhoneCall phoneCall2 = (PhoneCall) obj;
                phoneCall2.getClass();
                return dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxb(phoneCall2, (nea) this.a, (afck) null, 5));
            case 8:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                nea neaVar2 = (nea) this.a;
                return zBooleanValue ? neaVar2.l : neaVar2.k;
            case 9:
                odm odmVar = (odm) obj;
                odmVar.getClass();
                int iOrdinal = odmVar.ordinal();
                Object obj7 = this.a;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return ((nea) obj7).i;
                    }
                    if (iOrdinal != 4) {
                        return tby.b;
                    }
                }
                return tby.B(((nea) obj7).g, new nar(obj7, i5));
            case 10:
                odm odmVar2 = (odm) obj;
                odmVar2.getClass();
                boolean zContains = nea.b.contains(odmVar2);
                Object obj8 = this.a;
                if (!zContains) {
                    int iOrdinal2 = odmVar2.ordinal();
                    if (iOrdinal2 != 1 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                        if (iOrdinal2 != 5) {
                            if (iOrdinal2 != 7) {
                                if (iOrdinal2 != 8) {
                                    Objects.toString(odmVar2);
                                    throw new IllegalStateException("Unknown state: ".concat(odmVar2.toString()));
                                }
                            }
                        }
                    }
                    return ((nea) obj8).j;
                }
                return tby.v(((nea) obj8).j, new ndo(i4));
            case 11:
                PhoneCall phoneCall3 = (PhoneCall) obj;
                phoneCall3.getClass();
                nea neaVar3 = (nea) this.a;
                return new ndy(GhIcon.p(neaVar3.c, true != neaVar3.e ? R.drawable.ic_call : R.drawable.gs_call_wght500fill1rond100_vd_theme_24), new ndx(muo.l), true, new nav(phoneCall3, i6));
            case 12:
                PhoneCall phoneCall4 = (PhoneCall) obj;
                phoneCall4.getClass();
                nea neaVar4 = (nea) this.a;
                return new ndy(GhIcon.p(neaVar4.c, true != neaVar4.e ? R.drawable.gs_call_end_vd_theme_24 : R.drawable.gs_call_end_wght500fill1rond100_vd_theme_24), new ndx(muo.m), true, new nav(phoneCall4, 6));
            case 13:
                PhoneCall phoneCall5 = (PhoneCall) obj;
                phoneCall5.getClass();
                nea neaVar5 = (nea) this.a;
                if (true == neaVar5.e) {
                    i3 = R.drawable.gs_mic_off_wght500fill1rond100_vd_theme_24;
                }
                return new ndy(GhIcon.p(neaVar5.c, i3), null, true, new nav(phoneCall5, i7));
            case 14:
                nlz nlzVar = (nlz) obj;
                nlzVar.getClass();
                nok nokVarC = ((nhr) this.a).c(nlzVar);
                if (nokVarC != null) {
                    return nokVarC;
                }
                throw new IllegalStateException("Required value was null.");
            case 15:
                return nih.h(this.a, (cis) obj);
            case 16:
                return nih.h(this.a, (cis) obj);
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                yph yphVar3 = nih.a;
                this.a.invoke(bool);
                return afak.a;
            case 18:
                cis cisVar = (cis) obj;
                yph yphVar4 = nih.a;
                cisVar.getClass();
                if (cisVar.b()) {
                    ?? r0 = this.a;
                    nih.a.l().u("AssistantButton focused");
                    r0.b(nii.c);
                }
                return afak.a;
            case 19:
                cis cisVar2 = (cis) obj;
                yph yphVar5 = nih.a;
                cisVar2.getClass();
                if (cisVar2.b()) {
                    ?? r02 = this.a;
                    nih.a.l().u("HomeButton focused");
                    r02.b(nii.b);
                }
                return afak.a;
            default:
                cie cieVar = (cie) obj;
                yph yphVar6 = nih.a;
                cieVar.getClass();
                cieVar.e((cil) this.a);
                return afak.a;
        }
    }
}
