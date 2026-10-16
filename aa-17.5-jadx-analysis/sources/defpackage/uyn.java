package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
final class uyn implements xyc {
    private final Context a;
    private final boolean b;
    private final String c;

    public uyn(Context context, boolean z, String str) {
        this.a = context;
        this.b = z;
        this.c = str;
    }

    @Override // defpackage.xyc
    public final /* bridge */ /* synthetic */ Object gu() {
        File fileA = uyp.a(this.a, this.b, this.c);
        try {
            if (!fileA.exists() && !fileA.mkdirs()) {
                ((ynz) ((ynz) uyp.a.h()).ai(9724)).y("Failed to create directory: %s", fileA.getPath());
            }
            return fileA;
        } catch (SecurityException e) {
            ((ynz) ((ynz) ((ynz) uyp.a.h()).p(e)).ai((char) 9725)).y("Unable to create directory: %s", fileA.getPath());
            return fileA;
        }
    }
}
