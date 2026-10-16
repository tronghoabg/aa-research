package com.google.firebase.d.b;

import com.google.firebase.d.h;
import com.google.firebase.d.i;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f9822a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f9822a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // com.google.firebase.d.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((i) obj2).f(f9822a.format((Date) obj));
    }
}
