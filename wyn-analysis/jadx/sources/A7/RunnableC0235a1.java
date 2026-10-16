package A7;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* renamed from: A7.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0235a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P0 f805h;

    public RunnableC0235a1(P0 p02, String str, String str2, long j8, Bundle bundle, boolean z2, boolean z10, boolean z11) {
        this.f798a = str;
        this.f799b = str2;
        this.f800c = j8;
        this.f801d = bundle;
        this.f802e = z2;
        this.f803f = z10;
        this.f804g = z11;
        this.f805h = p02;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f805h.t0(this.f798a, this.f799b, this.f800c, this.f801d, this.f802e, this.f803f, this.f804g);
    }
}
