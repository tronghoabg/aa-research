package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lgv {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Language");
    public static final java.util.Locale b = java.util.Locale.ENGLISH;
    private static final defpackage.yhx e = defpackage.yhx.t("de", "en", "es", "fr", "he", "ko", "it", "ja", "pt", "ru", "zh", "iw");
    public final android.content.Context c;
    public java.util.List d;
    private int f;

    /* JADX WARN: Multi-variable type inference failed */
    public lgv(android.content.Context context) {
        this.c = context;
        defpackage.yhv yhvVar = new defpackage.yhv();
        defpackage.yhv yhvVar2 = new defpackage.yhv();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        java.util.Iterator<android.view.inputmethod.InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
        while (it.hasNext()) {
            for (android.view.inputmethod.InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                java.lang.String languageTag = inputMethodSubtype.getLanguageTag();
                languageTag = android.text.TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale().replace('_', '-') : languageTag;
                if (!android.text.TextUtils.isEmpty(languageTag)) {
                    yhvVar2.c(java.util.Locale.forLanguageTag(languageTag));
                }
            }
        }
        yhvVar.k(yhvVar2.g());
        defpackage.yhv yhvVar3 = new defpackage.yhv();
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            yhvVar3.c(localeList.get(i));
        }
        yhvVar.k(yhvVar3.g());
        yhvVar.c(j());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.yot it2 = yhvVar.g().iterator();
        while (it2.hasNext()) {
            java.util.Locale locale = (java.util.Locale) it2.next();
            if (e.contains(locale.getLanguage())) {
                arrayList.add(locale);
            }
        }
        this.d = arrayList;
        java.lang.String string = context.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).getString("current_language", j().toLanguageTag());
        int iIndexOf = this.d.indexOf(android.text.TextUtils.isEmpty(string) ? j() : java.util.Locale.forLanguageTag(string));
        this.f = iIndexOf;
        if (iIndexOf < 0) {
            int iIndexOf2 = this.d.indexOf(j());
            this.f = iIndexOf2;
            if (iIndexOf2 < 0) {
                this.f = 0;
            }
        }
    }

    public static defpackage.lgv a() {
        return (defpackage.lgv) defpackage.mkp.a.i(defpackage.lgv.class);
    }

    static final java.util.Locale j() {
        java.util.Locale locale = java.util.Locale.getDefault();
        return e.contains(locale.getLanguage()) ? locale : b;
    }

    public final defpackage.abxz b(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 35 && str.equals("he")) {
            str = "iw";
        }
        return com.google.android.libraries.handwriting.base.OnDeviceSpecUtils.getSpecForLanguage(com.google.android.libraries.handwriting.base.OnDeviceSpecUtils.readSubtypes(this.c.getResources().openRawResource(com.google.android.projection.gearhead.R.raw.recognizers), null), str);
    }

    public final java.lang.String c() {
        return ((java.util.Locale) this.d.get(this.f)).getLanguage();
    }

    public final java.util.Locale d() {
        return (java.util.Locale) this.d.get(this.f);
    }

    public final void e() {
        this.f = (this.f + 1) % this.d.size();
        java.util.Locale localeD = d();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3906)).y("New keyboard language: %s", localeD);
        this.c.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).edit().putString("current_language", localeD.toLanguageTag()).apply();
    }

    public final void f(boolean z) {
        this.c.getSharedPreferences("com.google.android.projection.gearhead.common.LANGUAGE_PREFERENCE_NAME", 0).edit().putBoolean("download_handwriting", z).apply();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean g() {
        try {
            int size = this.f;
            do {
                java.lang.String language = ((java.util.Locale) this.d.get(size)).getLanguage();
                size = (size + 1) % this.d.size();
                java.util.ArrayList<java.lang.String> filesFromSpec = com.google.android.libraries.handwriting.base.OnDeviceSpecUtils.getFilesFromSpec(b(language));
                defpackage.yqm yqmVar = a;
                ((defpackage.yqj) yqmVar.l().ai(3907)).y("Maybe download language files for %s", language);
                for (java.lang.String str : filesFromSpec) {
                    android.net.Uri uri = android.net.Uri.parse(str);
                    android.content.Context context = this.c;
                    java.lang.String strMaybeMakeFilenameFromUrl = com.google.android.libraries.handwriting.base.Util.maybeMakeFilenameFromUrl(context, str);
                    if (new java.io.File(strMaybeMakeFilenameFromUrl).exists()) {
                        ((defpackage.yqj) yqmVar.l().ai(3911)).y("File already exists: %s", strMaybeMakeFilenameFromUrl);
                    } else {
                        java.lang.String lastPathSegment = uri.getLastPathSegment();
                        com.google.android.libraries.handwriting.base.Util.downloadFile(str, context.openFileOutput(lastPathSegment, 0), null);
                        java.lang.String strMaybeUnzip = com.google.android.libraries.handwriting.base.Util.maybeUnzip(com.google.android.libraries.handwriting.base.Util.maybeMakeFilenameFromUrl(context, lastPathSegment));
                        if (new java.io.File(strMaybeUnzip).renameTo(new java.io.File(strMaybeMakeFilenameFromUrl))) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3910)).M("Downloaded: %s to %s", str, strMaybeMakeFilenameFromUrl);
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai(3909)).M("Failed to rename %s to %s", strMaybeUnzip, strMaybeMakeFilenameFromUrl);
                        }
                    }
                }
            } while (size != this.f);
            return true;
        } catch (java.lang.Exception e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 3908)).u("Exception ");
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
