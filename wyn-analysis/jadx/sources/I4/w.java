package I4;

import E5.T;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.wynauto.wyn.R;
import s6.G;

/* loaded from: classes.dex */
public final class w implements q, G {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f5375a;

    public w(Resources resources, int i5) {
        switch (i5) {
            case 1:
                resources.getClass();
                this.f5375a = resources;
                break;
            default:
                this.f5375a = resources;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(E5.T r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f3230c
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L3e
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L3e
        L13:
            int r1 = u6.v.f46721a
            r3 = 21
            if (r1 < r3) goto L1e
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            goto L24
        L1e:
            java.util.Locale r3 = new java.util.Locale
            r3.<init>(r0)
            r0 = r3
        L24:
            r3 = 24
            if (r1 < r3) goto L30
            d2.b.n()
            java.util.Locale r1 = u6.u.d()
            goto L34
        L30:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L34:
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L40
        L3e:
            r0 = r2
            goto L61
        L40:
            r3 = 1
            r4 = 0
            int r3 = r0.offsetByCodePoints(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r5.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r4 = r0.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r1 = r4.toUpperCase(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r1 = r0.substring(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r0 = r5.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L61
        L61:
            java.lang.String r1 = r6.b(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7e
            java.lang.String r7 = r7.f3229b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7c
            goto L7d
        L7c:
            r2 = r7
        L7d:
            r0 = r2
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.w.a(E5.T):java.lang.String");
    }

    public String b(T t10) {
        int i5 = t10.f3232e & 2;
        Resources resources = this.f5375a;
        String string = i5 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i10 = t10.f3232e;
        if ((i10 & 4) != 0) {
            string = e(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            string = e(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i10 & 1088) != 0 ? e(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(E5.T r18) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.w.c(E5.T):java.lang.String");
    }

    @Override // I4.q
    public p d(v vVar) {
        return new C0617b(this.f5375a, vVar.b(Uri.class, ParcelFileDescriptor.class));
    }

    public String e(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f5375a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
