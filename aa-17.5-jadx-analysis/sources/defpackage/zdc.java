package defpackage;

import j$.net.URLDecoder;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class zdc extends yeh implements Cloneable, Serializable {
    public static final zdc a = new zdc(ydv.a);
    private static final long serialVersionUID = -3053773769157973706L;
    public final yig b;

    public zdc(yig yigVar) {
        this.b = new zct(yigVar);
    }

    public static String j(String str, int i, int i2, Charset charset, boolean z) {
        try {
            return z ? new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(StandardCharsets.ISO_8859_1), charset) : URLDecoder.decode(str.substring(i, i2), charset.name());
        } catch (UnsupportedEncodingException unused) {
            return str.substring(i, i2);
        } catch (IllegalArgumentException unused2) {
            return str.substring(i, i2);
        }
    }

    @Override // defpackage.yeh
    protected final yig a() {
        return this.b;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.b;
    }

    @Override // defpackage.yeh, defpackage.yek
    /* renamed from: e */
    protected final /* synthetic */ yks d() {
        return this.b;
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final zdc clone() {
        return new zdc(new yif(this.b));
    }

    @Override // defpackage.yel
    public final String toString() {
        return zeb.o(this, zdb.a);
    }

    public zdc() {
        this(new yif(12));
    }
}
