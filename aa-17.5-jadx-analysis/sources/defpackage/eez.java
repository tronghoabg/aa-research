package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class eez {
    public final Object a;
    public Object b;
    public Object c;
    private final Object d;

    public eez(ehj ehjVar, afco afcoVar) {
        afcoVar.getClass();
        this.d = ehjVar;
        this.a = afcoVar;
        this.b = new eho();
        this.c = afbe.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ehj, java.lang.Object] */
    public final efa a() {
        ?? r0 = this.b;
        ?? r1 = this.c;
        r1.getClass();
        return new egd(this.d, woy.bg(new eeu((List) r1, (afck) null, 0)), r0, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final void b(List list) {
        this.c = woy.bY(this.c, list);
    }

    public final rz c() {
        Object obj = this.d;
        Intent intent = (Intent) obj;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(((sf) this.a).b().a());
        Object obj2 = this.c;
        if (obj2 != null) {
            intent.putExtras((Bundle) obj2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.b).setShareIdentityEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            if (this.b == null) {
                this.b = ActivityOptions.makeBasic();
            }
            ((ActivityOptions) this.b).setAllowPassThroughOnTouchOutside(!intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        Object obj3 = this.b;
        return new rz(obj, obj3 != null ? ((ActivityOptions) obj3).toBundle() : null);
    }

    public eez() {
        this.d = new Intent("android.intent.action.VIEW");
        this.a = new sf((byte[]) null);
    }
}
