package j9;

import h9.g;
import h9.h;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: j9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3093c implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f38677a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f38677a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        ((h) obj2).add(f38677a.format((Date) obj));
    }
}
