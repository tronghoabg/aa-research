package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.evu(a = "activity")
public class eue extends defpackage.evv<eud> {
    private final android.content.Context b;
    private final android.app.Activity c;

    public eue(android.content.Context context) {
        java.lang.Object next;
        this.b = context;
        java.util.Iterator itA = afsg.f(context, new dne(10)).a();
        while (itA.hasNext()) {
            next = itA.next();
            if (((android.content.Context) next) instanceof android.app.Activity) {
                this.c = (android.app.Activity) next;
            }
        }
        next = null;
        this.c = (android.app.Activity) next;
    }

    @Override // defpackage.evv
    public final /* synthetic */ defpackage.evf a() {
        return new eud(this);
    }

    @Override // defpackage.evv
    public final boolean b() {
        android.app.Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.evv
    public final /* bridge */ /* synthetic */ defpackage.evf c(defpackage.evf evfVar, android.os.Bundle bundle, defpackage.evk evkVar) {
        android.content.Intent intent;
        int intExtra;
        java.lang.String strEncode;
        eud eudVar = (eud) evfVar;
        android.content.Intent intent2 = eudVar.a;
        if (intent2 == null) {
            throw new java.lang.IllegalStateException("Destination " + eudVar.c() + " does not have an Intent set.");
        }
        android.content.Intent intent3 = new android.content.Intent(intent2);
        if (bundle != null) {
            intent3.putExtras(bundle);
            java.lang.String str = eudVar.b;
            if (str != null && str.length() != 0) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    java.lang.String strGroup = matcher.group(1);
                    strGroup.getClass();
                    if (!defpackage.fbh.f(bundle, strGroup)) {
                        throw new java.lang.IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    defpackage.euu euuVar = (defpackage.euu) eudVar.i().get(strGroup);
                    defpackage.evs evsVar = euuVar != null ? euuVar.a : null;
                    if (evsVar == null || (strEncode = evsVar.h(evsVar.b(bundle, strGroup))) == null) {
                        strEncode = android.net.Uri.encode(java.lang.String.valueOf(bundle.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent3.setData(android.net.Uri.parse(stringBuffer.toString()));
            }
        }
        android.app.Activity activity = this.c;
        if (activity == null) {
            intent3.addFlags(268435456);
        }
        if (evkVar != null && evkVar.a) {
            intent3.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent3.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent3.putExtra("android-support-navigation:ActivityNavigator:current", eudVar.c());
        android.content.Context context = this.b;
        android.content.res.Resources resources = context.getResources();
        if (evkVar != null) {
            int i = evkVar.h;
            int i2 = evkVar.i;
            if ((i <= 0 || !defpackage.afga.f(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !defpackage.afga.f(resources.getResourceTypeName(i2), "animator"))) {
                intent3.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent3.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2).getClass();
            } else {
                android.util.Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i2) + " when launching " + eudVar);
            }
        }
        context.startActivity(intent3);
        if (evkVar != null && activity != null) {
            int i3 = evkVar.f;
            int i4 = evkVar.g;
            if ((i3 > 0 && defpackage.afga.f(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && defpackage.afga.f(resources.getResourceTypeName(i4), "animator"))) {
                android.util.Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i3) + " and exit resource " + resources.getResourceName(i4) + "when launching " + eudVar);
            } else if (i3 >= 0 || i4 >= 0) {
                activity.overridePendingTransition(defpackage.afqt.e(i3, 0), defpackage.afqt.e(i4, 0));
            }
        }
        return null;
    }
}
