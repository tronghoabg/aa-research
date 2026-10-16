package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dvt extends defpackage.dvs {
    @Override // defpackage.dvs
    protected final android.graphics.fonts.Font e(dws dwsVar) {
        android.graphics.fonts.Font fontC;
        java.lang.String authority = dwsVar.a() ? ((android.net.Uri) dwsVar.f).getAuthority() : null;
        if (authority == null) {
            return null;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(authority, 0);
        android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            typefaceCreate = null;
        }
        if (typefaceCreate == null || (fontC = defpackage.dvo.c(typefaceCreate)) == null) {
            return null;
        }
        java.lang.String str = dwsVar.d;
        if (android.text.TextUtils.isEmpty(str)) {
            return fontC;
        }
        try {
            return ep$.ExternalSyntheticApiModelOutline0.m(ep$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontC), str));
        } catch (java.io.IOException unused) {
            android.util.Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
