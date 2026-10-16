package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class lng extends mot {
    public static final /* synthetic */ int a = 0;

    public lng() {
        super(mkn.f, "Media");
    }

    private static final ComponentName b(ComponentName componentName) {
        return !TextUtils.isEmpty(componentName.getClassName()) ? componentName : loh.a(kio.b().e(), componentName.getPackageName());
    }

    @Override // defpackage.mot
    protected final void c(Intent intent, qql qqlVar) {
        ComponentName component = intent.getComponent();
        component.getClass();
        ComponentName componentNameB = b(component);
        componentNameB.getClass();
        mqb mqbVarB = mpl.b(componentNameB);
        mqbVarB.d(intent);
        g(intent);
        String strC = mqbVarB.c();
        yph yphVar = jsf.a;
        intent.putExtra("TemplateCarActivity.SESSION_ID", strC);
        intent.putExtra("GH.ComponentExtra", componentNameB);
        intent.setComponent(mkn.f);
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        ComponentName componentNameB;
        mqb mqbVarB = mqb.b(intent);
        if (mqbVarB == null || (componentNameB = b(mqbVarB.a)) == null) {
            return false;
        }
        if (TextUtils.isEmpty(componentNameB.getClassName())) {
            return true;
        }
        mqc mqcVarA = lem.a().a(kio.b().e(), new mqb(componentNameB));
        return mqcVarA != null && mqcVarA.b == mpz.d;
    }

    @Override // defpackage.mot
    public final mqb h() {
        ComponentName componentNameA = lnm.y().a();
        if (componentNameA == null) {
            return null;
        }
        return mpl.b(componentNameA);
    }
}
