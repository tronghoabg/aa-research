package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class dvm extends dvl {
    @Override // defpackage.dvl
    protected final Font e(dwl dwlVar) {
        Font fontC;
        String authority = dwlVar.a() ? ((Uri) dwlVar.f).getAuthority() : null;
        if (authority == null) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(authority, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            typefaceCreate = null;
        }
        if (typefaceCreate == null || (fontC = dvh.c(typefaceCreate)) == null) {
            return null;
        }
        String str = dwlVar.d;
        if (TextUtils.isEmpty(str)) {
            return fontC;
        }
        try {
            return new Font.Builder(fontC).setFontVariationSettings(str).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
