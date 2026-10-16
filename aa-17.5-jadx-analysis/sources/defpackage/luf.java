package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class luf {
    public duk a;
    public Bitmap b;
    private String c;
    private String d;
    private yfq e;
    private boolean f;
    private boolean g;
    private byte h;

    public final lug a() {
        String str;
        String str2;
        yfq yfqVar;
        if (this.h == 3 && (str = this.c) != null && (str2 = this.d) != null && (yfqVar = this.e) != null) {
            return new lug(str, str2, this.a, yfqVar, this.b, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" title");
        }
        if (this.e == null) {
            sb.append(" messages");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isRead");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isGroupConversation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
    }

    public final void c(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 2);
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 1);
    }

    public final void e(yfq yfqVar) {
        if (yfqVar == null) {
            throw new NullPointerException("Null messages");
        }
        this.e = yfqVar;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.d = str;
    }
}
