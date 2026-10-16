package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@evo(a = "activity")
/* loaded from: classes.dex */
public class ety extends evp<etx> {
    private final Context b;
    private final Activity c;

    public ety(Context context) {
        Object next;
        this.b = context;
        Iterator itA = afrg.f(context, new dmw(11)).a();
        while (true) {
            if (!itA.hasNext()) {
                next = null;
                break;
            } else {
                next = itA.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) next;
    }

    @Override // defpackage.evp
    public final /* synthetic */ euz a() {
        return new etx(this);
    }

    @Override // defpackage.evp
    public final boolean b() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.evp
    public final /* bridge */ /* synthetic */ euz c(euz euzVar, Bundle bundle, eve eveVar) throws Resources.NotFoundException {
        Intent intent;
        int intExtra;
        String strEncode;
        etx etxVar = (etx) euzVar;
        Intent intent2 = etxVar.a;
        if (intent2 == null) {
            throw new IllegalStateException("Destination " + etxVar.c() + " does not have an Intent set.");
        }
        Intent intent3 = new Intent(intent2);
        if (bundle != null) {
            intent3.putExtras(bundle);
            String str = etxVar.b;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!fbb.f(bundle, strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    euo euoVar = (euo) etxVar.i().get(strGroup);
                    evm evmVar = euoVar != null ? euoVar.a : null;
                    if (evmVar == null || (strEncode = evmVar.h(evmVar.b(bundle, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(bundle.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.c;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (eveVar != null && eveVar.a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", etxVar.c());
        Context context = this.b;
        Resources resources = context.getResources();
        if (eveVar != null) {
            int i = eveVar.h;
            int i2 = eveVar.i;
            if ((i <= 0 || !affa.f(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !affa.f(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + etxVar);
            }
        }
        context.startActivity(intent3);
        if (eveVar != null && activity != null) {
            int i3 = eveVar.f;
            int i4 = eveVar.g;
            if ((i3 > 0 && affa.f(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && affa.f(resources.getResourceTypeName(i4), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + etxVar);
            } else if (i3 >= 0 || i4 >= 0) {
                activity.overridePendingTransition(afpt.e(i3, 0), afpt.e(i4, 0));
            }
        }
        return null;
    }
}
