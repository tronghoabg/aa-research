package I4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class y implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5377a;

    /* renamed from: b, reason: collision with root package name */
    public final p f5378b;

    public /* synthetic */ y(p pVar, int i5) {
        this.f5377a = i5;
        this.f5378b = pVar;
    }

    @Override // I4.p
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f5377a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        Uri uriFromFile;
        switch (this.f5377a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                p pVar = this.f5378b;
                if (pVar.a(uriFromFile)) {
                    return pVar.b(uriFromFile, i5, i10, gVar);
                }
                return null;
            default:
                return this.f5378b.b(new f((URL) obj), i5, i10, gVar);
        }
    }
}
