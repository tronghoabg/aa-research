package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kzd {
    public static final ColorStateList a(AttributeSet attributeSet, Context context, int[] iArr, int i) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static int b(Uri uri, kzw kzwVar, Context context) {
        String strC = c(uri);
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        woy.V(size >= 2, "Uri %s has %s path segments, expected at least 2", uri, pathSegments.size());
        try {
            int iA = kzwVar.a(context.getPackageManager().getResourcesForApplication(strC), pathSegments.get(1), pathSegments.get(0), strC);
            woy.S(iA != 0, "Couldn't find the resource ID for URI %s", uri);
            return iA;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException("Resources not found for ".concat(strC), e);
        }
    }

    public static String c(Uri uri) {
        String authority = uri.getAuthority();
        authority.getClass();
        return authority;
    }

    @ResultIgnorabilityUnspecified
    public static rzj d(rzj rzjVar, osb osbVar) {
        return rzjVar.f("AssistantSuggestionSignal", new kzu(rzjVar, osbVar, 1));
    }

    public static String e(ory oryVar) {
        return String.format(Locale.US, "Action {id=%s, dismiss_on_tap=%b}", oryVar.c, Boolean.valueOf(oryVar.d));
    }

    public static String f(osc oscVar) {
        return String.format(Locale.US, "%s/%s", oscVar.c, oscVar.d);
    }

    public static String g(String str) {
        return String.format(Locale.US, "'%s'", str);
    }

    public static void h(rzj rzjVar, osd osdVar) {
        rzjVar.f("Icon", new kyv(rzjVar, (abnv) osdVar, 13));
    }

    public static void i(rzj rzjVar, osk oskVar) {
        rzjVar.f("RowRenderingMetadata", new kyv(rzjVar, (abnv) oskVar, 19));
    }

    public static lbm j() {
        return (lbm) mki.a.i(lbm.class);
    }

    public static lbl k() {
        return (lbl) mki.a.i(lbl.class);
    }

    public static int l(Intent intent) {
        if (map.a.contains(intent.getPackage())) {
            return 2;
        }
        if (jrj.d(intent)) {
            return 3;
        }
        if (jrj.e(intent)) {
            return 5;
        }
        return (intent == null || !"android.intent.action.CALL".equals(intent.getAction())) ? 1 : 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence m(Context context, osk oskVar) {
        List listG;
        gjm gjmVar = new gjm(context, 15);
        if (oskVar.d) {
            listG = oskVar.b;
        } else {
            int i = yfq.d;
            yfl yflVar = new yfl(4);
            yflVar.i("");
            yflVar.k(oskVar.b);
            listG = yflVar.g();
        }
        aboh abohVar = oskVar.c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        int length = 0;
        while (i2 < Math.max(listG.size(), abohVar.size())) {
            String str = i2 < listG.size() ? (String) listG.get(i2) : "";
            spannableStringBuilder.append((CharSequence) str);
            length += str.length();
            if (i2 < abohVar.size()) {
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.setSpan(gjmVar.apply((osd) abohVar.get(i2)), length, length + 1, 0);
                length += 2;
            }
            i2++;
        }
        return spannableStringBuilder;
    }
}
