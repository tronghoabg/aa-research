package md;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* renamed from: md.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3531C {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f40566d = Logger.getLogger(C3531C.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final C3531C f40567e = new C3531C();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentSkipListMap f40568a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f40569b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f40570c;

    public C3531C() {
        new ConcurrentSkipListMap();
        this.f40568a = new ConcurrentSkipListMap();
        this.f40569b = new ConcurrentHashMap();
        this.f40570c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
