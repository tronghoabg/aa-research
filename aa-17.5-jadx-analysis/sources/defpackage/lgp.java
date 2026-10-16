package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.google.android.libraries.handwriting.base.OnDeviceSpecUtils;
import com.google.android.libraries.handwriting.base.Util;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lgp {
    public static final yph a = yph.c("GH.Language");
    public static final Locale b = Locale.ENGLISH;
    private static final ygr e = ygr.t("de", "en", "es", "fr", "he", "ko", "it", "ja", "pt", "ru", "zh", "iw");
    public final Context c;
    public List d;
    private int f;

    /* JADX WARN: Multi-variable type inference failed */
    public lgp(Context context) {
        this.c = context;
        ygp ygpVar = new ygp();
        ygp ygpVar2 = new ygp();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
        while (it.hasNext()) {
            for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                String languageTag = inputMethodSubtype.getLanguageTag();
                languageTag = TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale().replace('_', '-') : languageTag;
                if (!TextUtils.isEmpty(languageTag)) {
                    ygpVar2.c(Locale.forLanguageTag(languageTag));
                }
            }
        }
        ygpVar.k(ygpVar2.g());
        ygp ygpVar3 = new ygp();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            ygpVar3.c(localeList.get(i));
        }
        ygpVar.k(ygpVar3.g());
        ygpVar.c(j());
        ArrayList arrayList = new ArrayList();
        yno it2 = ygpVar.g().iterator();
        while (it2.hasNext()) {
            Locale locale = (Locale) it2.next();
            if (e.contains(locale.getLanguage())) {
                arrayList.add(locale);
            }
        }
        this.d = arrayList;
        String string = context.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).getString("current_language", j().toLanguageTag());
        int iIndexOf = this.d.indexOf(TextUtils.isEmpty(string) ? j() : Locale.forLanguageTag(string));
        this.f = iIndexOf;
        if (iIndexOf < 0) {
            int iIndexOf2 = this.d.indexOf(j());
            this.f = iIndexOf2;
            if (iIndexOf2 < 0) {
                this.f = 0;
            }
        }
    }

    public static lgp a() {
        return (lgp) mki.a.i(lgp.class);
    }

    static final Locale j() {
        Locale locale = Locale.getDefault();
        return e.contains(locale.getLanguage()) ? locale : b;
    }

    public final abww b(String str) {
        if (Build.VERSION.SDK_INT >= 35 && str.equals("he")) {
            str = "iw";
        }
        return OnDeviceSpecUtils.getSpecForLanguage(OnDeviceSpecUtils.readSubtypes(this.c.getResources().openRawResource(R.raw.recognizers), null), str);
    }

    public final String c() {
        return ((Locale) this.d.get(this.f)).getLanguage();
    }

    public final Locale d() {
        return (Locale) this.d.get(this.f);
    }

    public final void e() {
        this.f = (this.f + 1) % this.d.size();
        Locale localeD = d();
        ((ype) ((ype) a.f()).ai((char) 3903)).y("New keyboard language: %s", localeD);
        this.c.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).edit().putString("current_language", localeD.toLanguageTag()).apply();
    }

    public final void f(boolean z) {
        this.c.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).edit().putBoolean("download_handwriting", z).apply();
    }

    @ResultIgnorabilityUnspecified
    public final boolean g() {
        try {
            int size = this.f;
            do {
                String language = ((Locale) this.d.get(size)).getLanguage();
                size = (size + 1) % this.d.size();
                ArrayList<String> filesFromSpec = OnDeviceSpecUtils.getFilesFromSpec(b(language));
                yph yphVar = a;
                ((ype) yphVar.l().ai(3904)).y("Maybe download language files for %s", language);
                Iterator<String> it = filesFromSpec.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Uri uri = Uri.parse(next);
                    Context context = this.c;
                    String strMaybeMakeFilenameFromUrl = Util.maybeMakeFilenameFromUrl(context, next);
                    if (new File(strMaybeMakeFilenameFromUrl).exists()) {
                        ((ype) yphVar.l().ai(3908)).y("File already exists: %s", strMaybeMakeFilenameFromUrl);
                    } else {
                        String lastPathSegment = uri.getLastPathSegment();
                        Util.downloadFile(next, context.openFileOutput(lastPathSegment, 0), null);
                        String strMaybeUnzip = Util.maybeUnzip(Util.maybeMakeFilenameFromUrl(context, lastPathSegment));
                        if (new File(strMaybeUnzip).renameTo(new File(strMaybeMakeFilenameFromUrl))) {
                            ((ype) ((ype) yphVar.f()).ai(3907)).M("Downloaded: %s to %s", next, strMaybeMakeFilenameFromUrl);
                        } else {
                            ((ype) ((ype) yphVar.g()).ai(3906)).M("Failed to rename %s to %s", strMaybeUnzip, strMaybeMakeFilenameFromUrl);
                        }
                    }
                }
            } while (size != this.f);
            return true;
        } catch (Exception e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 3905)).u("Exception ");
            return false;
        }
    }

    public final boolean h() {
        return this.c.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).getBoolean("download_handwriting", false);
    }

    public final boolean i() {
        return this.d.size() > 1;
    }
}
