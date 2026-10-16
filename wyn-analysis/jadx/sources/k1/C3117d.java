package k1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3117d implements InterfaceC3116c, InterfaceC3118e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38806a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f38807b;

    /* renamed from: c, reason: collision with root package name */
    public int f38808c;

    /* renamed from: d, reason: collision with root package name */
    public int f38809d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f38810e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f38811f;

    public /* synthetic */ C3117d() {
    }

    @Override // k1.InterfaceC3116c
    public void b(Uri uri) {
        this.f38810e = uri;
    }

    @Override // k1.InterfaceC3116c
    public C3119f build() {
        return new C3119f(new C3117d(this));
    }

    @Override // k1.InterfaceC3118e
    public ContentInfo c() {
        return null;
    }

    @Override // k1.InterfaceC3118e
    public ClipData d() {
        return this.f38807b;
    }

    @Override // k1.InterfaceC3118e
    public int g() {
        return this.f38809d;
    }

    @Override // k1.InterfaceC3118e
    public int getSource() {
        return this.f38808c;
    }

    @Override // k1.InterfaceC3116c
    public void setExtras(Bundle bundle) {
        this.f38811f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f38806a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f38807b.getDescription());
                sb2.append(", source=");
                int i5 = this.f38808c;
                sb2.append(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? String.valueOf(i5) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.f38809d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                Uri uri = this.f38810e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return wg.b.c(sb2, this.f38811f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // k1.InterfaceC3116c
    public void x(int i5) {
        this.f38809d = i5;
    }

    public C3117d(C3117d c3117d) {
        ClipData clipData = c3117d.f38807b;
        clipData.getClass();
        this.f38807b = clipData;
        int i5 = c3117d.f38808c;
        if (i5 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i5 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f38808c = i5;
        int i10 = c3117d.f38809d;
        if ((i10 & 1) == i10) {
            this.f38809d = i10;
            this.f38810e = c3117d.f38810e;
            this.f38811f = c3117d.f38811f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
