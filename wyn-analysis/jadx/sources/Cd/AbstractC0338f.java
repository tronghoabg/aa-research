package Cd;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import yd.InterfaceC4593a;

/* renamed from: Cd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0338f {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f2099a;

    /* renamed from: b, reason: collision with root package name */
    public static final Nd.a f2100b;

    /* renamed from: c, reason: collision with root package name */
    public static final Dd.c f2101c;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(InterfaceC4593a.class);
        KType kTypeB2 = null;
        try {
            kTypeB = kotlin.jvm.internal.H.b(InterfaceC4593a.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f2099a = new Nd.a("UploadProgressListenerAttributeKey", new Sd.a(orCreateKotlinClass, kTypeB));
        KClass orCreateKotlinClass2 = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(InterfaceC4593a.class);
        try {
            kTypeB2 = kotlin.jvm.internal.H.b(InterfaceC4593a.class);
        } catch (Throwable unused2) {
        }
        f2100b = new Nd.a("DownloadProgressListenerAttributeKey", new Sd.a(orCreateKotlinClass2, kTypeB2));
        f2101c = U8.v0.s("BodyProgress", new com.moloco.sdk.service_locator.h(14), new Ad.g(5));
    }
}
