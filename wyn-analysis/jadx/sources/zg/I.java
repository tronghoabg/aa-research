package zg;

import okhttp3.MultipartBody;

/* loaded from: classes5.dex */
public final class I extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final I f48542b = new I();

    @Override // zg.a0
    public final void a(N n10, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            MultipartBody.Builder builder = n10.f48559i;
            builder.getClass();
            builder.f42308c.add(part);
        }
    }
}
