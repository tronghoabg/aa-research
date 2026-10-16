package vc;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import t6.q;
import tc.j;
import uc.C4281r;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4337a {

    /* renamed from: a, reason: collision with root package name */
    public final q f47157a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f47158b;

    public C4337a(Context context, q qVar) {
        j jVar = new j(this);
        this.f47158b = context;
        this.f47157a = qVar;
        qVar.f45907b = jVar;
    }

    public static Locale a(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i5 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i5 = 2;
        }
        if (strArrSplit.length > i5 && strArrSplit[i5].length() >= 2 && strArrSplit[i5].length() <= 3) {
            str4 = strArrSplit[i5];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(locales.get(i5));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        q qVar = this.f47157a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((C4281r) qVar.f45906a).a("setLocale", arrayList2, null);
    }
}
