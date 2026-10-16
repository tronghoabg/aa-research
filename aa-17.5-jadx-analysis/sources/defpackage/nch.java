package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.suggestion.model.Suggestion;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.GhPendingIntentReceiver;
import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final /* synthetic */ class nch implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ nch(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        PendingIntent pendingIntent;
        nua nuaVar;
        String str;
        String str2;
        String str3;
        GhIcon ghIcon;
        GhIcon ghIcon2;
        nul nulVar;
        int i = 0;
        switch (this.a) {
            case 0:
                nci nciVar = ncj.a;
                eqj eqjVarA = mad.e().a((ComponentName) obj);
                eqjVarA.getClass();
                return eqjVarA;
            case 1:
                return new ncp();
            case 2:
                return Boolean.valueOf(((ncx) obj) instanceof ncv);
            case 3:
                ncg ncgVar = (ncg) obj;
                ncgVar.getClass();
                return afrg.j(new airy(afrg.q(woy.cm(ncgVar.b), new nch(4))));
            case 4:
                mjv mjvVar = (mjv) obj;
                mjvVar.getClass();
                if (mjvVar instanceof ncf) {
                    moe moeVar = ((ncf) mjvVar).a;
                    Context context = mki.a.c;
                    context.getClass();
                    Suggestion suggestion = moeVar.a;
                    CarIcon icon = suggestion.getIcon();
                    ComponentName componentName = moeVar.b;
                    GhIcon ghIconM = icon != null ? GhIcon.m(icon, componentName) : GhIcon.p(context, R.drawable.navsuggestion_icon);
                    String string = suggestion.getTitle().toString();
                    string.getClass();
                    String strValueOf = String.valueOf(suggestion.getSubtitle());
                    PendingIntent pendingIntentB = jul.b(context, componentName.getPackageName(), suggestion.getAction());
                    pendingIntentB.getClass();
                    return new ncd(ghIconM, string, strValueOf, 0, pendingIntentB);
                }
                if (!(mjvVar instanceof nce)) {
                    throw new aezs();
                }
                NavigationSuggestion navigationSuggestion = ((nce) mjvVar).a;
                CharSequence charSequence = navigationSuggestion.b;
                if (charSequence == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intent intent = navigationSuggestion.a;
                if (intent == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Context context2 = mki.a.c;
                context2.getClass();
                IconCompat iconCompat = navigationSuggestion.d;
                GhIcon ghIconK = iconCompat != null ? GhIcon.k(dtj.b(iconCompat, context2)) : GhIcon.p(context2, R.drawable.navsuggestion_icon);
                CharSequence charSequence2 = navigationSuggestion.c;
                int iAA = a.aA(navigationSuggestion.e);
                if (iAA != 0) {
                    if (iAA == 1) {
                        i = leh.a.a().b() ? R.color.material_nav_suggestion_green : R.color.navsuggestion_green;
                    } else if (iAA == 2) {
                        i = leh.a.a().b() ? R.color.material_nav_suggestion_yellow : R.color.navsuggestion_yellow;
                    } else if (iAA == 3) {
                        i = leh.a.a().b() ? R.color.material_nav_suggestion_red : R.color.navsuggestion_red;
                    }
                }
                int i2 = i;
                PendingIntent pendingIntentC = GhPendingIntentReceiver.c(intent, context2);
                pendingIntentC.getClass();
                return new ncd(ghIconK, charSequence, charSequence2, i2, pendingIntentC);
            case 5:
                ((Float) obj).floatValue();
                aezr aezrVar = ndj.a;
                return afak.a;
            case 6:
                nur nurVar = (nur) obj;
                int i3 = ndp.q;
                nurVar.getClass();
                nub nubVar = nurVar.u;
                return (nubVar == null || (pendingIntent = nubVar.h) == null) ? nurVar.c : pendingIntent;
            case 7:
                nuh nuhVar = (nuh) obj;
                int i4 = ndp.q;
                nuhVar.getClass();
                return nuhVar.c;
            case 8:
                nur nurVar2 = (nur) obj;
                int i5 = ndp.q;
                nurVar2.getClass();
                return Integer.valueOf(nurVar2.E);
            case 9:
                nur nurVar3 = (nur) obj;
                int i6 = ndp.q;
                nurVar3.getClass();
                nub nubVar2 = nurVar3.u;
                return (nubVar2 == null || (nuaVar = nubVar2.f) == null) ? nurVar3.j ? nua.b : nua.a : nuaVar;
            case 10:
                nur nurVar4 = (nur) obj;
                int i7 = ndp.q;
                nurVar4.getClass();
                return Long.valueOf(nurVar4.i);
            case 11:
                nur nurVar5 = (nur) obj;
                int i8 = ndp.q;
                nurVar5.getClass();
                nub nubVar3 = nurVar5.u;
                if (nubVar3 != null && (str = nubVar3.d) != null) {
                    return str;
                }
                CharSequence charSequence3 = nurVar5.n;
                charSequence3.getClass();
                CharSequence charSequence4 = true != afyh.v(charSequence3) ? charSequence3 : null;
                if (charSequence4 != null) {
                    return charSequence4;
                }
                CharSequence charSequence5 = nurVar5.o;
                charSequence5.getClass();
                return charSequence5;
            case 12:
                int i9 = ndp.q;
                ((nur) obj).getClass();
                return Boolean.valueOf(!r10.l);
            case 13:
                nur nurVar6 = (nur) obj;
                int i10 = ndp.q;
                nurVar6.getClass();
                nub nubVar4 = nurVar6.u;
                return (nubVar4 == null || (str2 = nubVar4.i) == null) ? nurVar6.f : str2;
            case 14:
                nur nurVar7 = (nur) obj;
                int i11 = ndp.q;
                nurVar7.getClass();
                nub nubVar5 = nurVar7.u;
                return (nubVar5 == null || (str3 = nubVar5.c) == null) ? nurVar7.m : str3;
            case 15:
                nur nurVar8 = (nur) obj;
                int i12 = ndp.q;
                nurVar8.getClass();
                nub nubVar6 = nurVar8.u;
                return (nubVar6 == null || (ghIcon = nubVar6.a) == null) ? nurVar8.d : ghIcon;
            case 16:
                nur nurVar9 = (nur) obj;
                int i13 = ndp.q;
                nurVar9.getClass();
                Parcelable parcelable = nurVar9.F.getParcelable("car_app_call_background_image_uri");
                if (parcelable instanceof Uri) {
                    return (Uri) parcelable;
                }
                return null;
            case 17:
                Uri uri = (Uri) obj;
                int i14 = ndp.q;
                uri.getClass();
                Context context3 = mki.a.c;
                context3.getClass();
                return mlq.h(context3, uri, null, null, false);
            case 18:
                nur nurVar10 = (nur) obj;
                int i15 = ndp.q;
                nurVar10.getClass();
                return nurVar10.e;
            case 19:
                nur nurVar11 = (nur) obj;
                int i16 = ndp.q;
                nurVar11.getClass();
                nub nubVar7 = nurVar11.u;
                return (nubVar7 == null || (ghIcon2 = nubVar7.b) == null) ? nurVar11.b : ghIcon2;
            default:
                nur nurVar12 = (nur) obj;
                int i17 = ndp.q;
                nurVar12.getClass();
                if (ogb.a.c()) {
                    nub nubVar8 = nurVar12.u;
                    return nubVar8 != null ? nubVar8.e : nurVar12.p;
                }
                nub nubVar9 = nurVar12.u;
                return (nubVar9 == null || (nulVar = nubVar9.e) == null) ? nurVar12.p : nulVar;
        }
    }
}
