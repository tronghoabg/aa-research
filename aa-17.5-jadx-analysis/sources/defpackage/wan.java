package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
final class wan extends war {
    final /* synthetic */ wao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wan(wap wapVar, String str, String str2, wao waoVar) {
        super(wapVar, str, str2);
        this.a = waoVar;
    }

    @Override // defpackage.war
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", vzz.b(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
