package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes2.dex */
public final class hyw implements hzh {
    private final /* synthetic */ int a;
    private final Object b;

    public hyw(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.hzh
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return hdv.g((Uri) obj);
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            Uri uri = (Uri) obj;
            return hdv.g(uri) && !hdv.i(uri);
        }
        if (i != 5) {
            return true;
        }
        Uri uri2 = (Uri) obj;
        return hdv.g(uri2) && hdv.i(uri2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [hyu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [hzh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [hyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [hzh, java.lang.Object] */
    @Override // defpackage.hzh
    public final /* synthetic */ ncp b(Object obj, int i, int i2, hum humVar) {
        Uri uriC;
        Long l;
        int i3 = this.a;
        if (i3 == 0) {
            File file = (File) obj;
            return new ncp(new ifj(file), new hyt(file, (hyu) this.b, 0));
        }
        if (i3 == 1) {
            byte[] bArr = (byte[]) obj;
            return new ncp(new ifj(bArr), new hyi(bArr, this.b));
        }
        if (i3 == 2) {
            Uri uri = (Uri) obj;
            return new ncp(new ifj(uri), new hzd((Context) this.b, uri));
        }
        if (i3 == 3) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                uriC = null;
            } else if (str.charAt(0) == '/') {
                uriC = c(str);
            } else {
                Uri uri2 = Uri.parse(str);
                uriC = uri2.getScheme() == null ? c(str) : uri2;
            }
            if (uriC != null) {
                ?? r4 = this.b;
                if (r4.a(uriC)) {
                    return r4.b(uriC, i, i2, humVar);
                }
            }
            return null;
        }
        if (i3 == 4) {
            Uri uri3 = (Uri) obj;
            if (!hdv.h(i, i2)) {
                return null;
            }
            ifj ifjVar = new ifj(uri3);
            Context context = (Context) this.b;
            return new ncp(ifjVar, hyt.f(context, uri3, new hvl(context.getContentResolver())));
        }
        if (i3 != 5) {
            return this.b.b(new hyx((URL) obj), i, i2, humVar);
        }
        Uri uri4 = (Uri) obj;
        if (!hdv.h(i, i2) || (l = (Long) humVar.b(ibz.a)) == null || l.longValue() != -1) {
            return null;
        }
        ifj ifjVar2 = new ifj(uri4);
        Context context2 = (Context) this.b;
        return new ncp(ifjVar2, hyt.f(context2, uri4, new hvm(context2.getContentResolver())));
    }

    public hyw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public hyw(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }
}
